package com.humanbooster.tedi.tapp;

import java.util.Scanner;

public class Clavier {
	private static Scanner in = new Scanner(System.in);

	// saisie clavier d'un nombre
	public double liredouble() {
		// Scanner sc = new Scanner(System.in);
		double nombre = in.nextDouble();
		return nombre;
	}

	// Saisie chaine de caracteres au clavier
	public String lirechaine() {
		// Scanner in = new Scanner(System.in);
		String chaine;
		chaine = in.next();
		return chaine;
	}

	// saisie clavier d'un nombre
	public int lirentier() {
		// Scanner sc = new Scanner(System.in);
		int nombre = in.nextInt();
		return nombre;
	}
}
