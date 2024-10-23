package newshelf;

import oldshelf.Book;
import oldshelf.Comic;
import oldshelf.Fiction;
import oldshelf.TextBook;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		if(!(o instanceof Book)){
			return "";
		}if(o instanceof Comic){
			return ((Comic)o).gettitle();
		}if (o instanceof Fiction) {
			return ((Fiction)o).getname();
		}else {
			return ((TextBook)o).getsubject();
		}
		
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("physics");
		String result=getAgeOrTitle(t);
		System.out.println(result);
	}
}
