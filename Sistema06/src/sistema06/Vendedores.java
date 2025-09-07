
package sistema06;

import java.util.Scanner;


public class Vendedores {
     public void listarPub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja listar carros vendidos? Digite 1 para sim e 2 para não ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            System.out.println("Aqui está a lista com nomes de carros vendidos:");
            System.out.println("Exemplo1");
            System.out.println("Exemplo2");
            System.out.println("Exemplo3");
        } else {
            System.out.println("Ok, encerrando a ação!");
        }
    }
}

