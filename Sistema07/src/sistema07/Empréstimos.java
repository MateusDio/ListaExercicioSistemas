
package sistema07;

import java.util.Calendar;
import java.util.Date;


public class Empréstimos {
    class Emprestimo {
    private Livros livro;
    private Usuarios usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean devolvido;

    public Emprestimo(Livros livro, Usuarios usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = new Date(); 
        Calendar c = Calendar.getInstance();
        c.setTime(dataEmprestimo);
        c.add(Calendar.DAY_OF_MONTH, 7); 
        this.dataDevolucao = c.getTime();
        this.devolvido = false;

        livro.emprestar();
    }

    public Livros getLivro() {
        return livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    
    public double devolver() {
        this.devolvido = true;
        livro.devolver();

        Date hoje = new Date();
        if (hoje.after(dataDevolucao)) {
            long atraso = (hoje.getTime() - dataDevolucao.getTime()) / (1000 * 60 * 60 * 24);
            return atraso * 2.50; 
        }
        return 0;
    }

    @Override
    public String toString() {
        return usuario.getNome() + " pegou \"" + livro.getTitulo() + "\" até " + dataDevolucao;
    }
}
}
