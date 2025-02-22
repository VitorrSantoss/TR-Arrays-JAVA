package src.src.src;

import java.util.ArrayList;

public class Colecoes {
  public static void main(String[] args) {
    

    // Array (vetor) -> com um tamanho fixo de 5 posições
    String[] arrayEstatico = new String[5];                  

    // Atriubuindo elementos ao array          OU          String[] arrayEstatico = {"Sucesso", "Melância", "Academia", "Vitor", "Programador"};
    arrayEstatico[0] = "Sucesso";              
    arrayEstatico[1] = "Melância";        
    arrayEstatico[2] = "Academia";
    arrayEstatico[3] = "Vitor";
    arrayEstatico[4] = "Programador";
    
    System.out.println("Imprimindo o Array Estático");
    for(int indice = 0; indice < arrayEstatico.length; indice++){   
      System.out.println(arrayEstatico[indice]);
    }
    System.out.println("Imprimindo o Array Estático");
    for (String x: arrayEstatico){
      System.out.println(x);
    }

    /*
    Tipos primitivos ➞ Wrapper Class
    int              ➞ Integer
    float            ➞ Float
    double           ➞ Double
    char             ➞ Character
    */

   // ArrayList<Tipo> nome = new ArrayList<Tipo>();

    ArrayList<String> arrayDinamico = new ArrayList<String>();

    arrayDinamico.add("Sucesso"); // indice 0
    arrayDinamico.add("Melância"); // indide 1
    arrayDinamico.add("Academia"); // indide 2
    arrayDinamico.add("Vitor"); // indide 3
    arrayDinamico.add("Programador"); // indide 4
    
    System.out.println("Imprimindo o Array Estático");
    for (int indice = 0; indice < arrayDinamico.size(); indice++){
      System.out.println(arrayDinamico.get(indice));
    }
    // For Each
    for (String nome : arrayDinamico){
      System.out.println(nome);
    }

    
   









     
















  }
}
