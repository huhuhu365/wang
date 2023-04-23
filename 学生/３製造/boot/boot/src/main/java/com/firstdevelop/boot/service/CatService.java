package com.firstdevelop.boot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstdevelop.boot.entity.Cat;
import com.firstdevelop.boot.form.CatForm;
import com.firstdevelop.boot.mapper.CatMapper;

@Service
public class CatService {
	
	@Autowired
	private CatMapper catMapper;
	
	public List<Cat> searchAll() {
		return catMapper.searchAll();
	}
	
	public void regist(CatForm form) {
		
		Cat cat = new Cat();
		
		cat.setId(Integer.parseInt(form.getId()));//需要转换
		cat.setName(form.getName());//不需要转换
		cat.setColor(form.getColor());//不需要转换
		cat.setSpecies(form.getSpecies());//不需要转换
		cat.setSize(Integer.parseInt(form.getSize()));
		
		catMapper.regist(cat);
	}
	
	public void delete(Integer id) {
		
		Cat cat = new Cat();
		cat.setId(id);
		catMapper.delete(cat);
	}

	

}
