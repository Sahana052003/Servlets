<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vehicle-Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<h1>${name}</h1>
<h2>${name1}</h1>
    <form action="start" method="post">
        <div class="form">
        <div class="row">
            <div class="col">
                <input type="text" class="form-control" placeholder="First name" aria-label="First name" name="first" value="${Name}">
            </div>
            <div class="col">
                <input type="text" class="form-control" placeholder="Last name" aria-label="Last name" name="last" value="${FLName}">
            </div>
        </div><br>

        <div class="row">
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label" >Title</label>
                <input type="text" class="form-control"name="title" value="${Title}">
            </div>
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label">Company Name</label>
                <input type="text" class="form-control" name="companyName" value="${CompanyName}">
            </div>
        </div><br>


        <!--Address-->
        <div class="form-floating">
            <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2"
                style="height: 100px" name="address" value="${Address}"></textarea>
            <label for="floatingTextarea2">Address</label>
        </div><br>

        <!--Town and Country-->
        <div class="row">
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label">Town</label>
                <input type="text" class="form-control" name="town" value="${Town}">
            </div>
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label">Country</label>
                <input type="text" class="form-control" name="country" value="${Country}">
            </div>
        </div><br>

        <!--Post code-->
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Post Code</label>
            <input type="text" class="form-control" id="exampleFormControlInput1" name="postcode" value="${PostCode}">
        </div><br>


        <!--Home Number and Mobile Number-->
        <div class="row">
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label">Home Phone Number</label>
                <input type="number" class="form-control" placeholder="(000)000-000" name="phoneNo" value="${PNumber}">
            </div>
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label">Mobile Phone Number</label>
                <input type="number" class="form-control" placeholder="(000)000-000" name="mobileNo" value="${MNUmber}">
            </div>
        </div><br>


        <!--Fax and Email-->
        <div class="row">
            <div class="col">
            <label for="exampleFormControlInput1" class="form-label">Fax NO.</label>
                <input type="number" class="form-control" placeholder="(000)000-000"name="faxNumber" value="${FaxNo}">
            </div>
            <div class="col">
                <label for="exampleFormControlInput1" class="form-label">E-mail Address</label>
                <input type="email" class="form-control" placeholder="ex: myname@example.com" name="email" value="${Email}">
            </div>
        </div><br>


        <!--Check Box-->
        <div class="form-check">
            <input class="form-check-input" type="checkbox" value="" id="checkIndeterminate">
            <label class="form-check-label" for="checkIndeterminate">
               Above email address will be used to acknowledge registration on the ISR of <br>information submitted.If it is left blank you WILL NOT receive an acknowledgment.
            </label>
        </div><br>


        <h2>Vehicle Information</h2>
        <!--Vehicle Registration Number-->
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Registration No of Vehicle</label>
            <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="e.g., 23456345" name="vehicleNumber" value="${VehicleReg}">
        </div><br>

        <!--Windowa-->
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Number Etched into side Windows</label>
            <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="e.g., 23" name="sideWindows" value="${NoOfWindows}">
        </div><br>

        <!--VIN Number-->
        <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Chassis Number/VIN number Please enter the full 17 digits</label>
            <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="e.g., 232154678954456" name="chassisNumber" value="${ChassNumber}">
        </div><br>

        <!--Make Vehicle and Model type-->
        <div class="row">
            <div class="col">
            <label for="exampleFormControlInput1" class="form-label">Make of Vehicle</label>
                <input type="number" class="form-control" placeholder="e.g., 1999" name="vehicle" value="${Vehicle}">
            </div>
            <div class="col">
            <label for="exampleFormControlInput1" class="form-label">Model</label>
                <input type="number" class="form-control" placeholder="e.g., 2001" name="model" value="${Model}">
            </div>
        </div><br>


        <!--Color and Year-->
        <div class="row">
            <div class="col">
             <label for="exampleFormControlInput1" class="form-label">Colour</label>
                <input type="text" class="form-control" name="color" value="${Color}">
            </div>
            <div class="col">
            <label for="exampleFormControlInput1" class="form-label">Year</label>
                <input type="text" class="form-control" placeholder="e.g., 2001" name="year" value="${Year}">
            </div>
        </div><br>


            <!--Current Milage and type-->
        <div class="row">
            <div class="col">
                    <label for="exampleFormControlInput1" class="form-label">Current Mileage</label>
                <input type="number" class="form-control" name="mileage" value="${CurrMileage}">
            </div>
            <div class="col">
                    <label for="exampleFormControlInput1" class="form-label">Alarm Type</label>

                <input type="text" class="form-control" name="alarmType" value="${AlarmType}">
            </div>
        </div><br>


            <!--Delar Name-->
        <div class="row">
                    <label for="exampleFormControlInput1" class="form-label">Dealer Name</label>
            <div class="col">
                <input type="text" class="form-control" placeholder="First name" aria-label="First name" name="firstName" value="${DelarName}">
            </div>
            <div class="col">
                <input type="text" class="form-control" placeholder="Last name" aria-label="Last name" name="lastName" value="${DelarLastName}">
            </div>
        </div><br>

        <!--Town-->
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Dealer Town</label>
            <input type="text" class="form-control" name="delarTown" value="${DelarTown}">
        </div><br>

        <hr>

        <div class="d-grid gap-2 col-6 mx-auto">
            <button class="btn btn-primary" type="button">Print Form</button>
            <button class="btn btn-primary" type="submit">Submit</button>
        </div>
    </div>
    </form>
</body>
</html>
















