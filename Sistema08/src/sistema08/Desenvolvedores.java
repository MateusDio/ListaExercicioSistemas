
package sistema08;

import java.util.Scanner;


public class Desenvolvedores {
    Scanner sc = new Scanner(System.in);
    String nome1, nome2, nome3;

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

    public Desenvolvedores(String nome1, String nome2, String nome3) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nome3 = nome3;
    }
    
    
 

    public void listarPub(Tarefas tr) {
        System.out.println("Deseja listar tarefas do desenvolvedor? Digite 1 para sim e 2 para não ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            if (tr.salvar.isEmpty()) {
                System.out.println("Nenhuma tarefa cadastrada.");
            } else {
                System.out.println("Aqui estão as tarefas:");
                for (String tarefa : tr.salvar) {
                    System.out.println("- " + tarefa);
                }
            }
        } else {
            System.out.println("Ok, encerrando a ação!");
        }
    }
}
