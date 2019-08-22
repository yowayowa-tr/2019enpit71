package jp.co.enpit.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import jp.co.enpit.constants.EnpitPamphletWebPortletKeys;
import jp.co.enpit.model.Pamphlet;
import jp.co.enpit.service.PamphletLocalService;

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
	public void show(ActionRequest request, ActionResponse response) throws PortalException {
		System.out.println("get actionTest");

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(Pamphlet.class.getName(), request);

	    String content = ParamUtil.getString(request, "content");
	    System.out.println(content);

	    _pamphletLocalService.addEntry(content, serviceContext);
	}
	
	@Reference
	private PamphletLocalService _pamphletLocalService;
	
}