package umlPhase1;


public class Books extends LibraryResource {

	/**
	 * @uml.property  name="bookTitle"
	 */
	private String bookTitle;

	/**
	 * Getter of the property <tt>bookTitle</tt>
	 * @return  Returns the bookTitle.
	 * @uml.property  name="bookTitle"
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * Setter of the property <tt>bookTitle</tt>
	 * @param bookTitle  The bookTitle to set.
	 * @uml.property  name="bookTitle"
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/**
	 * @uml.property  name="bookID"
	 */
	private String bookID;

	/**
	 * Getter of the property <tt>bookID</tt>
	 * @return  Returns the bookID.
	 * @uml.property  name="bookID"
	 */
	public String getBookID() {
		return bookID;
	}

	/**
	 * Setter of the property <tt>bookID</tt>
	 * @param bookID  The bookID to set.
	 * @uml.property  name="bookID"
	 */
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	/** 
	 * @uml.property name="availablity"
	 */
	private boolean availablity;

	/** 
	 * @uml.property name="isbn"
	 */
	private int isbn;

	/** 
	 * Getter of the property <tt>isbn</tt>
	 * @return  Returns the isbn.
	 * @uml.property  name="isbn"
	 */
	public int getIsbn() {
		return isbn;
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

				/** 
				 * Setter of the property <tt>isbn</tt>
				 * @param isbn  The isbn to set.
				 * @uml.property  name="isbn"
				 */
				public void setIsbn(int isbn) {
					this.isbn = isbn;
				}

}
