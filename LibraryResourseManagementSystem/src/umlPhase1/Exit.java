package umlPhase1;


public class Exit {

	/** 
	 * @uml.property name="exitNumber"
	 */
	private int exitNumber;

	/** 
	 * Getter of the property <tt>exitNumber</tt>
	 * @return  Returns the exitNumber.
	 * @uml.property  name="exitNumber"
	 */
	public int getExitNumber() {
		return exitNumber;
	}

	/**
	 * @uml.property  name="detectorExit"
	 * @uml.associationEnd  inverse="exit:umlPhase1.detectorExit"
	 * @uml.association  name="if alaram does not trigger"
	 */
	private detectorExit detectorExit;

	/**
	 * Getter of the property <tt>detectorExit</tt>
	 * @return  Returns the detectorExit.
	 * @uml.property  name="detectorExit"
	 */
	public detectorExit getDetectorExit() {
		return detectorExit;
	}

	/**
	 * Setter of the property <tt>detectorExit</tt>
	 * @param detectorExit  The detectorExit to set.
	 * @uml.property  name="detectorExit"
	 */
	public void setDetectorExit(detectorExit detectorExit) {
		this.detectorExit = detectorExit;
	}

	/** 
	 * Setter of the property <tt>exitNumber</tt>
	 * @param exitNumber  The exitNumber to set.
	 * @uml.property  name="exitNumber"
	 */
	public void setExitNumber(int exitNumber) {
		this.exitNumber = exitNumber;
	}

}
