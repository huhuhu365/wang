package com.firstdevelop.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstdevelop.boot.entity.Cat;
import com.firstdevelop.boot.form.CatForm;
import com.firstdevelop.boot.service.CatService;

@Controller
@RequestMapping("/cat")
public class CatController {

	@Autowired
	private CatService catService;
	
	
	
	@RequestMapping("/searchAll")
	public String searchAll(Model model) {

		List<Cat> catList = catService.searchAll();
		model.addAttribute("catList", catList);
		model.addAttribute("title", "ユーザー一覧");
		
		return "/cat/catDetail";
	}
	
	@RequestMapping("/registInit")
	public String registInit() {
		
		return "/cat/regist";
	}
	
	@RequestMapping("/regist")
	public String regist(CatForm form) {
		
		catService.regist(form);
		return "redirect:searchAll";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id ,Model model) {
		
		catService.delete(id);
		
		List<Cat> catList = catService.searchAll();
		model.addAttribute("catList", catList);
		model.addAttribute("title", "ユーザー一覧");
		return "/cat/catDetail";
	}

}
