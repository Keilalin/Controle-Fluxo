import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner dadosDeEntrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numeroUm = dadosDeEntrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int numeroDois = dadosDeEntrada.nextInt();
		
        System.out.println("Você digitou os números: " + numeroUm + " e " + numeroDois);

		try {
			contar(numeroUm, numeroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
		} finally {
            dadosDeEntrada.close();
        }
	}
	
    static void contar(int numeroUm, int numeroDois ) throws ParametrosInvalidosException {
        if(numeroUm > numeroDois) {
            throw new ParametrosInvalidosException ("O segundo numero deve ser maior que o primeiro");
        }
		
    	int contagem = numeroDois - numeroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
