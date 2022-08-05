package edu.kh.variable.ex1;

public class VariableExample3 {
	
	//자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 구문
	public static void main(String[] args) {
		
		//*** 변수 명명 규칙 ***
		//1. 대소문자가 구분되며 길이 제한이 없다. (단, 띄어쓰기 불가)
		int num1;
		int Num1;
//		int Num1; //오류 Duplicate local variable Num1 (Num1 변수 중복)
		int abcdefghijklmnopqrstuvwxyz; //길이 제한 없음
//		int abcdefghijklm nopqrstuvwxyz; //띄어 쓰면 에러 발생
		
		//2. 예약어를 사용하면 안 된다.
/*		int int;
		int true;
		boolean final;
		char void;
*/		
		//3. 숫자로 시작하면 안 된다.
		int age1;
//		int 1age; //Syntax error on token "1", delete this token (문법 오류)
		
		//4. 특수문자는 '_'와 '$'만을 허용한다. (비추)
		//   ->$는 내부 클래스 사용 시 자동으로 붙는 기호 (직접 사용 안 함)
		//   ->_는 상수 단어 구분 외에는 사용 안 함
		double dNum$;
		float _f_num$;
//		long longnum!; //Syntax error on token "!", delete this token
		
		//5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다. 단, 첫 시작 글자는 소문자로 하는 것이 관례
		//   ==카멜 표기법
		//   첫 시작 글자 소문자가 아니면 --> 오류는 발생하지 않지만 개발자들 간의 약속/관례
		int userAge;
		int HelloWorld;
		int helloWorld;
		
		//cf. 변수명은 언어 제한이 없다.
		//단, 코드 공유 시 글자 깨짐이 발생할 수 있어서 권장하지 않음
		int 정수1;
		boolean 참거짓;
		
		// ** 변수는 한 개의 데이터만 보관 가능 **
		int iNum = 30;
		System.out.println(iNum);
		
		iNum = 50;
		System.out.println(iNum); //50,  마지막 값만 보관됨
		
		//문자열 자료형 String (참조형)
		//리터럴 : 문자열
		//리터럴 표기법 : ""
		String str1;
		str1 = "안녕하세요?"; //str1 변수의 초기화 (최초 값 대입)
		System.out.println(str1);
		
		str1 = "String도 기본 자료형 변수처럼 값을 변경할 수 있다.";
		System.out.println(str1);
		
		//변수 선언과 동시에 초기화
		String name = "김혜진";
		int age = 26;		
		char gender = '여';
		
		System.out.println("------------------------");
		System.out.println(age+10); //숫자+ 숫자 = 두 숫자의 합
		System.out.println(name + "입니다."); //문자열 + 문자열 = 이어쓰기
		System.out.println(name + age); //문자열 + 숫자 = 이어쓰기
		System.out.println(age+10+name); //숫자+숫자+문자열 = 숫자의 합 + 문자열(이어쓰기)
		System.out.println(name+age+10); //문자열+숫자+숫자 = 이어쓰기
		
		//김혜진님은 26세 여성입니다.
		System.out.println(name+"님은 "+age+"세 "+gender+"성입니다.");
		
		System.out.println("------------------------");
		
		//상수(final) : 항수 (=항상 같은 수)
		//한 번 값을 기록하면 값을 바꿀 수 없는 변수
		int num2=200;
		num2=300;
		//상수는 대문자로 표기 or final
		int CONSTANT_NUBER=100000000;
		final int CONSTANT_NUBER1=1000000000;
		
//		CONSTANT_NUBER1=1; // 값을 바꾸면 오류
		System.out.println(CONSTANT_NUBER1);
		
		final int INIT = 0;
		final int UP = 10;
		final int DOWN = -10;
		
		int num3=INIT;
		System.out.println(num3); //0
		
		num3 = num3 + UP;
		System.out.println(num3); //10
		
		num3 = num3 + DOWN * 3; 
		System.out.println(num3); //-20
		
		
	}
	
}













