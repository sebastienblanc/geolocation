package org.grails.plugin.geolocation;

class GeolocationTagLib {
	static namespace = "geolocation"
def locateMe =  {attrs, body ->
  out << render(template:"${pluginContextPath}/grails-app/views/templates/geolocation",model:[attrs:attrs, body:body])

}

def resources =  {attrs, body ->
  out << render(template:"${pluginContextPath}/grails-app/views/templates/resources",model:[attrs:attrs, body:body])

}

def resourcesPrototype =  {attrs, body ->
	out << render(template:"${pluginContextPath}/grails-app/views/templates/resourcesPrototype",model:[attrs:attrs, body:body])
  
  }
  
  def resourcesJquery =  {attrs, body ->
	  out << render(template:"${pluginContextPath}/grails-app/views/templates/resourcesJQuery",model:[attrs:attrs, body:body])
	
	}
  
  

}
