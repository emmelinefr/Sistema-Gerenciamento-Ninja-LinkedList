import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Sistema {

    LinkedList<Ninja> listaDeNinjas;

    public Sistema() {
        listaDeNinjas = new LinkedList<>();

        listaDeNinjas.add(new Ninja("Naruto", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi", 30, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 18, "Areia"));
        listaDeNinjas.add(new Ninja("Itachi", 21, "Akatsuki"));
        listaDeNinjas.add(new Ninja("Jiraiya", 50, "Konoha"));
    }

    public void adicionarNinja(Scanner sc) {
        System.out.print("Digite o nome do ninja: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do ninja: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a vila do ninja: ");
        String vila = sc.nextLine();

        Ninja novoNinja = new Ninja(nome, idade, vila);
        listaDeNinjas.addFirst(novoNinja);
        System.out.println("Ninja adicionado com sucesso!");

    }

    public void removerNinja() {
        if (listaDeNinjas.isEmpty()) {
            System.out.println("Lista vazia!");

        } else {
            listaDeNinjas.removeFirst();
            System.out.println("Ninja removido com sucesso!");
        }

    }

    public void listarNinjas() {
        if (listaDeNinjas.isEmpty()) {
            System.out.println("Lista vazia!");

        } else {
            //complexidade: O(n)
            for (int i = 0; i < listaDeNinjas.size(); i++) {
                System.out.println((i + 1) + " - " + listaDeNinjas.get(i).detalhes());
            }
        }
    }

    public void acessarNinjaPorPosicao(Scanner sc) {
        if (listaDeNinjas.isEmpty()) {
            System.out.println("Lista vazia!");

        } else {
            System.out.println("Digite a posição do ninja");
            int posicaoUsuario = sc.nextInt();
            sc.nextLine();

            if (posicaoUsuario < 1 || posicaoUsuario > listaDeNinjas.size()) {
                System.out.println("Posição inválida");

            } else {
                int posicaoNaLista = posicaoUsuario - 1;

                listaDeNinjas.get(posicaoNaLista).detalhes();
            }
        }
    }

    public void ordenarLista(Scanner sc) {
        if (listaDeNinjas.isEmpty()) {
            System.out.println("Lista vazia!");
        }

        System.out.print("Escolha o critéerio de ordenação:" +
                "\n1. Nome" +
                "\n2. Idade" +
                "\n3. Vila" +
                "\nDigite sua opção: ");

        int opcaoOrdenar = sc.nextInt();
        sc.nextLine();

        switch (opcaoOrdenar) {
            case 1:
                listaDeNinjas.sort(Comparator.comparing(Ninja::getNome));
                System.out.println("Lista ordenada por nome!");
                break;

            case 2:
                listaDeNinjas.sort(Comparator.comparing(Ninja::getIdade));
                System.out.println("Lista ordenada por idade!");
                break;

            case 3:
                listaDeNinjas.sort(Comparator.comparing(Ninja::getVila));
                System.out.println("Lista ordenada por vila!");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        for (int i = 0; i < listaDeNinjas.size(); i++) {
            System.out.println((i + 1) + " - " + listaDeNinjas.get(i).detalhes());
        }
    }


}
