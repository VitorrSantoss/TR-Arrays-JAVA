package src.src.src;
import java.util.ArrayList;
import java.util.Scanner;

public class EX06 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();

    while (true){
      System.out.println("DESEJA EFETUAR QUAL AÇÃO?");
      System.out.print("[1] Adicionar\n[2] Remover\n[3] Exibir\n[4] Pesquisar\nOPÇÃO: ");
      int decisao = sc.nextInt();
      sc.nextLine();
      if(decisao ==1){
        System.out.print("NOME: ");
        String nomeADICIONA = sc.nextLine().toUpperCase();
        System.out.println("Registrado com sucesso!\n");
        lista.add(nomeADICIONA);
      }
      if (decisao ==2){
        System.out.println("LISTA:");
        System.out.println(lista);
        System.out.print("Deseja remover qual nome?\n" );
        String nomeREMOVE = sc.nextLine();
        if (lista.contains(nomeREMOVE)){
          lista.remove(nomeREMOVE);
          System.out.printf("O nome %s foi removido!", nomeREMOVE);
        }
          /*String nomeREMOVE = sc.nextLine().toUpperCase();
          boolean removido = lista.remove(nomeREMOVE);
          System.out.println("Removido com sucesso!\n");*/
      }
      if (decisao ==3){
        System.out.println("Lista completa e atualizada!\n" + lista);
      }
      if (decisao ==4){
        System.out.println("PESQUISA: ");
        String nomeCONSULTA = sc.nextLine();
        if (lista.contains(nomeCONSULTA)){
          System.out.printf("O nome %s está na lista!", nomeCONSULTA);
        }
        else {
          System.out.printf("O nome %s não está na lista", nomeCONSULTA);
        }
      }
      if (decisao ==5){
        break;
      }
    }
    sc.close();

  }
  
}
