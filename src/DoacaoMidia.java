import java.util.Random;

public class DoacaoMidia {

    static Dvd senhorDosAneis = new Dvd("000001",40.0,"SenhorDosAnéis","Inglês",true,"Português");
    static Dvd starWars = new Dvd("000002",35.0,"Star Wars", "Inglês", true, "Português");
    static Dvd turmaDaMonica = new Dvd("000003",30.0,"Turma da Mônica","Português",false);
    static Cd fineLine = new Cd("000004",70.0,"Fine Line","Harry Styles",12);
    static Cd midnightMemories = new Cd("000005",75.0,"Midnight Memories","One Direction",18);
    static Cd between1and2 = new Cd("000006",70.0,"Between 1&2","Twice",7);

    public static void main(String[] args) {
        Midia a = pegarMidiaAleatoria();
        a.darPlay();

        assistirFilme(senhorDosAneis,false,"");
        System.out.println(senhorDosAneis);
    }

    public static Midia pegarMidiaAleatoria () {
        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(6);
            switch (valorAleatorio) {
                case 0:
                    return senhorDosAneis;
                case 1:
                    return starWars;
                case 2:
                    return turmaDaMonica;
                case 3:
                    return fineLine;
                case 4:
                    return midnightMemories;
                default:
                    return between1and2;
            }
    }

    public static void assistirFilme(Dvd dvd, boolean ligarDesligar, String idioma) {
        dvd.legenda(ligarDesligar, idioma);
        dvd.legenda(ligarDesligar);

    }

}
