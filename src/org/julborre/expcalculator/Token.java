package org.julborre.expcalculator;

public class Token{
	private String token;
	
	public Token(String t){
		this.token = t;
	}
	
	public Token(char c){
		this.token = String.valueOf(c);
	}
	
	public String token() {
		return this.token;
	}
	
	public static boolean isOperando(String c) {
		boolean esOperando = false;
		
		if(!esOperator(c) && !esParentesis(c)) {
			esOperando = true;
		}
		
		return esOperando;
	}
	
	public static boolean isOperando(char c) {
		boolean esOperando = false;
				
		if(!esOperator(c) && !esParentesis(c)) {
			esOperando = true;
		}
		
		return esOperando;
	}
	
	public static boolean esOperator(String c) {
		return c.length() == 1 && esOperator(c.charAt(0)); 
	}
	
	public static boolean esOperator(char c) {
		boolean operador = false;
		
		switch(c){
			case '+':
			case '-':
			case '*':
			case '/':
				operador = true;
				break;
		} 
		
		return operador;
	}
	
	public static boolean esParentesis(String c) {
		return c.length() == 1 && esParentesis(c.charAt(0));
	}
	
	public static boolean esParentesis(char c) {
		boolean parentesis = false;
		
		switch(c){
			case '(':
			case ')':			
				parentesis = true;
				break;
		} 
		
		return parentesis;
	}
			
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return token;
	}
}