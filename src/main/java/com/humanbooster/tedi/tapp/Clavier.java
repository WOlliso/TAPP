package com.humanbooster.tedi.tapp;

import java.util.Scanner;

public class Clavier {
	// saisie clavier d'un nombre
	public double liredouble() {
		Scanner sc = new Scanner(System.in);
		double nombre = sc.nextDouble();
		return nombre;
	}

	// Saisie chaine de caracteres au clavier
	public String lirechaine() {
		Scanner in = new Scanner(System.in);
		String chaine;
		chaine = in.nextLine();
		return chaine;
	}

	// saisie clavier d'un nombre
	public int lirentier() {
		Scanner sc = new Scanner(System.in);
		int nombre = sc.nextInt();
		return nombre;
	}
}
