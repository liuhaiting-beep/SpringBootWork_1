package com.accp.SpringBootWork_1.pojo;

/**
 * 部门类
 * @author Lenovo
 *
 */
public class Dept {
	private Integer tid;
	private String tname;//部门名称
	private String taddress;//部门地址
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTaddress() {
		return taddress;
	}
	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	public Dept(Integer tid, String tname, String taddress) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.taddress = taddress;
	}
	public Dept(String tname, String taddress) {
		super();
		this.tname = tname;
		this.taddress = taddress;
	}
	
	public Dept() {
		super();
	}
	@Override
	public String toString() {
		return "Dept [tid=" + tid + ", tname=" + tname + ", taddress=" + taddress + "]";
	}
	

}
