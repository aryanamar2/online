<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Update Profile</title>
</head>
<body>
    <h2>Update Profile</h2>
    <form:form method="POST" modelAttribute="user">
        <form:hidden path="id" />
        <p>
            <label>First Name:</label>
            <form:input path="firstName" />
        </p>
        <p>
            <label>Last Name:</label>
            <form:input path="lastName" />
        </p>
        <p>
            <label>Email:</label>
            <form:input path="email" />
        </p>
        <p>
            <label>Phone Number:</label>
            <form:input path="phoneNumber" />
        </p>
        <input type="submit" value="Save Changes" />
    </form:form>
</body>
</html>