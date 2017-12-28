package umlPhase1;

import java.util.Collection;


public class Kiosks {

	/**
	 * @uml.property  name="libraryName"
	 */
	private String libraryName;

	/**
	 * Getter of the property <tt>libraryName</tt>
	 * @return  Returns the libraryName.
	 * @uml.property  name="libraryName"
	 */
	public String getLibraryName() {
		return libraryName;
	}

	/**
	 * Setter of the property <tt>libraryName</tt>
	 * @param libraryName  The libraryName to set.
	 * @uml.property  name="libraryName"
	 */
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	/**
	 * @uml.property  name="libraryID"
	 */
	private String libraryID;

	/**
	 * Getter of the property <tt>libraryID</tt>
	 * @return  Returns the libraryID.
	 * @uml.property  name="libraryID"
	 */
	public String getLibraryID() {
		return libraryID;
	}

	/**
	 * Setter of the property <tt>libraryID</tt>
	 * @param libraryID  The libraryID to set.
	 * @uml.property  name="libraryID"
	 */
	public void setLibraryID(String libraryID) {
		this.libraryID = libraryID;
	}

		
		/**
		 */
		public void displayMenu(){
		}

		/** 
		 * @uml.property name="collegeMembers"
		 * @uml.associationEnd multiplicity="(0 -1)" inverse="kiosks:umlPhase1.CollegeMembers"
		 * @uml.association name="assists"
		 */
		private Collection collegeMembers;

		/** 
		 * Getter of the property <tt>collegeMembers</tt>
		 * @return  Returns the collegeMembers.
		 * @uml.property  name="collegeMembers"
		 */
		public Collection getCollegeMembers() {
			return collegeMembers;
		}

		/**
		 * @uml.property  name="database"
		 * @uml.associationEnd  inverse="kiosks:umlPhase1.Database"
		 * @uml.association  name="provides details"
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
		 * @uml.property  name="security"
		 * @uml.associationEnd  inverse="kiosks:umlPhase1.Security"
		 * @uml.association  name="guides to"
		 */
		private Security security;

		/**
		 * Getter of the property <tt>security</tt>
		 * @return  Returns the security.
		 * @uml.property  name="security"
		 */
		public Security getSecurity() {
			return security;
		}

		/**
		 * Setter of the property <tt>security</tt>
		 * @param security  The security to set.
		 * @uml.property  name="security"
		 */
		public void setSecurity(Security security) {
			this.security = security;
		}

		/** 
		 * Setter of the property <tt>collegeMembers</tt>
		 * @param collegeMembers  The collegeMembers to set.
		 * @uml.property  name="collegeMembers"
		 */
		public void setCollegeMembers(Collection collegeMembers) {
			this.collegeMembers = collegeMembers;
		}

		/**
		 * @uml.property  name="dataCentre"
		 * @uml.associationEnd  inverse="kiosks:umlPhase1.DataCentre"
		 * @uml.association  name="providesDetails"
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
