package com;

import java.util.Scanner;

public class TextoInvertido {

	public static void main(String[] args) {
		//Se utiliza Scan para obtener un input por parte del usuario
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter a word or sentence ");
		
		String normal = myScan.nextLine();
		myScan.close();
		//Se inicializa la variable String backward	
		String backward = "";
		//Ahora convertimos el string normal a un array de caracteres
		char[] charArray = normal.toCharArray();
		//Iteramos de forma inversa para inprimir la palabra al reves
		for (int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println(backward);
	}

}
/*Crear un programa en Java que realice lo siguiente:
eduardo
odraude
Debe solicitar al usuario por consola una palabra o frase.
Debe mostrar por consola el texto escrito al revés.
Entrada: 
Salida: 
Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub y adjuntar el link.
Sugerencias:
Puedes escribir tu código directamente en tu clase Main.
Para ayudarte puedes desarrollar un algoritmo y el pseudocódigo.
*/