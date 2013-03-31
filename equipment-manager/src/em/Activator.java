package em;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import em.service.EquipmentInquiryService;
import em.service.impl.EquipmentInquiryServiceImpl;

public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		
		context.registerService(EquipmentInquiryService.class.getName(), new EquipmentInquiryServiceImpl(), null);
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
	}

}
