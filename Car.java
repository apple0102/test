package test1;

public class Car extends VehicleA{
	Car(){
		maxSpeed = 180;
		numOfWheels = 4;
	}
	
	protected void setMaxSpeed(double speed){
		maxSpeed = speed;
	}
	protected void setNumOfWheels(double wheels){
		this.numOfWheels = wheels;
	}
}
