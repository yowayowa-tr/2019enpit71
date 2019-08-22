package jp.co.enpit.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import jp.co.enpit.constants.EnpitPamphletWebPortletKeys;
import jp.co.enpit.model.Pamphlet;
import jp.co.enpit.service.PamphletLocalService;
import jp.co.enpit.service.PamphletService;

/**
 * @author yasuflatland
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=EnpitPamphletWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EnpitPamphletWebPortletKeys.ENPITPAMPHLETWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EnpitPamphletWebPortlet extends MVCPortlet {
	public void addContent(ActionRequest request, ActionResponse response) throws PortalException {
		System.out.println("addContent request");

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(Pamphlet.class.getName(), request);

	    long locationId = ParamUtil.getLong(serviceContext, "locationId");
	    String content = ParamUtil.getString(request, "content");

	    _pamphletLocalService.addEntry(locationId, content, serviceContext);
	}
	
	public void getContent(ActionRequest request, ActionResponse response) throws PortalException {
		System.out.println("getContent request");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Pamphlet.class.getName(), request);
		long locationId = ParamUtil.getLong(serviceContext, "locationId");
		int start = ParamUtil.getInteger(serviceContext, "start");
		int end = ParamUtil.getInteger(serviceContext, "end");
		
		List<Pamphlet> pamp_list = _pamphletService.getPamphlets(locationId, start, end);
		
		
	}
	
	@Reference
	private PamphletLocalService _pamphletLocalService;
	
	@Reference
	private PamphletService _pamphletService;
	
}