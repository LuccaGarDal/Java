package academy.devdojo.maratonajava.unijorge.dominio;

public class Computador {
    String marca;
    String placaDeVideo;
    String cor;
    int memoria;
    int anoDeFabricacao;

    public Computador() {
        this.marca = "nulo";
        this.placaDeVideo = "nulo";
        this.cor = "nulo";
        this.memoria = 0;
        this.anoDeFabricacao = 0;
    }

    public Computador(String marca, String placaDeVideo, String cor, int memoria, int anoFabricacao) {
        this.marca = marca;
        this.placaDeVideo = placaDeVideo;
        this.cor = cor;
        this.memoria = memoria;
        this.anoDeFabricacao = anoFabricacao;
    }

    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Placa de vídeo: " + this.placaDeVideo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Memória: " + this.memoria);
        System.out.println("Ano de fabricação: " + this.anoDeFabricacao);
        System.out.print("\n");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getAnoFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
}
