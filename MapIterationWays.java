package collectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// ways to Iterate through a Map

class Employee {
	private Integer eId;
	private String eName;
	private Double salary;
	private String email;

	Employee(Integer eId, String eName, Double salary, String email) {
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.email = email;
	}

	@Override
	public String toString() {
		return "[Employee Id=" + eId + ", Employee name=" + eName + ", Salary=" + " and emaid id=" + email + "]";
	}
}

class Department {
	private Integer deptId;
	private String deptName;
	private String deptLocation;

	Department(Integer deptid, String deptname, String deptLocation) {
		super();
		this.deptId = deptid;
		this.deptName = deptname;
		this.deptLocation = deptLocation;
	}

	@Override
	public String toString() {
		return "[Department Id=" + deptId + ", Department name=" + deptName + ", Location " + deptLocation + "]";
	}
}

public class MapIterationWays {

	public static void main(String[] args) {

		// creating employee objects
		Employee e1 = new Employee(101, "Sam", 30000.00, "sam@gmail.com");
		Employee e2 = new Employee(102, "Santosh", 70000.00, "santosh@gmail.com");
		Employee e3 = new Employee(103, "Samantha", 50000.00, "samantha@gmail.com");
		Employee e4 = new Employee(104, "Sanny", 80000.00, "sanny@gmail.com");
		Employee e5 = new Employee(105, "Charlee", 34000.00, "charlee@gmail.com");

		// creating department objects
		Department d1 = new Department(1010, "IT", "Boston");
		Department d2 = new Department(1111, "Finance", "Redbrook");

		// creating Map to store employee and department
		Map<Employee, Department> empdeptMap = new HashMap<>();

		// adding entries to Map
		empdeptMap.put(e1, d1);
		empdeptMap.put(e2, d1);
		empdeptMap.put(e3, d1);
		empdeptMap.put(e4, d2);
		empdeptMap.put(e5, d2);

		// printing the map entries using forEach loop
//		empdeptMap.forEach((Employee, Department) -> System.out
//				.println(empdeptMap.get(Employee) + " " + empdeptMap.get(Department)));

//		// printing the map entries
//		for (Entry<Employee, Department> entrySet : empdeptMap.entrySet()) {
//			System.out.println(entrySet.getKey());
//			System.out.println(entrySet.getValue());
//		}
		Collection<Department> c=empdeptMap.values();
		for(Object obj:c) {
			System.out.println(obj);
		}
	}
}
