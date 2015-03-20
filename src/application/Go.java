package application;

/**
 *
 * @author Moi
 */
public class Go {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable job = new Myjob();
        
        Thread alpha = new Thread(job);
        Thread beta = new Thread(job);
        
        alpha.setName("Jean");
        beta.setName("Pol");
        
        alpha.start();
        beta.start();
                
        
    }
    
}
