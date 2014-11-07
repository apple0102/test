package test1;

public class Bicycle extends Vehicle{
	Bicycle(){
		brand = "";
		maxSpeed = 0;
		numOfWheels = 0;
		oilContainer = 0;
	}
	
	protected void setBrand(String brand){
		this.brand = brand;
	}
	protected void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	protected void setNumOfWheels(double numOfWheels){
		this.numOfWheels = numOfWheels;
	}
}
