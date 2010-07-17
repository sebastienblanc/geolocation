<head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />

<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>

<script type="text/javascript">
var map;

function initialize() {
var latlng = new google.maps.LatLng(${session.position.coords.latitude},${session.position.coords.longitude});
var myOptions = {
zoom: 8,
center: latlng,
mapTypeId: google.maps.MapTypeId.ROADMAP
};
map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);


var marker = new google.maps.Marker({
position: latlng,
map: map,
title:"test"
});


}

</script>

</head>

<body onload="initialize()">

<div id="map_canvas" style="width:100%; height:100%"></div>

</body>