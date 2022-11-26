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
        System.out.println ("Lista de correspondências");
        System.out.println ("Escolha uma opção?:");
        System.out.println ("1 - Mostra listade correspondências. \n2 - Iserir nova carta. \n3 - Apagar carta. \n4 - Sair." + "\n ");
        int task = scan1.nextInt();
        if (task==1) {
            System.out.println ("Contents of Employees:" + listaCorres);
        } else if (task==2) {
            do {
                System.out.println("Current list is " + listaCorres);
                System.out.println("Add more? (y/n) ");
                if (scan1.next().startsWith("y")) {
                    System.out.println("Enter : ");
                    listaCorres.add(scan1.next());
                } else {
                    break;
                }
            } while (true);
            System.out.println("List is " + listaCorres);
            String[] arr = listaCorres.toArray(new String[0]);
            System.out.println("Array is " + Arrays.toString(arr));
        }
        System.out.print("ArrayList: " + listaCorres);
        var first = Integer.parseInt(listaCorres.get(0));
        var last = Integer.parseInt(listaCorres.get(listaCorres.size() - 1));

        System.out.println("\nFirst : " + first
                + ", Last : " + last);

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
    }
}
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
