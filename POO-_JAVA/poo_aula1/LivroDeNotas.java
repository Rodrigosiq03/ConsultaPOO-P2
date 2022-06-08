package poo_aula1;

public class LivroDeNotas {
    // variaveis de classe

    // variasveis de instancia
    private String nomeDoCurso;

    // construtores
    public LivroDeNotas(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public LivroDeNotas() {
        this.nomeDoCurso = "nonono";
    }

    // getters e setters
    public void setNomeDocCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    // metodos especificos
    // public void exibirMensagem(String msg) {
    // System.out.println(msg);
    // }
    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public void exibirMensagem() {
        System.out.println(this.nomeDoCurso);
    }

    public void atribuiNomeCurso(String nome) {
        nomeDoCurso = nome;
    }

    public String acessaNomeDoCurso() {
        return this.nomeDoCurso;
    }

}
