package edu.kh.inheritance.model.vo;

public class Student extends Person {
	//자식 Student 클래스에 부모 Person 클래스의 멤버(필드, 메서드)를 상속한다.
	//extend : 확장하다 -> 자식이 자신의 멤버 + 부모의 멤버를 가지게 되어 몸집이 커짐
	
	private int grade;
	private int classroom;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	

}
