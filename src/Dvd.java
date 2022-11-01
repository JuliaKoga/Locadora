public class Dvd extends Midia{
    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }
    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }
    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public Dvd(String codigo, Double preco, String nome, String idioma, boolean possuiLegenda, String idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }
    public Dvd(String codigo, Double preco, String nome, String idioma, boolean possuiLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
    }
    public Dvd(){}

    public void legenda(boolean ligar, String idioma){
        setPossuiLegenda(ligar);
        if (ligar) {
            setIdiomaLegenda(idioma);
            System.out.println("Legenda ligada em: " + idioma);
        }
    }

    public void legenda(boolean ligarDesligar){
        setPossuiLegenda(ligarDesligar);
        if (ligarDesligar){
            System.out.println("Legenda ligada");
        }else{
            setIdiomaLegenda(null);
            System.out.println("legenda desligada");
        }
    }


    @Override
    public void darPlay(){
        System.out.println("filme " + getNome() +" iniciado");
    }

    @Override
    public String toString() {
        return  super.toString() +"Dvd{" +
                "idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                "} ";
    }
}
