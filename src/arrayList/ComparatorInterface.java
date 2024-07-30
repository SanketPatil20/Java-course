package arrayList;
import java.util.*;


public class ComparatorInterface {
	
	public static class vehicle {
		String brand;
		Integer year;
		
		public vehicle(String brand, Integer year) {
			this.brand = brand;
			this.year = year;
		}
	}

	public static class brandcomp implements Comparator<vehicle>{
		@Override
		public int compare(vehicle o1, vehicle o2) {
			return o1.brand.compareTo(o2.brand);
		}
	}
	
	public static class yearcomp implements Comparator<vehicle>{
		@Override
		public int compare(vehicle o1, vehicle o2) {
			return o1.year.compareTo(o2.year);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<vehicle> list = new ArrayList<>();
		list.add(new vehicle("suzuki", 2020));
		list.add(new vehicle("honda", 2023));
		list.add(new vehicle("toyota", 2019));
		list.add(new vehicle("audi", 2024));
		list.add(new vehicle("hyundai", 2021));
		
		System.out.println("Sorting by brand name: ");
		Collections.sort(list, new brandcomp());
		for (vehicle v1: list) {
			System.out.println("Brand: "+ v1.brand + " year: " + v1.year);
		}
		
		System.out.println("Sorting by make year: ");
		Collections.sort(list, new yearcomp());
		for (vehicle v1 : list) {
			System.out.println("Brand: " + v1.brand + ", Year: " + v1.year);
		}
	}
}
