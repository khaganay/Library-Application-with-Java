package lab1;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Book extends Resource {
	
	String ISBN;
	static int bookID=1;

	public Book() {
		//Scanner myScanner=new Scanner(System.in);
		//System.out.printf("%s","Please enter the name of the Book\n");
		nameOfBook = JOptionPane.showInputDialog(null, "Please enter the name of the Book\n" , JOptionPane.QUESTION_MESSAGE);
		author = JOptionPane.showInputDialog(null, "Please enter the author\n" , JOptionPane.QUESTION_MESSAGE);
		publisher = JOptionPane.showInputDialog(null, "Please enter the publisher\n" , JOptionPane.QUESTION_MESSAGE);
		//nameOfBook=myScanner.nextLine();
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
		catch (Exception exception) 
		{
		//System.err.printf("Wrong input!\n");
		//myScanner.nextLine();
		JOptionPane.showMessageDialog(null, "Wrong input!\n","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		}
		bookID++;
	}
	public void displayInfo() {
		//System.out.println();
		//System.out.printf("The name of the book is:%s\n",nameOfBook);
		//System.out.printf("The author of the book is %s\n",author);
		//System.out.printf("The publisher is:%s\n",publisher);
		if (ISBN != null) {
			JOptionPane.showMessageDialog(null,"The name of the book is:"+nameOfBook+"\n"
					+ "The author of the book is:"+author+"\n"
					+ "The publisher is:"+publisher+"\n"
					+ "The book price is "+priceInUSD+" USD"+"\n"
					+ "The book price is "+calculatePriceInTRY()+" TRY"+"\n"
					+ "The ISBN is:"+ISBN+"\n"
					);
			
			//System.out.printf("The ISBN is:%s\n",ISBN);
		}
		else
			JOptionPane.showMessageDialog(null,"The name of the book is:"+nameOfBook+"\n"
					+ "The author of the book is:"+author+"\n"
					+ "The publisher is:"+publisher+"\n"
					+ "The book price is "+priceInUSD+" USD"+"\n"
					+ "The book price is "+calculatePriceInTRY()+" TRY"+"\n"
					);
			
		//System.out.printf("The book price is %s USD\n",priceInUSD);
		//System.out.printf("The book price is %s TRY\n",calculatePriceInTRY());

	}
	
	public double calculatePriceInTRY() {
		double calc = super.calculatePriceInTRY() * (1 + 0.18 + 0.4);
		return calc;
	}
	public Book(String ISBN) {
		this.ISBN = ISBN;
		//Scanner myScanner=new Scanner(System.in);
		//System.out.printf("%s","Please enter the name of the Book\n");
		//nameOfBook=myScanner.nextLine();
		nameOfBook = JOptionPane.showInputDialog(null, "Please enter the name of the Book\n" , JOptionPane.QUESTION_MESSAGE);
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
			catch (Exception exception1) 
			{
			//System.err.printf("Wrong input!\n");
			//myScanner.nextLine();
			JOptionPane.showMessageDialog(null, "Wrong input!\n","ERROR",JOptionPane.ERROR_MESSAGE);
			}
			}
		bookID++;
		
	}
public void displayIdentifier() {
	if(ISBN != null) 
		//System.out.println("The book "+nameOfBook+" has ISBN:"+ISBN);	
		JOptionPane.showMessageDialog(null,"The book "+nameOfBook+" has ISBN:"+ISBN);
	else
		//System.out.println("The book "+nameOfBook+" has no ISBN");
		JOptionPane.showMessageDialog(null,"The book "+nameOfBook+" has no ISBN");
	
	}
	
	
}
	