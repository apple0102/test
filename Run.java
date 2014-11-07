package test1;

public class Run{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Motor motor1 = new Motor();
				
		System.out.println("The max speed of the car is: " + car1.maxSpeed + "(km/h)");
		System.out.println("The wheels of the car is: " + car1.numOfWheels);
		System.out.println("The oil containerof the car is: " + car1.oilContainer + "(l)");
		System.out.println("The max speed of the motor is: " + motor1.maxSpeed + "(km/h)");
		System.out.println("The wheels of the motor is: " + motor1.numOfWheels);
		System.out.println("The oil container of the motor is: " + motor1.oilContainer + "(l)");
		
		
		car1.setMaxSpeed(200);
		motor1.setMaxSpeed(120);
		
		System.out.println("The max speed of the car is: " + car1.maxSpeed + "(km/h)");
		System.out.println("The max speed of the motor is: " + motor1.maxSpeed + "(km/h)");
	}
}
