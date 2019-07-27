package com.accp.SpringBootWork_1.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.SpringBootWork_1.dao.IDeptDao;
import com.accp.SpringBootWork_1.pojo.Dept;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DeptBiz {
	@Autowired
	private IDeptDao e;
	
	/**
	 * 查询所有员工
	 * @return
	 */
	public List<Dept> findDept(){
		return e.findDept();
	}
}
