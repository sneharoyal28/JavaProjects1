package sneha;

class Car extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("car is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // handle exception if needed
            }
        }
    }
}  // <-- Closing brace added here for Car class

class Bike extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("ninja bike is moving " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // handle exception if needed
            }
        }
    }
}

public class SimpleRace {

    public static void main(String[] args) {
        new Car().start();
        new Bike().start();
    }

}
