package test1;

abstract class VehicleA {
	String brand;
	double maxSpeed;
	double numOfWheels;
	double oilContainer;
	
	abstract void setBrand(String brand);
	abstract void setMaxSpeed(double speed);
	abstract void setNumOfWheels(double wheels);
	abstract void setOilContainer(double container);
}
