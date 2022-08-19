package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		//길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		//순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		//짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		int arr[] = new int[9];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			if(i%2==0) {
				sum += i+1;
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : "+ sum);
	}
	
	public void practice2() {
		//길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		//순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		//홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		int arr[] = new int[9];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
			if(i%2!=0) {
				sum += i+1;
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : "+ sum);
	}
	
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int arr[]=new int[input];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		//정수 5개를 입력 받아 배열을 초기화 하고
		//검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		//배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		boolean flag=true; 
		for(int i=0;i<arr.length;i++) {
			System.out.printf("입력 %d : ",i);
			int input=sc.nextInt();
			arr[i]=input;
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("인덱스 : "+i);
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		//문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
		//검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input1 = sc.next();
		char arr[]=new char[input1.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=input1.charAt(i);
		}
		System.out.print("문자 : ");
		char input2=sc.next().charAt(0);
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ",input1, input2);
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input2) {
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println();
		System.out.printf("%s 개수 : %d \n",input2,cnt);
	}
	
	public void practice6() {
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input=sc.nextInt();
		int arr[]=new int[input];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}
	
	public void practice7() {
		//주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		//단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str=sc.next();
		char arr[]=new char[str.length()];
		for(int i=0;i<arr.length;i++) {
			if(i<8) {
				arr[i]=str.charAt(i);
			} else {
				arr[i]='*';
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public void practice8() {
		//3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		boolean flag2=true;
		while(flag) {
			System.out.print("정수 : ");
			int input=sc.nextInt();
			if(input<3 || input%2==0) {
				System.out.println("다시 입력하세요.");	
			} else {
				flag=false;
				int arr[]=new int[input*2-1];
				for(int i=0;i<arr.length;i++) {
					if(i<=input-1) {
						arr[i]=i+1;
					} else {
						arr[i]=input*2-1-i;
					}
					System.out.print(arr[i]);
					if(i!=arr.length-1) {
						System.out.print(", ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public void practice9() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		int arr[]=new int[10];
		System.out.print("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*11);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void practice10() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		//1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int arr[]=new int[10];
		System.out.print("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			} 
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice11() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int arr[]=new int[10];
		System.out.print("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			int ran=(int)(Math.random()*10+1);
			arr[i]=ran;
			for(int j=0;j<i;j++) {
				if(arr[j]==ran) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void practice12() {
		//로또 번호 자동 생성기 프로그램을 만들기.
		//(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			int ran=(int)(Math.random()*45+1);
			arr[i]=ran;
			for(int j=0;j<i;j++) {
				if(arr[j]==ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void practice13() {
		//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		//문자의 개수와 함께 출력하세요. (중복 제거)
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		char arr[]=new char[str.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					arr[i]=0;
					j--;
					break;
				}
			}
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				cnt++;
			}
		}
		char arr2[]=new char[cnt];
		int empty=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr2[i-empty]=arr[i];
			} else {
				empty++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println("문자 개수 : "+cnt);
	}
	
	public void practice14() {
		/*사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.*/
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		String arr[]=new String[input];
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			String str = sc.nextLine();
			arr[i]=str;
		}
		boolean flag=true;
		while(flag) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String yesorno=sc.next();
			if(yesorno.equals("y")) {
				System.out.print("배열의 크기를 입력하세요 : ");
				int input2 = sc.nextInt();
				sc.nextLine();
				input += input2;
				String arr2[]=new String[input];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				for(int i=arr.length;i<input;i++) {
					System.out.print((i+1)+"번째 문자열 : ");
					String str = sc.nextLine();
					arr2[i]=str;
				}
				arr=arr2;
				
			} 
			if(yesorno.equals("n")) {
				flag=false;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice15() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		String arr[][]=new String[3][3];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]="("+row+", "+col+")";
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
	}
	
	public void practice16() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		int arr[][]=new int[4][4];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=row*arr.length+col+1;
				System.out.printf("%3d",arr[row][col]);
			}
			System.out.println();
		}
	}
	public void practice16v2() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		int arr[][]=new int[4][4];
		int cnt=0;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=cnt+1;
				System.out.printf("%3d",arr[row][col]);
				cnt++;
			}
			System.out.println();
		}
	}
	
	public void practice17() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		int arr[][]=new int[4][4];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=arr.length*arr[row].length-(row*arr.length+col);
				System.out.printf("%3d",arr[row][col]);
			}
			System.out.println();
		}
	}
	public void practice17v2() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		int arr[][]=new int[4][4];
		int cnt=0;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=16-cnt;
				System.out.printf("%3d",arr[row][col]);
				cnt++;
			}
			System.out.println();
		}
	}
	
	public void practice18() {
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요.
		int arr[][]=new int[4][4];
		for(int row=0;row<arr.length-1;row++) {
			for(int col=0;col<arr[row].length-1;col++) {
				int ran =(int)(Math.random()*11);
				arr[row][col]=ran;
				arr[row][arr[col].length-1] +=ran;
				arr[arr.length-1][col] +=ran;
				arr[arr.length-1][arr[col].length-1] +=ran;
			}
		}
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.printf("%3d",arr[row][col]);				
			}
			System.out.println();
		}
	}
	
	public void practice19() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		//“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int row=sc.nextInt();
		System.out.print("열 크기 : ");
		int col=sc.nextInt();
		boolean flag =true;
		while(flag) {
			if((row<1 && row>10) || (col<1 && col>10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				flag=false;
			}
		}
		char arr[][]=new char[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				char ran = (char)((int)(Math.random()*26+65));
				arr[i][j]=ran;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%s ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice20() {
		//사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		//문자형 가변 배열을 선언 및 할당하세요.
		//그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row =sc.nextInt();
		char arr[][]=new char[row][];
		char str='a';
		for(int i=0;i<row;i++) {
			System.out.print(i+"번째 크기 : ");
			int col=sc.nextInt();
			arr[i]=new char[col];
			for(int j=0;j<col;j++) {
				arr[i][j]=str;
				str++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%s ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		//1차원 문자열 배열에 학생 이름 초기화되어 있다.
		//3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
		//학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
		//(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String arr1[][]=new String[3][2];
		String arr2[][]=new String[3][2];
		System.out.println("==1분단==");
		int cnt=0;
		for(int row=0;row<arr1.length;row++) {
			for(int col=0;col<arr1[row].length;col++) {
				arr1[row][col]=students[cnt];
				cnt++;
				System.out.print(arr1[row][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("==2분단==");
			for(int row=0;row<arr2.length;row++) {
				for(int col=0;col<arr2[row].length;col++) {
					arr2[row][col]=students[cnt];
					cnt++;
					System.out.print(arr2[row][col]+ " ");
				}
				System.out.println();
		}	
	}

	
	public void practice22() {
		//위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
		//해당 학생이 어느 자리에 앉았는지 출력하세요.
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String arr1[][]=new String[3][2];
		String arr2[][]=new String[3][2];
		System.out.println("==1분단==");
		int cnt=0;
		for(int row=0;row<arr1.length;row++) {
			for(int col=0;col<arr1[row].length;col++) {
				arr1[row][col]=students[cnt];
				cnt++;
				System.out.print(arr1[row][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("==2분단==");
		for(int row=0;row<arr2.length;row++) {
			for(int col=0;col<arr2[row].length;col++) {
				arr2[row][col]=students[cnt];
				cnt++;
				System.out.print(arr2[row][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input=sc.next();
		int num1=0;
		int num2=0;
		String num3="";
		boolean flag=true;
		for(int row=0;row<arr1.length;row++) {
			for(int col=0;col<arr1[row].length;col++) {
				if(input.equals(arr1[row][col])) {
					num1=1;
					num2=row+1;
					if(col==0) {
						num3="왼쪽";
					} else {
						num3="오른쪽";
					}
					flag=false;
				}
			}
		}
		if(flag) {
			for(int row=0;row<arr2.length;row++) {
				for(int col=0;col<arr2[row].length;col++) {
					if(input.equals(arr2[row][col])) {
						num1=2;
						num2=row+1;
						if(col==0) {
							num3="왼쪽";
						} else {
							num3="오른쪽";
						}
					}
				}
			}
		}
		System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.",input,num1,num2,num3);
	}
	
	public void practice23() {
		//String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
		//그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요.
		String arr[][]=new String[6][6];
		Scanner sc = new Scanner(System.in);
		System.out.print("행 인덱스 입력 : ");
		int row=sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==row+1 && j==col+1) {
					arr[i][j]="x";
				} else {
					arr[i][j]=" ";
					if(i==0) {
						arr[i][0]=" ";
						for(int k=0;k<arr[i].length-1;k++) {
							arr[i][k+1]=""+k;
						}
					}
					if(j==0) {
						arr[0][j]=" ";
						for(int k=0;k<arr.length-1;k++) {
							arr[k+1][j]=""+k;
						}
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice24() {
		//실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
		String arr[][]=new String[6][6];
		Scanner sc = new Scanner(System.in);
		System.out.print("행 인덱스 입력 : ");
		int row=sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==row+1 && j==col+1) {
					arr[i][j]="x";
				} else {
					arr[i][j]=" ";
					if(i==0) {
						arr[i][0]=" ";
						for(int k=0;k<arr[i].length-1;k++) {
							arr[i][k+1]=""+k;
						}
					}
					if(j==0) {
						arr[0][j]=" ";
						for(int k=0;k<arr.length-1;k++) {
							arr[k+1][j]=""+k;
						}
					}
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		boolean flag=true;
		while(flag) {
			System.out.print("행 인덱스 입력 : ");
			int row2=sc.nextInt();
			if(row2 != 99) {
				System.out.print("열 인덱스 입력 : ");
				int col2=sc.nextInt();
				String arr2[][]=new String[6][6];
				arr2=arr;
				for(int i=0;i<arr2.length;i++) {
					for(int j=0;j<arr2[i].length;j++) {
						if(i==row2+1 && j==col2+1) {
							arr2[i][j]="x";
						}
					}
				}
				for(int i=0;i<arr2.length;i++) {
					for(int j=0;j<arr2[i].length;j++) {
						System.out.print(arr2[i][j]+" ");
					}
					System.out.println();
				}
			} else {
				System.out.println("프로그램 종료");
				flag=false;
			}
		}
	}
	
}
































