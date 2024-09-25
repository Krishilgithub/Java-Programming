class Multi1 extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}

class Multi2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}

class Multi3 extends Thread{
    public void run(){
        System.out.println("Thread 3");
    }
}

public class mt2 {
    public static void main(String[] args) {
        Multi1 m1 = new Multi1();
        Multi2 m2 = new Multi2();
        Multi3 m3 = new Multi3();

        // m1.setPriority(8);
        // m2.setPriority(10);
        // m3.setPriority(5);

        // m1.getPriority();
        // m2.getPriority();
        // m3.getPriority();

        m1.start();
        m2.start();
        m3.start();
    }
}
