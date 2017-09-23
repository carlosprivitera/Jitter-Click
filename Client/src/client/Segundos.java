package client;

public class Segundos extends Thread {
    public Segundos() {
        super();
    }
    public int segundos = 1;
    public int segundosTotal = 1;
    public void run() {
        super.run();
        do{
            try {
                segundos = segundos + 1;
                segundosTotal = segundosTotal + 1;
                this.sleep(1000);
            } catch (InterruptedException e) {
                segundos=1;
                segundosTotal=1;
            }
        }while(true);
    }
}
