package App;

public class App {

	public void run() throws Exception {
		View.msgb("\n			CRIADOR DE LINKS\n");
		Criador c = new Criador();
		c.iniciaProcesso();
	}
	public static void main(String[] args)throws Exception {
		new App().run();   
	}
}
