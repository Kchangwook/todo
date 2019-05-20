package com.summer.submit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.summer.submit.domain.Todo;

@Mapper
public interface TodoMapper {

	List<Todo> getAll();
	int add(Todo t);
	Todo getByNum(int n);
	int update(Todo t);
	int delete(int n);
	
}//end of TodoMapper
