public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (marca != null && !marca.isBlank()) {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isBlank()) {
            this.modelo = modelo;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
    }

    public void exibirCarro() {
        System.out.printf("\nMarca: %s\nModelo: %s\nAno: %d", marca,modelo,ano);
    }
}

