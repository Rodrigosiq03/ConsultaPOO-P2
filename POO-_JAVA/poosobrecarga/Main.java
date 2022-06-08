import java.util.Scanner;

class Calculadora {
    public int soma(int a, int b) {
        int resultadosoma = a + b;
        return resultadosoma;
    }
    public int soma (int a, int b, int c) {
        int resultadosoma = a + b + c;
        return resultadosoma;
    }
    public double soma (double a, double b) {
        double resultadosoma = a + b;
        return resultadosoma;
    }
    public double soma (String sA, String sB) {
        double dA = Double.parseDouble(sA);
        double dB = Double.parseDouble(sB);
        return dA + dB;
        //return Double.parseDouble(sA) + Double.parseDouble(sB)
    }

    public int subtracao(int a, int b) {
        int resultadosub = a - b;
        return resultadosub;
    }

    public int multiplicacao(int a, int b) {
        int resultadomult = a * b;
        return resultadomult;
    }

    public int divisao(int a, int b) {
        int resultadodiv = a / b;
        return resultadodiv;
    }
}

/*
 * conjuntos de parametros diferentes
 * #em quantidade, em tipo
 */
public class Main {
	public static void main(String[] args) {
		Calculadora c = new Calculadora(); //construtor padrão
		/*
		int x = c.soma(12, 13);
		System.out.println("soma = " + x);
		System.out.println("subtracao = " + c.subtracao(x, 10));
		
		Calculadora s = new Calculadora();
		int j = s.soma(2, c.soma(1, 2));
		*/
		Scanner scanner1 = new Scanner(System.in);
		//Scanner scanner2 = new Scanner(System.in); isso não deveria funcionar
		int opcao;
		do {
		    do {
		        System.out.println ("Digite\n1 - soma\n2 - sutracao\n" + 
		        "3 - multiplicacao\n4 - divisao\n5 - sair");
		        opcao = scanner1.nextInt();
		    } while (opcao < 1 || opcao > 5);
    		if (opcao < 5) {
    		    System.out.println ("digite o primeiro valor");
    		    int a = scanner1.nextInt();
    		    System.out.println ("digite o segundo valor");
    		    int b = scanner1.nextInt();
    		    switch(opcao) {
    		        case 1:
    		            System.out.println("soma = " + c.soma(a, b));
    		            break;
    		        case 2:
    		            System.out.println("subtracao = " + c.subtracao(a, b));
    		            break;
    		        case 3:
    		            System.out.println("multiplicacao = " + c.multiplicacao(a, b));
    		            break;
    		        case 4:
    		            if (b == 0) {
    		                System.out.println("nao existe divisao por zero");
    		            }
    		            else {
    		                System.out.println("divisao = " + c.divisao(a, b));
    		            }
    		            break;
    		    }
    		}
    		else {
    		    System.out.println("Ate breve!");
    		}
	    } while (opcao != 5);
        scanner1.close();
	} 
}
