class ProduciDato extends Thread { 
    Semaforo pieno ;
    Semaforo vuoto ;
    String nome;
    int tanti  = 5 ;
    final int attesa = 500 ;
    public ProduciDato ( Semaforo s1 , Semaforo s2, String n ){
        pieno = s1;
        vuoto = s2;
        nome=n;
        setName(n);
    }

    public void run() { 
        for (int k = 0; k < tanti ; k ++)
        {
            vuoto.p();
            int newValore;
            if(nome == "prod1"){
                newValore=k;
            }else{
                newValore=k*2;
            }
            ProdConsSem.buffer = newValore;
            System.out.println("settore: dato scritto da "+ Thread.currentThread().getName()+":" + newValore);
            pieno.v();
            try {Thread.sleep(attesa);}
            catch (Exception e) { }
        }
        System.out.println("Settore: termine scrittura dati.");
    }
}