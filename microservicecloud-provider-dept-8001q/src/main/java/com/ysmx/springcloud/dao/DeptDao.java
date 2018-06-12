package com.ysmx.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysmx.springcloud.entity.Dept;

@Mapper
public interface DeptDao {

	public Boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
