package com.ram.presistance;

import com.ram.dto.Student;

public interface IStudentDao {
	
	//Operations to be implemented
	public String addStudent(String sname,Integer sage,String address);
	
	public Student searchStudent(Integer sid);
	
	public String updateStudent(Integer sid, String sname, Integer sage, String address);
	
	public Student deleteStudent(Integer sid);
	
}
