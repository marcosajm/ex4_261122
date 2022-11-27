import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaCorres = new ArrayList<>();
        Scanner scan1 = new Scanner (System.in);
        while (true) {
            boolean ans = listaCorres.isEmpty();
            int size = listaCorres.size();
            System.out.println("Lista de correspondências");
            System.out.println("Escolha uma opção:(1 - 4)");
            System.out.println("1 - Mostra lista de correspondências e próxima carta a ser entregue. \n2 - Inserir nova carta. \n3 - Apagar carta. \n4 - Sair." + "\n ");
            int task = scan1.nextInt();
            if (task == 4) {
                break;
            }
            switch (task) {
                case 1:
                    if (ans) {
                        System.out.println("Lista vazia! " + "\n ");
                        break;
                    }                   
                    var last = listaCorres.get(listaCorres.size() - 1);
                    System.out.println("List is " + listaCorres + "\n ");
                    System.out.println("Próxima carta a ser entregue: " + last + "\n ");
                    System.out.println("Quantas cartas existem na lista: " + size + "\n ");
                    break;
                case 2:
                    do {
                        System.out.println("Entre com a carta: ");
                        listaCorres.add(scan1.next());
                        System.out.println("Inserir nova carta? (y/n) " + "\n ");
                        if (scan1.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    } while (true);
                    break;
                case 3:
                    if (ans) {
                        System.out.println("Lista vazia! " + "\n ");
                        break;
                    }
                    do {
                        System.out.println("Entre com a carta: " + "\n ");
                        listaCorres.remove(scan1.next());
                        System.out.println("Apagar outra carta? (y/n) ");
                        if (scan1.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    } while (true);
                    break;
                default:
                    System.out.println("Número invalido!" + "\n ");
                    break;
            }
        }
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
