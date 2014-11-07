package test1;

public class Bicycle implements Vehicle{
	String brand = "Null";
	double maxSpeed = 0;
	double numOfWheels = 0;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public void setNumOfWheels(double numOfWheels){
		this.numOfWheels = numOfWheels;
	}
}
