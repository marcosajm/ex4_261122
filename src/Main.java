import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCorres = new ArrayList<String>();
        int size = listaCorres.size();
        boolean ans = listaCorres.isEmpty();
        Scanner scan1 = new Scanner (System.in);
        while (true) {
            System.out.println("Lista de correspondências");
            System.out.println("Escolha uma opção?:");
            System.out.println("1 - Mostra lista de correspondências e próxima carta a ser entregue. . \n2 - Inserir nova carta. \n3 - Apagar carta. \n4 - Sair." + "\n ");
            int task = scan1.nextInt();
            if (task == 4) {
                break;
            }
            switch (task) {
                case 1:
                    if (ans) {
                        System.out.println("Lista vazia: " + size + "\n ");
                        break;
                    }
                case 2:
                    do {
                        System.out.println("Inserir nova carta? (y/n) ");
                        if (scan1.next().startsWith("y")) {
                            System.out.println("Entre com a carta : ");
                            listaCorres.add(scan1.next());
                        } else {
                            break;
                        }
                    } while (true);
                    String[] arr = listaCorres.toArray(new String[0]);
                    System.out.println("\n Array is " + Arrays.toString(arr) + "\n ");
                    var first = listaCorres.get(0);
                    var last = listaCorres.get(listaCorres.size() - 1);
                    System.out.println("List is " + listaCorres);
                    System.out.println("Próxima carta a ser entregue: " + last);
                    System.out.println("Quantas cartas existem na lista " + size);
                    break;
                case 3:
                    if (ans) {
                        System.out.println("Lista vazia: " + size + "\n ");
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalido!");
                    break;
            }
        }
    }
}
       //     if (sc.next().equalsIgnoreCase("N")) {
      //          if (ans) {
      //              System.out.println("Lista fazia: " + size);
      //              break;
      //          }
      //          else {
      //              System.out.println("Quantas cartas existem na lista: " + size);
      //              System.out.println("Próxima carta a ser entregue: " + size);
       //         }
       //         break;
       //     }
      //      listaCorres.add(sc.next());
      //  }

   // Exercício 4:
  //  Crie um programa que cria e gera uma lista de cartas
  //          (correspondência). Deve ter em consideração que as cartas são
 //   empilhadas na lista e devem ser entregues, tendo sempre em
 //   consideração que, a primeira carta a ser entregue será sempre aquela
 //   que se encontra no fim.
  //  O programa deve permitir:
            // Inserir uma carta;
// Remover carta;
 //Verificar se a lista de cartas está cheia ou vazia;
 //Verificar a próxima carta a ser entregue;
 //Informar quantas cartas existem na lista;
