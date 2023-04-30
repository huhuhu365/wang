package com.firstdevelop.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.firstdevelop.boot.entity.Cat;


@Mapper
public interface CatMapper {

	List<Cat> searchAll();
	
	void regist(Cat cat);
	
	void delete(Cat cat);
}
