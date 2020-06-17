import java.util.Stack;

public class StackCripto {

	public static void main(String[] args) {
//aqui eu usei a classe Scanner para entrar com a frase
		ImprimirCript("Esta frase esta criptografada com StackCripto");
	}

	public static void ImprimirCript(String frase) {
		System.out.println(Cripto(frase));
	}

	public static String Cripto(String palavra) {
		// Usei a classe do java Stack de pilha
		Stack<Character> azul = new Stack<Character>();
		Stack<Character> laranja = new Stack<Character>();
		Stack<Character> amarelo = new Stack<Character>();

		// aqui eu peguei cada caracter da (palavra) utilizando o charAt

		for (int i = 0; i < palavra.length(); i++) {
			// passei o (i) como posicao para empilhar cada caracter
			azul.push(palavra.charAt(i));
			// e somando o (i)+2 para pular 2 posicões
			i = i + 2;
		}

		System.out.println("azul:    " + azul);
		// aqui da mesma forma sendo que começando o i(i) com 1 pulando a primeira letra
		for (int i = 1; i < palavra.length(); i++) {
			laranja.push(palavra.charAt(i));
			i = i + 2;
		}

		System.out.println("laranja: " + laranja);
		// aqui da mesma forma sendo que começando o i(i) com 2 pulando a primeira e
		// segunda letra
		for (int i = 2; i < palavra.length(); i++) {
			amarelo.push(palavra.charAt(i));
			i = i + 2;
		}

		System.out.println("amarelo: " + amarelo);

		String fraseCripta = "";
		while (!azul.isEmpty()) {
			// exemplo como foi feito
			// Comecei a desempilhar Exp: p da pilha azul e coloquei na String
			// Depois a desempilhei a primeira palavra de laranja e coloquei na String
			// Da mesma forma com amarelo e assim sucessivamente até formar a frase inteira
			fraseCripta += azul.pop();
			fraseCripta += laranja.pop();
			fraseCripta += amarelo.pop();
		}

		return fraseCripta;
	}

}

