
package veiculo;

public class Veiculoo {
   protected int velocidadeMaxima;  // Atributo protegido

    // Construtor da classe Veiculo
    public Veiculoo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

// Classe Carro que herda de Veiculo
class Carro extends Veiculo {

    


    // Método para exibir a velocidade máxima
    public void exibirVelocidadeMaxima() {
        String velocidadeMaxima = null;
        System.out.println("A velocidade máxima do carro é " + velocidadeMaxima + " km/h.");
    }
       
   } 
       
    
    
    
    
    
    

