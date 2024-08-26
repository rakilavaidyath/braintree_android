package com.braintreepayments.api.sharedutils;

import android.os.Handler;
import android.os.Looper;

import androidx.annotation.VisibleForTesting;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadScheduler implements Scheduler {

    private final Handler mainThreadHandler;
    private final ExecutorService backgroundThreadService;

    ThreadScheduler(int threadPoolSize) {
        this(new Handler(Looper.getMainLooper()), Executors.newFixedThreadPool(threadPoolSize));
    }

    @VisibleForTesting
    ThreadScheduler(Handler mainThreadHandler, ExecutorService backgroundThreadPool) {
        this.mainThreadHandler = mainThreadHandler;
        this.backgroundThreadService = backgroundThreadPool;
    }

    public void runOnBackground(Runnable runnable) {
        backgroundThreadService.submit(runnable);
    }

    public void runOnMain(Runnable runnable) {
        mainThreadHandler.post(runnable);
    }
}
