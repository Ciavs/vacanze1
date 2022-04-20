

class ConsumaDato extends Thread {
    Semaforo pieno;
    Semaforo vuoto;
    int dato;


    public ConsumaDato(Semaforo s1, Semaforo s2, String nome){
        pieno = s1;
        vuoto = s2;
        setName(nome);
    }


    public void run(){
        while (true)
        {
            pieno.p();
            dato = ProdConsSem.buffer;
            System.out.println("lettore : dato letto :" + dato +" "+ "il consumatore e' : " + Thread.currentThread().getName());
            vuoto.v();
        }
    }
}
