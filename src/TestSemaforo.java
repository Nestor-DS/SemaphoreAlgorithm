public class TestSemaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Semaforo semaforo = new Semaforo();
        P_Signal p = new P_Signal(semaforo);
        V_Wait v = new V_Wait(semaforo);
        
        p.start();
        v.start();
        
        p.join();
        v.join();
    }
    
}