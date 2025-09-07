package sistema05;

public class Sistema05 {

    public static void main(String[] args) {
        Medico md = new Medico();
        Paciente pc = new Paciente();
        Consultas rs = new Consultas("Igor", "Rafael", "Italo");
        pc.nomes();
        rs.agnConsu();
        md.listarPub();
        pc.listarPub();
    }

}
