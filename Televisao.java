
package atividade;
//DANILO DE LIMA ALMEIDA

public class Televisao {
    public String cor;
    public String formato;
    public String marca;
    public int polegadas;
    
    public void Ligar () {
        System.out.println(" a TV ligou");
    }
    public void impDados(){
    System.out.println("sua cor é: "+this.cor);
    System.out.println("sua marca é: "+this.marca);
    System.out.println("seu  é: "+this.formato);
    System.out.println("sua polegadas é: "+this.polegadas);
   
}
}
