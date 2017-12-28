package umlPhase1;


public class Location {

	/** 
	 * @uml.property name="floorNumber"
	 */
	private int floorNumber;

	/** 
	 * Getter of the property <tt>floorNumber</tt>
	 * @return  Returns the floorNumber.
	 * @uml.property  name="floorNumber"
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * @uml.property  name="stackSection"
	 */
	private String stackSection;

	/**
	 * Getter of the property <tt>stackSection</tt>
	 * @return  Returns the stackSection.
	 * @uml.property  name="stackSection"
	 */
	public String getStackSection() {
		return stackSection;
	}

	/**
	 * Setter of the property <tt>stackSection</tt>
	 * @param stackSection  The stackSection to set.
	 * @uml.property  name="stackSection"
	 */
	public void setStackSection(String stackSection) {
		this.stackSection = stackSection;
	}

	/**
	 * @uml.property  name="database"
	 * @uml.associationEnd  inverse="location:umlPhase1.Database"
	 * @uml.association  name="contains"
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
	 * Setter of the property <tt>floorNumber</tt>
	 * @param floorNumber  The floorNumber to set.
	 * @uml.property  name="floorNumber"
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 * @uml.property  name="rackNumber"
	 */
	private int rackNumber;

	/** 
	 * Getter of the property <tt>rackNumber</tt>
	 * @return  Returns the rackNumber.
	 * @uml.property  name="rackNumber"
	 */
	public int getRackNumber() {
		return rackNumber;
	}

	/** 
	 * Setter of the property <tt>rackNumber</tt>
	 * @param rackNumber  The rackNumber to set.
	 * @uml.property  name="rackNumber"
	 */
	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}

	/**
	 * @uml.property  name="dataCentre"
	 * @uml.associationEnd  inverse="location:umlPhase1.DataCentre"
	 * @uml.association  name="contains"
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
