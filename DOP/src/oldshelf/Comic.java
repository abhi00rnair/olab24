package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/ //done
	public String Title;

	// TODO: Warning to be removed.  //done
	private final int ageOfMainCharacter=100;

	// TODO Correct the error //done
	public Comic(String title) {
		super(title);
	}
	
	// TODO : create a getter if required. // done
	public String gettitle(){
		return Title;
	}
	int getageofmain(){
		return ageOfMainCharacter;
	}
	
	// TODO: Create a setter if required //done
	public void settitle(String title1){
		this.Title=title1;
	}

	// TODO: write a toString method  //done
	@Override
	public String toString() {
		return Title + ageOfMainCharacter;
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title   //done
		int result=5;
		result=5*result+(Title==null?0:Title.hashCode());
		result=5*result+ageOfMainCharacter;

		return result;
	}
	
	// TODO: Bonus:  //done
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
		if(this==o){
			return true;
		}if(!(o instanceof Comic)){
			return false;
		}else{
			return false;
		}
	}
}
