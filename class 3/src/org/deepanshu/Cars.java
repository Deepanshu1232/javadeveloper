package org.deepanshu;

public class Cars {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;


	
	public Cars(String doors, String engine, String driver, int speed) {
		
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}


	/* Getter and Setter */

	public void setSpeed(int speed) {

		this.speed = speed;

	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String run() {

		if (doors.equals("Closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {

			return "running";

		} else {

			return "not Running";
		}

	}
}