package src.src.src;

import java.util.Scanner;

public class EX04 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        int[] lista = new int[8];

        int maior = -1;
        int menor = 999;

        // ARMAZENAR NÚMEROS NO ARRAY
        for (int i = 0; i < lista.length; i++){
            System.out.printf("%dº número: ", i +1 );
            lista[i] = sc.nextInt();
            if(lista[i] > maior){
                maior = lista[i];
            }
            if(lista[i] < menor){
                menor = lista[i];
            }
        }
        sc.close();

        System.out.println("Maior número:" + maior);
        System.out.println("Menor número:" + menor);



  }
}
