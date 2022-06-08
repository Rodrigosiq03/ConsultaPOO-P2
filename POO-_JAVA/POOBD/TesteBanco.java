import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class TesteBanco {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pessoas", "root", "Megan200903$");
            if (conexao != null) {
                JOptionPane.showMessageDialog(null, "Conexao realizada com sucesso!!");
                String nome = JOptionPane.showInputDialog("Qual o seu nome?");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
                //o comando a ser executado é uma simples string
                //os símbolos ? reservam o lugar de valores a serem especificados
                String sql = "INSERT INTO tb_pessoa (nome, idade) VALUES (?, ?)";
                //uma estrutura que representa o comando é "preparada". Assim, ele pode ser executado diversas vezes com dados diferentes
                PreparedStatement ps = conexao.prepareStatement(sql);
                //configuramos os valores a serem inseridos
                ps.setString(1, nome);
                ps.setInt(2, idade);

                ps.execute();
                conexao.close();
                JOptionPane.showMessageDialog(null, "Dados Inseridos Com Sucesso!!");

            }
            else {
                System.out.println("Conexão não estabelecida!");
            }
        } 
        catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }

    }
}