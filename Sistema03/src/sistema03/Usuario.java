package sistema03;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    Publicacoes pb = new Publicacoes();  // Supondo que seja uma classe com título e assunto
    String nome;
    int n;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void nomes() {
        System.out.print("Digite o nome do usuário: ");
        this.nome = sc.nextLine();
    }

    public void AdcPubb() {
        System.out.println("Deseja adicionar uma publicação? Digite 1 para sim e 2 para não: ");
        n = sc.nextInt();
        sc.nextLine();

        if (n == 1) {
            System.out.print("Agora digite o título da sua postagem: ");
            this.pb.titulo = sc.nextLine();

            System.out.print("Agora o assunto: ");
            this.pb.assunto = sc.nextLine();

            System.out.println("Sua postagem ficou assim:");
            System.out.println("Título: " + pb.titulo);
            System.out.println("Assunto: " + pb.assunto);

        } else {
            System.out.println("Ok, encerrando a ação!");
        }
    }

    public void listarPub() {
        System.out.println("Deseja listar publicações feitas? Digite 1 para sim e 2 para não ");
        n = sc.nextInt();
        sc.nextLine(); 

        if (n == 1) {
            System.out.println("Aqui está a lista de publicações:");
            System.out.println("Usuário: " + nome);
            System.out.println("Título: " + pb.titulo);
            System.out.println("Assunto: " + pb.assunto);
        } else {
            System.out.println("Ok, encerrando a ação!");
        }
    }
}
