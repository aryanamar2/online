<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Book Appointment</title>
</head>
<body>
    <h2>Book an Appointment</h2>
    <form:form method="POST" modelAttribute="appointment">

        <form:hidden path="id" />
        <p>
            <label>Patient:</label>
            <form:input path="patientName" />
        </p>
        <p>
            <label>Doctor:</label>
            <form:input path="doctorName" />
        </p>
        <p>
            <label>Date:</label>
            <form:input path="date" />
        </p>
        <p>
            <label>Room:</label>
            <form:select path="roomId" items="${rooms}" itemValue="id" itemLabel="roomNumber" />
        </p>
        <input type="submit" value="Book Appointment" />
    </form:form>
</body>
</html>