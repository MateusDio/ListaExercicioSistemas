
package sistema09;

import java.util.Scanner;


public class Pedido {
    Scanner sc = new Scanner(System.in);
    Prato pr = new Prato();

 public void CalTo() {
    System.out.println("Deseja calcular o total do pedido? Digite 1 para sim e 2 para não ");
    int n = sc.nextInt();
    sc.nextLine();

    if (n == 1) {
        double total = 0;

        System.out.println("Quantos itens deseja adicionar?");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o Nome do pedido: ");
            pr.nomeP = sc.nextLine();
            System.out.println("Digite o valor:");
            pr.valor = sc.nextDouble();
            sc.nextLine();

            total += pr.valor;
        }

        System.out.println("O total foi: " + total);
    }
}
}
