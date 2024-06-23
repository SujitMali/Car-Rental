<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Rating Form</title>
    <style>
        body,
        html {
            height: 100%;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            text-align: center;
        }

        select {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        select:focus {
            outline: none;
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }

        #thankYouMessage {
            display: none;
        }
    </style>
</head>

<body>
    <div class="container">
        <h2>Rate Our Vehicle</h2>
        <form id="ratingForm" action="afterRating" method="post">
            <div class="rating">
                <select name="rating" id="ratingDropdown">
                    <option value="">Select Rating</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </div>
            <button type="submit">Submit Rating</button>
        </form>
        
    </div>
    
</body>

</html>