package com.novo.scheduled.monitor;

import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.monitor.Observable;
import com.novo.framework.core.monitor.Observer;
import com.novo.scheduled.ScheduledTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WatchRegistrar implements Observable{
	 
	private static List<Observer> watchList = Collections.synchronizedList(new ArrayList<Observer>());
	
	private ScheduledTask scheduledTask;
	
	public WatchRegistrar(ScheduledTask scheduledTask) {
		if(scheduledTask == null) {
			throw new SystemException();
		}
		this.scheduledTask = scheduledTask;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		watchList.add(observer);
	}


	@Override
	public void unRegisterObserver(Observer observer) {
		watchList.remove(observer);
	}


	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = watchList.iterator();
		while(iterator.hasNext()) {
			iterator.next().processNotify(scheduledTask);
		}
	}
	
	public Watch getWatch() {
		return this.scheduledTask;
	}
}
