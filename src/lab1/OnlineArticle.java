package lab1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OnlineArticle extends Resource {

	String DOI;
	
	public double calculatePriceInTRY() {
		double calc = super.calculatePriceInTRY() * (1 + 0.18);
		return calc;
	}

	public OnlineArticle(String DOI) {
		this.DOI = DOI;
		//Scanner myScanner=new Scanner(System.in);
		//System.out.printf("%s","Please enter the name of the Article\n");
		//nameOfBook=myScanner.nextLine();
		nameOfBook = JOptionPane.showInputDialog(null, "Please enter the name of the Article\n" , JOptionPane.QUESTION_MESSAGE);
		author = JOptionPane.showInputDialog(null, "Please enter the author\n" , JOptionPane.QUESTION_MESSAGE);
		publisher = JOptionPane.showInputDialog(null, "Please enter the publisher\n" , JOptionPane.QUESTION_MESSAGE);
		//System.out.printf("%s","Please enter the author\n");
		//author=myScanner.nextLine();
		//System.out.printf("%s","Please enter the publisher\n");
		//publisher=myScanner.nextLine();
		while(true){
			try
			{
			//System.out.printf("%s","Please enter the price in US dollars\n");
			//priceInUSD=myScanner.nextDouble();
			String temp = JOptionPane.showInputDialog(null, "Please enter the price in US dollars\n" , JOptionPane.QUESTION_MESSAGE);
			priceInUSD = Double.parseDouble(temp);
			break;
			}
			catch (Exception exception2) 
			{
			//System.err.printf("Wrong input!\n");
			//myScanner.nextLine();
			JOptionPane.showMessageDialog(null, "Wrong input!\n","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			}
	
	}
	public void displayInfo() {
		//System.out.println();
		//System.out.printf("The name of the article is:%s\n",nameOfBook);
		//System.out.printf("The author of the article is %s\n",author);
		//System.out.printf("The publisher is:%s\n",publisher);
		if (DOI != null) {
			JOptionPane.showMessageDialog(null,"The name of the article is:"+nameOfBook+"\n"
					+ "The author of the article is:"+author+"\n"
					+ "The publisher is:"+publisher+"\n"
					+ "The article price is "+priceInUSD+" USD"+"\n"
					+ "The article price is "+calculatePriceInTRY()+" TRY"+"\n"
					+ "The DOI is:"+DOI+"\n"
					);
			//System.out.printf("The DOI is:%s\n",DOI);
			}
		else
			JOptionPane.showMessageDialog(null,"The name of the article is:"+nameOfBook+"\n"
					+ "The author of the article is:"+author+"\n"
					+ "The publisher is:"+publisher+"\n"
					+ "The article price is "+priceInUSD+" USD"+"\n"
					+ "The article price is "+calculatePriceInTRY()+" TRY"+"\n"
					);
			
		//System.out.printf("The article price is %s USD\n",priceInUSD);
		//System.out.printf("The article price is %s TRY\n",calculatePriceInTRY());

	}
	public void displayIdentifier() {
		//System.out.println("Online article "+nameOfBook+" has DOI "+DOI);
		JOptionPane.showMessageDialog(null,"Online article "+nameOfBook+" has DOI:"+DOI);
	}
}