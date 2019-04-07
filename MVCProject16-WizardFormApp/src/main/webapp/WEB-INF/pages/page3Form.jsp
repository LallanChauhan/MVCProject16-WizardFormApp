<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="post" commandName="regCmd">
City::<form:input path="city"/><br>
PinCode::<form:input path="pinCode"/><br>
<input type="submit" value="previous" name="_target1"/>
<input type="submit" value="finish" name="_finish"/>  <!-- a7 -->
<input type="submit" value="Cancle" name="_cancle"/>
</form:form>

<!-- a6 -->