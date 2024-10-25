Leaflet Routing Machine / OpenRoute Service
NOTE: As of the latest commit, this is a preliminary implementation. For example, there is NO Browserfy implementation at this time, as is the norm for other extentions of the Leaflet Routing Machine.

Author: James G. Willmore

License: Apache 2.0

Extends Leaflet Routing Machine with support for OpenRoute Service routing API.

Some brief instructions follow below, but the Leaflet Routing Machine tutorial on alternative routers is recommended.

Installing
Put the script L.Routing.OpenRouteService.js after Leaflet and Leaflet Routing Machine has been loaded.

Using
There's a single class exported by this module, L.Routing.OpenRouteService. It implements the IRouter interface. Use it to replace Leaflet Routing Machine's default OSRM router implementation:

L.Routing.control({
router: new L.Routing.openrouteservice('api key'),
}).addTo(map);
L.Routing.control({
router: new L.Routing.openrouteserviceV2(
'{{ openserviceroute_key }}',
{
profile: "driving-car",
geometry_simplify: true // Needs to do _decodePolyline and smaller request
}
),
}).addTo(map);
Note that you will need to pass a valid OpenRoute Service api key and options to the constructor.