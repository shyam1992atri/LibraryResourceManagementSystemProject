package umlPhase1;

import java.util.Collection;


public class Database {

	/**
	 * @uml.property  name="kiosks"
	 * @uml.associationEnd  inverse="database:umlPhase1.Kiosks"
	 * @uml.association  name="provides details"
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
	 * @uml.property name="remainderNotification"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="database:umlPhase1.RemainderNotification"
	 * @uml.association name="sends"
	 */
	private Collection remainderNotification;

	/** 
	 * Getter of the property <tt>remainderNotification</tt>
	 * @return  Returns the remainderNotification.
	 * @uml.property  name="remainderNotification"
	 */
	public Collection getRemainderNotification() {
		return remainderNotification;
	}

	/**
	 * @uml.property  name="location"
	 * @uml.associationEnd  inverse="database:umlPhase1.Location"
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
	 * @uml.property name="libraryResource"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="database:umlPhase1.LibraryResource"
	 * @uml.association name="provides details"
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
	 * @uml.property  name="detectorExit"
	 * @uml.associationEnd  inverse="database:umlPhase1.detectorExit"
	 * @uml.association  name="checks details"
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
	 * Setter of the property <tt>remainderNotification</tt>
	 * @param remainderNotification  The remainderNotification to set.
	 * @uml.property  name="remainderNotification"
	 */
	public void setRemainderNotification(Collection remainderNotification) {
		this.remainderNotification = remainderNotification;
	}

	/** 
	 * Setter of the property <tt>libraryResource</tt>
	 * @param libraryResource  The libraryResource to set.
	 * @uml.property  name="libraryResource"
	 */
	public void setLibraryResource(Collection libraryResource) {
		this.libraryResource = libraryResource;
	}

}
