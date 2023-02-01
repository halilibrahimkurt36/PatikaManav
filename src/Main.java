import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float pear,apple,tomato,eggPlant,banana;
		
		double pearPrice,applePrice,tomatoPrice,eggPlantPrice,bananaPrice,total;
		
		Scanner giris=new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? ");
		pear=giris.nextFloat();
		pearPrice=pear*2.14;
		
		System.out.print("Elma Kaç Kilo ? ");
		apple=giris.nextFloat();
		applePrice=apple*3.67;
		
		System.out.print("Domates Kaç Kilo ? ");
		tomato=giris.nextFloat();
		tomatoPrice=tomato*1.11;
		
		System.out.print("Patlıcan Kaç Kilo ? ");
		eggPlant=giris.nextFloat();
		eggPlantPrice=eggPlant*5;
		
		System.out.print("Muz Kaç Kilo ? ");
		banana=giris.nextFloat();
		bananaPrice=banana*0.95;
		
		
		total=bananaPrice+eggPlantPrice+tomatoPrice+applePrice+pearPrice;
		System.out.print("Toplam Tutar = "+total);
	}

}
