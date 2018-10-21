package org.julborre.expcalculator;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//String cadena = "33*2-100+(5/3-(2/4))";
		String cadena = "33*2";
		
		Main m = new Main();
		List<Token> tokens =  m.parsear(cadena);
		System.out.println("\n\n" + cadena + "\n" + tokens + "\n" + tokens.size());
		
		m.buildTree(tokens);
		
	}
	
	public List<Token> parsear(String cadena){
		List<Token> tokens =  new ArrayList<Token>();
		String subcadena = "";
		
		for(int i=0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			System.out.println(i + " -> " + c);
			
			//if(esOperator(c)) {
			if(Token.esOperator(c)) {
				Token t = new Token(subcadena);
				tokens.add(t);
				
				Token o = new Token(c);
				tokens.add(o);
				
				subcadena = "";
				
				
			//}else if(esParentesis(c)) {
			}else if(Token.esParentesis(c)) {
				//String cadena = "33*2-100+(5/3)";
				
				if(!subcadena.equals("")) {
					Token t = new Token(subcadena);
					tokens.add(t);
				}
				
				Token p = new Token(c);
				tokens.add(p);
				
				subcadena = "";
				
			}else {
				
				subcadena += c;
								
				if(i == cadena.length() -1) {					
					Token t = new Token(subcadena);
					tokens.add(t);
				}
				
			} 
			
		}
		
		
		
		return tokens;
	}
	
	
	public void buildTree(List<Token> tokens) {
		ParseTree tree = new ParseTree();
		
		for(Token t: tokens) {
			tree.addNodo(t);
			
		}
		
	}
	
	
}
