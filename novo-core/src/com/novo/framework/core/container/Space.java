package com.novo.framework.core.container;

public interface Space {
	
	public void setinitialSize(int size);
	
	public int getSize();
	
	public void expand(int increment);
	
	public int increment();
	
	public int decrement();
}
