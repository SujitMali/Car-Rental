<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Reverse Geocoding</title>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>

    <link rel="stylesheet" type="text/css" href="./style.css" />
    <style>
    /* 
 * Always set the map height explicitly to define the size of the div element
 * that contains the map. 
 */
#map {
  height: 100%;
}

/* 
 * Optional: Makes the sample page fill the window. 
 */
html,
body {
  height: 100%;
  margin: 0;
  padding: 0;
}

#floating-panel {
  position: absolute;
  top: 10px;
  left: 25%;
  z-index: 5;
  background-color: #fff;
  padding: 5px;
  border: 1px solid #999;
  text-align: center;
  font-family: "Roboto", "sans-serif";
  line-height: 30px;
  padding-left: 10px;
}

#floating-panel {
  position: absolute;
  top: 5px;
  left: 50%;
  margin-left: -180px;
  width: 350px;
  z-index: 5;
  background-color: #fff;
  padding: 5px;
  border: 1px solid #999;
}

#latlng {
  width: 225px;
}
    </style>
    <script type="module" src="./index.js"></script>
  </head>
  <body>
  
  <%
  	String lat =  (String)request.getAttribute("lat");
    String lng = (String) request.getAttribute("lng");
    String loc = lat+","+lng;
    System.out.println(loc);
  %>
    <div id="floating-panel">
      <input id="latlng" type="text" value="<%=loc%>" />
      <input id="submit" type="button" value="Reverse Geocode" />
    </div>
    <div id="map"></div>

    <!-- 
      The defer attribute causes the callback to execute after the full HTML
      document has been parsed. For non-blocking uses, avoiding race conditions,
      and consistent behavior across browsers, consider loading using Promises.
      See https://developers.google.com/maps/documentation/javascript/load-maps-js-api
      for more information.
      -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB41DRUbKWJHPxaFjMAwdrzWzbVKartNGg&callback=initMap&v=weekly"
      defer
    ></script>
    <script type="text/javascript">
    function initMap() {
    	  const map = new google.maps.Map(document.getElementById("map"), {
    	    zoom: 8,
    	    center: { lat: 40.731, lng: -73.997 },
    	  });
    	  const geocoder = new google.maps.Geocoder();
    	  const infowindow = new google.maps.InfoWindow();

    	  document.getElementById("submit").addEventListener("click", () => {
    	    geocodeLatLng(geocoder, map, infowindow);
    	  });
    	}

    	function geocodeLatLng(geocoder, map, infowindow) {
    	  const input = document.getElementById("latlng").value;
    	  const latlngStr = input.split(",", 2);
    	  const latlng = {
    	    lat: parseFloat(latlngStr[0]),
    	    lng: parseFloat(latlngStr[1]),
    	  };

    	  geocoder
    	    .geocode({ location: latlng })
    	    .then((response) => {
    	      if (response.results[0]) {
    	        map.setZoom(11);

    	        const marker = new google.maps.Marker({
    	          position: latlng,
    	          map: map,
    	        });

    	        infowindow.setContent(response.results[0].formatted_address);
    	        infowindow.open(map, marker);
    	      } else {
    	        window.alert("No results found");
    	      }
    	    })
    	    .catch((e) => window.alert("Geocoder failed due to: " + e));
    	}

    	window.initMap = initMap;
    </script>
  </body>
</html>