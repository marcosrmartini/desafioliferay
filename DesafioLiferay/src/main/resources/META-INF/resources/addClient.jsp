<%@ include file="init.jsp"%>
<portlet:actionURL name="addClient" var="addClientURL">
</portlet:actionURL>

<aui:form action="${addClientURL}">
	<aui:input name="id" label="ID:"></aui:input>
	<aui:input name="nome" label="Nome:"></aui:input>
	<aui:input name="rg" label="RG:"></aui:input>
	<aui:input name="nomeMae" label="Nome mãe:"></aui:input>
	<aui:input name="nomePai" label="Nome pai:"></aui:input>
	<aui:input name="orgaoExpedidor" label="Orgão expedidor:"></aui:input>
	<aui:input name="estado" label="Estado:"></aui:input>
	<aui:input name="dataExpedicao" label="Data expedição:"></aui:input>		
	<aui:input name="" type="submit" value="add-client"></aui:input>
</aui:form>

