import java.util.TimerTask;

public class Obliczenia extends TimerTask{

	static int pozycjaNapisuX = 700;
	static int pozycjaNapisuY = 20;
	int kierunek = 1;
	int przebytaDrogaNapisu = 0;
	
	public void run() {
		switch(kierunek){
			case 1:
				pozycjaNapisuY++;
				przebytaDrogaNapisu++;
				if(przebytaDrogaNapisu == 200) {
					przebytaDrogaNapisu = 0;
					kierunek = 2;
				}
			break;
			case 2:
				pozycjaNapisuY--;
				przebytaDrogaNapisu++;
				if(przebytaDrogaNapisu == 200) {
					przebytaDrogaNapisu = 0;
					kierunek = 1;
				}
			break;
		}
		Start.applet.repaint();
	}
}
