public class ProdConsSem{

    protected static int buffer;
    public static int Contatore;
    public static void main(String[] args) {
        
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        new ConsumaDato(pieno, vuoto);
        prod.start();
        prod.start();
        System.out.println("main temaina avvio thread");

    }


}