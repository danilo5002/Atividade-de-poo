
package atividade;
//DANILO DE LIMA ALMEIDA

public class ClassPrincipal {
    public static void main(String[] args){
        Lampada L1 = new Lampada();
        
         L1.cor = "Transparente";
        L1.marca = "Ching Ling";
        L1.potencia = 15;
        L1.volt = 230;
        L1.ligar();
        L1.desligar();
        L1.emitirluz();
        L1.impDados();
         
        System.out.println("-----------------------");
        
        Televisao T1 = new Televisao();
        T1.cor = "preta";
        T1.formato = "quadrado";
        T1.marca = "Samsung";
        T1.polegadas = 32;
        T1.Ligar();
        T1.impDados();
        
        System.out.println("---------------------");
        
        Elevador E1 = new Elevador();
        E1.cor = "prata";
        E1.formato = "quadrado";
        E1.peso = 100;
        E1.comprimento = 120;
        E1.subir();
        E1.impDados();
        
        System.out.println("---------------------");
        
        Cadeira C1 = new Cadeira();
        C1.cor = "Azul";
        C1.material = "plastico";
        C1.preco = "20";
        C1.comprimento = 120;
        C1.quebrar();
        C1.impDados();
        
        System.out.println("---------------------");
        
        Aluno A1 = new Aluno();
        A1.idade = 16;
        A1.altura = 186;
        A1.peso = 75;
        A1.nome = "Danilo";
        A1.Estudar();
        A1.impDados();
        
        System.out.println("---------------------");
        
        DataShow D1 = new DataShow();
        D1.peso = 3;
        D1.marca = "LG";
        D1.cor =  "branco";
        D1.preco = 3200;
        D1.Ligar();
        D1.impDados();
        
       System.out.println("---------------------");
       
        Microondas M1 = new Microondas();
        M1.peso = 20;
        M1.marca = "consul";
        M1.cor =  "branco";
        M1.preco = 340;
        M1.Desligar();
        M1.impDados();
       
        
        
    }
}
