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
  <title>Owner Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      background-image: url('./resources/images/login_1.jpg');
      background-size: cover;
      background-position: center;
    }

   

    /* Container for the registration form */
    .container {
      max-width: 400px;
      margin: 50px auto;
      padding: 30px;
      background-color: rgba(255, 255, 255, 0.8);
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }

    /* Input fields */
    input[type="text"],
    input[type="password"],
    input[type="number"] {
      width: calc(100% - 20px);
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    /* Submit button */
    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    /* Submit button hover effect */
    input[type="submit"]:hover {
      background-color: #45a049;
    }
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
<%
  String lat=request.getParameter("lat");
  String lng=request.getParameter("lng");
  
  System.out.println("lat "+lat);
  System.out.println("lng "+lng);
  %>
  
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
  <h2>Vehicle Owner Registration</h2>
  <form action="afterOwnerRegister" method="post">
    <input type="text" id="ownerContact" name="ownerCont" placeholder="Enter owner's contact number" required>
    <input type="text" id="ownerName" name="ownerName" placeholder="Enter owner's name" required>
    <input type="password" id="password" name="ownerPass" placeholder="Enter password" required>
    
    <input class="form-control" type="hidden" value="<%=lat %>" placeholder="lat" name="lat" required/>
    <input class="form-control" type="hidden" value="<%=lng %>"placeholder="lng" name="lng" required/>
    
    <input type="text" id="age" name="ownerAge" placeholder="Enter Age" required>
    <input type="submit" value="Register">
  </form>
</div>

<div class="login-link">
    <p> <a href="owner-login">Already registered? Login</a></p>
  </div>

</body>
</html>