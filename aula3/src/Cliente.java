
import Negócio.Conta;
import javax.swing.JOptionPane;


public class Cliente {

    public static void main(String[] args) {
        /* Construtor da classe conta*/
        Conta minhaConta = new Conta();
        /* Objeto da classe Conta*/
        
        
        minhaConta.setDono("Abner");
        JOptionPane.showMessageDialog(null,"Bem vindo "+minhaConta.getDono());
                
        minhaConta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo")));
        JOptionPane.showMessageDialog(null,"Saldo: "+minhaConta.getSaldo());
        
        minhaConta.deposita(Double.parseDouble(JOptionPane.showInputDialog("Deposito")));
        JOptionPane.showMessageDialog(null,"Saldo: "+minhaConta.getSaldo());
        
              
        minhaConta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Saque")));
        JOptionPane.showMessageDialog(null,"Saldo: "+minhaConta.getSaldo());
                              
            
    }
}