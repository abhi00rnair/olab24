package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ //done
	private String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */

	private final FictionType type;
	
	public String getname(){
		return name;
	}
	public FictionType getfFictionType(){
		return type;
	}
	public Fiction (String title,FictionType tp1) {
		super(title);
		this.type=tp1;
		// TODO  correct the above.
	}

}
