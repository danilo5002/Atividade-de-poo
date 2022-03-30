
package atividade;
//DANILO DE LIMA ALMEIDA

public class Microondas {
    
    public int peso;
    public String marca;
    public String cor;
    public int preco;
    
     public void Desligar () {
    System.out.println("O microondas esta desligado");
}
    public void impDados(){
    System.out.println("seu peso é: "+this.peso + "kg" );
    System.out.println("sua marca é: "+this.marca);
    System.out.println("sua cor é: "+this.cor);
    System.out.println("seu preço é: "+this.preco);
}
}    
