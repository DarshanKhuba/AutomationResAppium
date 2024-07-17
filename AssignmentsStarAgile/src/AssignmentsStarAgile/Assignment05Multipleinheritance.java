package AssignmentsStarAgile;

public class Assignment05Multipleinheritance {

		interface Vehicle {
			void start();
			void stop();
		}
		
		//Interface represents Engine
		interface Engine {
			void startEngine();
			void stopEngine();
		}
		//Interface representing body of Vehicle
		interface Body {
			void openDoors();
			void closeDoors();
		}
		
		//Class representing the car implementing multiple inheritance
	     class Car implements Vehicle, Engine, Body {
			public void start() {
				startEngine();
				System.out.println("Car started!!!");
			}
			public void stop() {
				stopEngine();
				System.out.println("Car stopped!!!");
			}
			public void startEngine() {
				System.out.println("Engine Started!!!");
			}
			public void openDoors() {
				System.out.println("Doors Opened!!!");
			}
			public void closeDoors() {
				System.out.println("Doors Closed!!!");
			}
			public class Main {
				public static void main(String[] args) {
					Car myCar = new Car();
					myCar.start();
					myCar.openDoors();
					myCar.stop();
					myCar.closeDoors();
				}
			}
	     }

}
