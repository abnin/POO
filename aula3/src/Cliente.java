
import Negócio.Conta;
import javax.swing.JOptionPane;


public class Cliente {

    public static void main(String[] args) {
        /* Construtor da classe conta*/
        Conta minhaConta = new Conta();
        /* Objeto da classe Conta*/
        minhaConta.setDono(JOptionPane.showInputDialog("Dono"));
        JOptionPane.showMessageDialog (null,minhaConta.getDono());
                
        minhaConta.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
        JOptionPane.showMessageDialog (null,minhaConta.getNumero());
              
             
        }
    
}
