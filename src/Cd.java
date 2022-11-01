public class Cd extends Midia{
    private String artista;
    private int quantidadeFaixas;

    public String getArtista(){
        return this.artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }
    public void setQuantidadeFaixas(int quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }


    public Cd(String codigo, Double preco, String nome, String artista, int quantidadeFaixas) {
        super(codigo, preco, nome);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public Cd() {
    }

    @Override
    public void darPlay(){
        System.out.println("Primeira faixa de "+ getNome() +" tocando");
    }

    @Override
    public String toString() {
        return super.toString()+ "Cd{" +
                "artista='" + artista + '\'' +
                ", quantidadeFaixas=" + quantidadeFaixas +
                "} " ;
    }
}
