package umlPhase1;

import java.util.Collection;


public class DataCentre {

	/** 
	 * @uml.property name="libraryResource"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="dataCentre:umlPhase1.LibraryResource"
	 * @uml.association name="providesDetails"
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
	 * Setter of the property <tt>libraryResource</tt>
	 * @param libraryResource  The libraryResource to set.
	 * @uml.property  name="libraryResource"
	 */
	public void setLibraryResource(Collection libraryResource) {
		this.libraryResource = libraryResource;
	}

	/**
	 * @uml.property  name="location"
	 * @uml.associationEnd  inverse="dataCentre:umlPhase1.Location"
	 * @uml.association  name="contains"
	 */
	private Location location;

	/**
	 * Getter of the property <tt>location</tt>
	 * @return  Returns the location.
	 * @uml.property  name="location"
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Setter of the property <tt>location</tt>
	 * @param location  The location to set.
	 * @uml.property  name="location"
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @uml.property  name="remainderNotification"
	 * @uml.associationEnd  inverse="dataCentre:umlPhase1.RemainderNotification"
	 * @uml.association  name="sends"
	 */
	private RemainderNotification remainderNotification;

	/**
	 * Getter of the property <tt>remainderNotification</tt>
	 * @return  Returns the remainderNotification.
	 * @uml.property  name="remainderNotification"
	 */
	public RemainderNotification getRemainderNotification() {
		return remainderNotification;
	}

	/**
	 * Setter of the property <tt>remainderNotification</tt>
	 * @param remainderNotification  The remainderNotification to set.
	 * @uml.property  name="remainderNotification"
	 */
	public void setRemainderNotification(
			RemainderNotification remainderNotification) {
				this.remainderNotification = remainderNotification;
			}

	/**
	 * @uml.property  name="kiosks"
	 * @uml.associationEnd  inverse="dataCentre:umlPhase1.Kiosks"
	 * @uml.association  name="providesDetails"
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

	/**
	 * @uml.property  name="detectorExit"
	 * @uml.associationEnd  inverse="dataCentre:umlPhase1.detectorExit"
	 * @uml.association  name="checksDetails"
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

}
