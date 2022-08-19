package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.User;

public class UserService {
	//회원 가입 서비스 메서드
	
	//반환형이 클래스명 == 반환되는 값이 해당 클래스를 이용해 만들어진 객체의 주소 값
	public User signUp(String userId, String userPw, String UserName, int UserAge, char UserGender) {
		//기본 생성자를 이용해서 User 객체 생성
		User u=new User();
		
		//setter를 이용해서 매개변수로 전달 받은 값을 세팅
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(UserName);
		u.setUserAge(UserAge);
		u.setUserGender(UserGender);
		
		return u; //User 객체의 시작 주소를 반환
	}
	
	public int login(String id, String pw, User user) {
		              //입력된 id/pw + 가입한 회원정보를 가지고 있는 객체의 주소
		
		//회원가입을 안 하고 로그인을 시도하는 경우
		if(user == null) {
			return -1;
		} else { //회원 가입 된 경우
			if(user.getUserId().equals(id) && user.getUserPw().equals(pw)) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	public void updateUser(String name, int age, char gender, User loginUser) {
		loginUser.setUserName(name);
		loginUser.setUserAge(age);
		loginUser.setUserGender(gender);
	}

}
