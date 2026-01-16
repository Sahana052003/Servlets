<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!DOCTYPE html>
<html>
<head>
    <title>Hotel Booking</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>

    <form action="register" method="post">
        <div class="mb-3">
            <label class="form-label">Guest Name</label>
            <input type="text" class="form-control" name="guestName" placeholder="Enter your name">
        </div>
        <div class="mb-3">
            <label class="form-label">Email Address</label>
            <input type="email" class="form-control" name="email" placeholder="Enter email">
        </div>
        <div class="mb-3">
            <label class="form-label">Number of Rooms</label>
            <input type="number" class="form-control" name="rooms" min="1" max="10">
        </div>
        <div class="mb-3">
            <label class="form-label">Check-in Date</label>
            <input type="date" class="form-control" name="checkInDate">
        </div>
        <div class="mb-3">
            <label class="form-label">Room Type</label>
            <select class="form-select" name="roomType">
                <option selected disabled>Select room type</option>
                <option>Single</option>
                <option>Double</option>
                <option>Deluxe</option>
                <option>Suite</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Book Now</button>

    </form>
</div>
</body>
</html>