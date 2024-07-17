package AssignmentsStarAgile;

public class Assk {
	// Interface representing Vehicle
    interface Vehicle {
        void start();
        void stop();
    }

    //Here interface representing Engine
    interface Engine {
        void startEngine();
        void stopEngine();
    }

    // Here interface is representing the body of Vehicle
    interface Body {
        void openDoors();
        void closeDoors();
    }

    // Here the Class is representing the car implementing multiple inheritance
    class Car implements Vehicle, Engine, Body {
        @Override
        public void start() {
            startEngine();
            System.out.println("Car started!!!");
        }

        @Override
        public void stop() {
            stopEngine();
            System.out.println("Car stopped!!!");
        }

        @Override
        public void startEngine() {
            System.out.println("Engine Started!!!");
        }

        @Override
        public void stopEngine() {
            System.out.println("Engine Stopped!!!");
        }

        @Override
        public void openDoors() {
            System.out.println("Doors Opened!!!");
        }

        @Override
        public void closeDoors() {
            System.out.println("Doors Closed!!!");
        }
    }

    public static void main(String[] args) {
        Assk demo = new Assk();
        Car myCar = demo.new Car();
        myCar.start();
        myCar.openDoors();
        myCar.stop();
        myCar.closeDoors();
    }

}
