package br.com.mmartini.portlet;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.client.service.service.ClienteLocalServiceUtil;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import br.com.mmartini.constants.DesafioLiferayControllerPortletKeys;

/**
 * @author marcos
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=DesafioLiferayController",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DesafioLiferayControllerPortletKeys.DESAFIOLIFERAYCONTROLLER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DesafioLiferayControllerPortlet extends MVCPortlet {

	 @Override
	 public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	   throws IOException, PortletException {
	  // TODO Auto-generated method stub
	  super.render(renderRequest, renderResponse);
	 }
	 
	 @ProcessAction(name="addClient")
	 public void addProduct(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		 String rg=ParamUtil.getString(actionRequest,"rg");
		 String nome=ParamUtil.getString(actionRequest,"nome");
		 String nomePai=ParamUtil.getString(actionRequest,"nomePai");
		 String nomeMae=ParamUtil.getString(actionRequest,"nomeMae");
		 String orgaoExpedidor=ParamUtil.getString(actionRequest,"orgaoExpedidor");
		 String estado=ParamUtil.getString(actionRequest,"estado");
		 Date dataExpedicao= new Date(ParamUtil.getString(actionRequest,"dataExpedicao"));
		 ClienteLocalServiceUtil.saveProduct(rg,nome,nomeMae,nomePai,orgaoExpedidor, estado, dataExpedicao);
	 }
	
}
