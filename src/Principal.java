
public class Principal {

    static void main () {
        Livro hp = new Livro("Harry Potter", false, "XYZ123");
        hp.setTitulo("Harry Potter");

        hp.setIsbn("XYZ123");
        hp.setEmprestado(true);

        Usuario joao = new Usuario();
        joao.nome = "João";

        joao.livro = hp;
        hp.setEmprestado(true);

        joao.livro = null;
        hp.setEmprestado(true);

        joao.alogarLivro(hp);
        joao.devolverLivro(hp);


       }
    }


