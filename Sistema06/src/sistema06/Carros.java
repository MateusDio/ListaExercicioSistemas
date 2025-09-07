package sistema06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carros {

    List<String> salvar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String cor, marca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void adcEstoque() {
        System.out.println("Deseja adicionar um carro ao estoque? Digite 1 para sim e 0 para não");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.println("Digite a marca do carro: ");
            marca = sc.nextLine();
            System.out.println("Digite a cor do carro: ");
            cor = sc.nextLine();
            System.out.println("O registro do carro ficou assim: ");
            System.out.println("Marca: " + marca + " Cor: " + cor);
            salvar.add(marca + " - " + cor);

        } else {
            System.out.println("Ok, encerrando cadastro");

        }

    }
}
