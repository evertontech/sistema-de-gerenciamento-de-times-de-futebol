import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Time {
    private String nome;
    private String cidade;
    private int anoDeFundacao;
    private Tecnico tecnicoResponsavel;
    private List<Jogador> listaDeJogadores;

    // segundo construtor com os atributos
    public Time(String nome, String cidade, int anoDeFundacao, Tecnico tecnicoResponsavel) {
        this.setNome(nome);
        this.setCidade(cidade);
        this.setAnoDeFundacao(anoDeFundacao);
        this.setTecnico(tecnicoResponsavel);
        this.listaDeJogadores = new ArrayList<>();
    }

    // set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // get nome
    public String getNome() {
        return this.nome;
    }

    // set cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // get cidade
    public String getCidade() {
        return this.cidade;
    }

    // set anoFundacao
    public void setAnoDeFundacao(int anoDeFundacao) {
        int anoAtual = LocalDateTime.now().getYear();
        if (anoDeFundacao <= anoAtual) {
            this.anoDeFundacao = anoDeFundacao;
        } else {
            System.out.println("O ano de fundação não pode ser maior que o atual");
        }
    }

    // get anoFundacao
    public int getAnoDeFundacao() {
        return this.anoDeFundacao;
    }

    // get listaJogadores
    public List<Jogador> getListaDeJogadores() {
        return this.listaDeJogadores;
    }

    // set Tecnico
    public void setTecnico(Tecnico tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    // get Tecnico
    public Tecnico getTecnico() {
        return this.tecnicoResponsavel;
    }

    // Método que calcula média de idade dos jogadores
    public float calcularMediaDeIdadeDosJogadores() {
        int somaIdade = 0;

        for (Jogador jogador : listaDeJogadores) {
          somaIdade = somaIdade + jogador.getIdade();
        }

        return somaIdade / (float) listaDeJogadores.size();
    }

    //Método para imprimir todas as informações de um time
    public void exibirTodasAsInformacoes() {

        System.out.println("*********** INFORMACOES DO TIME ************");
        System.out.println("Nome.............: " + nome);
        System.out.println("Cidade...........: " + cidade);
        System.out.println("Ano de fundação..: " + anoDeFundacao);
        System.out.println();

        System.out.println("********** INFORMACOES DO TECNICO **********");
        System.out.println("Nome.................: " + tecnicoResponsavel.getNome());
        System.out.println("Idade................: " + tecnicoResponsavel.getIdade());
        System.out.println("Salário..............: R$ " + tecnicoResponsavel.getSalario());
        System.out.println("Anos de experiência..: " + tecnicoResponsavel.getAnosDeExperiencia());
        System.out.println();

        for (Jogador jogador : listaDeJogadores) {
            System.out.println("********** INFORMACOES DO JOGADOR **********");
            System.out.println("Nome........: " + jogador.getNome());
            System.out.println("Idade.......: " + jogador.getIdade());
            System.out.println("Posição.....: " + jogador.getPosicao());
            System.out.println("Salário.....: R$ " + jogador.getSalario());
            System.out.println("Contratado..: " + (jogador.isContratado() ? "SIM" : "NÃO"));
            System.out.println();
        }
    }

    //método para adicionar jogador
    // Observação: No parâmetro, qual é a classe do objeto
    public void adicionarJogador(Jogador jogadorParaAdicionar){
        this.listaDeJogadores.add(jogadorParaAdicionar);
    }
}
