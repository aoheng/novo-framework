package com.novo.framework.core.container;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSpace implements Space{
	
	private AtomicInteger size ;
	
	private static final int default_initial_size = 0;
	
	public AtomicSpace() {
		size = new AtomicInteger(default_initial_size);
	}
	
	public AtomicSpace(int initialSize) {
		size = new AtomicInteger(initialSize);
	}
	
	@Override
	public void setinitialSize(int size) {
		this.size.set(size);
	}
	@Override
	public int getSize() {
		return size.get();
	}
	@Override
	public void expand(int increment) {
		this.size.set(this.getSize()+increment);
	}

	@Override
	public int increment() {
		return this.size.incrementAndGet();
	}

	@Override
	public int decrement() {
		return this.size.decrementAndGet();
	}
}
