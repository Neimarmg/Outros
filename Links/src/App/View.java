package App;

import java.util.Scanner;

/**
 * Classe respons�vel pela impress�o do programa 
 * @author Neimar, Aur�lio
 */
public class View {	
	static Scanner var = new Scanner(System.in);
	
	public static void msg(Object desc) {   
		System .out.print(desc);
	}
	
	
	public static void msge(Object desc) {   
		System .err.print(desc);
	}
	
	
	/**
	 * @param desc
	 */
	public static void msgb(Object desc) {
		System .out.print(
			  "\n==========================================================================\n"
			+ desc
			+ "\n==========================================================================\n");
	}
	
	
	public static void msgc(Object desc) {
		System .out.print(
			"\n==========================================================================\n"
			+ desc);
	}


	public static void msgr(Object desc) {
		System .out.print(
			desc
			+ "\n==========================================================================\n");
	}	
	

	public static void msgl() {
		System .out.print(
			"\n==========================================================================\n");
	}
	
	
	public static void espacoInsuficiente() {
		System .err.print("\nEspa�o insuficiente em disco para inserir dados.\n");
	}
	
	
	public static void opcaoInvalida() {
		System .err.println("\nComando inv�lido. Tente novamente.");
	}
	
	
	public static void objetoNaoImplementado() {
		System .err.print("\nN�o implementado.\n");
	}
	

	/**
	 * M�todo de label dos comandos do sistema
	 * @param label
	 */
	public static void paleta(String label) {
		System .out.println();
		if (label.equals("")) {
			System .out.print("COMANDO: ");
		} else {
			System .out.print(label + ": ");
		}
	}

	
	/**
	 * Valores "booleans"
	 * @param label
	 * @return
	 */
	public static int digitaNumero(String label) {
		paleta(label);
		return var.nextInt();		
	}
	
	
	/**
	 * M�todo de retorno que recebe a label com par�mento, e retorna
	 * uma string para filtros
	 * @param label
	 * @return
	 */
	public static String digita(String label) {
		paleta(label);
		return var.next().toLowerCase();
	}
	
	
	public static void sair() {
		System.err.print("\nVoc� optou por sair do jogo. Obrigado.");
	}
	
	
	/**
	 * M�todo de defin��o de status das atividades do programa
	 * @param status
	 * @return
	 */
	public static String statusAcao(int status, int sucesso) {
		String r, s;	
		
		if (sucesso == 7) { // Avalia��o de sucesso da atividade
			s = "com sucesso!";
		} else if(sucesso == -1) {
			s = "sem sucesso"; 
		} else {
			s = "...";
		}
		
		switch (status) { // Definidor de status da atividade
		
		case -1:r = "Pendente " + s; 
			break;
		case 0:	r = "N�o definido " + s; 
			break;
		case 1:	r = "Em planejamento " + s; 
			break;
		case 2:	r = "Em desenvolvimento " + s; 
			break;
		case 3:	r = "Em teste " + s; 
			break;
		case 4:	r = "Em revis�o " + s; 
			break;
		case 5:	r = "Conclu�do(a) parcialmente " + s; 
			break;
		case 6:	r = "Conclu�do(a) " + s; 
			break;
		case 7:	r = "Finalizado(a) " + s; 
			break;		
		default:
			r = "inv�lido "; break;
		}
		
		return r;
	}
}