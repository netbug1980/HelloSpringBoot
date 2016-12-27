package com.cdv.spring.service;

public abstract class AbstractService {
	protected String serviceName;
	protected boolean enable;
	protected String defName;

	public abstract void run();

	public abstract void doWork(String workName);

	public boolean isEnable() {
		return enable;
	}

	public abstract void setEnable(boolean enable);

	public String getDefName() {
		return defName;
	}

	public abstract void setDefName(String defName);

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
