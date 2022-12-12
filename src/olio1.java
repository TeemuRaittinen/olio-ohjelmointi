
public class olio1 {

	public static void main(String[] args)
	// mainin alku
	{
	// muodostetaan 1. olio
		Pesukone kone1 = new Pesukone();
		kone1.merkki = "Samsung";
		kone1.malli = "SuperWASH";
		kone1.tilavuus = 6;
		kone1.paino = 35;

	// muodostetaan 2. olio
		Pesukone kone2 = new Pesukone();
		kone2.merkki = "Miele";
		kone2.malli = "UltraWash";
		kone2.tilavuus = 7;
		kone2.paino = 35;
		
	korjaaMerkki(kone1, "OBH");
	tulostaTiedot(kone1);

	
	}
	// metodi joka tulostaa annetun koneen tiedot
	public static void tulostaTiedot(Pesukone kone1)
	{
		System.out.println(kone1.merkki);
		System.out.println(kone1.malli);
		System.out.println(kone1.tilavuus);
		System.out.println(kone1.paino);
	// metodi jolla voidaan vaihtaa koneen merkkiä
	}
	public static void korjaaMerkki(Pesukone kone1, String uusiMerkki) 
	{
	kone1.merkki = uusiMerkki; 
	}// mainin lopetus

	static class Pesukone 
	// pesukone luokan aloitus
	{
	// ominaisuudet
		String merkki;
		String malli;
		double tilavuus;
		double paino;
		
	// default muodostin
		public Pesukone()
		{
			merkki="";
		}
	// parametrillinen muodostin
		public Pesukone(String merkkiNimi)
		{
			merkki = merkkiNimi;
		}
	// toiminnallisuudet
		public void linkoaPyykit() 
		{
			System.out.println("Linkousohjelma käynnistetty!");
		}
		public void huuhtelePyykit()
		{
			System.out.println("Huuhtelu aloitettu!");
		}
		public void kaynnisty() 
		{
			System.out.println("Pesukone käynnistyy...");
		}
		public void sammu()
		{
			System.out.println("Pesukone sammuu...");
		}
		public void halyyta()
		{
			System.out.println("PIIP PIIP, Pesuohjelma on valmis!");
		}
		public void wifi()
		{
			System.out.println("Haetaan langatonta yhteyttä...");
			
		}
	}}
		