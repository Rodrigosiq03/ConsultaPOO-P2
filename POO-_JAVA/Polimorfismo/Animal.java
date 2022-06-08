public class Animal {
    private String nome;

    public Animal (String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;

    }
    public void fazBarulho() {
        System.out.println("fazendo barulho");
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
    