public class Box{
    private Integer occupato;

    public Box(Integer occupato) {
        this.occupato = occupato;
    }

    public synchronized void P(){
        while (occupato == 0){
            try {
                System.out.println("---- " + Thread.currentThread().getName() + " in attesa al box -----");
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } 
        }
        occupato = 0;
    }
      
    public synchronized void V(){
        occupato = 1;
        System.out.println("PIT - STOP " + Thread.currentThread().getName() + " FINITO");
        notify();
    }

}
