package com.firstdevelop.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.firstdevelop.boot.entity.Student;
/*
 * 学生テーブル関連マッパ
 */
@Mapper
public interface StudentMapper {
//  secrchAll 选择所有
//	学生一覧取得
	List<Student> searchAll();
//	学生情報登録(挿入、insert)
	void regist(Student student);
//	学生情報削除する
	void delete(Student student);
//	resources中のStudentMapper.xmlとid同じ　***  searchAll regist delete
}
