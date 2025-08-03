<!-- pass.jsp -->
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result - Pass</title>
</head>
<body>
    <h2>Congratulations <%= request.getAttribute("name") %>!</h2>
    <p>You passed with <%= request.getAttribute("marks") %> marks.</p>

    <jsp:include page="footer3.jsp" />
</body>
</html>
