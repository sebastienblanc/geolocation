<script type="text/javascript">
function foundLocation(position) { 
var objx = {timestamp:position.timestamp,coords:{latitude:position.coords.latitude,longitude:position.coords.longitude,accuracy:position.coords.accuracy,speed:position.coords.speed}}; 
var jsonPos = JSON.stringify(objx); 
${remoteFunction(controller: 'geolocation',action:'setGeoPosition',params:'\'val=\' + jsonPos')} } 
navigator.geolocation.getCurrentPosition(foundLocation); 
</script>