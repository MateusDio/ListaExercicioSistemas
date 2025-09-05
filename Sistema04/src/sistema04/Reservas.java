package sistema04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservas {
    public List<String> salvar = new ArrayList<>();

    public void reserva() {
        Scanner sc = new Scanner(System.in);
        Voo vo = new Voo("Airlanes", "França", "Airplane", "China");

        System.out.println("Deseja fazer uma reserva? Digite 1 para sim e 0 para não");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            System.out.println("Deseja fazer reserva em qual voo?");
            System.out.println("1 - " + vo.nomeV + " " + vo.destino);
            System.out.println("2 - " + vo.nomeV1 + " " + vo.destino1);
            System.out.print("Digite a opção correspondente: ");
            int n1 = sc.nextInt();
            sc.nextLine();

            if (n1 == 1) {
                System.out.println("A reserva foi feita no voo:");
                System.out.println("1 - " + vo.nomeV + " " + vo.destino);
                salvar.add(vo.nomeV + " - " + vo.destino);
            } else if (n1 == 2) {
                System.out.println("A reserva foi feita no voo:");
                System.out.println("2 - " + vo.nomeV1 + " " + vo.destino1);
                salvar.add(vo.nomeV1 + " - " + vo.destino1);
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Fechando o programa!");
        }

        
    }
}
