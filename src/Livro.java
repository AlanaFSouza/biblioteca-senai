public class Livro {

    private String titulo;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, boolean emprestado, String isbn) {
        this.titulo = titulo;
        this.emprestado = emprestado;
        this.isbn = isbn;
    }

    public Livro() {

    }
    public void setTitulo(String titulo) {
        if (titulo.length() < 2) {
            System.out.println("Titulo com menos de 2 caracteres não aceito.");
            return;
        }
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}



