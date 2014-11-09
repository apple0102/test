package test1;

abstract class Vehicle {
	String brand;
	double maxSpeed;
	double numOfWheels;
	double oilContainer;
	
	abstract void setBrand(String brand);
	abstract void setMaxSpeed(double maxSpeed);
	abstract void setNumOfWheels(double numOfWheels);
	void setOilContainer(double oilContainer){};
}
