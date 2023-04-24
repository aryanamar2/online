<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Update Password</title>
</head>
<body>
    <h2>Update Password</h2>
    <form:form method="POST" modelAttribute="user">
        <form:hidden path="id" />
        <p>
            <label>Current Password:</label>
            <form:password path="currentPassword" />
        </p>
        <p>
            <label>New Password:</label>
            <form:password path="newPassword" />
        </p>
        <p>
            <label>Confirm New Password:</label>
            <form:password path="confirmPassword" />
        </p>
        <input type="submit" value="Save Changes" />
    </form:form>
</body>
</html>