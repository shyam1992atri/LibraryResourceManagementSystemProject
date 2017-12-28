package umlPhase1;

import java.util.Collection;


public class LibraryResource {

	/**
	 * @uml.property  name="typeOfResource"
	 */
	private String typeOfResource;

	/**
	 * Getter of the property <tt>typeOfResource</tt>
	 * @return  Returns the typeOfResource.
	 * @uml.property  name="typeOfResource"
	 */
	public String getTypeOfResource() {
		return typeOfResource;
	}

	/**
	 * Setter of the property <tt>typeOfResource</tt>
	 * @param typeOfResource  The typeOfResource to set.
	 * @uml.property  name="typeOfResource"
	 */
	public void setTypeOfResource(String typeOfResource) {
		this.typeOfResource = typeOfResource;
	}

		
		/**
		 */
		public void selectResourceType(){
		}


		/** 
		 * @uml.property name="database"
		 * @uml.associationEnd inverse="libraryResource:umlPhase1.Database"
		 * @uml.association name="provides details"
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
		 * @uml.property name="collegeMembers"
		 * @uml.associationEnd multiplicity="(0 -1)" inverse="libraryResource:umlPhase1.CollegeMembers"
		 * @uml.association name="can search"
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
		 * Setter of the property <tt>collegeMembers</tt>
		 * @param collegeMembers  The collegeMembers to set.
		 * @uml.property  name="collegeMembers"
		 */
		public void setCollegeMembers(Collection collegeMembers) {
			this.collegeMembers = collegeMembers;
		}


		/** 
		 * @uml.property name="dataCentre"
		 * @uml.associationEnd inverse="libraryResource:umlPhase1.DataCentre"
		 * @uml.association name="providesDetails"
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
