package sistema05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medico {

    List<String> pacientes = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    Consultas rs = new Consultas("Igor", "Rafael", "Italo");

    public void listarPub() {
        Paciente pc = new Paciente();
        System.out.println("Deseja listar consultas do médico? Digite 1 para sim e 2 para não ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            System.out.println("Aqui está a lista com nomes de consultas marcadas:");
            System.out.println(pc.getnome);
        } else {
            System.out.println("Ok, encerrando a ação!");
        }
    }
}
