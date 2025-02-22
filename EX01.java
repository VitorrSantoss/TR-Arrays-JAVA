package src.src.src;

import java.util.Scanner;

public class EX01 {
  public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    // CRIAÇÃO DA LISTA (ARRAY)
    int[] lista = new int[10];
    // ARMAZENAGEM DE DADOS NA LISTA (ARRAY)
    for(int i = 0; i < lista.length; i++){
      System.out.printf("%dº número: ", i+1);
      lista[i] = sc.nextInt();
    }
    // EXPOSIÇÃO DE DADOS DA LISTA (ARRAY)
    for(int num: lista) {
      System.out.print(num + " ");
    }
    System.out.print(" -->> ");
    // EXPOSIÇÃO DE DADOS INVERSA DA LISTA (ARRAY)
    for (int i = 9; i >= 0; i--){
      System.out.print(lista[i] + " ");
    }
    sc.close();

        
           
  }
}



   















  

  
