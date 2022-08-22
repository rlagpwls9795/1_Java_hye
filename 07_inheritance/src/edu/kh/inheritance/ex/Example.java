package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Student;

public class Example {
	public void ex1() {
		//상속 확인
		
		//Student 객체 생성
		Student s1=new Student();
		//자식만의 기능/필드 (grade, classroom)
		s1.setGrade(2); //setGrade(int grade) : void - Student (Student의 메서드)
		s1.setClassroom(3); //(Student의 메서드)
		s1.setName("김개똥"); //setName(String name) : void - Person (Person의 메서드)
		s1.setAge(15); //(Person의 메서드)
		System.out.println(s1.getGrade()); //int edu.kh.inheritance.model.vo.Student.getGrade()
		System.out.println(s1.getClassroom());
		System.out.println(s1.getName()); //String edu.kh.inheritance.model.vo.Person.getName()
		System.out.println(s1.getAge());
	}

}
