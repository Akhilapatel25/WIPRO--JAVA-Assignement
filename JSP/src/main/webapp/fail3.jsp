<!-- fail.jsp -->
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result - Fail</title>
</head>
<body>
    <h2>Sorry <%= request.getAttribute("name") %>,</h2>
    <p>You failed with <%= request.getAttribute("marks") %> marks.</p>

    <jsp:include page="footer3.jsp" />
</body>
</html>
