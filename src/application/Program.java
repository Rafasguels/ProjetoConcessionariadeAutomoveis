package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;
import entities.Estoque;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Estoque> estoque = new ArrayList<Estoque>();
		
		estoque.addAll(new Carro(GM, corsa, prata));
		
		
		Date data = new Date();//Buscando a data atual do sistema
		SimpleDateFormat formater = new SimpleDateFormat("HH");//Formantando a data em horas e minutos
		String horaAtual = formater.format(data);
		Double horAtualPc = Double.parseDouble(horaAtual); ///Transformando a String HoraAtual em Double.
				
		if (horAtualPc <= 8 || horAtualPc >= 18) {
				System.out.println("Concessionaria esta fechada no momento, faça a sua solicitação é em breve lhe retornaremos!");
		}
		else {
			System.out.println("Bem vindo a concessionaria Rafael Vieira");
		}
		
		
		System.out.print("Entre com o nome do Cliente: ");
		String nome = sc.nextLine();
		System.out.printf("Entre com o CPF do Cliente: ");
		double cpf = sc.nextDouble();
		
		//informaçoes do CLiente.
		Cliente cliente = new Cliente(nome, cpf);
		
		//escolha do cliente
		System.out.println("Escolha uma opção desejada");
		System.out.println("1 - Comprar carro do estoque"); //excluindo .
		System.out.println("2 - Vende veiculos para concessionaria"); //adicionado itens do arrayslist
		System.out.println("3 - verificar carros no estoque"); //verificando items no arraylist
		
		int input = sc.nextInt();
		
		switch (input) {
        case 1:
            System.out.println("");
            
            
            
            
            
            
            break;
        case 2:
            System.out.println("Python Current Version is 3.7");
            break;
        case 3:
            System.out.println("Rust Current Version is 1.34.1");
            break;
        }
		
		
		
		
		


		
		
		sc.close();


	}

}
