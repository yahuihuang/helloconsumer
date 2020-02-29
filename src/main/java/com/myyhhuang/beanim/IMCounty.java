package com.myyhhuang.beanim;

import java.io.Serializable;
import java.util.Date;

public class IMCounty implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String countyCode;
	private String countyName;
	private Date modifyTime;
	private String modifyEmp;
	
	public IMCounty() {
		
	}

	public IMCounty(String countyCode) {
		super();
		this.countyCode = countyCode;
	}

	public IMCounty(String countyCode, String countyName, Date modifyTime, String modifyEmp) {
		super();
		this.countyCode = countyCode;
		this.countyName = countyName;
		this.modifyTime = modifyTime;
		this.modifyEmp = modifyEmp;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyEmp() {
		return modifyEmp;
	}

	public void setModifyEmp(String modifyEmp) {
		this.modifyEmp = modifyEmp;
	}

	@Override
	public String toString() {
		return "IMCounty [countyCode=" + countyCode + ", countyName=" + countyName + ", modifyTime=" + modifyTime
				+ ", modifyEmp=" + modifyEmp + "]";
	}
}
