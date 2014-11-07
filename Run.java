package test1;

public class Run{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setBrand("Toyota");
		car1.setMaxSpeed(200);
		car1.setNumOfWheels(4);
		car1.setOilContainer(20);
		
		Motor motor1 = new Motor();
		motor1.setBrand("SYM");
		motor1.setMaxSpeed(120);
		motor1.setNumOfWheels(2);
		motor1.setOilContainer(6);
		
		Bicycle bicycle1 = new Bicycle();
		bicycle1.setBrand("GIANT");
		bicycle1.setMaxSpeed(30);
		bicycle1.setNumOfWheels(2);
		
		System.out.println("The brand of the car1 is: " + car1.brand);
		System.out.println("The max speed of the car1 is: " + car1.maxSpeed + "(km/h)");
		System.out.println("The wheels of the car1 is: " + car1.numOfWheels);
		System.out.println("The oil containerof the car1 is: " + car1.oilContainer + "(l)");
		System.out.println("\n==============================\n");
		System.out.println("The brand of the motor1 is: " + motor1.brand);
		System.out.println("The max speed of the motor1 is: " + motor1.maxSpeed + "(km/h)");
		System.out.println("The wheels of the motor1 is: " + motor1.numOfWheels);
		System.out.println("The oil container of the motor1 is: " + motor1.oilContainer + "(l)");
		System.out.println("\n==============================\n");
		System.out.println("The brand of the bicycle1 is: " + bicycle1.brand);
		System.out.println("The max speed of the bicycle1 is: " + bicycle1.maxSpeed + "(km/h)");
		System.out.println("The wheels of the bicycle1 is: " + bicycle1.numOfWheels);
	}
}
