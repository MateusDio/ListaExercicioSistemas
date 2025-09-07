package sistema08;

import java.util.Scanner;

public class Projetos {

    Scanner sc = new Scanner(System.in);
    String nome, tamanho;
    int hora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanh() {
        return tamanho;
    }

    public void setTamanh(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void cargaHo() {
        System.out.println("Deseja calcular a carga horaria de um projeto? Digite 1 para sim e 0 para não");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.println("Qual o tamanho do projeto? ");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Grande");
            System.out.println("Digite o número da alternativa: ");
            int n1 = sc.nextInt();
            sc.nextLine();
            if(n1 == 1){
                System.out.println("O tempo demorado é entre 1 a 4 semanas!");
            } else if (n1 == 2){
                System.out.println("O tempo demorado é entre 2 a 6 meses");
                
            } else if (n1 == 3){
                System.out.println("O tempo demorado é entre 6 meses a 2 anos");
                

        }

    } else {
            System.out.println("Ok, encerrando o programa");
        }
    }
}
