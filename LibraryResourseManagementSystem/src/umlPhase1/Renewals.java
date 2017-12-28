package umlPhase1;

import java.util.Collection;


public class Renewals extends Services {

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
			public void displayValidUpto(){
			}

				
					
					
					public boolean displayRenewStatus(){
						return false;	
					}

					
					/**
					 */
					public void printRecept(){
					}


					/**
					 * @uml.property  name="checkOUT"
					 * @uml.associationEnd  inverse="renewals:umlPhase1.CheckOUT"
					 * @uml.association  name="to"
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
					 * @uml.property name="detectorExit"
					 * @uml.associationEnd multiplicity="(0 -1)" inverse="renewals:umlPhase1.detectorExit"
					 * @uml.association name="to"
					 */
					private Collection detectorExit;

					/** 
					 * Getter of the property <tt>detectorExit</tt>
					 * @return  Returns the detectorExit.
					 * @uml.property  name="detectorExit"
					 */
					public Collection getDetectorExit() {
						return detectorExit;
					}

					/** 
					 * Setter of the property <tt>detectorExit</tt>
					 * @param detectorExit  The detectorExit to set.
					 * @uml.property  name="detectorExit"
					 */
					public void setDetectorExit(Collection detectorExit) {
						this.detectorExit = detectorExit;
					}

}
