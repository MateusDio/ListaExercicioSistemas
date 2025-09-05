package sistema03;

import java.util.Scanner;

public class Comentarios {

    Scanner sc = new Scanner(System.in);
    String cont;
    int n;

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

 public void AdcCom() {
        System.out.println("Deseja adicionar um comentário? Digite 1 para sim e 2 para não: ");
        n = sc.nextInt();
        sc.nextLine(); 

        if (n == 1) {
            System.out.print("Agora digite o conteúdo do comentário: ");
            cont = sc.nextLine();

            System.out.println("Seu comentário ficou assim:");
            System.out.println("Assunto: " + cont);
        } else {
            System.out.println("Ok, encerrando a ação!");
        }

        
    }

    }

