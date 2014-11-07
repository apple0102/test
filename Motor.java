package test1;

public class Motor extends VehicleA{
	Motor(){
		brand = "Suzuki";
		maxSpeed = 100;
		numOfWheels = 2;
		oilContainer = 6;
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
