package com.accp.SpringBootWork_1.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.SpringBootWork_1.biz.DeptBiz;
import com.accp.SpringBootWork_1.biz.EmpBiz;
import com.accp.SpringBootWork_1.pojo.Dept;
import com.accp.SpringBootWork_1.pojo.Emp;
import com.alibaba.fastjson.JSON;

/**
 * 第一次springboot作业
 * Servlet implementation class EmpAction
 */
@RestController
@RequestMapping("/c/emp")
public class EmpAction{
	@Autowired
	private DeptBiz d;
	
	@Autowired
	private EmpBiz e;

	@GetMapping("/getList")
	public List<Dept> findDept() {
		return  d.findDept();
	}
	
	@GetMapping("/getList2/{tid}")
	public List<Emp> findEmp(@PathVariable Integer tid) {
		return  e.findEmp(tid);
	}

	@GetMapping("/countEmp/{tid}")
	public int countEmp(@PathVariable Integer tid) {
		return e.countEmp(tid);
	}	
	
	@DeleteMapping("/removeEmp/{pid}")
	public int removeEmp(@PathVariable Integer pid) {
		return e.removeEmp(pid);
	}	
}
