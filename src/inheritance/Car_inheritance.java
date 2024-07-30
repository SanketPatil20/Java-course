package inheritance;

class Vehicle{
	private String speed;
	private String model;
	
	public Vehicle() {
		speed = "100";
		model = "Tesla";
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public String getModel() {
		return model;
	}	
}


class car extends Vehicle{
	private String name;
	public car() {
		name = " ";
	}
	
	public void setDetails(String name) {
		this.name= name;	
	}
	
	public String getDetails(String carName) {
		String details= carName + ": "+ getModel()+ ": " + getSpeed();
		return details;	
	}
}


public class Car_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1 = new car();
		System.out.println(c1.getDetails("Model 5"));

	}

}
