package poo_estudogetters;

import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        String nomeDoCurso = JOptionPane.showInputDialog(null, "Professor, qual o nome do curso???");
        livroDeNotas.setnomeDoCurso(nomeDoCurso);
        livroDeNotas.exibirMensagem();
    }

}
