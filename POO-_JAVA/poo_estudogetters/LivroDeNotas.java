package poo_estudogetters;

public class LivroDeNotas {
    private String nomeDoCurso;

    // public LivroDeNotas(String nome) {
    // this.nomeDoCurso = nome;

    // }

    public void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas do curso %s", getnomeDoCurso());

    }

    public String getnomeDoCurso() {
        return nomeDoCurso;
    }

    public void setnomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

}
