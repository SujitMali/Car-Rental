<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>QR Code Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        /* Additional CSS for centering the card */
        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="card" style="width: 18rem;">
            <img class="card-img-top" src="./resources/images/qr.jpg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">QR Code</h5>
              <div id="timer">Waiting For <span id="countdown">15</span> seconds...</div> 
            </div>
        </div>
    </div>
    
    <script>
        // Function to countdown and redirect after 30 seconds
        function countdown() {
            var seconds = 30;
            var countdownElement = document.getElementById("countdown");

            var countdownInterval = setInterval(function() {
                seconds--;
                countdownElement.textContent = seconds;

                if (seconds <= 0) {
                    clearInterval(countdownInterval);
                    // Redirect to your desired page
                    window.location.href = "cust-destination";
                }
            }, 1000);
        }

        // Call countdown function when the page loads
        window.onload = function() {
            countdown();
        };
    </script>
</body>
</html>