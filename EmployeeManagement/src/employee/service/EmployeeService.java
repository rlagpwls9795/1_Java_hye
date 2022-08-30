package employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import employee.vo.Employee;

public class EmployeeService {
	List<Employee> empList=new ArrayList<Employee>();
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		empList.add(new Employee(100,"user1","1234-5678","aaa@gmail.com","010-1111-1111","depart1","job1",100));
		empList.add(new Employee(200,"user2","5678-1234","bbb@gmail.com","010-2222-2222","depart2","job1",200));
		empList.add(new Employee(300,"user3","1234-9999","ccc@gmail.com","010-3333-3333","depart2","job2",400));
		empList.add(new Employee(400,"user4","5555-5555","ddd@gmail.com","010-4444-4444","depart3","job1",100));
		empList.add(new Employee(500,"user5","9876-4321","eee@gmail.com","010-5555-5555","depart3","job4",700));
		empList.add(new Employee(600,"user6","1591-3573","fff@gmail.com","010-6666-6666","depart3","job2",300));
		empList.add(new Employee(700,"user7","9999-0000","ggg@gmail.com","010-7777-7777","depart4","job1",200));
		empList.add(new Employee(800,"user8","1357-2468","hhh@gmail.com","010-8888-8888","depart4","job3",500));
	}

	/**새로운 사원 정보 추가 메서드
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 */
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone, String departmentTitle,
			String jobName, int salary) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		return empList.add(emp);
	}
	
	/**전체 사원 정보 조회 메서드
	 * @return 사원 리스트
	 */
	public List<Employee> getEmpList() {
		return empList;
	}

	/** 사번이 일치하는 사원 정보 조회 메서드
	 * @param empId
	 */
	public List<Employee> printEmployee(int empId) {
		// TODO Auto-generated method stub
		List<Employee> resultList=new ArrayList<Employee>();
		for(Employee e: empList) {
			if(empId== e.getEmpId()) {
				resultList.add(e);
			}
		}
		return resultList;
	}

	/**사번이 일치하는 사원 정보 수정 메서드
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return
	 */
	public int updateEmployee(int empId, String empName, String empNo, String email, String phone,
			String departmentTitle, String jobName, int salary) {
		// TODO Auto-generated method stub
		for(Employee e:empList) {
			if(empId==e.getEmpId()) {
				e.setEmpName(empName);
				e.setEmpNo(empNo);
				e.setEmail(email);
				e.setPhone(phone);
				e.setDepartmentTitle(departmentTitle);
				e.setJobName(jobName);
				e.setSalary(salary);
				return 0;
			}
		}
		return -1;
	}

	/**사번이 일치하는 사원 정보 삭제 메서드
	 * @param empId
	 */
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		for(Employee e:empList) {
			if(empId==e.getEmpId()) {
				empList.remove(e);
				return true;
			}
		}
		return false;
	}

	/**입력 받은 부서와 일치 모든 사원 정보 조회 메서드
	 * @param departmentTitle
	 */
	public List<Employee> printDepart(String departmentTitle) {
		// TODO Auto-generated method stub
		List<Employee> resultList=new ArrayList<Employee>();
		for(Employee e : empList) {
			if(departmentTitle.equals(e.getDepartmentTitle())) {
				resultList.add(e);
			}
		}
		return resultList;
	}

	/**입력 받은 급여 이상을 받는 모든 사원 정보 조회 메서드
	 * @param salary
	 */
	public List<Employee> printSal(int salary) {
		// TODO Auto-generated method stub
		List<Employee> resultList=new ArrayList<Employee>();
		for(Employee e : empList) {
			if(salary<=e.getSalary()) {
				resultList.add(e);
			}
		}
		return resultList;
	}
	
	/**부서별 급여 합 전체 조회 메서드
	 * @return
	 */
	public Map<String,Integer> sumSal() {
		Set<String> deSet=new HashSet<String>();
		Map<String,Integer> resultMap = new TreeMap<String, Integer>();
		for(Employee e : empList) {
			deSet.add(e.getDepartmentTitle());
		}
		for(String s : deSet) {
			int sum=0;
			for(Employee e : empList) {
				if(e.getDepartmentTitle().equals(s)) {
					sum+=e.getSalary();
				}
			}
			resultMap.put(s, sum);
		}
		return resultMap;
	}
	
	
}

