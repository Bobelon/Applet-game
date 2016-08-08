import java.util.TimerTask;

public class Obliczenia extends TimerTask{

	static int pozycjaNapisuX = 700;
	static int pozycjaNapisuY = 20;
	int kierunek = 1;
	int przebytaDrogaNapisu = 0;
	int mapa1[][] = new int [20][20];
	int pPostaciY = 2, pPostaciX = 2;
	int zyciePostaci = 100;
	String komunikatWKonsoli, komunikatSmierci;
	
	public void run() {
		if(zyciePostaci > 100) {
			zyciePostaci = 100;
		}
		else if (zyciePostaci <= 0) {
			smiercGracza(true, 0, false, 90, 10);
		}
		Start.applet.repaint();
	}
	
	public void tworzenieMapy() {
		int mapa12[][] = {
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{1,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1},
				{1,0,4,0,1,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1},
				{1,0,0,0,1,0,0,0,0,1,1,2,2,2,2,2,2,2,0,1},
				{1,0,0,0,1,0,0,0,0,0,1,2,2,2,2,2,2,2,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,2,3,2,2,2,2,2,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
		
		for(int i = 0; i < mapa1.length; i++) {
			for(int j = 0; j < mapa1[0].length; j++) {
				mapa1[i][j] = mapa12[i][j];
			}
		}
	}
	
	public void poruszaniePostacia(char klawisz) {
		switch(klawisz) {
			case 'w':
				if(mapa1[pPostaciY - 1][pPostaciX] == 0) {
					mapa1[pPostaciY - 1][pPostaciX] = 4;
					mapa1[pPostaciY][pPostaciX] = 0;
					pPostaciY--;
				}
			break;
			case 's':
				if(mapa1[pPostaciY + 1][pPostaciX] == 0) {
					mapa1[pPostaciY + 1][pPostaciX] = 4;
					mapa1[pPostaciY][pPostaciX] = 0;
					pPostaciY++;
				}
			break;
			case 'a':
				if(mapa1[pPostaciY][pPostaciX - 1] == 0) {
					mapa1[pPostaciY][pPostaciX - 1] = 4;
					mapa1[pPostaciY][pPostaciX] = 0;
					pPostaciX--;
				}
			break;
			case 'd':
				if(mapa1[pPostaciY][pPostaciX + 1] == 0) {
					mapa1[pPostaciY][pPostaciX + 1] = 4;
					mapa1[pPostaciY][pPostaciX] = 0;
					pPostaciX++;
				}
			break;
		}
	}
	
	public void smiercGracza(boolean resetMapy, int mapaOdrodzenia, boolean resetEQ,
			int iloscZyciaPoOdrodzeniu, int iloscMinusowychPunktow) {
		if(resetMapy == true) {
			tworzenieMapy();
			pPostaciX = 2;
			pPostaciY = 2;
		}
		else{}
		//if(resteEQ == true) {}else()
		//switch(mapaOdrodzenia){}
		
		//punkty = iloscMinusowychPunktow;
		
		komunikatWKonsoli = komunikatSmierci;		
		zyciePostaci = iloscZyciaPoOdrodzeniu;
	}
}
