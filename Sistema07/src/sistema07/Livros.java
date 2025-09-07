package sistema07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Livros {
    private String titulo;
    private Autores autor;
    private int quantidade;
    private int vezesEmprestado;

    public Livros(String titulo, Autores autor, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.vezesEmprestado = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autores getAutor() {
        return autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void emprestar() {
        if (quantidade > 0) {
            quantidade--;
            vezesEmprestado++;
        }
    }

    public void devolver() {
        quantidade++;
    }

    public int getVezesEmprestado() {
        return vezesEmprestado;
    }

  
    public static class Biblioteca {
        private List<Livros> livros = new ArrayList<>();
        private List<Empréstimos> emprestimos = new ArrayList<>();
        private Queue<Usuarios> reservas = new LinkedList<>();

        public void adicionarLivro(Livros livro) {
            livros.add(livro);
        }

        public Empréstimos emprestarLivro(Livros livro, Usuarios usuario) {
            if (livro.getQuantidade() > 0) {
                Empréstimos e = new Empréstimos(livro, usuario);
                emprestimos.add(e);
                System.out.println("✅ " + usuario.getNome() + " emprestou " + livro.getTitulo());
                return e;
            } else {
                reservas.add(usuario);
                System.out.println("⚠️ Livro indisponível. Reserva feita para " + usuario.getNome());
                return null;
            }
        }

        public void devolverLivro(Empréstimos e) {
            double multa = e.devolver();
            if (multa > 0) {
                System.out.println("⚠️ Multa de R$ " + multa + " pelo atraso.");
            } else {
                System.out.println("✅ Livro devolvido sem multa.");
            }

           
            if (!reservas.isEmpty()) {
                Usuarios u = reservas.poll();
                emprestarLivro(e.getLivro(), u);
            }
        }

        public void listarLivrosPopulares() {
            livros.sort((a, b) -> b.getVezesEmprestado() - a.getVezesEmprestado());
            System.out.println("📚 Livros mais populares:");
            for (Livros l : livros) {
                System.out.println(l.getTitulo() + " - " + l.getVezesEmprestado() + " empréstimos");
            }
        }
    }
}