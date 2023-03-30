import java.util.Scanner;

public class exercicio_salario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M;
		double H;
		double V;
		double salario;
		
			System.out.println("Digite o numero da sua matrícula:"); 
			M = sc.nextInt();
			System.out.println("Digite quantas horas você trabalhou:");
			H = sc.nextDouble();
			System.out.println("Digite o valor da sua hora trabalhada:");
			V = sc.nextDouble();
			
		salario = H * V;
		
			System.out.println("Matrícula: " + M);
			System.out.println("Salario: " + salario);
		

		
		sc.close();
	}

}
