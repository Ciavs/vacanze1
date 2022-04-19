

public class ConsumaDato extends Thread {
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo s1, Semaforo s2){
        pieno = s1;
        vuoto = s2;
    }


    public void run(){
        while (true)
        {
            pieno.p();
            dato = ProdConsSem.Contatore;
            System.out.println("lettore : dato leto " + dato);
            vuoto.v();
        }
    }
}

