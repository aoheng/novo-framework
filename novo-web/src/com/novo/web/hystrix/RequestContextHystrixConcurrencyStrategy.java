package com.novo.web.hystrix;

import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;

/**
 * @author Aoheng on 2020/01/08.
 */
public class RequestContextHystrixConcurrencyStrategy extends HystrixConcurrencyStrategy {

    private final Collection<HystrixCallableWrapper> wrappers;

    public RequestContextHystrixConcurrencyStrategy(Collection<HystrixCallableWrapper> wrappers) {
        this.wrappers = wrappers;
    }

    @Override
    public <T> Callable<T> wrapCallable(Callable<T> callable) {
        return new CallableWrapperChain(callable, wrappers.iterator()).wrapCallable();
    }

    private static class CallableWrapperChain<T> {

        private final Callable<T> callable;

        private final Iterator<HystrixCallableWrapper> wrappers;

        CallableWrapperChain(Callable<T> callable, Iterator<HystrixCallableWrapper> wrappers) {
            this.callable = callable;
            this.wrappers = wrappers;
        }

        Callable<T> wrapCallable() {
            Callable<T> delegate = callable;
            while (wrappers.hasNext()) {
                delegate = wrappers.next().wrap(delegate);
            }
            return delegate;
        }
    }
}
