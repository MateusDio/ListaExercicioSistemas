
package sistema05;

import java.util.Scanner;


public class Paciente {
    Scanner sc = new Scanner(System.in);
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public void nomes(){
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
    }
    
 public void listarPub() {
     Consultas rs = new Consultas("Igor", "Rafael", "Italo");
    System.out.println("Deseja listar consultas marcadas? Digite 1 para sim e 2 para não ");
    int n = sc.nextInt();
    sc.nextLine();

    if (n == 1) {
        System.out.println("Aqui está a lista de consultas marcadas:");
        for (String consulta : rs.salvar) {
            System.out.println(consulta);
        }
    } else {
        System.out.println("Ok, encerrando a ação!");
    }
}
}
