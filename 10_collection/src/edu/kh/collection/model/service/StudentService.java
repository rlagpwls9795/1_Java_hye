package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {	
			//부모 타입 참조 변수 List
	private List<Student> stdList=new ArrayList<Student>(); 
									//Student 타입으로 제한된 ArrayList 객체 생성
	public StudentService() {
		stdList.add(new Student("user1", 18, "서울시 강남구", 'M', 80));
		stdList.add(new Student("user2", 17, "서울시 중구", 'F', 70));
		stdList.add(new Student("user3", 19, "경기도 부천시", 'F', 100));
	}
	/** stdList에 학생 정보 추가 메서드
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return 
	 * true : 학생 정보 추가 성공 시
	 * false : 학생 정보 추가 실패 시
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		//제네릭 확인 테스트
//		List test1=new ArrayList();
//		List<String> test2 = new ArrayList<String>();
//		List<Integer> test3 = new ArrayList<Integer>();
		//List.add(E e) -> 제네릭 <E>에 작성되는 타입으로 모든 E가 변화함
		//test1.add(Object e) -> 타입 제한 X, 모든 참조 변수가 Object 타입	
		//test2.add(String s) -> 타입 제한 O, 모든 참조 변수가 String 타입
		//test3.add(Integer i) -> 타입 제한 O, 모든 참조 변수가 Integer 타입
		
		Student std=new Student(name, age, address, gender, score);
		//boolean add(Student e) : add() 결과로 boolean 반환
		return stdList.add(std);
	}
	
	/**학생 전체 조회 시 stdList 반환 메서드
	 * @return stdList
	 */
	public List<Student> getStdList() {
		return stdList;
	}
	
	/**학생 정보 수정 메서드
	 * @param idx
	 * @param address
	 * @param score
	 * @return
	 * true:인덱스가 일치하는 학생 정보 수정 성공 시
	 * false:인덱스가 일치하는 학생이 없을 경우
	 */
	public boolean updateStudent(int idx, String address, int score) {
		if(idx<0 || idx>=stdList.size()) { //입력받은 idx가 stdList 에 존재하는 요소의 인덱스 범위를 넘어선 경우
			return false;			
		} else {
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			return true;
		}
	}
	
	/**학생 정보 제거 메서드
	 * @param idx
	 * @return 
	 * null : 일치하는 인덱스가 없는 경우 null 반환
	 * Student 객체 : 일치하는 인덱스가 있는 경우 stdList에서 제거된 요소 반환
	 */
	public Student removeStudent(int idx) {
		//일치하는 인덱스가 있으면 해당 학생 정보를 stdList를 제거하고 제거된 학생 정보를 반환
		//일치하는 인덱스가 없으면 null 반환
		if(idx<0 || idx>=stdList.size()) { 
			return null;			
		} else {
			return stdList.remove(idx);
		}
	}
	
	/**일치하는 이름 검색 메서드
	 * @param name
	 * @return resultList
	 */
	public List<Student> selectStudent1(String name) {
		List<Student> resultList=new ArrayList<Student>();
		for(Student s:stdList) {
			if(s.getName().equals(name)) { //stdList에서 얻어 온 Student의 s객체의 이름과 검색된 이름이 같은 경우
				resultList.add(s);
			} 
		}
		return resultList;
	}
	
	/**포함하는 이름 메서드
	 * @param name
	 * @return resultList
	 */
	public List<Student> selectStudent2(String name) {
		List<Student> resultList=new ArrayList<Student>();
		for(Student s : stdList) {
			if(s.getName().contains(name)) { //검색한 이름이 학생 이름에 포함되어 있는 경우
				//String.contatins() : 문자열에 값이 포함되어 있으면 true
				resultList.add(s);
			} 
		}
		return resultList;
	}
	
	
}
