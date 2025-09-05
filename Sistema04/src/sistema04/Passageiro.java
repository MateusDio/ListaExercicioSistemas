
package sistema04;

import java.util.Scanner;


public class Passageiro {
    
    Scanner sc = new Scanner(System.in);
    Reservas rs = new Reservas();
     public void listarPub() {
        System.out.println("Deseja listar reservas feitas? Digite 1 para sim e 2 para não ");
        int n = sc.nextInt();
        sc.nextLine(); 

        if (n == 1) {
            System.out.println("Aqui está a lista de reservas feitas:");
            System.out.println(rs.salvar);
        } else {
            System.out.println("Ok, encerrando a ação!");
        }
    }
}
