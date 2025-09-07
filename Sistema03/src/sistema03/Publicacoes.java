
package sistema03;

import java.util.Scanner;


public class Publicacoes {
    Scanner sc = new Scanner(System.in);
    String nomeP, assunto;

   

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    
public void adcP(){
    System.out.println("Você deseja criar uma nova publicação? Digite 1 para sim e 0 para não");
    int n = sc.nextInt();
    sc.nextLine(); 

    if(n == 1){
        System.out.println("Muito bem!");
        System.out.println("Digite o titulo da sua publicação: ");
        nomeP = sc.nextLine();

        System.out.println("Digite o assunto: ");
        assunto = sc.nextLine();

        System.out.println("Sua postagem está aqui:");
        System.out.println("Titulo: " + nomeP);
        System.out.println("Assunto: " + assunto);
    }
}
}