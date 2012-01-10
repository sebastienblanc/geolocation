import geolocation.GeolocationService;

import org.grails.plugins.geolocation.GeoPosition
class GeolocationGrailsPlugin {
    // the plugin version
    def version = "0.3"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Sebastien Blanc"
    def authorEmail = "scm.blanc@gmail.com"
    def title = "Geolocation support"
    def description = '''\\
This plugin adds HTML5 geolocation support and offers some utlity methods to calculate distances and range checks
'''
    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/geolocation"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

	
    def doWithDynamicMethods = { ctx ->
		GeolocationService service =  applicationContext.getBean('geolocationService')
		
        GeoPosition.metaClass.distanceFrom = {position ->
        	service.distance(delegate, position)
		}
		GeoPosition.metaClass.isInRange = {position, range ->
			service.isInRange(delegate, position,range)
		}
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
