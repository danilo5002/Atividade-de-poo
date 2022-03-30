
package atividade;
//DANILO DE LIMA ALMEIDA

public class Cadeira {
    public String cor;
    public String material;
    public String preco;
    public int comprimento;
    
    public void quebrar () {
    System.out.println("A cadeira quebrou");
}
    
    public void impDados(){
    System.out.println("sua cor é: "+this.cor);
    System.out.println("seu material é: "+this.material);
    System.out.println("sua preço é: "+this.preco);
    System.out.println("seu comprimento é: "+this.comprimento);
}
}
