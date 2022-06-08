package poo_estudoconstrutores;

public class LivroDeNotas {
    private String nomeDoCurso;

    public LivroDeNotas(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas do curso %s \n", nomeDoCurso);
    }

    public String getnomeDoCurso() {
        return nomeDoCurso;
    }

    public void setnomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

}
