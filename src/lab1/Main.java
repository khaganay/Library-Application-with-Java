package lab1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/*enum MenuItems {
	item1("(1) Insert a new book"),item2("(2) Insert a new book with ISBN"),item3("(3) Insert a new online article"),item4("(4) Display all resources"),item5("(5) Display book and online article count"),item6("(6) Print identifiers"),item7("(0) Exit");
	private String s;
	
	MenuItems(String c){
		s = c;
	}
	String getString() {
		return s;
	}
}*/


public class Main {


public static void main(String[] args) {
	
	ArrayList<Resource> resourceArray = new ArrayList<Resource>();
	
		int resourceCount=0;
		int bookCount=0;
		int articleCount=0;
		int M=1;

		Scanner myScanner = new Scanner(System.in);
		
		while (M == 1) {
			//for(MenuItems a : MenuItems.values())
				//System.out.println(a.getString());
			String xmenu = JOptionPane.showInputDialog(null, "(1) Insert new book\n"
					+ "(2) Insert a new book with ISBN\n"
					+ "(3) Insert a new online article\n"
					+ "(4) Display all resources\n"
					+ "(5) Display book and online article count\n"
					+ "(6) Print identifiers\n"
					+ "(0) Exit" , "Main Menu" ,JOptionPane.QUESTION_MESSAGE);

			int x = Integer.parseInt(xmenu);
			System.out.println();

			if(x == 1) {
				resourceArray.add(new Book());
				resourceCount++;
				bookCount++;
			}
			if(x == 2) {
				//System.out.printf("%s","Please enter the ISBN\n");
				//String ISBN=myScanner.nextLine();
				String ISBN = JOptionPane.showInputDialog(null, "Please enter the ISBN\n", "ISBN Menu" , JOptionPane.QUESTION_MESSAGE);
				resourceArray.add(new Book(ISBN));
				resourceCount++;
				bookCount++;
			}
			if(x == 3) {
				//System.out.printf("%s","Please enter the DOI\n");
				//String DOI=myScanner.nextLine();
				String DOI = JOptionPane.showInputDialog(null, "Please enter the DOI\n", "DOI Menu" , JOptionPane.QUESTION_MESSAGE);
				resourceArray.add(new OnlineArticle(DOI));
				resourceCount++;
				articleCount++;
				
			}

		    else if(x == 4) {
		    	Collections.sort(resourceArray);
		    	int i=0;
		    	for(i=0;resourceCount>i;i++) {
		    		resourceArray.get(i).displayInfo();}
		    	
		    	
		    
		    }
		    else if(x == 5) {
		    	//System.out.printf("There book are %s book(s) and %s article(s) in the library\n",bookCount,articleCount);
		    	JOptionPane.showMessageDialog(null,"There book are "+bookCount+" book(s) and "+articleCount+" article(s) in the library\n");
		    }
		    else if(x == 6) {
		    for(int i=0;resourceCount>i;i++) {
		    	resourceArray.get(i).displayIdentifier();
		    }
		    }
		    else if(x == 0) {
		        break;
		    }


		}   

	}

	}

