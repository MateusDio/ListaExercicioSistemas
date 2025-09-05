
package sistema03;


public class Sistema03 {

   
    public static void main(String[] args) {
        Usuario us = new Usuario();
        Comentarios cm = new Comentarios();
        
        us.nomes();
        us.AdcPubb();
        cm.AdcCom();
        us.listarPub();
    }
    
}
