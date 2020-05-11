package com.yt.workmanagerpractise.periodic;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

import java.util.Timer;

public class PeriodicWorker extends Worker {
    private Timer timer = new Timer();

    @NonNull
    @Override
    public Result doWork() {
//		try {
//			//模拟耗时任务
//			Thread.sleep(1000);
//			Log.d("tuacy", "periodic work");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Log.i("tuacy", "周期性调度任务");
        return Result.SUCCESS;
    }
}
