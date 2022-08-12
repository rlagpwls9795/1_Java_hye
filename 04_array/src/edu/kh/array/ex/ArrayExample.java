package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	/* [배열] 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불러지고 각 변수들은 index를 이용하여 구분
	 */
	public void ex1() {
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		int sum=num1+num2+num3+num4;
		System.out.println("합계 : "+sum);
		
		//배열이용
		int[] arr=new int[4]; //int형 변수 4개를 묶음으로 다룰 수 있는 배열 생성
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		int sum2=0;
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
			sum2+=arr[i];
		}
		System.out.println("합계 : "+sum2);
	}
	
	public void ex2() {
		//int[]을 참조하는 변수 arr 선언
		int[] arr; //배열 시작주소를 저장하는 변수 (참조형, 4byte)
		arr=new int[4]; 
		//heap 영역에 int 4칸짜리 배열을 할당(생성)하고 
		//할당된 배열의 시작주소를 arr에 대입
		
		System.out.println("배열 길이 : "+arr.length);
		//arr.length : arr이 참조하고 있는 배열의 길이
		
		System.out.println("컴파일러가 0으로 초기화?");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		//stack 영역은 컴파일러가 초기화 X
		//heap 영역은 컴파일러가 초기화 O		
		System.out.println("===========================");
		
		//배열 초기화
		//1)인덱스를 이용한 초기화
		arr[0]=100; //arr int[] 참조형 변수가 참조하고 있는 배열의 0번 인덱스에 100 대입
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr1[%d] = %d\n",i,arr[i]);
		}
		System.out.println("===========================");
		//2)for문을 이용한 초기화
		int arr2[]=new int[10];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=10*(i+1);
			System.out.printf("arr2[%d] = %d\n",i,arr2[i]);
		}
		System.out.println("===========================");
		
	}
	
	//5명의 키(cm)를 입력 받고 평균 구하기
	// 1번 키 입력 : 170.5
    // 2번 키 입력 : 165.7
    // 3번 키 입력 : 184.3
    // 4번 키 입력 : 190.2
    // 5번 키 입력 : 174.4
    // 입력 받은 키 : 170.5  165.7  184.3  190.2  174.4
    // 평균 : 177.02cm
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		double[] heightArr= new double[5];
		double sum=0.0;
		for(int i=0;i<heightArr.length;i++) {
				System.out.print((i+1)+"번 키 입력 : ");
				heightArr[i]=sc.nextDouble();	
		}
		//System.out.println(heightArr); 
		//배열 주소 출력 -> heightArr의 참조 변수에는 배열의 시작 주소가 저장되어 있기 때문
		//System.out.println(Arrays.toString(heightArr));
		//Arrays.toString(배열명) : 배열에 저장된 모든 값을 한 줄로 간단히 출력
		System.out.println();
		System.out.print("입력받은 키 : ");
		for(int i=0;i<heightArr.length;i++) {
			sum += heightArr[i];
			System.out.print(heightArr[i]+" ");
		}
		System.out.printf("\n평균 : %.2fcm",sum/heightArr.length);
	}

	public void ex4() {
		//ArrayIndexOutOfBoundsException : 인덱스가 범위를 벗어났을 때 오류
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); 
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//3)배열 선언과 동시에 (할당 및) 초기화
	public void ex5() {
		int[] arr= {10,20,30,40};
		//1.int[]을 참조하는 변수 arr 선언
		//2.heap 영역에 int형 4칸짜리 배열을 할당(생성) 후 각각의 인덱스 10,20,30,40으로 초기화
		//3.할당된 배열의 시작주소를 arr에 대입
		System.out.println("배열 길이 : "+arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	//점심 메뉴 뽑기 프로그램
	public void ex6() {
		String[] menuArr = {"김밥+라면","KFC","맘스터치","서브웨이"
				,"백반집","순대국","곰탕","파스타","삼겹살","빵"};
		int ran = (int)(Math.random()*menuArr.length);
		System.out.print("오늘 점심 메뉴 : "+menuArr[ran]);
	}
	//=================배열 응용====================
	
	//// ex)
    // 입력 받을 인원 수 : 4
    // 1번 점수 입력 : 100
    // 2번 점수 입력 : 80
    // 3번 점수 입력 : 50
    // 4번 점수 입력 : 60
    
    // 합계 : 290
    // 평균 : 72.5
    // 최고점 : 100
    // 최저점 : 50
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int size=sc.nextInt();
		int[] scoreArr=new int[size];
		int sum=0;
		for(int i=0;i<scoreArr.length;i++) {
			System.out.print((i+1)+"번 점수 입력 : ");
			scoreArr[i]=sc.nextInt();
			sum += scoreArr[i];
		}
		int max=scoreArr[0];
		int min=scoreArr[0];
		
		//breakpoint를 지정한 라인 이전에 멈춤
		//for문에 breakpoint 지정 : 증감식이 해석되기 전에 멈춤
		
		for(int i=1;i<scoreArr.length;i++) { 
			if(scoreArr[i]>max) {
				max=scoreArr[i];
			} 
			if(scoreArr[i]<min) {
				min=scoreArr[i];
			}
		}
		System.out.println("\n합계 : "+sum);
		System.out.printf("평균 : %.1f\n",(double)sum/scoreArr.length);
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);
	}
	
	//배열 내 데이터 검색
	public void ex8() {
		int[] arr= {100,200,300,400,500,600,700,800,900,1000};
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int search = sc.nextInt();
		boolean flag=true; 
		//true:for문이 종료된 후 존재 O
		//false:for문이 종료된 후 존재 X
		//배열 순차 접근(반복 접근)
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(i+"번째 인덱스에 존재합니다.");
				flag=false;
				break; //중복 데이터가 없으면 추가 검색을 하지 않아도 됨
			} 
		}
		if(flag) {
			System.out.println("존재하지 않습니다.");
		}
	}
	
	//배열을 이용한 중복 데이터 제거 + 정렬
	public void createLottoNumber() {
		System.out.println("***** 로또 번호 생성기 *****");
		//난수 6개를 저장할 배열 선언 및 할당
		int lotto[]=new int[6];
		//난수를 생성하여 lotto 배열에 추가
		for(int i=0;i<lotto.length;i++) {
			int ran=(int)(Math.random()*45+1);
			lotto[i]=ran;
			//현재 인덱스(i) 이전의 요소를 순차 접근
			for(int j=0;j<i;j++) {
				if(lotto[j]==ran) {
					i--; //i값을 인위적으로 감소
					break;
				}
			} 
		}
		//Arrays.sort(); : 배열 내 값을 오름차순 정렬
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	//얕은 복사 : 참조하는 주소만을 복사하여 서로 다른 참조 변수가 하나의 배열(또는 객체)를 참조하게 하는 복사
	//특징 : 하나의 배열을 참조하기 때문에 값을 공유
	public void ex9() {
		int[] arr= {99,70,80,50,40};
		//arr변수에 저장된 배열의 시작 주소를 copyArr에 대입(얕은 복사)
		int[] copyArr=arr;
		System.out.println("arr: "+arr); 
		System.out.println("copyArr: "+copyArr); //--> 주소 같음
		
		System.out.println("[변경 전]");
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("copyArr: "+Arrays.toString(copyArr));
		
		copyArr[2]=10000;
		System.out.println("[변경 후]");
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("copyArr: "+Arrays.toString(copyArr));
		//복사본 값 변경-> 원본도 값 변경 : 값을 공유(얕은 복사 틍징)
	}
	
	//깊은 복사 : 원본과 같은 자료형, 크기의 새로운 배열을 만들어 원본의 데이터를 모두 복사하는 방법 (=복제)
	//-->원본 데이터를 보존하면서 복사본의 데이터 가공을 진행하는 경우에 많이 사용
	public void ex10() {
		int[] arr= {99,70,80,50,40};
		
		//깊은 복사를 위한 배열 선언 및 할당
		int[] copyArr=new int[arr.length];
		//원본 데이터를 모두 복사
		//1)for문 이용 (index가 동일하다는 특징 이용)
		for(int i=0;i<arr.length;i++) {
			copyArr[i]=arr[i];
		}
		System.out.println("arr: "+arr); 
		System.out.println("copyArr: "+copyArr); //주소 다름
		
		System.out.println("[변경 전]");
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("copyArr: "+Arrays.toString(copyArr));
		
		copyArr[2]=10000;
		System.out.println("[변경 후]");
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("copyArr: "+Arrays.toString(copyArr));
		//복사본 값 변경-> 원본도 값 변경X : 값 공유 X -> 서로 다른 배열
		
		System.out.println();
		
		//2)System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		int[] arr2= {99,70,80,50,40};
		int[] copyArr2=new int[arr2.length];
		System.arraycopy(arr2, 0, copyArr2, 0, arr2.length);
		
		System.out.println("arr: "+Arrays.toString(arr2));
		System.out.println("copyArr: "+Arrays.toString(copyArr2));
		
		System.out.println();
		
		//3)복사할 배열의 참조 변수=Arrays.copyOf(원본배열,복사할 길이);
		int[] arr3= {99,70,80,50,40};
		int[] copyArr3=new int[arr3.length];
		copyArr3=Arrays.copyOf(arr3, arr3.length);
		System.out.println("arr: "+Arrays.toString(arr3));
		System.out.println("copyArr: "+Arrays.toString(copyArr3));
	}
	
	//null 의미 : 참조하는 것(배열, 객체)이 없다를 의미하는 값
	public void ex11() {
		int[] arr1=new int[3];
		System.out.println(arr1==null); //false
		if(arr1!=null) { 
			System.out.println(arr1[0]);
		}
		System.out.println("=====================");
//		int[] arr2;
//		System.out.println(arr2); 
//		//배열참조변수를 선언만 했을 때 ==> 초기화 오류
		int[] arr2=null;
		System.out.println(arr2);
		//배열 찬조 변수 선언 및 null 초기화 ==> 값은 있으나 참조하는게 없다
		
		if(arr2==null) {
			arr2=new int[4];
		} //arr2가 참조하는 배열이 없을 때 새로운 배열을 생성하여 그 시작 주소를 arr2에 대입
		System.out.println(arr2);
	}
}

