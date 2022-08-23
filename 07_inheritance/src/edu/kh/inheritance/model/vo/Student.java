package edu.kh.inheritance.model.vo;

public class Student extends Person {
	//자식 Student 클래스에 부모 Person 클래스의 멤버(필드, 메서드)를 상속한다.
	//extend : 확장하다 -> 자식이 자신의 멤버 + 부모의 멤버를 가지게 되어 몸집이 커짐
	
	private int grade;
	private int classroom;
	
	public Student() {
//		Person(); //부모 생성자는 상속 X
		super(); //super 생성자
		//부모의 생성자를 참조하기 위해서 사용하는 생성자
		//자식 생성자 내부 첫 번째 줄에서만 작성 가능 (미작성 시 컴파일러가 자동 추가)
		//자식 객체 생성 시 내부에 부모 객체를 생성할 때 사용한다.
	}
	
	//매개변수 생성자
	public Student(String name, int age, int grade, int classsRoom) {
		//상속 받은 자식도 부모의 private 필드는 직접 접근 불가
//		this.name=name;
//		this.age=age;
		//방법 1. 부모의 getter/setter 이용
//		siper.setName(name);
//		super.setAge(age);
		//방법 2. super() 생성자 이용
		super(name,age); 
		//edu.kh.inheritance.model.vo.Person.Person(String name, int age)
		
		this.grade=grade;
		this.classroom=classsRoom;
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
	
	//Person 으로부터 상속 받은 introduce() 메서드 오버라이딩
	@Override
	public void introduce() {
		super.introduce(); //오버라이딩 되지 않은 부모의 introduce() 메서드를 호출
//		System.out.println("이름 : "+super.getName());
//		System.out.println("나이 : "+super.getAge());
		System.out.println("학년 : "+this.getGrade());
		System.out.println("반  : "+this.getClassroom());
	}
	
	/* Annotation(@) : 컴파일러용 주석
	 * ->컴파일러에게 해당 코드가 무엇을 의미하는지
	 *   아니면 해당 코드를 수행하기 전에 무엇을 수행해야 하는지 등을 알려줌
	 *   
	 *   @Override 
	 *   1) 컴파일러에게 해당 메서든 오버라이딩 되었음을 알려줌
	 *   2) 오버라이딩이 가능한지, 잘못 작성되지 않았는지 검사
	 *   
	 * */
	

}
