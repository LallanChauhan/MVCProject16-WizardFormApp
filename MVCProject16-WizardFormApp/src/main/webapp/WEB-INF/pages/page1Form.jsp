<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="post" commandName="regCmd">
userName::<form:input path="userName"/><br>
password::<form:input path="pass"/><br>
<input type="submit" value="Next" name="_target1"/>  <!-- q -->
<input type="submit" value="Cancle" name="_cancle"/>
</form:form>

<!-- p-->