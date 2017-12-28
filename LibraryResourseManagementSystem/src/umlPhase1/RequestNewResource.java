package umlPhase1;


public class RequestNewResource {

	/**
	 * @uml.property  name="resourceName"
	 */
	private String resourceName;

	/**
	 * Getter of the property <tt>resourceName</tt>
	 * @return  Returns the resourceName.
	 * @uml.property  name="resourceName"
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * Setter of the property <tt>resourceName</tt>
	 * @param resourceName  The resourceName to set.
	 * @uml.property  name="resourceName"
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

		
		/**
		 */
		public void enterResourceName(){
		}


		/**
		 * @uml.property  name="services"
		 * @uml.associationEnd  inverse="requestNewResource:umlPhase1.Services"
		 */
		private Services services;

		/**
		 * Getter of the property <tt>services</tt>
		 * @return  Returns the services.
		 * @uml.property  name="services"
		 */
		public Services getServices() {
			return services;
		}

		/**
		 * Setter of the property <tt>services</tt>
		 * @param services  The services to set.
		 * @uml.property  name="services"
		 */
		public void setServices(Services services) {
			this.services = services;
		}

}
