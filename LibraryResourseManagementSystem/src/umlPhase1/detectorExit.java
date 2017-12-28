package umlPhase1;


public class detectorExit {

	/**
	 * @uml.property  name="resourceID"
	 */
	private String resourceID;

	/**
	 * Getter of the property <tt>resourceID</tt>
	 * @return  Returns the resourceID.
	 * @uml.property  name="resourceID"
	 */
	public String getResourceID() {
		return resourceID;
	}

	/**
	 * Setter of the property <tt>resourceID</tt>
	 * @param resourceID  The resourceID to set.
	 * @uml.property  name="resourceID"
	 */
	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

		
			
			
			public int resourceBarCodeDetect(){
				return 0;
			}

			
			/**
			 */
			public void triggerAlarm(){
			}


			/**
			 * @uml.property  name="database"
			 * @uml.associationEnd  inverse="detectorExit:umlPhase1.Database"
			 * @uml.association  name="checks details"
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
			 * @uml.property name="checkIN"
			 * @uml.associationEnd inverse="detectorExit:umlPhase1.CheckIN"
			 * @uml.association name="to"
			 */
			private CheckIN checkIN;

			/** 
			 * Getter of the property <tt>checkIN</tt>
			 * @return  Returns the checkIN.
			 * @uml.property  name="checkIN"
			 */
			public CheckIN getCheckIN() {
				return checkIN;
			}

			/** 
			 * Setter of the property <tt>checkIN</tt>
			 * @param checkIN  The checkIN to set.
			 * @uml.property  name="checkIN"
			 */
			public void setCheckIN(CheckIN checkIN) {
				this.checkIN = checkIN;
			}


			/** 
			 * @uml.property name="checkOUT"
			 * @uml.associationEnd inverse="detectorExit:umlPhase1.CheckOUT"
			 * @uml.association name="to"
			 */
			private CheckOUT checkOUT;

			/** 
			 * Getter of the property <tt>checkOUT</tt>
			 * @return  Returns the checkOUT.
			 * @uml.property  name="checkOUT"
			 */
			public CheckOUT getCheckOUT() {
				return checkOUT;
			}

			/** 
			 * Setter of the property <tt>checkOUT</tt>
			 * @param checkOUT  The checkOUT to set.
			 * @uml.property  name="checkOUT"
			 */
			public void setCheckOUT(CheckOUT checkOUT) {
				this.checkOUT = checkOUT;
			}


			/**
			 * @uml.property  name="exit"
			 * @uml.associationEnd  inverse="detectorExit:umlPhase1.Exit"
			 * @uml.association  name="if alaram does not trigger"
			 */
			private Exit exit;

			/**
			 * Getter of the property <tt>exit</tt>
			 * @return  Returns the exit.
			 * @uml.property  name="exit"
			 */
			public Exit getExit() {
				return exit;
			}

			/**
			 * Setter of the property <tt>exit</tt>
			 * @param exit  The exit to set.
			 * @uml.property  name="exit"
			 */
			public void setExit(Exit exit) {
				this.exit = exit;
			}


			/**
			 * @uml.property  name="security"
			 * @uml.associationEnd  inverse="detectorExit:umlPhase1.Security"
			 * @uml.association  name="if alaram triggers"
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
			 * @uml.property name="renewals"
			 * @uml.associationEnd inverse="detectorExit:umlPhase1.Renewals"
			 * @uml.association name="to"
			 */
			private Renewals renewals;

			/** 
			 * Getter of the property <tt>renewals</tt>
			 * @return  Returns the renewals.
			 * @uml.property  name="renewals"
			 */
			public Renewals getRenewals() {
				return renewals;
			}

			/** 
			 * Setter of the property <tt>renewals</tt>
			 * @param renewals  The renewals to set.
			 * @uml.property  name="renewals"
			 */
			public void setRenewals(Renewals renewals) {
				this.renewals = renewals;
			}


			/**
			 * @uml.property  name="dataCentre"
			 * @uml.associationEnd  inverse="detectorExit:umlPhase1.DataCentre"
			 * @uml.association  name="checksDetails"
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
