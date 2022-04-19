class ProduciDato extends Thread { 
    Semaforo pieno ;
    Semaforo vuoto ;
    int tanti  = 5 ;
    final int attesa = 500 ;
    public ProduciDato ( Semaforo s1 , Semaforo s2 ){
        pieno = s1;
        vuoto = s2;
    }

    public void run() { 
        for (int k = 0; k < tanti ; k ++)
        {
            vuoto.p();
            ProdConsSem.Contatore = k;
            System.out.println("settore: dato scritto :" + k);
            pieno.v();
            try {Thread.sleep(attesa);}
            catch (Exception e) { }
        }
        System.out.println("Settore: termine scrittura dati.");
    }
}