package com.accp.SpringBootWork_1.dao;

import java.util.List;

import com.accp.SpringBootWork_1.pojo.Dept;


public interface IDeptDao {

	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Dept> findDept();

}