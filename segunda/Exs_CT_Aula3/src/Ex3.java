import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0, num4=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1� n�mero");
		num1=entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero");
		num2=entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero");
		num3=entrada.nextInt();
		
		System.out.println("Digite o 4� n�mero");
		num4=entrada.nextInt();
		
		System.out.println("O resultado da multiplica��o do 1� pelo 3� �:"+num1*num3);
		
		System.out.println("O resultado da soma do 2� pelo 4� �:"+(num2+num4));
		entrada.close();
	}

}
