package sistema01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {

    Scanner sc = new Scanner(System.in);
    public String nome;
    public int quant;
     protected List<Item> estoque = new ArrayList<>();
    protected static List<String> salvar = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

public void AdcPro() {
    while (true) {  
        System.out.print("Quer adicionar um produto? (1 = sim / 0 = não)");
        String opc = sc.nextLine();

        if (opc.equals("1")) {
            System.out.print("Nome do produto:");
            String nome = sc.nextLine();

            System.out.print("Quantidade:");
            int quant = sc.nextInt();
            sc.nextLine();  

            estoque.add(new Item(nome, quant));
            System.out.println("Produto adicionado!\n");

        } else if (opc.equals("0")) {
            System.out.println("Encerrando adição de produtos...");
            break; 
        } else {
            System.out.println("Opção inválida, tente novamente.");
        }
    }
}

    public void ExibirEstoque() {
        for (Item item : estoque) {
            System.out.println(item);
        }
    }

   
    public static class Item {
        String nome;
        int quant;

        public Item(String nome, int quant) {
            this.nome = nome;
            this.quant = quant;
        }

        @Override
        public String toString() {
            return nome + ": " + quant;
        }
    }

}
