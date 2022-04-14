package org.deepanshu;


	public class MainCar {

		public static void main(String[] args) {
			
			Cars car = new Cars("Closed", "on", "seated", 20);
			/*car.setDoors("Closed");
			car.setDriver("seated");
			car.setEngine("on");
			car.setSpeed(20);
			car.run();
			*/
		System.out.println(car.run());
		} 

}
