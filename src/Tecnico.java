public class Tecnico {
    private String nome;
    private int idade;
    private float salario;
    private int anosDeExperiencia;

    //construtores com sets
    public Tecnico(String nome, int idade, float salario, int anosDeExperiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setAnosDeExperiencia(anosDeExperiencia);
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
        if (idade > 18) {
            this.idade = idade;
        } else {
            System.out.println("A idade deve ser maior que dezoito anos!!!");
        }
    }

    // get idade
    public int getIdade() {
        return this.idade;
    }

    // set salario
    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("O salario não pode ser negativo");
        }
    }

    // get salario
    public float getSalario() {
        return this.salario;
    }

    // set anosExperiencia
    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    // get anosExperiencia
    public int getAnosDeExperiencia() {
        return this.anosDeExperiencia;
    }
}
