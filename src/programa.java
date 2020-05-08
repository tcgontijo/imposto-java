import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, servicos, capital, medicos, educacao, impSalario, impServicos, impCapital;
		
		
		//Leitura dos dados
		System.out.print("Renda anual com sal�rio: ");
		salario = sc.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		servicos = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.print("Gastos m�dicos: ");
		medicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		educacao = sc.nextDouble();
		
		//Consolidado da renda
		
		if((salario / 12) < 3000.00) {
			impSalario = 0;
		} 
		else if((salario / 12) >= 3000.00 && (salario / 12) < 5000.00 ) {
			impSalario = salario * 0.1;
		} else {
			impSalario = salario * 0.2;
		}
		
		impServicos = servicos * 0.15;
		impCapital = capital * 0.20;
		
		System.out.println();
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("Imposto sobre sal�rio: " + impSalario);
		System.out.println("Imposto sobre servi�os: " + impServicos);
		System.out.println("Imposto sobre ganho de capital: " + impCapital);
		
		sc.close();
	}

}
