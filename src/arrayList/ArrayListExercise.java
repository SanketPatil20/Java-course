package arrayList;

import java.util.*;

public class ArrayListExercise {
	
	public static class Employee {
		
		String name;
		int age;
		String country;
		
		public Employee(String name, int age, String country) {
			super();
			this.name = name;
			this.age = age;
			this.country = country;
		}

	}


	public static void EmpOver50(List<Employee> list){
		System.out.println("Employee aged over 50: ");
		for (Employee e : list){
			if (e.age > 50){
				System.out.println(e.name);
			}
		}
	}

	public static void RemoveFromUsa(List<Employee> list){
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()){
			Employee e = it.next();
			if(e.country.equalsIgnoreCase("USA")){
				it.remove();
			}
		}
	}


	public static void EmpByCountry(List<Employee> list){
		Collections.sort(list, (e1,e2) -> e1.country.compareTo(e2.country));
	}
	
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alex", 23, "USA"));
		list.add(new Employee("Dave", 34, "India"));
		list.add(new Employee("Carl", 21, "USA"));
		list.add(new Employee("Joe", 56, "Russia"));
		list.add(new Employee("Amit", 64, "China"));
		list.add(new Employee("Ryan", 19, "Brazil"));

		EmpOver50(list);

		RemoveFromUsa(list);
		System.out.println("Employees after removing from USA: ");
		for (Employee e: list){
			System.out.println(e.name+ " from  "+ e.country);
		}

		EmpByCountry(list);
		System.out.println("Employees sorted by country: ");
        for (Employee e : list) {
            System.out.println(e.name + " from " + e.country);
        }
		
	}

}
