<script type="text/javascript">
function foundLocation(position)
	{
	var jsonPos =  JSON.stringify(position);
      ${remoteFunction(controller: 'geolocation',action:'setGeoPosition',params:'\'val=\' + jsonPos')}
}   


navigator.geolocation.getCurrentPosition(foundLocation);

</script>