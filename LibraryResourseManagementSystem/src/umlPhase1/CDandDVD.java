package umlPhase1;


public class CDandDVD extends LibraryResource {

	/**
	 * @uml.property  name="cdOrDVDtitle"
	 */
	private String cdOrDVDtitle;

	/**
	 * Getter of the property <tt>cdOrDVDtitle</tt>
	 * @return  Returns the cdOrDVDtitle.
	 * @uml.property  name="cdOrDVDtitle"
	 */
	public String getCdOrDVDtitle() {
		return cdOrDVDtitle;
	}

	/**
	 * Setter of the property <tt>cdOrDVDtitle</tt>
	 * @param cdOrDVDtitle  The cdOrDVDtitle to set.
	 * @uml.property  name="cdOrDVDtitle"
	 */
	public void setCdOrDVDtitle(String cdOrDVDtitle) {
		this.cdOrDVDtitle = cdOrDVDtitle;
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
	 * @uml.property name="ageRestriction"
	 */
	private int ageRestriction;

	/** 
	 * Getter of the property <tt>ageRestriction</tt>
	 * @return  Returns the ageRestriction.
	 * @uml.property  name="ageRestriction"
	 */
	public int getAgeRestriction() {
		return ageRestriction;
	}

	/**
	 * @uml.property  name="tutorDetails"
	 */
	private String tutorDetails;

	/**
	 * Getter of the property <tt>tutorDetails</tt>
	 * @return  Returns the tutorDetails.
	 * @uml.property  name="tutorDetails"
	 */
	public String getTutorDetails() {
		return tutorDetails;
	}

	/**
	 * Setter of the property <tt>tutorDetails</tt>
	 * @param tutorDetails  The tutorDetails to set.
	 * @uml.property  name="tutorDetails"
	 */
	public void setTutorDetails(String tutorDetails) {
		this.tutorDetails = tutorDetails;
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
				 * Setter of the property <tt>ageRestriction</tt>
				 * @param ageRestriction  The ageRestriction to set.
				 * @uml.property  name="ageRestriction"
				 */
				public void setAgeRestriction(int ageRestriction) {
					this.ageRestriction = ageRestriction;
				}

}
