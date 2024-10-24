package newshelf;

//import oldshelf.Book;
import oldshelf.FictionType;
//import oldshelf.Comic;
//import oldshelf.Fiction;
//import oldshelf.TextBook;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		if(!(o instanceof IBook)){
			return "";
		}if (o instanceof comic1  c1) {
			return c1.title();
		}if(o instanceof Fiction1 f1){
			return f1.name();
		}
		if(o instanceof textbook1){
			return ((textbook1)o).subject();
		}
		return "";
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		//TextBook t = new TextBook("physics");
		textbook1 t=new textbook1("gdsc");
		Fiction1 f1=new Fiction1("fic1", FictionType.Comedy);
		comic1 c1=new comic1("comeddd", 020);
		String res1=getAgeOrTitle(f1);
		String res2=getAgeOrTitle(c1);
		String result=getAgeOrTitle(t);
		System.out.println(result);
		System.out.println(res1);
		System.out.println(res2);
}
}
