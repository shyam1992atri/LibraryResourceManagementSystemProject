package umlPhase1;


public class RemainderNotification {

	/**
	 * @uml.property  name="dueDate"
	 */
	private String dueDate;

	/**
	 * Getter of the property <tt>dueDate</tt>
	 * @return  Returns the dueDate.
	 * @uml.property  name="dueDate"
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * Setter of the property <tt>dueDate</tt>
	 * @param dueDate  The dueDate to set.
	 * @uml.property  name="dueDate"
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @uml.property  name="memberName"
	 */
	private String memberName;

	/**
	 * Getter of the property <tt>memberName</tt>
	 * @return  Returns the memberName.
	 * @uml.property  name="memberName"
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * Setter of the property <tt>memberName</tt>
	 * @param memberName  The memberName to set.
	 * @uml.property  name="memberName"
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @uml.property  name="memberID"
	 */
	private String memberID;

	/**
	 * Getter of the property <tt>memberID</tt>
	 * @return  Returns the memberID.
	 * @uml.property  name="memberID"
	 */
	public String getMemberID() {
		return memberID;
	}

	/**
	 * Setter of the property <tt>memberID</tt>
	 * @param memberID  The memberID to set.
	 * @uml.property  name="memberID"
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	/** 
	 * @uml.property name="memberPhone"
	 */
	private int memberPhone;

	/** 
	 * Getter of the property <tt>memberPhone</tt>
	 * @return  Returns the memberPhone.
	 * @uml.property  name="memberPhone"
	 */
	public int getMemberPhone() {
		return memberPhone;
	}

	/**
	 * @uml.property  name="memberEmail"
	 */
	private String memberEmail;

	/**
	 * Getter of the property <tt>memberEmail</tt>
	 * @return  Returns the memberEmail.
	 * @uml.property  name="memberEmail"
	 */
	public String getMemberEmail() {
		return memberEmail;
	}

	/**
	 * Setter of the property <tt>memberEmail</tt>
	 * @param memberEmail  The memberEmail to set.
	 * @uml.property  name="memberEmail"
	 */
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

		
		/**
		 */
		public void sendTextNotification(){
		}

			
			/**
			 */
			public void sendEmailNotification(){
			}

			/** 
			 * @uml.property name="database"
			 * @uml.associationEnd inverse="remainderNotification:umlPhase1.Database"
			 * @uml.association name="sends"
			 */
			private Database database;

			/** 
			 * Getter of the property <tt>database</tt>
			 * @return  Returns the database.
			 * @uml.property  name="database"
			 */
			public Database getDatabase() {
				return database;
			}

			/** 
			 * Setter of the property <tt>database</tt>
			 * @param database  The database to set.
			 * @uml.property  name="database"
			 */
			public void setDatabase(Database database) {
				this.database = database;
			}

			/** 
			 * Setter of the property <tt>memberPhone</tt>
			 * @param memberPhone  The memberPhone to set.
			 * @uml.property  name="memberPhone"
			 */
			public void setMemberPhone(int memberPhone) {
				this.memberPhone = memberPhone;
			}

			/**
			 * @uml.property  name="dataCentre"
			 * @uml.associationEnd  inverse="remainderNotification:umlPhase1.DataCentre"
			 * @uml.association  name="sends"
			 */
			private DataCentre dataCentre;

			/**
			 * Getter of the property <tt>dataCentre</tt>
			 * @return  Returns the dataCentre.
			 * @uml.property  name="dataCentre"
			 */
			public DataCentre getDataCentre() {
				return dataCentre;
			}

			/**
			 * Setter of the property <tt>dataCentre</tt>
			 * @param dataCentre  The dataCentre to set.
			 * @uml.property  name="dataCentre"
			 */
			public void setDataCentre(DataCentre dataCentre) {
				this.dataCentre = dataCentre;
			}

}
