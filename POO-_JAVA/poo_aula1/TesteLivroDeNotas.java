package poo_aula1;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        LivroDeNotas livro1 = new LivroDeNotas();
        LivroDeNotas livro2 = new LivroDeNotas();
        livro1.exibirMensagem("bem vindo ao livro 1");
        livro2.exibirMensagem();

        livro1.atribuiNomeCurso("CIC");
        livro2.atribuiNomeCurso("SIN");

        System.out.println(livro1.acessaNomeDoCurso());
        System.out.println(livro2.acessaNomeDoCurso());

    }

}
