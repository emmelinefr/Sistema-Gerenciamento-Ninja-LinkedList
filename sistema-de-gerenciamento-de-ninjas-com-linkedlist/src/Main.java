import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        int menu;
        do {
            System.out.print("==== MENU ====" +
                    "\n1. Adicionar ninja" +
                    "\n2. Remover ninja" +
                    "\n3. Listar ninjas" +
                    "\n4. Acessar ninja por posição" +
                    "\n5. Ordenar Lista" +
                    "\n6. Sair" +
                    "\nDigite uma das opções: ");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: //add
                    sistema.adicionarNinja(sc);
                    break;

                case 2: //remover
                    sistema.removerNinja();
                    break;

                case 3: //list
                    sistema.listarNinjas();
                    break;

                case 4:
                    sistema.acessarNinjaPorPosicao(sc);
                    break;

                case 5:
                    sistema.ordenarLista(sc);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção incorreta. Tente novamente.");
                    break;

            }
        } while (menu != 5);

        sc.close();
    }
}