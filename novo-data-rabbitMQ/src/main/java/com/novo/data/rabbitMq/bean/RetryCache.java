package com.novo.data.rabbitMq.bean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Aoheng on 2021/01/30 2020/02/08.
 */
public class RetryCache {

    public final int RETRY_TIME_INTERVAL = 60 * 1000;
    private AtomicBoolean stop = new AtomicBoolean(true);
    private Map<String, MqMessage> map = new ConcurrentHashMap<>();

    public void add(String id, MqMessage message) {
        map.put(id, message);
    }

    public void delete(String id) {
        map.remove(id);
    }

    public void start() {
        //TODO 待完善重试逻辑
        new Thread(() -> {
            while (isRunning()) {
                try {
                    Thread.sleep(RETRY_TIME_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long now = System.currentTimeMillis();
                for (Map.Entry<String, MqMessage> entry : map.entrySet()) {
                    MqMessage message = entry.getValue();
                    if (message != null) {

                    }
                }
            }
        }).start();
    }

    public void stop() {
        stop.set(true);
    }

    public boolean isRunning() {
        return !stop.get();
    }
}
