public class TesteSobreCarga {
    public static void main(String[] args) {
        int x = 2, y = 3, z = 4;

        Calculadora c1 = new Calculadora();

        System.out.println("Soma de dois inteiros: " + c1.soma(x, y));

        System.out.println("Soma de três inteiros: " + c1.soma(x, y, z));

        System.out.println("Soma de doubles: " + c1.soma(2.4, 3.6));

        System.out.println("Soma das Strings: " + c1.soma("1.6", "3.4"));
    }
    
}
