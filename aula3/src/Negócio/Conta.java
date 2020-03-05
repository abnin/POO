
package Negócio;

import javax.swing.JOptionPane;

 
public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    
    
    

    public void deposita (double quantidade){
        this.saldo +=quantidade;
    }
            
    public void sacar (double quantidade){
        if(quantidade > saldo){
        JOptionPane.showMessageDialog(null,"Saldo Indisponível");
        JOptionPane.showConfirmDialog(null,"Precisa de crédito ?"); 
        }else{
        this.saldo -=quantidade;
        }
    }        
   
    
    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */


    /**
     * @param limite the limite to set
     */



    
    
}
