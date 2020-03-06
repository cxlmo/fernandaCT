import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		double din=0, valor=0;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite o valor do litro da gasolina:");
		 valor=entrada.nextDouble();
		 
		 System.out.println("Digite o valor para abastecer:");
		 din=entrada.nextDouble();
		 
		 System.out.println("Você possui:"+(din/valor)+" doláres");
		 entrada.close();
	}

}
