<%@ page contentType="text/html;charset=UTF-8" import="Wipro.BankAccount5" %>
<%
    BankAccount5 acc = (BankAccount5) request.getAttribute("account");
    String accType = (String) session.getAttribute("accountType");
%>
<html>
<head><title>Account Details</title></head>
<body>
<h2>Account Details</h2>

<p><strong>Account No:</strong> ${account.accountNo}</p>
<p><strong>Name:</strong> ${account.name}</p>
<p><strong>Balance:</strong> ₹${account.balance}</p>
<p><strong>Account Type:</strong> <%= accType %></p>

<%
    if (acc.getBalance() >= 1000) {
%>
    <p><strong>Status:</strong> ✅ Sufficient Balance</p>
<%
    } else {
%>
    <p><strong>Status:</strong> ❌ Insufficient Balance</p>
<%
    }
%>

</body>
</html>
