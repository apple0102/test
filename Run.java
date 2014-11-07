package test1;

public class Run{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Motor motor1 = new Motor();
				
		System.out.println("The max speed of the car is: " + car1.maxSpeed);
		System.out.println("The max speed of the motor is: " + motor1.maxSpeed);
		
		car1.setMaxSpeed(200);
		motor1.setMaxSpeed(120);
		
		System.out.println("The max speed of the car is: " + car1.maxSpeed);
		System.out.println("The max speed of the motor is: " + motor1.maxSpeed);
	}
}
