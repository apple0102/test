package test1;

public class Motor extends VehicleA{
	Motor(){
		maxSpeed = 100;
		numOfWheels = 2;
		oilContainer = 6;
	}
	
	protected void setMaxSpeed(double speed){
		maxSpeed = speed;
	}
	protected void setNumOfWheels(double wheels){
		this.numOfWheels = wheels;
	}
	protected void setOilContainer(double container){
		this.oilContainer = container;
	}
}