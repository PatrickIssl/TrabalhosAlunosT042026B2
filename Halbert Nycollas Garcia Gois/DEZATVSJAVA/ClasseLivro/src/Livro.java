public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String emprestado;

    public Livro(){
        setTitulo(titulo);
        setAutor(autor);
        setNumeroPaginas(numeroPaginas);
        setEmprestado(emprestado);
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEmprestado() {
        return emprestado;
    }
    public void setEmprestado(String emprestado) {
        this.emprestado = emprestado;
    }



    public void emprestar() {

    }
    public void devolver() {

    }
    public void exibirInformações() {

    }

}
