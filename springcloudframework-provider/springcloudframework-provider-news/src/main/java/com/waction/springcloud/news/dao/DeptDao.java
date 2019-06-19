package com.waction.springcloud.news.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.waction.springcloud.base.Dept;



@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
