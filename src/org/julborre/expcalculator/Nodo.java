package org.julborre.expcalculator;

public class Nodo{
	Nodo izquierdo;
	Nodo derecho;
	String raiz;
	
	public Nodo() {
		izquierdo = null;
		derecho = null;
		raiz = "";
	}
	
	public Nodo(String raiz) {
		izquierdo = null;
		derecho = null;
		this.raiz = "";
	}
		
	public void izquierdo(Nodo izq) {
		izquierdo = izq;
	}
	
	public void derecho(Nodo der) {
		derecho = der;
	}
	
	public void raiz(String ra) {
		raiz = ra;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\t\t" + this.raiz + "\t\t" + 
				"\t" + this.izquierdo + "\t\t\t\t" + this.derecho;
	}
	
	
}