package umlPhase1;


public class Journals extends LibraryResource {

	/**
	 * @uml.property  name="journalTitle"
	 */
	private String journalTitle;

	/**
	 * Getter of the property <tt>journalTitle</tt>
	 * @return  Returns the journalTitle.
	 * @uml.property  name="journalTitle"
	 */
	public String getJournalTitle() {
		return journalTitle;
	}

	/**
	 * Setter of the property <tt>journalTitle</tt>
	 * @param journalTitle  The journalTitle to set.
	 * @uml.property  name="journalTitle"
	 */
	public void setJournalTitle(String journalTitle) {
		this.journalTitle = journalTitle;
	}

	/**
	 * @uml.property  name="areaOfInterest"
	 */
	private String areaOfInterest;

	/**
	 * Getter of the property <tt>areaOfInterest</tt>
	 * @return  Returns the areaOfInterest.
	 * @uml.property  name="areaOfInterest"
	 */
	public String getAreaOfInterest() {
		return areaOfInterest;
	}

	/**
	 * Setter of the property <tt>areaOfInterest</tt>
	 * @param areaOfInterest  The areaOfInterest to set.
	 * @uml.property  name="areaOfInterest"
	 */
	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}

	/** 
	 * @uml.property name="availablity"
	 */
	private boolean availablity;

	/**
	 * @uml.property  name="author"
	 */
	private String author;

	/**
	 * Getter of the property <tt>author</tt>
	 * @return  Returns the author.
	 * @uml.property  name="author"
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Setter of the property <tt>author</tt>
	 * @param author  The author to set.
	 * @uml.property  name="author"
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

		
			
			
			public boolean displayStatus(){
				return false;	
			}

			
			/**
			 */
			public void displayLocationDetails(){
			}

				
				/**
				 */
				public void sendLocationDetails(){
				}

				/** 
				 * Getter of the property <tt>availablity</tt>
				 * @return  Returns the availablity.
				 * @uml.property  name="availablity"
				 */
				public boolean isAvailablity() {
					return availablity;
				}

				/** 
				 * Setter of the property <tt>availablity</tt>
				 * @param availablity  The availablity to set.
				 * @uml.property  name="availablity"
				 */
				public void setAvailablity(boolean availablity) {
					this.availablity = availablity;
				}

}
