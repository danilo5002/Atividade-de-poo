
package atividade;
//DANILO DE LIMA ALMEIDA

public class Lampada {
    public String cor;
    public String marca;
    public int potencia;
    public int volt;
    
public void ligar(){
    System.out.println("Lâmpada ligada ");
}
public void desligar(){
    System.out.println("Lâmpada desligada ");
}
public void emitirluz(){    
    System.out.println("Emitindo luz ");
}
public void impDados(){
    System.out.println("sua cor é: "+this.cor);
    System.out.println("sua marca é: "+this.marca);
    System.out.println("sua potencia é: "+this.potencia + "w");
    System.out.println("sua voltagem é: "+this.volt + "v");
    
}   
}

