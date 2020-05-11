package com.yt.workmanagerpractise;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yt.workmanagerpractise.cancel.CancelWorkerActivity;
import com.yt.workmanagerpractise.combine.CombineWorkerActivity;
import com.yt.workmanagerpractise.constraints.ConstraintsWorkerActivity;
import com.yt.workmanagerpractise.inputoutput.InputOutputWorkerActivity;
import com.yt.workmanagerpractise.periodic.PeriodicWorkerActivity;
import com.yt.workmanagerpractise.taskchainstream.TaskCharinStreamActivity;
import com.yt.workmanagerpractise.then.OrderWorkerActivity;
import com.yt.workmanagerpractise.unique.UniqueWorkerActivity;

public class MainActivity extends AppCompatActivity {

	private Context mContext;
	private Button button_intervals;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
//		initView();
//		initEvent();
		initData();
		button_intervals=findViewById(R.id.button_intervals);
		button_intervals.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				PeriodicWorkerActivity.startUp(mContext);
			}
		});
	}

	private void initView() {
		findViewById(R.id.button_output).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				InputOutputWorkerActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_intervals).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				PeriodicWorkerActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_constraints).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ConstraintsWorkerActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_intervals).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				CancelWorkerActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_order).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				OrderWorkerActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_combine).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				CombineWorkerActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_task_charin_stream).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TaskCharinStreamActivity.startUp(mContext);
			}
		});
		findViewById(R.id.button_task_unique).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UniqueWorkerActivity.startUp(mContext);
			}
		});
	}

	private void initEvent() {

	}

	private void initData() {

	}
}
