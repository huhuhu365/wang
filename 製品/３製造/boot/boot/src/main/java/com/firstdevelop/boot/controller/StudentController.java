package com.firstdevelop.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstdevelop.boot.entity.Student;
import com.firstdevelop.boot.form.StudentForm;
import com.firstdevelop.boot.service.StudentService;
/*
 * 学生情報用コントローラー
 */
@Controller
@RequestMapping("/student")
public class StudentController {
//	学生用サービス
	@Autowired
	private StudentService studentService;
	/*
	 * searchAll 学生一覧取得
	 */
	@RequestMapping("/searchAll")
	public String searchAll(Model model) {
//		学生サービスの一覧取得ﾒｯｿﾄﾞを呼び出し
		List<Student> studentList = studentService.searchAll();
//		画面に関する属性を設定する
		model.addAttribute("studentList", studentList);
		model.addAttribute("title", "学生情報一覧");
//		resources/student/studnetDetail.html
		return "/student/studentDetail";
	}
	/*
	 * 学生登録の初期化
	 */
	@RequestMapping("/registInit")
	public String registInit() {
//		regist.html
		return "/student/regist";
	}
	/*
	 * regist 学生登録
	 */
	@RequestMapping("/regist")
	public String regist(StudentForm form) {
//		学生サービスの学生登録ﾒｯｿﾄﾞを呼び出し
		studentService.regist(form);
		return "redirect:searchAll";
	}
	/*
	 * 学生情報削除
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id ,Model model) {
//		学生サービスの削除ﾒｯｿﾄﾞを呼び出し
		studentService.delete(id);
//		学生サービスの一覧取得ﾒｯｿﾄﾞを呼び出し
		List<Student> studentList = studentService.searchAll();
//		画面に関する属性を設定する
		model.addAttribute("studentList", studentList);
		model.addAttribute("title", "学生情報一覧");
		
		return "/student/studentDetail";
		
		//return "redirect:searchAll";
	}
}