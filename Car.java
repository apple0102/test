package test1;

public class Car extends VehicleA{
	Car(){
		brand = "Toyota";
		maxSpeed = 180;
		numOfWheels = 4;
		oilContainer = 20;
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
