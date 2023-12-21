import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private List<Jogador> listaJogadores;
    private Tecnico tecnicoResponsavel;

    // construtor vazio
    public Time() {

    }

    // construtor com todos os atributos, o construtor chamar o sets
    public Time(String nome, String cidade, int anoFundacao, List<Jogador> listaJogadores, Tecnico tecnicoResponsavel) {
        this.setNome(nome);
        this.setCidade(cidade);
        this.setAnoFundacao(anoFundacao);
        this.setListaJogadores(listaJogadores);
        this.setTecnico(tecnicoResponsavel);
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
        this.anoFundacao = anoFundacao;
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
}
