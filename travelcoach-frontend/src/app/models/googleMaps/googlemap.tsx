import React from "react";


export default function Googlemap(){
    return(
        <div>

            <title>Simple Marker</title>
            {/* The callback parameter is required, so we use console.debug as a noop */}
            {/*<script async*/}
            {/*        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDY7VjG2kG7Yu2qE1PeVg31cY__laaWZOc&callback=console.debug&libraries=maps,marker&v=beta">*/}
            {/*</script>*/}

            <iframe
                width="600"
                height="450"

                loading="lazy"
                allowFullScreen
                referrerPolicy="no-referrer-when-downgrade"
                src="https://www.google.com/maps/embed/v1/place?key=AIzaSyDY7VjG2kG7Yu2qE1PeVg31cY__laaWZOc
                 &q=Woenselsestraat+306,Eindhoven+NL">
            </iframe>


            {/*<gmp-map center="51.423248291015625,5.462212562561035" zoom="14" map-id="DEMO_MAP_ID">*/}
            {/*    <gmp-advanced-marker position="51.423248291015625,5.462212562561035"*/}
            {/*                         title="My location"></gmp-advanced-marker>*/}
            {/*</gmp-map>*/}

        </div>
    )
};