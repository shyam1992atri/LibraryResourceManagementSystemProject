package umlPhase1;

import java.util.Collection;


public class CheckOUT extends Services {

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

			
				
				
				public boolean resourceIssueStatus(){
					return false;	
				}

				
				/**
				 */
				public void printRecept(){
				}


				/** 
				 * @uml.property name="detectorExit"
				 * @uml.associationEnd multiplicity="(0 -1)" inverse="checkOUT:umlPhase1.detectorExit"
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
				 * @uml.property  name="renewals"
				 * @uml.associationEnd  inverse="checkOUT:umlPhase1.Renewals"
				 * @uml.association  name="to"
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
				 * Setter of the property <tt>detectorExit</tt>
				 * @param detectorExit  The detectorExit to set.
				 * @uml.property  name="detectorExit"
				 */
				public void setDetectorExit(Collection detectorExit) {
					this.detectorExit = detectorExit;
				}

}
