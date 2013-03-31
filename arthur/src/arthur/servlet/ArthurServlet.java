package arthur.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import em.service.EquipmentInquiryService;

/**
 * Servlet implementation class ArthurServlet
 */
@WebServlet("/profile")
public class ArthurServlet extends HttpServlet {
	private static final long serialVersionUID = 3153762910232404188L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
/*		ServletContext context = config.getServletContext();
		BundleContext bundleContext = (BundleContext) context.getAttribute("osgi-bundlecontext");
		System.out.println(bundleContext);
		ServiceReference serviceRef = bundleContext.getServiceReference("em.service.EquipmentInquiryService");
		System.out.println(serviceRef);
		EquipmentInquiryService service = (EquipmentInquiryService)bundleContext.getService(serviceRef);
		System.out.println(service);*/
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BundleContext bundleContext = (BundleContext) getServletContext().getAttribute("osgi-bundlecontext");
		System.out.println(bundleContext);
		ServiceReference serviceRef = bundleContext.getServiceReference("em.service.EquipmentInquiryService");
		System.out.println(serviceRef);
		EquipmentInquiryService service = (EquipmentInquiryService)bundleContext.getService(serviceRef);
		System.out.println(service);
		
		request.setAttribute("weapons",	service.getAllWeapons());
		
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/arthur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
