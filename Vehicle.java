package test1;

abstract class Vehicle {
	String brand;
	double maxSpeed;
	double numOfWheels;
	double oilContainer;
	
	abstract void setBrand(String brand);
	abstract void setMaxSpeed(double speed);
	abstract void setNumOfWheels(double wheels);
	void setOilContainer(double container){};
}
