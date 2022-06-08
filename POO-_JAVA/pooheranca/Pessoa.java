public class Pessoa {
    //atributos encapsulados
    private int idade;
    private String nome;
    //construtores sobrecarregados
    public Pessoa() {}
    public Pessoa(String nome) {
        this.setNome(nome);
    }
    public Pessoa(int idade, String nome) {
        this (nome); //chamada para o construtor anterior
        // ou usar this.setNome(nome);
        this.setIdade(idade);
    }

    //modificadores
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //metodos de acesso
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }
    //sobrescrever (redefinir) o metodo toString
    @Override
    public String toString() {
        return "nome: " + this.nome + "\nidade: " + this.nome;
    }
}