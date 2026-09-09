import java.util.Scanner;
public class Usuario {

    String nome;
    Livro livro;

    public void alogarLivro(Livro livro) {

        livro.emprestado = true;
        this.livro = livro;
        System.out.println("Olá " + nome + "! O Livro " + livro.titulo + " foi alocado!");
    }

    public void devolverLivro(Livro livro) {
        livro.emprestado = false;
        this.livro = livro;
        System.out.println("Olá " + nome + "! O Livro " + livro.titulo + " foi devolvido!");

    }

}
