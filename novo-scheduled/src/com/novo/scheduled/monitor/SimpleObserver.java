package com.novo.scheduled.monitor;

import com.novo.framework.core.monitor.Notify;
import com.novo.framework.core.monitor.Observer;

public class SimpleObserver implements Observer{
	@Override
	public void processNotify(Notify notify) {
		notify.executeEvent();
	}

}
