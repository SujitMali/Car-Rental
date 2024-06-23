<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
  <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">

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
  <title>Customer Login</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-image: url('./resources/images/login_1.jpg'); /* Add the URL of the image */
      background-size: cover;
      background-position: center;
    }



    /* Container for the login form */
    .login-container {
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh; /* Full viewport height */
      flex-direction: column; /* Align items vertically */
    }

    .container {
      max-width: 400px;
      padding: 20px;
      background-color: rgba(255, 255, 255, 0.8);
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }

  .signup-link {
  margin-top: 10px;
  text-align: center;
}

.signup-link a {
  color: #000000; /* Black color for the link */
  text-decoration: none; /* Remove default underline */
  font-weight: bold; /* Make the text bold */
  transition: all 0.3s ease; /* Smooth transition effect */
}

.signup-link a:hover {
  transform: scale(1.1); /* Scale the link on hover */
  color: #3366ff; /* Change color on hover */
}
  
  </style>
 
</head>
<body>

  <!-- Container for the navbar -->
<div class="navbar-container">
      <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
        <div>
          <a class="navbar-brand" href="index"><span>CarBook</span>DashBoard</a>

        </div>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav"
          aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
  			<ul class="navbar-nav ml-auto">
    			<li class="nav-item">
      				<a href="index" class="nav-link" style="font-weight: bold;">Home</a>
    			</li>
  			</ul>
		</div>

      </nav>
    </div>


  <!-- Container for the login form -->
  <div class="login-container">
    <div class="container">
      <h2>Vehicle Owner Login</h2>
      <form action="afterOwnerLogin" method="post">
        <input type="text" id="contactNumber" name="ownerCont" placeholder="Contact Number" required>
        <input type="password" id="password" name="ownerPass" placeholder="Password" required>
        <input type="submit" value="Login">
      </form>
    </div>

    <div class="signup-link">
       <a href="owner-map">Don't have an account? Register</a>
    </div>
  </div>

</body>
</html>