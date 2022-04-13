package com.novo.framework.core.bean;

import java.util.Collection;

public interface DataBean {
	
	public <T extends DataClass> Collection<T> getData();
}
