package test1;

public class Truck extends Vehicle {
	Truck(){
		brand = "null";
		maxSpeed = 0;
		numOfWheels = 0;
		oilContainer = 0;
	}
	
	void setBrand(String brand){
		this.brand = brand;
	}
	void setMaxSpeed(double maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	void setNumOfWheels(double numOfWheels){
		this.numOfWheels = numOfWheels;
	}
	void setOilContainer(double oilContainer){
		this.oilContainer = oilContainer;
	};
}
