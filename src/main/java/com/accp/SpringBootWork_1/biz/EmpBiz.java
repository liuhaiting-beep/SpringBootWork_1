package com.accp.SpringBootWork_1.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.SpringBootWork_1.dao.IEmpDao;
import com.accp.SpringBootWork_1.pojo.Emp;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmpBiz {

	@Autowired
	private IEmpDao d;
	
	/**
	 * 查询所有部门及员工
	 * @return
	 */
	public List<Emp> findEmp(Integer tid){
		return d.findEmp(tid);
	}

	/**
	 * 查询员工的数量
	 * @return
	 */
	public int countEmp(Integer tid){
		return d.countEmp(tid);
	}

	/**
	 * 删除相应员工
	 * @param pid
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeEmp(Integer pid){
		return d.removeEmp(pid);	
	}
}
