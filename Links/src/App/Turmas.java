package App;

public class Turmas {
	static int tamanho = 10;
	public static String descTuma[] = new String[tamanho];
	
	public static int getTamanho() {
		return tamanho;
	}
	
	
	public static void setTamanho(int tamanho) {
		Turmas.tamanho = tamanho;
	}
	
	
	public static String[] getDescTuma() {
		return descTuma;
	}
	
	
	public static void print(){
		for (int i = 0; i < getDescTuma().length; i++) {
			if (descTuma[i] != null) {
				View.msg(descTuma[i] +"\n");
			}			
		}
	}
}
