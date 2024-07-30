package hashMap;
import java.util.*;
import java.util.Map.Entry;
class Employee{
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result +((empName == null)? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.empId == emp.empId;
	}
}

public class HashMapKey {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Employee emp1 = new Employee(123, "Jane");
		Employee emp2 = new Employee(123, "Jane");

		Map<Employee, Integer> employeeMap = new HashMap<>();

		employeeMap.put(emp1, 56000);
		employeeMap.put(emp2, 45000);
		
		for (Entry<Employee, Integer> entry : employeeMap.entrySet()) {
			System.out.println("Employee Id: " + entry.getKey().empId + " Employee Name: " + entry.getKey().empName + " " + entry.getValue());
		}
		

	}

}
