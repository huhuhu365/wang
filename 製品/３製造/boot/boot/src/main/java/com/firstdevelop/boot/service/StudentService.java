package com.firstdevelop.boot.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstdevelop.boot.entity.Student;
import com.firstdevelop.boot.form.StudentForm;
import com.firstdevelop.boot.mapper.StudentMapper;
/*
 * 学生情報サービス（学生业务逻辑）
 */
@Service
public class StudentService {
//	学生用マッパ
	@Autowired
	private StudentMapper studentMapper;
	/*
	 * 学生一覧取得(调用searchAll)
	 *@return 学生情報一覧
	 */
	public List<Student> searchAll() {
		return studentMapper.searchAll();
	}
	/*
	 * 学生一覧登録
	 * @param from 画面から取得された学生情報
	 */
	public void regist(StudentForm form) {
//		画面から取得された値がDB用のstudentモデルにセットする
		Student student = new Student();
		
		student.setId(Integer.parseInt(form.getId()));//需要转换
		student.setName(form.getName());//不需要转换
		student.setBirthday(Timestamp.valueOf(form.getBirthday()));//Timestamp.valueOf(form.getStudentBirthday())
		student.setAge(Integer.parseInt(form.getAge()));// "1" 1
		student.setScore(Integer.parseInt(form.getScore()));
		student.setClassid(Integer.parseInt(form.getClassid()));
//		DBにデータを登録する
		studentMapper.regist(student);
	}
	/*
	 * 学生情報削除
	 * @param id 学生ID
	 */
	public void delete(Integer id) {
//		学生Dto初期化
		Student student = new Student();
		student.setId(id);
//		学生削除ﾒｯｿﾄﾞを呼び出し
		studentMapper.delete(student);
	}
	
	
}
