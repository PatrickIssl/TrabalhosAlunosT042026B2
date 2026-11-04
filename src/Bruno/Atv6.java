class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    public void emprestar() {
        if (emprestado == true) {
            System.out.println("ja esta emprestado");
        } else {
            emprestado = true;
            System.out.println("livro emprestado");
        }
    }

    public void devolver() {
        if (emprestado == false) {
            System.out.println("nao esta emprestado");
        } else {
            emprestado = false;
            System.out.println("livro devolvido");
        }
    }

    public void exibirInformacoes() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("paginas: " + numeroPaginas);
        System.out.println("emprestado: " + emprestado);
    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "The Anatomy of Fascism";
        l.autor = "Robert O. Paxton";
        l.numeroPaginas = 336;
        l.emprestado = false;

        l.exibirInformacoes();
        l.emprestar();
        l.devolver();
    }
}