package com.accp.SpringBootWork_1.pojo;

import java.util.Date;

/**
 * 员工类
 * @author Lenovo
 *
 */
public class Emp {
	private Integer pid;//员工编号
	private String pname;//员工姓名
	private String pwork;//工作
	private Integer ppay;//工作
	private Date pStarttime;//入职时间
	private Integer pmoney;//奖金
	private Integer tid;
	
	private Dept t;//部门对象
	
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPwork() {
		return pwork;
	}
	public void setPwork(String pwork) {
		this.pwork = pwork;
	}
	public Integer getPpay() {
		return ppay;
	}
	public void setPpay(Integer ppay) {
		this.ppay = ppay;
	}
	public Date getpStarttime() {
		return pStarttime;
	}
	public void setpStarttime(Date pStarttime) {
		this.pStarttime = pStarttime;
	}
	public Integer getPmoney() {
		return pmoney;
	}
	public void setPmoney(Integer pmoney) {
		this.pmoney = pmoney;
	}
	public Dept getT() {
		return t;
	}
	public void setT(Dept t) {
		this.t = t;
	}
	
	public Emp() {
		super();
	}
	public Emp(Integer pid, String pname, String pwork, Integer ppay, Date pStarttime, Integer pmoney, Integer tid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pwork = pwork;
		this.ppay = ppay;
		this.pStarttime = pStarttime;
		this.pmoney = pmoney;
		this.tid = tid;
	}
	public Emp(Integer pid, String pname, String pwork, Integer ppay, Date pStarttime, Integer pmoney, Dept t) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pwork = pwork;
		this.ppay = ppay;
		this.pStarttime = pStarttime;
		this.pmoney = pmoney;
		this.t = t;
	}
	public Emp(String pname, String pwork, Integer ppay, Date pStarttime, Integer pmoney, Dept t) {
		super();
		this.pname = pname;
		this.pwork = pwork;
		this.ppay = ppay;
		this.pStarttime = pStarttime;
		this.pmoney = pmoney;
		this.t = t;
	}
	public Emp(String pname, String pwork, Integer ppay, Date pStarttime, Integer pmoney) {
		super();
		this.pname = pname;
		this.pwork = pwork;
		this.ppay = ppay;
		this.pStarttime = pStarttime;
		this.pmoney = pmoney;
	}
	@Override
	public String toString() {
		return "Emp [pid=" + pid + ", pname=" + pname + ", pwork=" + pwork + ", ppay=" + ppay + ", pStarttime="
				+ pStarttime + ", pmoney=" + pmoney + ", t=" + t + "]";
	}
	
	
	                                                  
}
