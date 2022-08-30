package employee.view;

import java.util.List;
import java.util.Scanner;

import employee.service.EmployeeService;
import employee.vo.Employee;

public class EmployeeView {
	Scanner sc = new Scanner(System.in);
	EmployeeService service=new EmployeeService();
	public void menu() {
		int input=-1;
		
		while(input!=0) {
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴 선택 >> ");
			input=sc.nextInt();
			sc.nextLine();
			switch(input) {
			case 1: 
				addEmployee();
				break;
			case 2: 
				printAll();
				break;
			case 3: 
				printEmployee();
				break;
			case 4: 
				updateEmployee();
				break;
			case 5: 
				deleteEmployee();
				break;
			case 6: 
				printDepart();
				break;
			case 7: 
				printSal();
				break;
			case 8: 
				sumSal();
				break;
			case 0: 
				break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}

	private void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("[새로운 사원 정보 추가]");
		System.out.print("사원번호 : ");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.print("사원 이름 : ");
		String empName=sc.nextLine();
		System.out.print("주민등록번호 : ");
		String empNo=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc.nextLine();
		System.out.print("부서명 : ");
		String departmentTitle=sc.nextLine();
		System.out.print("직급명 : ");
		String jobName=sc.nextLine();
		System.out.print("급여 : ");
		int salary=sc.nextInt();
		
		if(service.addEmployee(empId,empName,empNo,email,phone,departmentTitle,jobName,salary)) {
			System.out.println("새로운 사원 정보가 추가되었습니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

	private void printAll() {
		System.out.println("[전체 사원 정보 조회]");
		List<Employee> empList =service.getEmpList();
		for(Employee e : empList) {
			System.out.println(e);
		}
		System.out.println();
		
	}

	private void printEmployee() {
		// TODO Auto-generated method stub
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		System.out.print("사원번호 : ");
		int empId=sc.nextInt();
		List<Employee> resultList=service.printEmployee(empId);
		if(resultList.isEmpty()) {
			System.out.println("일치하는 정보가 없습니다.");
			System.out.println();
		} else {
			for(Employee e : resultList) {
				System.out.println(e);
			}
			System.out.println();
		}
		
	}

	private void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("[사번이 일치하는 사원 정보 수정]");
		System.out.print("사원번호 : ");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.print("사원 이름 : ");
		String empName=sc.nextLine();
		System.out.print("주민등록번호 : ");
		String empNo=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		System.out.print("전화번호 : ");
		String phone=sc.nextLine();
		System.out.print("부서명 : ");
		String departmentTitle=sc.nextLine();
		System.out.print("직급명 : ");
		String jobName=sc.nextLine();
		System.out.print("급여 : ");
		int salary=sc.nextInt();
		if(service.updateEmployee(empId,empName,empNo,email,phone,departmentTitle,jobName,salary)==0) {
			System.out.println("사원번호 "+empId+"번 사원의 정보가 수정되었습니다.");
			System.out.println();
		} else {
			System.out.println("사번을 잘못 입력하였습니다.");
			System.out.println();
		}
	}

	private void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("[사번이 일치하는 사원 정보 삭제]");
		System.out.print("사원번호 : ");
		int empId=sc.nextInt();
		if(service.deleteEmployee(empId)) {
			System.out.println("사원번호 "+empId+" 사원의 정보가 삭제되었습니다.");
			System.out.println();
		} else {
			System.out.println("사번을 잘못 입력하였습니다.");
			System.out.println();
		}
	}

	private void printDepart() {
		// TODO Auto-generated method stub
		System.out.println("[입력 받은 부서와 일치 모든 사원 정보 조회]");
		System.out.print("부서명 : ");
		String departmentTitle=sc.nextLine();
		for(Employee e : service.printDepart(departmentTitle)) {
			System.out.println(e);
		}
		if(service.printDepart(departmentTitle).isEmpty()) {
			System.out.println("부서 정보를 잘못 입력햇습니다.");
		}
		System.out.println();
	}

	private void printSal() {
		// TODO Auto-generated method stub
		System.out.println("[입력 받은 급여 이상을 받는 모든 사원 정보 조회]");
		System.out.print("사원번호 : ");
		int salary=sc.nextInt();
		for(Employee e : service.printSal(salary)) {
			System.out.println(e);
		}
		if(service.printSal(salary).isEmpty()) {
			System.out.println("부서 정보를 잘못 입력햇습니다.");
		}
		System.out.println();
	}

	private void sumSal() {
		// TODO Auto-generated method stub
		System.out.println("[부서별 급여 합 전체 조회]");
		System.out.println(service.sumSal());
	}

}
