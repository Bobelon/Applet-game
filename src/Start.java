import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;

public class Start extends Applet {

	static Applet applet;
	int wielkoscX = 800, wielkoscY = 600;
	Obliczenia zad = new Obliczenia();
	Timer timer = new Timer();
	Image bgImage;
	Graphics bgGrap;
	Image testowy1;
	
	public void init() {
		applet = this;
		applet.setSize(wielkoscX, wielkoscY);
		timer.scheduleAtFixedRate(zad, 10, 10);
		bgImage = createImage(wielkoscX, wielkoscY);
		bgGrap = bgImage.getGraphics();
		
		zad.tworzenieMapy();
		
		testowy1 = getImage(getDocumentBase(), "img/cl.jpg");
	}
	
	public void update(Graphics g) {
		bgGrap.clearRect(0, 0, wielkoscX, wielkoscY);
		paint(bgGrap);
		g.drawImage(bgImage, 0, 0, applet);
	}
	
	public void paint(Graphics g){
		g.drawString("Filip", zad.pozycjaNapisuX, zad.pozycjaNapisuY);
		g.drawImage(testowy1, 50, 200, 180, 200, applet);
	}
}
