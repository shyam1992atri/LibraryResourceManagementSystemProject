package umlPhase1;

import java.util.Collection;


public class CheckIN extends Services {

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

			
				
				
				public boolean resourceAcceptStatus(){
					return false;	
				}

				
					
					
					public double calculateFine(){
						return 0;
					}

					
					/**
					 */
					public void fineAmount(){
					}

						
						/**
						 */
						public void enterResourceToDropBox(){
						}

							
							/**
							 */
							public void printRecept(){
							}


							/** 
							 * @uml.property name="detectorExit"
							 * @uml.associationEnd multiplicity="(0 -1)" inverse="checkIN:umlPhase1.detectorExit"
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
							 * @uml.property  name="fineAmount"
							 */
							private double fineAmount = 0;

							/**
							 * Getter of the property <tt>fineAmount</tt>
							 * @return  Returns the fineAmount.
							 * @uml.property  name="fineAmount"
							 */
							public double getFineAmount() {
								return fineAmount;
							}

							/**
							 * Setter of the property <tt>fineAmount</tt>
							 * @param fineAmount  The fineAmount to set.
							 * @uml.property  name="fineAmount"
							 */
							public void setFineAmount(double fineAmount) {
								this.fineAmount = fineAmount;
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
