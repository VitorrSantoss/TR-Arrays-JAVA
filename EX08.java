package src.src.src;

import java.util.Scanner;

public class EX08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int[] lista1 = new int[5];

    for(int i =0; i < lista1.length; i++) {
        System.out.printf("%dº Número: ", i + 1);
        lista1[i] = sc.nextInt();
    }

    int[] lista2 = new int[5];

    for(int i = 0; i < lista2.length; i++){
        System.out.printf("%dº Número: ", i + 1);
        lista2[i] = sc.nextInt();
    }
    sc.close();
    for(int ordem1: lista1){
        System.out.println(ordem1);
    }
    for(int ordem2: lista2){
        System.out.println(ordem2);
    }

  }
}
