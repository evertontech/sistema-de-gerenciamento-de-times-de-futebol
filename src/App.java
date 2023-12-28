import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Robert Lewandowski", 33, "Atacante", 250000.0f, false);
        Jogador jogador2 = new Jogador("Manuel Neuer", 35, "Goleiro", 200000.0f, true);
        Jogador jogador3 = new Jogador("Joshua Kimmich", 26, "Meio-campo", 180000.0f, true);
        Jogador jogador4 = new Jogador("Thomas Müller", 32, "Atacante", 220000.0f, false);
        Jogador jogador5 = new Jogador("Leon Goretzka", 26, "Meio-campo", 160000.0f, true);
        Jogador jogador6 = new Jogador("Serge Gnabry", 26, "Atacante", 150000.0f, true);
        Jogador jogador7 = new Jogador("David Alaba", 29, "Defensor", 200000.0f, true);
        Jogador jogador8 = new Jogador("Leroy Sané", 25, "Atacante", 180000.0f, true);
        Jogador jogador9 = new Jogador("Niklas Süle", 26, "Defensor", 170000.0f, true);
        Jogador jogador10 = new Jogador("Alphonso Davies", 21, "Defensor", 140000.0f, false);
        Jogador jogador11 = new Jogador("Kingsley Coman", 25, "Atacante", 160000.0f, true);


        Tecnico tecnico = new Tecnico("Tite", 60, 1000000.0f, 20);


        Time time = new Time("Seleção Brasileira", "Rio de Janeiro", 1914, tecnico);
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);
        time.adicionarJogador(jogador4);

        System.out.println("A média de idade dos jogadores é: " + time.calcularMedia());
        time.exibirInformacoes();


    }
}
