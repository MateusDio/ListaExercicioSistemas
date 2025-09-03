package sistema01;

public class Pedidos {

    private String nomeCliente, itens;
    private int quantPed;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public int getQuantPed() {
        return quantPed;
    }

    public void setQuantPed(int quantPed) {
        this.quantPed = quantPed;
    }

  
    Produtos pr1 = new Produtos();

   public void listProdt() {
    boolean achou = false;

    for (Produtos.Item item : pr1.estoque) {
    if (item.quant < 10) {
        System.out.println(item);
    }
}

    if (!achou) {
        System.out.println("Nenhum produto com quantidade menor que 10.");
    }
}

    }

