package poo_estudo1;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        String nomeDoCurso = JOptionPane.showInputDialog(null, "Professor, qual o nome do curso?");
        livroDeNotas.exibirMensagem(nomeDoCurso);
    }

}
