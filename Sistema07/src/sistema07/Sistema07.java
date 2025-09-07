/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema07;

/**
 *
 * @author mauri
 */
public class Sistema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autores autor1 = new Autores("Machado de Assis");
        Autores autor2 = new Autores("J.K. Rowling");

        Livros livro1 = new Livros("Dom Casmurro", autor1, 2);
        Livros livro2 = new Livros("Harry Potter", autor2, 1);

        Usuarios u1 = new Usuarios("Igor");
        Usuarios u2 = new Usuarios("Rafael");
        Usuarios u3 = new Usuarios("Italo");

        Biblioteca b = new Biblioteca();
        b.adicionarLivro(livro1);
        b.adicionarLivro(livro2);

        Emprestimos e1 = b.emprestarLivro(livro1, u1);
        Emprestimos e2 = b.emprestarLivro(livro1, u2);
        Emprestimos e3 = b.emprestarLivro(livro1, u3); 

        b.devolverLivro(e1);

        b.listarLivrosPopulares();
    }

}
