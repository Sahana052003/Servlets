<!DOCTYPE html>
<html>
<head>
    <title>Passport Application</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
    <form action="details" method="post">
        <div class="mb-3">
            <label class="form-label">Full Name</label>
            <input type="text" class="form-control" name="fullName" placeholder="Enter full name">
        </div>
        <div class="mb-3">
            <label class="form-label">Date of Birth</label>
            <input type="date" class="form-control" name="dob">
        </div>
        <div class="mb-3">
            <label class="form-label">Passport Type</label>
            <select class="form-select" name="passportType">
                <option selected disabled>Select type</option>
                <option>Regular</option>
                <option>Diplomatic</option>
                <option>Official</option>
            </select>
        </div>
        <div class="mb-3">
            <label class="form-label">Email Address</label>
            <input type="email" class="form-control" name="email" placeholder="Enter email">
  </div>
        <div class="mb-3">
            <label class="form-label">Mobile Number</label>
            <input type="tel" class="form-control" name="mobile" placeholder="Enter mobile number">
        </div>
        <button type="submit" class="btn btn-primary">Apply Passport</button>

    </form>
</div>
</body>
</html>
