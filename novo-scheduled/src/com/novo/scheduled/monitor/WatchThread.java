package com.novo.scheduled.monitor;

import com.novo.framework.core.exception.SystemException;

public class WatchThread extends Thread {

	private WatchRegistrar watchRegistrar;
	
	public WatchThread(WatchRegistrar watchRegistrar) {
		if(watchRegistrar == null) {
			throw new SystemException();
		}
		this.watchRegistrar = watchRegistrar;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				if(this.watchRegistrar.getWatch().watchStatus() == false) {
					this.watchRegistrar.notifyObservers();
				}
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
