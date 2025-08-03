<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Submitted Info</title>
</head>
<body>
<h2>User Submitted Information</h2>

<p><strong>User Name:</strong> ${username}</p>
<p><strong>Password:</strong> ${password}</p>
<p><strong>Address:</strong> ${address}</p>
<p><strong>Subscribed:</strong> ${subscribe}</p>
<p><strong>Gender:</strong> ${gender}</p>
<p><strong>Favorite Number:</strong> ${favNumber}</p>
<p><strong>Favorite Frameworks:</strong>
    <c:forEach items="${frameworks}" var="fw">
        ${fw}&nbsp;
    </c:forEach>
</p>

</body>
</html>
