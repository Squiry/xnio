package org.xnio;

import java.util.concurrent.locks.ReentrantLock;

public class WithLock<T> {
    private final ReentrantLock lock;
    private final T value;

    public WithLock(T value) {
        this.value = value;
        this.lock = new ReentrantLock();
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public T getValue() {
        return value;
    }
}
