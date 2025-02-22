package src.src.src;

import java.util.Scanner;

public class EX02 {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);

  int[] lista = new int[5];
  int soma = 0;

  for (int i = 0; i < lista.length; i++){
    System.out.printf("%dº número: ", i+1);
    lista[i] = sc.nextInt();
    soma = soma + lista[i];
    }
    sc.close();
    System.out.printf("Soma: %d\n", soma);
    System.out.printf("Média: %.1f", soma/5.0);
















  }
}
