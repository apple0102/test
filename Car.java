package test1;

public class Car extends Vehicle{
	Car(){
		brand = "Null";
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
	protected void setOilContainer(double oilContainer){
		this.oilContainer = oilContainer;
	}
}
