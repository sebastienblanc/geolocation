package org.grails.plugins.geolocation.utils

import org.grails.plugins.geolocation.GeoPosition;

import com.javadocmd.simplelatlng.LatLng;

class GeoUtils {
	static final String DEFAULT_LENGTH_UNIT = "KILOMETER"
	
	static LatLng  convertGeopositionToLatLng(GeoPosition geoposition){
		return new LatLng(geoposition.coords.latitude, geoposition.coords.longitude)
	}
}
