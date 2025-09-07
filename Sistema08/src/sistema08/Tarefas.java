package sistema08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    List<String> salvar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n1 ;
    String tarefa;

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
    


    public void adicionar(String tarefa) {
        salvar.add(tarefa);
    }
    public void adcTare() {
        Desenvolvedores ds = new Desenvolvedores("Mateus", "Rafaela", "Igor");
        System.out.println("Deseja adcionar tarefas a um desenvolvedor? Digite 1 para sim e 0 para não ");
        int n = sc.nextInt();
        n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.print("Descreva a tarefa: ");
            tarefa = sc.nextLine();
            System.out.println("Selecione o desenvolvedor para adcionar a tarefa: ");
            System.out.println("1 - " + ds.nome1);
            System.out.println("2 - " + ds.nome2);
            System.out.println("3 - " + ds.nome3);
            System.out.print("Digite o número do desenvolvedor:");
             n1 = sc.nextInt();
            sc.nextLine();
            if (n1 == 1) {
                System.out.println("O resultado ficou assim: ");
                System.out.println("Desenvolvedor: " + ds.getNome1() + " Tarefa: " + tarefa);
                salvar.add(ds.getNome1() + "-" + tarefa);

            } else if (n1 == 2) {
                System.out.println("O resultado ficou assim: ");
                System.out.println("Desenvolvedor: " + ds.getNome2() + " Tarefa: " + tarefa);
                salvar.add(ds.getNome2() + "-" + tarefa);
            } else if (n1 == 3) {
                System.out.println("O resultado ficou assim: ");
                System.out.println("Desenvolvedor: " + ds.getNome3() + " Tarefa: " + tarefa);
                salvar.add(ds.getNome3() + "-" + tarefa);
            }
        }
    }
}
