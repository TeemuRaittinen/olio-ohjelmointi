
public class autoOlio {

public static void main(String[] args)
// mainin alku
{
// muodostetaan 1. olio
	Auto auto1 = new Auto();
	auto1.merkki = "BMW";
	auto1.malli = "525 SPORT";
	auto1.bensanMaara = 80;
// mudostetaan 2. olio käyttäen konstruktoria
	Auto auto2 = new Auto();
	
naytaTiedot(auto1);
Auto.kiihdyta(auto1);
naytaTiedot(auto1);
Auto.tankkaa(auto1,5);

}// mainin lopetus


	


// metodi joka tulostaa annetun koneen tiedot
public static void naytaTiedot(Auto auto1)
{
System.out.println(auto1.merkki);
System.out.println(auto1.malli);
System.out.println(auto1.bensanMaara);
}
 static class Auto 
// pesukone luokan aloitus
{
// ominaisuudet
	String merkki;
	String malli;
	static int bensanMaara;
	
//oletusmuodostin
	public Auto() 
	{
		merkki="";
	}
//parametrillinen muodostin
	public Auto(String autonMerkki, String autonMalli, int tankinTilanne)
	{
		merkki=autonMerkki;
		malli=autonMalli;
		tankinTilanne=bensanMaara;
	}
// toiminnallisuudet
	public void jarruta() 
	{
		System.out.println("Auto jarruttaa");
	}
	public static void kiihdyta(Auto auto1)
	{
		System.out.println("Auto kiihtyy");
		if(bensanMaara > 0)
		{
		bensanMaara = bensanMaara-1;
		}
		else
		{
		System.out.println("Bensa loppu.");
		}
	}
	public static void tankkaa(Auto auto1,int tankkaus)
	{
	System.out.println("Tankissa bensaa "+ bensanMaara);
	System.out.println("Tankkaus: " + tankkaus);
	bensanMaara = bensanMaara+tankkaus;
	System.out.println("Tankissa bensaa tankkauksen jälkeen:" + bensanMaara);
	

}}}
	
