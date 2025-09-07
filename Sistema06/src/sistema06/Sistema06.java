
package sistema06;


public class Sistema06 {

   
    public static void main(String[] args) {
       Carros cr = new Carros();
       Marcas mc = new Marcas();
       Vendedores vn = new Vendedores();
       cr.adcEstoque();
       mc.mediaValor();
       vn.listarPub();
    }
    
}
