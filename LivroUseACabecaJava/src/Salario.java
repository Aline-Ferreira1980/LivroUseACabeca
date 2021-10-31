import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		DecimalFormat df = new DecimalFormat("###0.00");
		String nome;
		double salaryFixo, vendasMes, salarioBonus;
		
		nome = sc.next();
		salaryFixo = sc.nextDouble();
		vendasMes = sc.nextDouble();
		
		
		
		salarioBonus = (vendasMes * 0.15) + salaryFixo;
		
		System.out.println("TOTAL = R$ " + df.format(salarioBonus));

		sc.close();
	}

}
