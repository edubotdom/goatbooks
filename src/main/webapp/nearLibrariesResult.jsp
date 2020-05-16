<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/nearLibrariesResult.css">
<link rel="stylesheet" href="css/cabecera.css">
<head>
<meta name="viewport" content="initial-scale=1.0, width=device-width" />
<script src="http://js.api.here.com/v3/3.0/mapsjs-core.js"
	type="text/javascript" charset="utf-8"></script>
<script src="http://js.api.here.com/v3/3.0/mapsjs-service.js"
	type="text/javascript" charset="utf-8"></script>
<script src="http://js.api.here.com/v3/3.0/mapsjs-mapevents.js"
	type="text/javascript" charset="utf-8"></script>
<title>Resultados de la búsqueda</title>
</head>
<body>
	<header>
		<div class="imagen_cabecera">
			<a href="/index.html"><img src="images/Goat Books logo.png"></a>

			<h1 id="titulo">GOATBooks</h1>
		</div>
	</header>
	<div class=busqueda>
		Resultados de la búsqueda las librerías cercanas a la posición
		detallada al rango
		<c:out value="${param.r}" />
	</div>
	<div class="resultados">
		<div id="result2">
			<!--Position information will be inserted here-->
		</div>

		<!-- JAVASCRIPT MAPA -->

		<div style="width: 640px; height: 480px" id="mapContainer">
			<!--Position information will be inserted here--></div>

		
		<script>
			// Initialize the platform object:
			var platform = new H.service.Platform({
				'app_id' : 'eH4E6e9Qf0s9wJhKk3y1',
				'app_code' : 'J9X9Z-6Afj8y_XejA778fg'
			});

			// Obtain the default map types from the platform object
			var maptypes = platform.createDefaultLayers();

			// Instantiate (and display) a map object:
			var map = new H.Map(document.getElementById('mapContainer'),
					maptypes.normal.map, {
						zoom : 12,
						center : {
							lng : -5.944466,
							lat : 37.397834
						}
					});

			// Enable the event system on the map instance:
			var mapEvents = new H.mapevents.MapEvents(map);

			// Add event listeners:
			map.addEventListener('tap', function(evt) {
				// Log 'tap' and 'mouse' events:
				console.log(evt.type, evt.currentPointer.type);
			});

			// Instantiate the default behavior, providing the mapEvents object: 
			var behavior = new H.mapevents.Behavior(mapEvents);

			// Define a variable holding SVG mark-up that defines an icon image:
			var svgMarkup = '<svg width="240" height="24" ' +
      'xmlns="http://www.w3.org/2000/svg">'
					+ '<rect stroke="white" fill="#1b468d" x="1" y="1" width="35" ' +
      'height="22" /><text x="18" y="18" font-size="12pt" ' +
      'font-family="Arial" font-weight="bold" text-anchor="middle" ' +
      'fill="white">BIB</text></svg>';

			// Create an icon, an object holding the latitude and longitude, and a marker:
			var icon = new H.map.Icon(svgMarkup), coords = {
				lng : -5.944466,
				lat : 37.397834
			}, marker = new H.map.Marker(coords, {
				icon : icon
			});

			// Add the marker to the map and center the map at the location of the marker:
			map.addObject(marker);
			//map.setCenter(coords);
		</script>

		<script type="text/javascript">
			var svgMarkup2 = '<svg width="140" height="30" ' +
    'xmlns="http://www.w3.org/2000/svg">'
					+ '<rect stroke="red" fill="#FF0000" x="1" y="1" width="75" ' +
    'height="22" /><text x="37" y="18" font-size="10pt" ' +
    'font-family="Arial" font-weight="bold" text-anchor="middle" ' +
    'fill="white">ESTA AQUI</text></svg>';
			function showPosition() {
				if (navigator.geolocation) {
					navigator.geolocation
							.getCurrentPosition(function(position) {
								coordsUsu = {
									lat : position.coords.latitude,
									lng : position.coords.longitude
								};
								map.setCenter(coordsUsu);

								var icon2 = new H.map.Icon(svgMarkup2), marker2 = new H.map.Marker(
										coordsUsu, {
											icon : icon2
										});
								map.addObject(marker2);
							});
				} else {
					alert("Sorry, your browser does not support HTML5 geolocation.");
				}
			}

			function anadirMapa(lat, lng) {
				var svgMarkup = '<svg width="240" height="24" ' +
		      'xmlns="http://www.w3.org/2000/svg">'
						+ '<rect stroke="white" fill="#1b468d" x="1" y="1" width="35" ' +
		      'height="22" /><text x="18" y="18" font-size="12pt" ' +
		      'font-family="Arial" font-weight="bold" text-anchor="middle" ' +
		      'fill="white">BIB</text></svg>';
				var libLat = lat;
				var libLng = lng;
				coordsLib = {
					lat : libLat,
					lng : libLng
				};
				var libIcon = new H.map.Icon(svgMarkup), coords = {
					lng : libLng,
					lat : libLat
				}, libMarker = new H.map.Marker(coordsLib, {
					icon : libIcon
				});
				map.addObject(libMarker);
			}
		</script>

		
		<button id="boton" type="button" onclick="showPosition();">¡Localízate
			en el mapa!</button>

		<c:forEach items="${requestScope.libraries}" var="libraries">
			<span>Título de la librería: <c:out value="${libraries.title}" /></span>
			<br />
			<span>Localización de la librería: <c:out
					value="${libraries.position}" /></span>
			<br />
			<span>Latitud de la librería: <c:out
					value="${libraries.position[0]}" /></span>
			<br />
			<span>Longitud de la librería: <c:out
					value="${libraries.position[1]}" /></span>
			<br />
			<script>
				anadirMapa("${libraries.position[0]}",
						"${libraries.position[1]}");
			</script>
			<br />
		</c:forEach>


	</div>
</body>
</html>