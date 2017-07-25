<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>    
<%@page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%
		String s1= new String("ABCD");
		String s2= new String("EFGH");
		String s3= new String("IJKL");
		String s4= new String("MNOP");
		String s5= new String("Wx Yz");
		List<String> list=new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		boolean verify =false;
		
		String ss1= new String("ABCD");
		String ss2= new String("MNOP");
		String ss3= new String("wx yz");
		List<String> remove=new ArrayList<String>();
		remove.add(ss1);
		remove.add(ss2);
		remove.add(ss3);
		
		pageContext.setAttribute("list",list);
		pageContext.setAttribute("verify",verify);
		pageContext.setAttribute("remove",remove);
		
	%>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
      <form action="" name="formForEach">
		<c:chose>
			<c:when test="${verify}">
				<c:forEach items="${list}" var="a">
					<c:if test="${! fn:containsIgnoreCase(remove, a)}">
						<input type="checkbox" name="forlabel" value="${a}"><c:out value="${a}"/><br/>
					</c:if>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list}" var="a">
					<input type="checkbox" name="forlabel" value="${a}"><c:out value="${a}"/><br/>
				</c:forEach>
			</c:otherwise>
		</c:chose>
      </form>
  	</body>
</html> --%>