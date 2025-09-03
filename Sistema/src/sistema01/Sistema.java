package sistema01;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Produtos pr = new Produtos();
        Fornecedores fn = new Fornecedores();
        Pedidos pd = new Pedidos();

        pr.AdcPro();       
        pr.ExibirEstoque();
        fn.AdcPro();
        fn.ExibirEstoque();
        pd.listProdt();

    }
}
