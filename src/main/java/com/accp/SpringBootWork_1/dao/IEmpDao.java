package com.accp.SpringBootWork_1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.SpringBootWork_1.pojo.Emp;


public interface IEmpDao {

	/**
	 * 查询所有部门及员工
	 * @return
	 */
	public List<Emp> findEmp(@Param("tid")Integer tid);

	/**
	 * 查询员工的数量
	 * @return
	 */
	public int countEmp(@Param("tid")Integer tid);

	/**
	 * 删除相应员工
	 * @param pid
	 * @return
	 */
	public int removeEmp(@Param("pid")Integer pid);

}