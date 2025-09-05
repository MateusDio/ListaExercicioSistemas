
package sistema04;


public class Sistema04 {

    public static void main(String[] args) {
       Voo vo = new Voo("Airlanes", " França", "Airplane", "China");
       Reservas rs = new Reservas();
       Passageiro pg = new Passageiro();
       vo.vooDisp();
       pg.rs.reserva();
       pg.listarPub();
    }
    
}
