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
	Image player, tex1, texK1, texD1, texT1;
	
	public void init() {
		applet = this;
		applet.setSize(wielkoscX, wielkoscY);
		timer.scheduleAtFixedRate(zad, 10, 10);
		bgImage = createImage(wielkoscX, wielkoscY);
		bgGrap = bgImage.getGraphics();
		
		zad.tworzenieMapy();
		
		player = getImage(getDocumentBase(), "img/player.png");
		tex1 = getImage(getDocumentBase(), "img/tex1.png");
		texK1 = getImage(getDocumentBase(), "img/texK1.png");
		texD1 = getImage(getDocumentBase(), "img/texD1.png");
		texT1 = getImage(getDocumentBase(), "img/texT1.png");
	}
	
	public void update(Graphics g) {
		bgGrap.clearRect(0, 0, wielkoscX, wielkoscY);
		paint(bgGrap);
		g.drawImage(bgImage, 0, 0, applet);
	}
	
	public void paint(Graphics g){
		g.drawString("Filip", zad.pozycjaNapisuX, zad.pozycjaNapisuY);
		rysujMapeGry(g);
	}
	
	public void rysujMapeGry(Graphics g) {
		for(int i = 0; i < zad.mapa1.length; i++) {
			for(int j = 0; j < zad.mapa1[0].length; j++) {
				switch(zad.mapa1[i][j]) {
					case 0:
						g.drawImage(texT1, 50 + 20 * j, 50 + 20 * i, this);
					break;
					case 1:
						g.drawImage(texT1, 50 + 20 * j, 50 + 20 * i, this);
						g.drawImage(texK1, 50 + 20 * j, 50 + 20 * i, this);
					break;
					case 2:
						g.drawImage(texT1, 50 + 20 * j, 50 + 20 * i, this);
						g.drawImage(tex1, 50 + 20 * j, 50 + 20 * i, this);
					break;
					case 3:
						g.drawImage(tex1, 50 + 20 * j, 50 + 20 * i, this);
						g.drawImage(texD1, 50 + 20 * j, 50 + 20 * i, this);
					break;
					case 4:
						g.drawImage(texT1, 50 + 20 * j, 50 + 20 * i, this);
						g.drawImage(player, 50 + 20 * j, 50 + 20 * i, this);
					break;
				}
			}
		}
	}
}
