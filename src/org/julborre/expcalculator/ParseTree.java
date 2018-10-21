package org.julborre.expcalculator;

public class ParseTree {

	private Nodo raiz;
	
	
	public void addNodo(Token token) {
		
		String tk = token.token();
		
		if(raiz == null) {
			
			raiz = new Nodo();
			
			if(token.esOperator()) {
				raiz.raiz(tk);
			}else if(token.isOperando()) {
				Nodo izq = new Nodo();
				
				izq.raiz(tk);
				raiz.izquierdo(izq);
			} 
		}else {
			if(token.esOperator()) {
				
			}
		}
		
		
		
		
		
		
	}
}
