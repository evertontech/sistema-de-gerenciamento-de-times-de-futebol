import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private List<Jogador> listaJogadores;
    private Tecnico tecnicoResponsavel;

    // construtor vazio
    public Time() {
        listaJogadores = new ArrayList<>();
    }

    // construtor com todos os atributos, o construtor chamar o sets
    public Time(String nome, String cidade, int anoFundacao, List<Jogador> listaJogadores, Tecnico tecnicoResponsavel) {
        this.setNome(nome);
        this.setCidade(cidade);
        this.setAnoFundacao(anoFundacao);
        this.setListaJogadores(listaJogadores);
        this.setTecnico(tecnicoResponsavel);
    }

    // segundo construtor com os atributos
    public Time(String nome, String cidade, int anoFundacao, Tecnico tecnicoResponsavel) {
        this.setNome(nome);
        this.setCidade(cidade);
        this.setAnoFundacao(anoFundacao);
        this.setTecnico(tecnicoResponsavel);
        this.listaJogadores = new ArrayList<>();
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
    public void setAnoFundacao(int anoFundacao) {
        int anoAtual = LocalDateTime.now().getYear();
        if (anoFundacao <= anoAtual) {
            this.anoFundacao = anoFundacao;
        } else {
            System.out.println("O ano de fundação não pode ser maior que o atual");
        }
    }

    // get anoFundacao
    public int getAnoFundacao() {
        return this.anoFundacao;
    }

    // set listaJogadores
    public void setListaJogadores(List<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    // get listaJogadores
    public List<Jogador> getListaDeJogadores() {
        return this.listaJogadores;
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
    public float calcularMedia() {
        int i;
        int somaIdade = 0;

        for (i = 0; i < listaJogadores.size(); i++) {
          somaIdade = somaIdade + listaJogadores.get(i).getIdade();
        }

        return somaIdade / 11.0f;
    }

    //Método para imprimir todas as informações de um time
    public void exibirInformacoes() {

        System.out.println("*********** INFORMACOES DO TIME ************");
        System.out.println("Nome.............: " + nome);
        System.out.println("Cidade...........: " + cidade);
        System.out.println("Ano de fundação..: " + anoFundacao);
        System.out.println();
        tecnicoResponsavel.exibirInformacoes();
        for (int i = 0; i < listaJogadores.size(); ++i) {
            Jogador jogador = listaJogadores.get(i);
            jogador.exibirInformacoes();
        }
    }

    //método para adicionar jogador
    // Observação: No parâmetro, qual é a classe do objeto
    public void adicionarJogador(Jogador jogador){
        this.listaJogadores.add(jogador);
    }
}
