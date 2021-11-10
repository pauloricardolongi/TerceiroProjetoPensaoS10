package aplicacao;

import java.text.ParseException;
import java.util.Scanner;

import entidades.Renda;
/* A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.
How many rooms will be rented? 3
Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5
Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1
Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8
Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail*/

public class Programa {

	public static void main(String[] args)throws ParseException {
		Scanner sc = new Scanner(System.in);
		Renda[] vect = new Renda[10];
		System.out.print("Informe o n�meros dos quartos ocupados? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
		System.out.println();
		System.out.println("Renda #" + i + ":");
		System.out.print("Nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Quarto: ");
		int room = sc.nextInt();
		vect[room] = new Renda(name, email);
		}
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for (int i=0; i<10; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
		}
		}
		sc.close();
		

	}

}
