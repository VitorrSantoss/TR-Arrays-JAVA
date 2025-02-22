package src.src.src;

import java.util.Arrays;
import java.util.Scanner;

public class EX07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int[] lista = new int[10];

    for(int i = 0; i < lista.length; i++){
      System.out.printf("%dº Número: ", i+1);
      lista[i] = sc.nextInt();
    }
    sc.close();
    
    Arrays.sort(lista);

    for(int ordem: lista){
      System.out.println(ordem);
    }

  }
}
