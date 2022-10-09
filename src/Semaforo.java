public class Semaforo {

    static int value = 0;

    public Semaforo() {
        this.value = value;
    }
    synchronized void v() throws Exception{
        Semaforo.value++;
        notify();
    }
    synchronized void p() throws Exception{
        while (Semaforo.value > 0){
            wait();
            Semaforo.value--;
        }
    }
}