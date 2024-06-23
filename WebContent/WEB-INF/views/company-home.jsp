<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
  <head>
    <title>Company Dashboard</title>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <link
      href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap"
      rel="stylesheet"
    />

    <link rel="stylesheet" href="./resources/css/open-iconic-bootstrap.min.css" />
    <link rel="stylesheet" href="./resources/css/animate.css" />

    <link rel="stylesheet" href="./resources/css/owl.carousel.min.css" />
    <link rel="stylesheet" href="./resources/css/owl.theme.default.min.css" />
    <link rel="stylesheet" href="./resources/css/magnific-popup.css" />

    <link rel="stylesheet" href="./resources/css/aos.css" />

    <link rel="stylesheet" href="./resources/css/ionicons.min.css" />

    <link rel="stylesheet" href="./resources/css/bootstrap-datepicker.css" />
    <link rel="stylesheet" href="./resources/css/jquery.timepicker.css" />

    <link rel="stylesheet" href="./resources/css/flaticon.css" />
    <link rel="stylesheet" href="./resources/css/icomoon.css" />
    <link rel="stylesheet" href="./resources/css/style.css" />
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
            height: 60vh;
             text-align: center;
        }
    </style>
  </head>
  <body>
     <nav
      class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
      id="ftco-navbar"
    >
      <div class="container">
        <a class="navbar-brand" href="index"
          ><span>CarBook</span>DashBoard</a
        >
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#ftco-nav"
          aria-controls="ftco-nav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a href="company-home" class="nav-link">Home</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Orders
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">             
                  <a class="dropdown-item" href="company-booking-todays">Today's Booking</a>
                  <a class="dropdown-item" href="company-booking-upcoming">Upcoming Booking</a>
              </div>
          </li>
          
              
          </li>
          
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Owners
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="company-owner-pending">Pending</a>
                  <a class="dropdown-item" href="company-owner-approve">Approved</a>
                  <a class="dropdown-item" href="company-owner-disapprove">Disapproved</a>
              </div>
          </li>
          
           <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Vehicles
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="company-vehicle-pending">Pending</a>
                  <a class="dropdown-item" href="company-ehicle-approve">Approved</a>
                  <a class="dropdown-item" href="company-ehicle-disapprove">Disapproved</a>
              </div>
          </li>
          
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              Bookings
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="company-booking-pending">Pending</a>
                <a class="dropdown-item" href="company-booking-approve">Approved</a>
                <a class="dropdown-item" href="company-booking-disapprove">Disapproved</a>
            </div>
        </li>
        



            <li class="nav-item">
              <a href="company-add-emp" class="nav-link">Add Employee</a>
            </li>
            <li class="nav-item"><a href="index" class="nav-link">Logout</a></li>
          </ul>
        </div>
      </div>
    </nav>



    <!-- Your content goes here -->

    <!-- loader -->
    <div id="ftco-loader" class="show fullscreen">
      <svg class="circular" width="48px" height="48px">
        <circle
          class="path-bg"
          cx="24"
          cy="24"
          r="22"
          fill="none"
          stroke-width="4"
          stroke="#eeeeee"
        />
        <circle
          class="path"
          cx="24"
          cy="24"
          r="22"
          fill="none"
          stroke-width="4"
          stroke-miterlimit="10"
          stroke="#F96D00"
        />
      </svg>
    </div>

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