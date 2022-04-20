public class ProdConsSem{

    protected static int buffer;
    public static int Contatore;
    public static void main(String[] args) {
        
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        
        ProduciDato p1 = new ProduciDato(pieno, vuoto, "prod1");
        ConsumaDato c1 = new ConsumaDato(pieno, vuoto, "name");

        ProduciDato p2 = new ProduciDato(pieno, vuoto, "prod2");
        ConsumaDato c2 = new ConsumaDato(pieno, vuoto, "name2");

        p1.start();
        c1.start();
        p2.start();      
        c2.start();

        System.out.println("main temaina avvio thread");

    }


}