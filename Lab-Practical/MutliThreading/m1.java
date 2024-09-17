class Multi extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

class Multi2 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class m1 {
    public static void main(String[] args) {

        Multi m1 = new Multi();
        m1.start();

        // Multi2 m2 = new Multi2();
        // Thread t2 = new Thread(m2);
        // t2.start();
    }
}
