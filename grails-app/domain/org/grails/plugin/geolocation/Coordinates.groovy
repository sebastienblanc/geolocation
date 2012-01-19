package org.grails.plugin.geolocation

class Coordinates {
    double latitude
    double longitude
    double altitude
    double accuracy
    double altitudeAccuracy
    double heading
    double speed 
	
    static belongsTo = [position:GeoPosition]
	
    static constraints = {
	latitude(nullable:true)
	longitude(nullable:true)
	altitude(nullable:true)
	accuracy(nullable:true)
	altitudeAccuracy(nullable:true)
	heading(nullable:true)
	speed(nullable:true)
    }  
}
