package poo_estudoconstrutores;

import javax.swing.JOptionPane;

public class TesteLivrodeNotas {
    public static void main(String[] args) {
        String primeiroCurso;
        primeiroCurso = JOptionPane.showInputDialog(null, "Prof, qual nome do primeiro curso? ");
        String segundoCurso;
        segundoCurso = JOptionPane.showInputDialog(null, "Prof, qual nome do segundo curso?");

        LivroDeNotas livroDeNotas1 = new LivroDeNotas(primeiroCurso);
        LivroDeNotas livroDeNotas2 = new LivroDeNotas(segundoCurso);

        livroDeNotas1.exibirMensagem();
        livroDeNotas2.exibirMensagem();
    }

}
