package application;

/**
 *
 * @author Moi
 */
public class BankAccount {
    
    private int solde = 20;
    
    public void retirerArgent(int montant){
        setSolde(getSolde() - montant);
    }

    /**
     * @return the solde
     */
    public int getSolde() {
        return solde;
    }

    /**
     * @param solde the solde to set
     */
    public void setSolde(int solde) {
        this.solde = solde;
    }
    
    
}
