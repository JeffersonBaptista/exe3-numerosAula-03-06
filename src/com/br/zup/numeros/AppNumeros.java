package com.br.zup.numeros;

import java.util.Scanner;

public class AppNumeros {

	public static void main(String[] args) {
		int inicio = 0;
		int termino = 0;
		String modelo = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Vamos imprimir uma sequencia de numeros\n" + "Digite um numero para iniciarmos");
		inicio = scan.nextInt();

		System.out.println("Digite o numero final");
		termino = scan.nextInt();

		if (inicio < termino) {
			for (int i = inicio; i <= termino; i++) {
				if (i < termino) {
					modelo += i + ",";
				} else {
					modelo += i;
				}

			}
		} else {

			for (int i = inicio; i >= termino; i--) {
				if (i > termino) {
					modelo += i + ",";
				} else {
					modelo += i;
				}

			}

		}
		System.out.println(modelo);
		
		scan.close();
	}

}
