package lab1;
import java.util.Scanner;

abstract class Resource implements Identifier, Comparable<Resource>{
	String nameOfBook;
	String author;
	String publisher;
	double priceInUSD;

		public double calculatePriceInTRY() {
		return (priceInUSD*7.9);

	}
		abstract void displayInfo();
		
		public int compareTo(Resource x) {
			if(author.equals(x.author))
				return 0;
			else if(author.compareTo(x.author)>0)
				return 1;
			else
				return -1;
		}
		

}
