package aggregation_and_composition;

class Country {
	private String name;
	private int population;
	
	public Country(String n, int p) {
		name= n;
		population = p;
	}
	public String getName() {
		return name;
	}
}
 class Person{
	 private String name;
	 private Country country;
	 
	 public Person(String n, Country c) {
		 name= n;
		 country = c;
	 }
	 public void printDetails() {
		 System.out.println("Name: "+ name);
		 System.out.println("Country: "+ country.getName());
	 }
 }

public class Country_man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Country c1 = new Country("India", 10);
		{
			Person p1 = new Person("Vijay",c1);
			p1.printDetails();
		}
System.out.println(c1.getName());
	}
}





//class Engine {
//	  
//	  private int capacity;
//	  
//	  public Engine(){
//	    capacity = 0;
//	  }
//	  
//	  public Engine(int cap) {
//	    capacity = cap;
//	  }
//	  
//	  public void engineDetails() {
//	    System.out.println("Engine details: " + capacity);
//	  }
//	  
//	}
//
//	class Tires {
//	  
//	  private int noOfTires;
//	  
//	  public Tires() {
//	    noOfTires = 0;
//	  }
//	  
//	  public Tires(int nt) {
//	    noOfTires = nt;
//	  }
//	  
//	  public void tireDetails() {
//	    System.out.println("Number of tyres: " +  noOfTires);
//	  }
//	  
//	}
//
//	class Doors {
//	  
//	  private int noOfDoors;
//	  
//	  public Doors() {
//	    noOfDoors = 0;
//	  }
//	  
//	  public Doors(int nod) {
//	    noOfDoors = nod;
//	  }
//	  
//	  public void doorDetails() {
//	    System.out.println("Number of Doors: " + noOfDoors);
//	  }
//	  
//	}
//
//	class Car {
//	  
//	  private Engine eObj;
//	  private Tires tObj;
//	  private Doors dObj;
//	  private String color;
//	  
//	  public Car(String col, int cap, int nt, int nod) {
//	    this.eObj = new Engine(cap);
//	    this.tObj = new Tires(nt);
//	    this.dObj = new Doors(nod);
//	    
//	    this.color = col;    
//	  }
//	  
//	  public void carDetail() {
//	    eObj.engineDetails();
//	    tObj.tireDetails();
//	    dObj.doorDetails();
//	    System.out.println("Car color: " + color);
//	  }
//	  
//	}
//	  
//	class Main {
//	  
//	  public static void main(String[] args) {
//	    Car cObj = new Car("Black", 1600, 4, 4);
//	    cObj.carDetail();
//	  }
//	}