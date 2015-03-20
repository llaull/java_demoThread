/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Arkesys
 */
class Myjob implements Runnable {
    
    private BankAccount compte = new BankAccount();
    
    public Myjob() {
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            effectuerRetrait(10);
            
            if (compte.getSolde() < 0) {
                System.out.println("decouvert !");
            }
            
        }
        
    }
    
    private void effectuerRetrait(int montant){
        String name = Thread.currentThread().getName();
        
        if (compte.getSolde() >= montant) {
            System.out.println(name + " veut retirer de la tune pour "+ compte.getSolde());
            
            try {
                System.out.println(name + " s'endor zzzz");
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println(name + " vient de se reveiller");
            compte.retirerArgent(montant);
            System.out.println(name + " termine le retrait pour " + montant);
            
        } else {
            System.out.println("no tune pour " + name);
        }
        
    }

    
}
