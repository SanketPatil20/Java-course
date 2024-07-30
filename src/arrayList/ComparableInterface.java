package arrayList;
import java.util.*;

class employee1 implements Comparable<employee1> {
	
	String name;
	int age;
	
	public employee1 (String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	
	// To sort according to age
//	@Override
//	public int compareTo(employee1 emp) {
//		return (this.age - emp.age);
//	}
	
	// To sort according to name
	@Override
	public int compareTo(employee1 emp) {
		return this.name.compareTo(emp.name);
	}
}

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employee1> list = new ArrayList<>();
		list.add(new employee1("Jane" , 21));
		list.add(new employee1("Alex" , 24));
		list.add(new employee1("Matt" , 27));
		list.add(new employee1("Jason" ,21));
		
		Collections.sort(list);
		for (employee1 emp : list) {
			System.out.println("Employee name: "+emp.name +" " + "age: "+ emp.age);
		}
	}
}