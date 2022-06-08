public class Carro {
    // variaveis de instancia
    private String placa;
    private String modelo;
    private int anoFabricacao;

    // construtores com sobrecarga
    public Carro(String placa, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Carro(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro() {
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;

    }
}
