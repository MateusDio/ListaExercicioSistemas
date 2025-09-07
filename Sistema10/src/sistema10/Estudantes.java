
package sistema10;

import java.awt.List;
import java.util.ArrayList;


public class Estudantes {
 String nome;
    int matricula;
    List <Disciplinas> disciplinas = new ArrayList<>();

    public Estudantes(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void matricular(Disciplinas d) {
        disciplinas.add(d);
        d.estudantes.add(this);
        System.out.println(nome + " foi matriculado em " + d.nome);
    }

    public double calcularMedia(Disciplinas d) {
        if (!d.notas.containsKey(this)) {
            return 0.0;
        }
        List<Double> notas = d.notas.get(this);
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.size();
    }
}
}
