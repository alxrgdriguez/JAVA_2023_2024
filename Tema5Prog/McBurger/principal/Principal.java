package Tema5Prog.McBurger.principal;

import Tema5Prog.McBurger.dominio.*;

public class Principal {

	public static void main(String[] args) {

		// ***************************************************************
		// Crear ingredientes
		// ***************************************************************

		Hamburguesa h1 = new Hamburguesa("26/04/2022");
		Hamburguesa h2 = new Hamburguesa("27/04/2022");
		Hamburguesa h3 = new Hamburguesa("07/05/2022");

		Patata p1 = new Patata();
		Patata p2 = new Patata();
		Patata p3 = new Patata();
		Patata p4 = new Patata();

		Agua a1 = new Agua();
		Agua a2 = new Agua();
		Agua a3 = new Agua();

		Cola c1 = new Cola();
		Cola c2 = new Cola();
		Cola c3 = new Cola();

		// ***************************************************************
		// Menú 1
		// ***************************************************************

		Menu m1 = new Menu();

		// Cocinar ingredientes
		a1.meterEnNevera();
		c1.meterEnNevera();
		h1.cocinar();
		p1.freir();
		a1.sacarDeNevera();

		// add ingredientes
		m1.addBebida(a1);
		m1.addBebida(c1);

		m1.addComida(h1);
		m1.addComida(p1);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m1);

		// ***************************************************************
		// Menú 2
		// ***************************************************************

		Menu m2 = new Menu();

		// Cocinar ingredientes
		a2.meterEnNevera();
		c2.meterEnNevera();
		h2.cocinar();
		p2.asar();

		// add ingredientes
		m2.addBebida(a2);
		m2.addBebida(c2);

		m2.addComida(h2);
		m2.addComida(p2);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m2);

		// ***************************************************************
		// Menú 3
		// ***************************************************************

		Menu m3 = new Menu();

		// Cocinar ingredientes
		p3.cocer();
		a3.sacarDeNevera();
		c3.meterEnNevera();

		// add ingredientes
		m3.addBebida(a3);
		m3.addBebida(c3);

		m3.addComida(h3);
		m3.addComida(p3);
		m3.addComida(p4);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m3);

		// ***************************************************************
		// Menú 4
		// ***************************************************************

		Menu m4 = new Menu();

		// Cocinar ingredientes
		p3.cocer();
		a3.sacarDeNevera();
		c3.meterEnNevera();
		p4.freir();
		h3.cocinar();

		// add ingredientes
		m4.addBebida(a2);
		m4.addBebida(a3);
		m4.addBebida(c3);

		m4.addComida(h3);
		m4.addComida(p3);
		m4.addComida(p4);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m4);

		// ***************************************************************
		// Menú 5
		// ***************************************************************

		Menu m5 = new Menu();

		// add ingredientes

		m5.addComida(h3);
		m5.addComida(p3);
		m5.addComida(p4);

		// Obtener precio del menú e imprimir ticket
		imprimirTicket(m5);

		// Imprimir total menús
		System.out.println("****************************");
		System.out.println("Total menús: " + Menu.numeroMenus);
		System.out.println("****************************");
	}

	private static void imprimirTicket(Menu m) {

		double precioMenu = 0.0;

		System.out.println("****************************");
		System.out.printf("** Menú (%2d ingredientes) **\n", m.getNumeroIngredientes());
		System.out.println("****************************");

		precioMenu = m.obtenerPrecioMenu();

		// Imprimir ingredientes menú
		m.imprimirMenu();

		// Imprimir precio total
		System.out.printf("\nPrecio Total.......... %3.2f€\n", precioMenu);

		System.out.println("");
	}

}