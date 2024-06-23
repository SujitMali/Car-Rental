<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
  <title>Customer Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-color: #f4f4f4;
    }

    .container {
      max-width: 400px;
      margin: 20px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }

    input[type="text"],
    input[type="password"],
    input[type="tel"],
    input[type="date"] {
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

    label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
    }

      body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-image: url('./resources/images/login_1.jpg');
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
        color: #007bff;
        text-decoration: none;
      }
  
      .signup-link a:hover {
        text-decoration: underline;
      }
      
      /* Centering the container vertically */
.login-container {
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
}
  label {
    display: block;
    margin-bottom: 10px;
    font-weight: bold;
  }

  /* Placeholder style */
  input::placeholder {
    color: #999;
  }

  /* Styling for login link */
  .login-link {
    margin-top: 20px;
    text-align: center;
    font-weight: bold; /* Make the text bold */
  }

  .login-link a {
  color: #000000; /* Black color for the link */
  text-decoration: none; /* Remove default underline */
  font-weight: bold; /* Make the text bold */
  transition: all 0.3s ease; /* Smooth transition effect */  }

  .login-link a:hover {
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
  <br><br>
  <br><br>
  <br><br>
  

<div class="container">
  <h2>Customer Registration</h2>
  <form action="afterCustomerRegister" method="post">
    <label for="customerContact">Contact Number:</label>
    <input type="text" id="customerContact" name="custCont" placeholder="Enter contact number" required>

    <label for="customerName">Name:</label>
    <input type="text" id="customerName" name="custName" placeholder="Enter name" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="custPass" placeholder="Enter password" required>

    <label for="location">Location:</label>
    <input type="text" id="location" name="custLoc" placeholder="Enter location" required>

    <label for="age">Age:</label>
    <input type="text" id="age" name="custAge" placeholder="Enter your age" required>
    

    <input type="submit" value="Register">
  </form>
  
  
	</div>
 		<div class="login-link">
        <p> <a href="cust-login">Already registered? Login</a></p>
      </div>

</body>
</html>