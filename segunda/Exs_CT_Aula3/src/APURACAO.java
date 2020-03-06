import java.util.Scanner;

public class APURACAO {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int CandidatoA;
		int CandidatoB;
		int CandidatoC;
		int Branco;
		int Nulo;
		int total = 0 ;
		System.out.println("Quantos votos teve o candidato A: ");
		CandidatoA = entrada.nextInt();
		System.out.println("Quantos votos teve o candidato B: ");
		CandidatoB = entrada.nextInt();
		System.out.println("Quantos votos teve o candidato C: ");
		CandidatoC = entrada.nextInt();
		System.out.println("Quantos votos teve branco: ");
		Branco = entrada.nextInt();
		System.out.println("Quantos votos teve nulo: ");
		Nulo = entrada.nextInt();
		total=(CandidatoA + CandidatoB + CandidatoC + Branco + Nulo);
		
		System.out.println("Quantidade de votos de cada candidato");
		System.out.println("CandidatoA "+ CandidatoA);
		System.out.println("CandidatoB "+ CandidatoB);
		System.out.println("CandidatoC "+ CandidatoC);
		System.out.println("Branco "+ Branco);
		System.out.println("Nulo "+ Nulo);
		
		System.out.println("Número total de eleitores: "+total);

		System.out.println("PERCENTUAL DE VOTOS");
		System.out.println("CandidatoA "+ CandidatoA*total/100+"%");
		System.out.println("CandidatoB "+ CandidatoB*total/100+"%");
		System.out.println("CandidatoC "+ CandidatoC*total/100+"%");
		System.out.println("Branco "+ Branco*total/100+"%");
		System.out.println("Nulo "+ Nulo*total/100+"%");
		
		
		
		
		entrada.close();
	}

}
