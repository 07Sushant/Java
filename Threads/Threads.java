class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Hum first Hum first");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("ERROR:404 MEMORY NOT FOUND");
            }

        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Tum first tum first");
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            System.out.println("ERROR:404 MEMORY NOT FOUND");
        }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}