package varsha;

class Car implements Runnable{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Car is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // Handle exception if needed
            }
        }
    }
}

class Bike implements  Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bike is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // Handle exception if needed
            }
        }
    }
}

public class SimpleRace2{
    public static void main(String[] args) {
    	Thread caThread=new Thread(new Car());
    	Thread baThread=new Thread(new Bike());
    	System.out.println("doog");
        caThread.start();
        baThread.start();
    }
}