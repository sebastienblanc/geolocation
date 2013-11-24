package org.grails.plugin.geolocation;

import org.codehaus.groovy.grails.commons.GrailsApplication;
import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LatLngConfig;
import com.javadocmd.simplelatlng.util.LengthUnit;
import org.grails.plugin.geolocation.utils.GeoUtils;

class GeolocationService {
	def grailsApplication

    double distance(GeoPosition positionFrom, GeoPosition positionTo) {
		LatLngTool.distance(GeoUtils.convertGeopositionToLatLng(positionFrom), GeoUtils.convertGeopositionToLatLng(positionTo),getLengthUnit())
    }
	
	boolean isInRange(GeoPosition position,GeoPosition referencePosition, double range){
		double distance = distance(position, referencePosition)
		return distance<range
	}
	
	private LengthUnit getLengthUnit(){
		if(grailsApplication.config.geolocation.length.unit){
			return LengthUnit.valueOf(grailsApplication.config.geolocation.length.unit)
		}
		return LengthUnit.KILOMETER
	}
}
