package sistema05;

import java.util.Scanner;

public class Consulta {

    public void reserva() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja agendar uma consulta? Digite 1 para sim e 0 para não");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            System.out.println("Deseja agendar consulta com qual medico? ");
            System.out.println("1 - Medico1");
            System.out.println("2 - Medico2");
            System.out.println("3 - Medico3");
        } else {
            System.out.println("Fechando o programa!");
        }

    }
}
