import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		double c=0;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite a tempratura en ºC:");
		 c=entrada.nextDouble();
		 
		 System.out.println("A Temperatura em ºF é: ºF"+((1.8*c)+32));
		 

		 entrada.close();
	}

}
