package com.waction.springcloud.news.service;

import java.util.List;

import com.waction.springcloud.base.Dept;



public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
