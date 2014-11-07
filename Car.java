package test1;

public class Car implements Vehicle{
	String brand = "Null";
	double maxSpeed = 0;
	double numOfWheels = 0;
	double oilContainer = 0;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public void setNumOfWheels(double numOfWheels){
		this.numOfWheels = numOfWheels;
	}
	public void setOilContainer(double oilContainer){
		this.oilContainer = oilContainer;
	}
}
