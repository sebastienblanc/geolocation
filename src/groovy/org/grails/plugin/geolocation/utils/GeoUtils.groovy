package org.grails.plugin.geolocation.utils

import org.grails.plugin.geolocation.GeoPosition
import com.javadocmd.simplelatlng.LatLng;

class GeoUtils {
	static final String DEFAULT_LENGTH_UNIT = "KILOMETER"
	
	static LatLng  convertGeopositionToLatLng(GeoPosition geoposition){
		return new LatLng(geoposition.coords.latitude, geoposition.coords.longitude)
	}
}
