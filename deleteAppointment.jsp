<html>
<head>
    <title>Delete Appointment</title>
</head>
<body>
    <h2>Delete Appointment</h2>
    <form method="POST" action="/deleteAppointment">
        <input type="hidden" name="id" value="${appointment.id}" />
        <p>Are you sure you want to delete the appointment with ${appointment.doctorName} on ${appointment.date}?</p>
        <input type="submit" value="Delete" />
    </form>
</body>
</html>