package sistema06;

import java.util.Scanner;

public class Marcas {

    Scanner sc = new Scanner(System.in);
    Carros cr = new Carros();
    double valor,valor1;
    double media = (valor + valor1) / 2;

    public void mediaValor() {
        System.out.println("Digite o valor das marcas: ");
        System.out.print(cr.marca + ": ");
        valor = sc.nextDouble();
        sc.nextLine();
        System.out.print(cr.marca + ": ");
        valor1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("O valor médio das marcas é: " + media);

    }
}
