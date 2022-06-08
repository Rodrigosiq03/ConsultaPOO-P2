import javax.swing.JOptionPane;

public class TestCarro {
        public static void main(String[] args) {
                Carro c1 = new Carro("ABC1234");
                System.out.println("Carro 1: Primeira informacao\nPlaca: " + c1.getPlaca() + "\nmodelo: "
                                + c1.getModelo() + "\nano: "
                                + c1.getAnoFabricacao());
                String modelo = JOptionPane.showInputDialog(null, "Digite o modelo: ");
                c1.setModelo(modelo);
                int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano: "));
                c1.setAnoFabricacao(anoFabricacao);

                System.out.println("Carro 1:Novas informações sobre o carro 1 \nPlaca: " + c1.getPlaca() + "\nmodelo: "
                                + c1.getModelo() + "\nano: "
                                + c1.getAnoFabricacao());
                Carro c2 = new Carro();
                System.out.println("Carro 2:Construtor padrao \nPlaca: " + c2.getPlaca() + "\nmodelo: "
                                + c2.getModelo() + "\nano: "
                                + c2.getAnoFabricacao());

                String placa = JOptionPane.showInputDialog(null, "digite a placa do carro: ");

                modelo = JOptionPane.showInputDialog(null, "Digite o modelo: ");

                anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano: "));

                Carro carroNovo = new Carro(placa, modelo, anoFabricacao);

                System.out
                                .println("Carro novo: Seguem informacoes do carro novo \nPlaca: " + carroNovo.getPlaca()
                                                + "\nmodelo: "
                                                + carroNovo.getModelo() + "\nano: "
                                                + carroNovo.getAnoFabricacao());

        }

}
