<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="post" commandName="regCmd">
EmailId::<form:input path="emailId"/><br>
PhonNo::<form:input path="phoneNo"/><br>
<input type="submit" value="previous" name="_target0"/>
<input type="submit" value="Next" name="_target2"/>  <!-- y -->
<input type="submit" value="Cancle" name="_cancle"/>
</form:form>


<!--x -->