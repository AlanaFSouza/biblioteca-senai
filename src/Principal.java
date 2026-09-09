
public class Principal {

    static void main () {
        Livro hp = new Livro();
        hp.titulo = "Harry Potter";
        hp.isbn = "XYZ123";
        hp.emprestado = false;

        Usuario joao = new Usuario();
        joao.nome = "João";

        joao.livro = hp;
        hp.emprestado = true;

        joao.livro = null;
        hp.emprestado = false;

        joao.alogarLivro(hp);
        joao.devolverLivro(hp);


       }
    }


