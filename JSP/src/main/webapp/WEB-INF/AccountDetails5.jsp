<%@ page import="Wipro.BankAccount" %>
<jsp:useBean id="account" class="Wipro.BankAccount" scope="request" />
<jsp:setProperty name="account" property="*" />

<%
    // Store account type in session
    String accountType = request.getParameter("accountType");
    session.setAttribute("accountType", accountType);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Bank Account Details</title>
</head>
<body>
    <h2>Bank Account Information</h2>

    <!-- Access bean properties using EL -->
    <p><strong>Account No:</strong> ${account.accountNo}</p>
    <p><strong>Name:</strong> ${account.name}</p>
    <p><strong>Balance:</strong> ${account.balance}</p>

    <!-- Display session-scoped account type -->
    <p><strong>Account Type (from session):</strong> ${sessionScope.accountType}</p>

    <!-- Conditional EL to check balance -->
    <p>
        <strong>Balance Status:</strong> 
        ${account.balance >= 1000 ? 'Sufficient' : 'Insufficient'}
    </p>
</body>
</html>
