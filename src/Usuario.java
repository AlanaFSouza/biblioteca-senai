import java.util.Scanner;
public class Usuario {

    String nome;
    Livro livro;

    public void alogarLivro(Livro livro) {

        livro.setEmprestado(true);
        this.livro = livro;
        System.out.println("Olá " + nome + "! O Livro " + livro.getTitulo() + " foi alocado!");
    }

    public void devolverLivro(Livro livro) {
        livro.setEmprestado(false);
        this.livro = livro;
        System.out.println("Olá " + nome + "! O Livro " + livro.getTitulo() + " foi devolvido!");

    }

}
