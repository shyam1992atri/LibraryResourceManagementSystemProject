package umlPhase1;

import java.util.Collection;


public class Services {

	/** 
	 * @uml.property name="collegeMembers"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="services:umlPhase1.CollegeMembers"
	 * @uml.association name="accesses"
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
	 * @uml.property  name="serviceType"
	 */
	private String serviceType;

	/**
	 * Getter of the property <tt>serviceType</tt>
	 * @return  Returns the serviceType.
	 * @uml.property  name="serviceType"
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * Setter of the property <tt>serviceType</tt>
	 * @param serviceType  The serviceType to set.
	 * @uml.property  name="serviceType"
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

		
		/**
		 */
		public void displayAssiociatedService(){
		}

		/**
		 * @uml.property  name="requestNewResource"
		 * @uml.associationEnd  inverse="services:umlPhase1.RequestNewResource"
		 */
		private RequestNewResource requestNewResource;

		/**
		 * Getter of the property <tt>requestNewResource</tt>
		 * @return  Returns the requestNewResource.
		 * @uml.property  name="requestNewResource"
		 */
		public RequestNewResource getRequestNewResource() {
			return requestNewResource;
		}

		/**
		 * Setter of the property <tt>requestNewResource</tt>
		 * @param requestNewResource  The requestNewResource to set.
		 * @uml.property  name="requestNewResource"
		 */
		public void setRequestNewResource(RequestNewResource requestNewResource) {
			this.requestNewResource = requestNewResource;
		}

}
