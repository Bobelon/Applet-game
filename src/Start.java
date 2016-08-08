import java.applet.Applet;
import java.awt.Graphics;
import java.util.Timer;

public class Start extends Applet {

	static Applet applet;
	Obliczenia zad = new Obliczenia();
	Timer timer = new Timer();
	
	public void init() {
		applet = this;
		applet.setSize(800, 600);
		timer.scheduleAtFixedRate(zad, 10, 10);
	}
	
	public void paint(Graphics g){
		g.drawString("Filip", zad.pozycjaNapisuX, zad.pozycjaNapisuY);
	}
}
