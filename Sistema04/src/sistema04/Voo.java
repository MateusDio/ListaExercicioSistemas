package sistema04;

import java.util.Scanner;

public class Voo {

    Scanner sc = new Scanner(System.in);
    String nomeV, destino, nomeV1, destino1;
    boolean tru = true;
    boolean fal = false;

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNomeV() {
        return nomeV;
    }

    public void setNomeV(String nomeV) {
        this.nomeV = nomeV;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNomeV1() {
        return nomeV1;
    }

    public void setNomeV1(String nomeV1) {
        this.nomeV1 = nomeV1;
    }

    public String getDestino1() {
        return destino1;
    }

    public void setDestino1(String destino1) {
        this.destino1 = destino1;
    }

    public boolean isTru() {
        return tru;
    }

    public void setTru(boolean tru) {
        this.tru = tru;
    }

    public boolean isFal() {
        return fal;
    }

    public void setFal(boolean fal) {
        this.fal = fal;
    }

    public Voo(String nomeV, String destino, String nomeV1, String destino1) {
        this.nomeV = nomeV;
        this.destino = destino;
        this.nomeV1 = nomeV1;
        this.destino1 = destino1;
    }

    

   

    public void vooDisp() {
        System.out.println("Deseja ver a lista de voos? Digite 1 para sim e 0 para não");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.println("Aqui está a lista: ");
            System.out.println("Nome: " + nomeV + "|Destino: " + destino + "|Disponibilidade: " + tru);
            System.out.println("Nome: " + nomeV1 + "|Destino: " + destino1 + "|Disponibilidade: " + false);
        }
    }

}
