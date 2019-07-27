package com.accp.SpringBootWork_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.SpringBootWork_1.biz.DeptBiz;
import com.accp.SpringBootWork_1.biz.EmpBiz;
import com.accp.SpringBootWork_1.pojo.Dept;
import com.accp.SpringBootWork_1.pojo.Emp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWork1ApplicationTests {

	@Autowired
	private DeptBiz d;
	
	@Autowired
	private EmpBiz e;
	
	@Test
	public void contextLoads() {
		for (Dept i : d.findDept()) {
			System.err.println(i);
		}
	}

	
	@Test
	public void contextLoads2() {
		for (Emp i : e.findEmp(1)) {
			System.err.println(i);
		}
	}

}
