public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private float salario;
    private boolean contratado;

    // construtor com sets
    public Jogador(String nome, int idade, String posicao, float salario, boolean contratado) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPosicao(posicao);
        this.setSalario(salario);
        this.setContratado(contratado);
    }

    // set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // get nome
    public String getNome() {
        return this.nome;
    }

    // set idade
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
        else {
            System.out.println("A idade deve ser maior que zero!");
        }
    }

    // get idade
    public int getIdade() {
        return this.idade;
    }

    // set posicao
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    // get posicao
    public String getPosicao() {
        return this.posicao;
    }

    // set salario
    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("O salario nao pode ser menor que zero");
        }
    }

    // get salario
    public float getSalario() {
        return this.salario;
    }

    //set contratado
    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    //get contratado
    public boolean isContratado() {
        return this.contratado;
    }
}
