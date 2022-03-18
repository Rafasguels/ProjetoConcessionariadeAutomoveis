package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Estoque;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Date data = new Date();//Buscando a data atual do sistema
		SimpleDateFormat formater = new SimpleDateFormat("HH");//Formantando a data em horas e minutos
		String horaAtual = formater.format(data);
		Double horAtualPc = Double.parseDouble(horaAtual); ///Transformando a String HoraAtual em Double.
				
		if (horAtualPc <= 9 || horAtualPc >= 18) {
				System.out.println("Concessionaria esta fechada no momento, faça a sua solicitação é em breve lhe retornaremos!");
		}
		else {
			System.out.print("Bem vindo a concessionaria Rafael Vieira");
		}
		
		System.out.println("Bem vindo a concessionaria Rafael Vieira!");
		System.out.print("Entre com o nome do Cliente: ");
		String nome = sc.nextLine();
		System.out.printf("Entre com o CPF do Cliente: ");
		double cpf = sc.nextDouble();
		
		//informaçãoes do CLiente.
		Cliente cliente = new Cliente(nome, cpf);
		
		System.out.print(cliente);

		
		
		sc.close();


	}

}
