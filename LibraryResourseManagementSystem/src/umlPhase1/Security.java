package umlPhase1;


public class Security {

	/**
	 * @uml.property  name="securityGardNumber"
	 */
	private String securityGardNumber;

	/**
	 * Getter of the property <tt>securityGardNumber</tt>
	 * @return  Returns the securityGardNumber.
	 * @uml.property  name="securityGardNumber"
	 */
	public String getSecurityGardNumber() {
		return securityGardNumber;
	}

	/**
	 * Setter of the property <tt>securityGardNumber</tt>
	 * @param securityGardNumber  The securityGardNumber to set.
	 * @uml.property  name="securityGardNumber"
	 */
	public void setSecurityGardNumber(String securityGardNumber) {
		this.securityGardNumber = securityGardNumber;
	}

	/**
	 * @uml.property  name="exitNumber"
	 */
	private String exitNumber;

	/**
	 * Getter of the property <tt>exitNumber</tt>
	 * @return  Returns the exitNumber.
	 * @uml.property  name="exitNumber"
	 */
	public String getExitNumber() {
		return exitNumber;
	}

	/**
	 * Setter of the property <tt>exitNumber</tt>
	 * @param exitNumber  The exitNumber to set.
	 * @uml.property  name="exitNumber"
	 */
	public void setExitNumber(String exitNumber) {
		this.exitNumber = exitNumber;
	}

		
		/**
		 */
		public void guideMember(){
		}

		/**
		 * @uml.property  name="detectorExit"
		 * @uml.associationEnd  inverse="security:umlPhase1.detectorExit"
		 * @uml.association  name="if alaram triggers"
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
		 * @uml.property  name="kiosks"
		 * @uml.associationEnd  inverse="security:umlPhase1.Kiosks"
		 * @uml.association  name="guides to"
		 */
		private Kiosks kiosks;

		/**
		 * Getter of the property <tt>kiosks</tt>
		 * @return  Returns the kiosks.
		 * @uml.property  name="kiosks"
		 */
		public Kiosks getKiosks() {
			return kiosks;
		}

		/**
		 * Setter of the property <tt>kiosks</tt>
		 * @param kiosks  The kiosks to set.
		 * @uml.property  name="kiosks"
		 */
		public void setKiosks(Kiosks kiosks) {
			this.kiosks = kiosks;
		}

}
