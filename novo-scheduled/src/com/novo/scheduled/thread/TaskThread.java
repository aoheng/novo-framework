package com.novo.scheduled.thread;

import com.novo.scheduled.Task;

import java.util.Calendar;

public class TaskThread extends Thread{
	private String taskName;
	private Task task;

	public TaskThread(String taskName,Task task){
		this.taskName = taskName;
		this.task = task;
		this.setName(taskName);
	}

	@Override
	public void run() {
		if(this.task != null) {
			this.task.execute();
		}
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	public static void main(String[] args) {
		/*Thread t = new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("");
				}
			}
		};
		t.start();
		List<Thread> tL = new ArrayList<Thread>();
		tL.add(t);
		Thread tt = new Thread() {
			@Override
			public void run() {
				while(true) {
					for(Thread th : tL) {
						System.out.println(th.isAlive());
						System.out.println(th.isInterrupted());
						System.out.println(th.isDaemon());
						System.out.println(th.getState());
					}
				}
			}
		};
		tt.start();*/
		Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);//获取年份
        int month=cal.get(Calendar.MONTH);//获取月份
        int day=cal.get(Calendar.DATE);//获取日
        int hour=cal.get(Calendar.HOUR_OF_DAY);//小时
        int minute=cal.get(Calendar.MINUTE);//分           
        int second=cal.get(Calendar.SECOND);//秒
        int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);//一周的第几天
        System.out.println("现在的时间是：公元"+year+"年"+month+"月"+day+"日      "+hour+"时"+minute+"分"+second+"秒       星期"+WeekOfYear);
	}
}
