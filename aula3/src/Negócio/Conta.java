
package Negócio;

 
public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private double limite;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
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
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }


    
    
}
