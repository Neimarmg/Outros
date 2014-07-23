package App;

public class Links {
	private static int tam = Turmas.getTamanho()*Partes.getQtPartes();
	public static String descLink[] = new String[tam];
	
	
	public static String[] getDescLink() {
		return descLink;
	}
	

	public static void imprime(){
		for (int i = 0; i < tam; i++) {
			View.msg(descLink[i] +"\n");			
		}
	}
}
