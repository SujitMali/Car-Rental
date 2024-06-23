<!DOCTYPE html>
<html lang="en">

<head>
    <title>Add Employee</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap"
        rel="stylesheet">

    <link rel="stylesheet" href="./resources/css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="./resources/css/animate.css">

    <link rel="stylesheet" href="./resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="./resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="./resources/css/magnific-popup.css">

    <link rel="stylesheet" href="./resources/css/aos.css">

    <link rel="stylesheet" href="./resources/css/ionicons.min.css">

    <link rel="stylesheet" href="./resources/css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="./resources/css/jquery.timepicker.css">


    <link rel="stylesheet" href="./resources/css/flaticon.css">
    <link rel="stylesheet" href="./resources/css/icomoon.css">
    <link rel="stylesheet" href="./resources/css/style.css">
    
    <style>
        body {
            background-image: url("./resources/images/wallpaper.jpg");
            background-size: cover;
            background-position: center;
            backface-visibility: visible;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80vh;
        }

        .container {
           
            padding: 20px;
            border-radius: 20px;
            color: white;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>

<body>

    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
        <div class="container">
            <a class="navbar-brand" href="index"><span>CarBook</span>DashBoard</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav"
                aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="oi oi-menu"></span> Menu
            </button>

            <div class="collapse navbar-collapse" id="ftco-nav">
                <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a href="owner-home" class="nav-link">Home</a>
            </li>
            
             <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Vehicle
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="owner-vehicle-add">Add</a>
                <a class="dropdown-item" href="owner-vehicle-allocate">Allocated</a>
                <a class="dropdown-item" href="owner-vehicle-unallocate">Unallocated</a>
            </div>
        </li>
        
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Status
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="owner-vehicle-pending">Pending</a>
                <a class="dropdown-item" href="owner-vehicle-approve">Approved</a>
                <a class="dropdown-item" href="owner-vehicle-disapprove">Disapproved</a>
            </div>
        </li>
                             
                     
            <li class="nav-item"><a href="index" class="nav-link">Logout</a></li>
          </ul>
            </div>
        </div>
    </nav>



    <div class="container">
    <br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>
    <h2 style="text-align: center; color: white;">Add Employee</h2>
    <form action="afterAddVehicle" method="post" class="vertical-form">
        <div class="form-group">
            <label for="vehicle_name">Vehicle Name:</label>
            <input type="text" id="vehicle_name" name="vehName" required>
        </div>
        <div class="form-group">
            <label for="vehicle_type">Vehicle Type:</label>
            <input type="text" id="vehicle_type" name="vehType" required>
        </div>
        <div class="form-group">
            <label for="model_year">Model Year:</label>
            <input type="text" id="model_year" name="vehModelYear" min="1900" max="2099" required>
        </div>
        <div class="form-group">
            <label for="start_date">Start Date:</label>
            <input type="date" id="start_date" name="vehStartDate" required>
        </div>
        <div class="form-group">
            <label for="end_date">End Date:</label>
            <input type="date" id="end_date" name="vehEndDate" required>
        </div>
        <div class="form-group">
            <label for="rent_price">Rent Price:</label>
            <input type="text" id="rent_price" name="vehRentPrice" min="0" required>
        </div>
        <input type="submit" value="Submit">
    </form>
</div>

<style>
.vertical-form {
    max-width: 350px;
    margin: 0 auto;
}

.vertical-form .form-group {
    margin-bottom: 10px;
}

.vertical-form label {
    color: white;
}

.vertical-form input[type="text"],
.vertical-form input[type="number"],
.vertical-form input[type="date"],
.vertical-form input[type="submit"] {
    width: 100%;
}

.vertical-form input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 10px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

</style>


  <script src="./resources/js/jquery.min.js"></script>
    <script src="./resources/js/jquery-migrate-3.0.1.min.js"></script>
    <script src="./resources/js/popper.min.js"></script>
    <script src="./resources/js/bootstrap.min.js"></script>
    <script src="./resources/js/jquery.easing.1.3.js"></script>
    <script src="./resources/js/jquery.waypoints.min.js"></script>
    <script src="./resources/js/jquery.stellar.min.js"></script>
    <script src="./resources/js/owl.carousel.min.js"></script>
    <script src="./resources/js/jquery.magnific-popup.min.js"></script>
    <script src="./resources/js/aos.js"></script>
    <script src="./resources/js/jquery.animateNumber.min.js"></script>
    <script src="./resources/js/bootstrap-datepicker.js"></script>
    <script src="./resources/js/jquery.timepicker.min.js"></script>
    <script src="./resources/js/scrollax.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY&sensor=false"></script>
    <script src="./resources/js/google-map.js"></script>
    <script src="./resources/js/main.js"></script>
</body>

</html>