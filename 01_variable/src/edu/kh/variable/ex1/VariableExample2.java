package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
	/*변수 선언 : 메모리에 값을 저장할 공간을 할당*/
		
		boolean  booleanData; 
		//논리값(true/false)을 저장할 공간 1byte를 메모리에 할당하고 
		//그 공간을 booleanData라고 부르겠다.
		
		int iNum;
		//정수 값을 저장할 공간 4byte를 메모리에 할당하고
		//그 공간을 iNum이라고 부르겠다.
		
		long longNum;
		//정수 값을 저장할 공간 8byte를 메모리에 할당하고
		//그 공간을 longNum이라고 부르겠다.
		
		byte bNum;
		bNum = 127;
		
		short sNum;
		sNum = 1000;
		//-> byte/short 는 거의 사용되지 않는 자료형으로
		//   별도의 리터럴 표기법이 없음 => int 표기법 사용
		
		float fNum; //실수형 변수 4byte 할당
		
		double dNum; //실수형 변수 8byte 할당
		
		char ch1; //문자형 변수 2byte 할당
		char ch2; //문자형 변수 2byte 할당
		
		
	/*값 대입 : 선언된 변수에 값(리터럴)을 대입하는 것*/
		
		booleanData = false;
		//boolean 자료형 변수는 true/false 만 저장할 수 있다.
		// -> boolean의 리터럴 표기법은 true/false
		
		iNum = 1000000;
		//->int의 리터럴 표기법은 기본적인 정수 표기법
//		iNum = 10000000000; 
		//The literal 1000000000 of type int is out of range
		
//		longNum = 10000000000; //오류
		//10000000000은 int 표기법이므로 int의 최대 크기를 넘어설 수 없다.
		longNum = 10000000000L;
		//long 자료형의 리터럴 표기법은 정수 뒤에 L 또는 l 작성.
		
//		fNum = 3.14; //오류
		fNum = 3.14f;
		//float의 리터럴 표기법은 F 또는 f 를 뒤에 추가
		
		dNum = 1.23;
		//double의 리터럴 표기법은 기본 실수 표기법
		
		ch1 = 'A';
		//char의 리터럴 표기법은 ''
		
		ch2 = 66; // 'B'
		//char 자료형은 "숫자-문자" 형태의 문자표에서 
		//일치하는 문자나 숫자의 문자 부분만 출력
		
		
		System.out.println(booleanData);
		System.out.println(iNum);
		System.out.println(longNum); 
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(fNum); 
		System.out.println(dNum);
		System.out.println(ch1); //A
		System.out.println(ch2); //B
		
		//출력 시 f , L 과 같은 리터럴 표기법은 생략
		
		
	}

}
