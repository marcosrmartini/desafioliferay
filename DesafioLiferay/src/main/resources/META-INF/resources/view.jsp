<%@ include file="init.jsp" %>

<portlet:renderURL var="addClientURL">
	<portlet:param name="mvcPath" value="/addClient.jsp"/>
</portlet:renderURL>

<aui:button onClick="${addClientURL}" value="add-client"></aui:button>