
public class teste {

   
    public static void main(String[] args) {
       //Estou declarando as variáveis
       int idade,ano;
       idade=5;
       ano=2020;
       
       int quatro = 2 + 2;
       int tres = 5 - 2;
       int oito = 4 * 2;
       int dezesseis = 64 / 4;
       int um = 5 % 2;
       
       System.out.println(quatro+"\n"+tres+"\n"+oito+"\n"+dezesseis+"\n"+um+"\n");
       
       double nota=7.3;
       double d = 3.777;
       
       //processo de casting
       int a = (int) d;
       System.out.println(a+"\n");
       
       boolean menorDeIdade = idade <10;
       System.out.println("É menor de idade: "+menorDeIdade+"\n");
       
             
       
       
       //Constante
       int novaIdade = idade+1;
       System.out.println("A sua idade é: "+idade
       +"\n"+"Estamos no ano de: "+ano
       +"\n"+"A sua nova idade é "+novaIdade);
       
    }
    
}
