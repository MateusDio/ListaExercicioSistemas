package sistema05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {

    Scanner sc = new Scanner(System.in);
    List<String> salvar = new ArrayList<>();
    String nome1, nome2, nome3;
    

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public Consultas(String nome1, String nome2, String nome3) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nome3 = nome3;
    }

    public void agnConsu() {
        System.out.println("Deseja agendar uma consulta?Digite 1 para sim e 0 para não");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.println("Deseja agendar qual consulta?");
            System.out.println("1 - " + nome1);
            System.out.println("2 - " + nome2);
            System.out.println("3 - " + nome3);
            System.out.print("Digite a opção correspondente: ");
            int n1 = sc.nextInt();
            sc.nextLine();
            if (n1 == 1) {
                System.out.println("A consulta agendada foi: " + nome1);
                salvar.add(nome1);

            } else if (n1 == 2) {
                System.out.println("A consulta agendada foi: " + nome2);
                salvar.add(nome2);
                
            } else if (n1 == 3) {
                System.out.println("A consulta agendada foi: " + nome3);
                salvar.add(nome3);
                
            }
        }

    }

}
