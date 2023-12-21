public class Tecnico {
    private String nome;
    private int idade;
    private float salario;
    private int anosExperiencia;

    //construtores vazios
    public Tecnico() {

    }

    //construtores com sets
    public Tecnico(String nome, int idade, float salario, int anosExperiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setAnosExperiencia(anosExperiencia);
    }

    // set nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // get nome
    public String getNome() {
        return nome;
    }

    // set idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // get idade
    public int getIdade() {
        return this.idade;
    }

    // set salario
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // get salario
    public float getSalario() {
        return this.salario;
    }

    // set anosExperiencia
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    // get anosExperiencia
    public int getAnosExperiencia() {
        return this.anosExperiencia;
    }
}
