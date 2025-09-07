
package sistema09;

import java.util.Scanner;


public class Mesa {
    String nome;
     Scanner sc = new Scanner(System.in);
     public void listarPub() {
     
    System.out.println("Deseja listar mesas reservadas? Digite 1 para sim e 2 para não ");
    int n = sc.nextInt();
    sc.nextLine();

    if (n == 1) {
        System.out.println("Aqui está a lista de mesas reservadas:");
        System.out.println("Mesa1");
        System.out.println("Mesa2");
        System.out.println("Mesa3");
    } else {
        System.out.println("Ok, encerrando a ação!");
    }
}
}
