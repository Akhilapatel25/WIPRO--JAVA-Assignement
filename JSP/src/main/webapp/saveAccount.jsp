<%@ page contentType="text/html;charset=UTF-8" import="Wipro.BankAccount5" %>
<jsp:useBean id="acc" class="Wipro.BankAccount5" scope="request" />
<jsp:setProperty name="acc" property="*" />

<%
    // Store account type in session
    String accType = request.getParameter("accountType");
    session.setAttribute("accountType", accType);

    // Forward to result page
    request.setAttribute("account", acc);
    RequestDispatcher rd = request.getRequestDispatcher("showAccount5.jsp");
    rd.forward(request, response);
%>
