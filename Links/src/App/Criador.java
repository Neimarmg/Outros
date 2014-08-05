package App;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Criador {
	static int index = 0; 
	
	public static String dataSerial() {		
		Calendar data = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("ddmmyyyy");
		data.set(Calendar.DST_OFFSET,0);		
		return sdf.format(data.getTime());
	}
	
	
	private static void processaLink(){
						
		for (int i = 0; i < Turmas.getDescTuma().length; i++) {
			for (int j = 0; j < Partes.qtPartes; j++) {
				Partes.setParte(j);
				if ((Turmas.descTuma[i] != null)) {
					Links.descLink[index++] = Turmas.descTuma[i] +"_" +dataSerial()+"_"	+Turnos.getTurno()+"_" +Partes.getParte();
				}else{
					Links.descLink[index++] = "";
				}
			}
		}
		Links.imprime();
	}
	
	
	private static void leDados(String novo){
		if (novo.equals("s")) {		
			Turmas.descTuma[index++] = View.digita("Nome da turma");
			leDados(View.digita("Nova"));	
		}else{
			Partes.setQtPartes((View.digitaNumero("Qt partes")));
			Turnos.setTurno(View.digita("Turno"));;
		}
		index = 0;
	}
	
	
	public void iniciaProcesso(){
		leDados(View.digita("Criar turma"));
		View.msgl();
		processaLink();
	}
}
