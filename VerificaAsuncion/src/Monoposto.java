public class Monoposto extends Thread{
    /**
     * @author PadreDiXie
     */
    private Box b;
    private Integer numero;
    private String scuderia;
    private Pilota concorrente;
    
    /**
     * 
     * @param b Area dedicata al PIT-STOP
     * @param numero Numero Identificativo
     * @param scuderia Scuderia
     * @param concorrente Pilota dell'autovettura
     */

    public Monoposto(Box b, Integer numero, String scuderia, Pilota concorrente) {
        this.b = b;
        this.numero = numero;
        this.scuderia = scuderia;
        this.concorrente = concorrente;
    }

    /**
     * 
     * @return numero
     * Ritorna numero identificativo
     */

    public Integer getNumero() {
        return numero;
    }

    /**
     * 
     * @return scuderia
     * Ritorna scuderia di appartenenza
     */
     public String getScuderia() {
        return scuderia;
    }
    
    @Override
    public void run() {
        int ngiri = 10;
        System.out.println(concorrente.getNome() + " ha iniziato la corsa.");

        for(int i = 0; i <= ngiri; i++){
            if(i == 3 || i == 6 || i == 9){
                try {
                    b.P();
                    Thread.sleep(1000*((int)((Math.random() * 5) + 1)));
                    b.V();                               
                } catch (Exception e) {
                    e.printStackTrace();
                }    
            }
            
            try {
                Thread.sleep(1000*((int)((Math.random() * 4) + 1)));
            } catch (Exception e) {
                e.printStackTrace();
            }
            //b.P();
            System.out.println("GIRO - " + i + " Completato " + concorrente.getNome());
            //concorrente.corri(ngiri);
            //b.V();
            
        }
        System.out.println(concorrente.getNome() + " FINITO");
    }

}

