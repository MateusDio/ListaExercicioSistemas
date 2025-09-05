package sistema03;

import java.util.Scanner;

public class Publicacoes {

    Scanner sc = new Scanner(System.in);
    public String titulo, assunto;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

}
