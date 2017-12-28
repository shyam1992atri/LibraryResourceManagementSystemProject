package umlPhase1;

import java.util.Collection;


public class CollegeMembers {

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
	 * @uml.property name="phoneNumber"
	 */
	private int phoneNumber;

	/** 
	 * Getter of the property <tt>phoneNumber</tt>
	 * @return  Returns the phoneNumber.
	 * @uml.property  name="phoneNumber"
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

		
		
			
			
				
				
				public String displayVereficationDetails(){
				
							
										return "";	
									  }

		/** 
		 * Setter of the property <tt>phoneNumber</tt>
		 * @param phoneNumber  The phoneNumber to set.
		 * @uml.property  name="phoneNumber"
		 */
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

			
			/**
			 */
			public void displayAccountDetails(){
			}

				
					
					
					public boolean displayResourceStatus(){
						return false;	
					}

					
						
						
						public String recieveLocation(){
							return "";	
						}

					/** 
					 * @uml.property name="kiosks"
					 * @uml.associationEnd multiplicity="(0 -1)" inverse="collegeMembers:umlPhase1.Kiosks"
					 * @uml.association name="assists"
					 */
					private Collection kiosks;

					/** 
					 * Getter of the property <tt>kiosks</tt>
					 * @return  Returns the kiosks.
					 * @uml.property  name="kiosks"
					 */
					public Collection getKiosks() {
						return kiosks;
					}

					/** 
					 * @uml.property name="services"
					 * @uml.associationEnd multiplicity="(0 -1)" inverse="collegeMembers:umlPhase1.Services"
					 * @uml.association name="accesses"
					 */
					private Collection services;

					/** 
					 * Getter of the property <tt>services</tt>
					 * @return  Returns the services.
					 * @uml.property  name="services"
					 */
					public Collection getServices() {
						return services;
					}

					/** 
					 * @uml.property name="libraryResource"
					 * @uml.associationEnd multiplicity="(0 -1)" inverse="collegeMembers:umlPhase1.LibraryResource"
					 * @uml.association name="can search"
					 */
					private Collection libraryResource;

					/** 
					 * Getter of the property <tt>libraryResource</tt>
					 * @return  Returns the libraryResource.
					 * @uml.property  name="libraryResource"
					 */
					public Collection getLibraryResource() {
						return libraryResource;
					}

					/** 
					 * Setter of the property <tt>kiosks</tt>
					 * @param kiosks  The kiosks to set.
					 * @uml.property  name="kiosks"
					 */
					public void setKiosks(Collection kiosks) {
						this.kiosks = kiosks;
					}

					/** 
					 * Setter of the property <tt>services</tt>
					 * @param services  The services to set.
					 * @uml.property  name="services"
					 */
					public void setServices(Collection services) {
						this.services = services;
					}

					/** 
					 * Setter of the property <tt>libraryResource</tt>
					 * @param libraryResource  The libraryResource to set.
					 * @uml.property  name="libraryResource"
					 */
					public void setLibraryResource(Collection libraryResource) {
						this.libraryResource = libraryResource;
					}

}
