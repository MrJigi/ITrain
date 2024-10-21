Profiel
Uitloggen
Picture
Alle APIs
API Products
Aan de slag
Hulp nodig
API Operations
Search operations
Group by tag

Show URL path

Arrivals
Booked trip
Calamities
Departures
Disruptions
Domestic prices
Domestic prices
Get stations closest to provided coordinates
Journey details
OpenAPI Spec
Single disruption
Single trip
Station disruptions
Stations
Trips
Related Products
Subscribe to below product(s) to receive a subscription key for this API.

Select API: products

API question?
If you have a question or comment about this API, go to the related product (via the Related Products card above) and fill in the contact form on the relevant Product page. The product/API owner will respond ASAP.

Reisinformatie API

API definition
Changelog
Deze API bevat alle reisinformatie bronnen voor de NS App


Contact
M-Lab
mlab@ns.nl
Trips
Try it 
Returns a travel advice for the given parameters

Trips
Request
https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips[?lang][&fromStation][&originUicCode][&originLat][&originLng][&originName][&toStation][&destinationUicCode][&destinationLat][&destinationLng][&destinationName][&viaStation][&viaUicCode][&viaLat][&viaLng][&originWalk][&originBike][&originCar][&destinationWalk][&destinationBike][&destinationCar][&dateTime][&searchForArrival][&departure][&context][&shorterChange][&addChangeTime][&minimalChangeTime][&viaWaitTime][&originAccessible][&travelAssistance][&nsr][&travelAssistanceTransferTime][&accessibilityEquipment1][&accessibilityEquipment2][&searchForAccessibleTrip][&filterTransportMode][&localTrainsOnly][&excludeHighSpeedTrains][&excludeTrainsWithReservationRequired][&product][&discount][&travelClass][&passing][&travelRequestType][&disabledTransportModalities][&firstMileModality][&lastMileModality][&entireTripModality]
Request parameters
Name
In
Required
Type
Description
lang
query
false
string
Language to use for localizing the travel advice. Only a small subset of text is translated, mainly notes. Defaults to Dutch

fromStation
query
false
string
NS station code of the origin station

originUicCode
query
false
string
UIC code of the origin station

originLat
query
false
number
Latitude of the origin location. Should be used together with originLng. If the origin is a station, just provide the uicCode instead of the lat/lng

originLng
query
false
number
Longitude of the origin location. Should be used together with originLat. If the origin is a station, just provide the uicCode instead of the lat/lng

originName
query
false
string
Name of the origin location. Will be returned in the response

toStation
query
false
string
NS station code of the destination station

destinationUicCode
query
false
string
UIC code of the destination station

destinationLat
query
false
number
Latitude of the destination location. Should be used together with destinationLng. If the destination is a station, just provide the uicCode instead of the lat/lng

destinationLng
query
false
number
Longitude of the destination location. Should be used together with destinationLat. If the destination is a station, just provide the uicCode instead of the lat/lng

destinationName
query
false
string
Name of the destination location. Will be returned in the response

viaStation
query
false
string
NS station code of the via station

viaUicCode
query
false
string
UIC code of the via station

viaLat
query
false
number
Latitude of the via location. Should be used together with viaLng. Will only be used for door-to-door trips. If the via location is a station, just provide the uicCode instead of the lat/lng.

viaLng
query
false
number
Longitude of the via location. Should be used together with viaLat. Will only be used for door-to-door trips. If the via location is a station, just provide the uicCode instead of the lat/lng.

originWalk
query
false
boolean
Return trip advices with walking options to start travel from origin to a train station (first mile)

originBike
query
false
boolean
Return trip advices with biking options to start travel from origin to a train station (first mile)

originCar
query
false
boolean
Return trip advices with car options to start travel from origin to a train station (first mile)

destinationWalk
query
false
boolean
Return trip advices with walking options to finish travel to the destination (last mile)

destinationBike
query
false
boolean
Return trip advices with biking options to finish travel to the destination (last mile)

destinationCar
query
false
boolean
Return trip advices with car options to finish travel to the destination (last mile)

dateTime
query
false
string
Format - date-time (as date-time in RFC3339). Datetime that the user want to depart from his origin or or arrive at his destination

searchForArrival
query
false
boolean
If set, the date and time parameters specify the arrival time for the trip search instead of the departure time

departure
query
false
boolean
Use searchForArrival parameter instead

context
query
false
string
Parameter specifying that the user wants a next or previous page of the results

shorterChange
query
false
boolean
Changes the CHANGE_NOT_POSSIBLE status to CHANGE_COULD_BE_POSSIBLE if the traveler can walk twice as fast. Deprecated: the functionality is removed because we do not want to suggest travelers to run.

addChangeTime
query
false
integer
Format - int32. Extra time in minutes required at all transfers to change trains.

minimalChangeTime
query
false
integer
Format - int32. Use addChangeTime instead

viaWaitTime
query
false
integer
Format - int32. Waiting time in minutes at the via location, exclusive of transfer time

originAccessible
query
false
boolean
Use travelAssistance parameter instead

travelAssistance
query
false
boolean
Return trip advices from the trip assistance booking engine PAS

nsr
query
false
integer
Format - int32. NSR number for the customer making this request. Since the replacement of the NSRA backend in Reisinfo with PAS, we do not use the NSR number anymore

travelAssistanceTransferTime
query
false
integer
Format - int32. Use addChangeTime parameter instead

accessibilityEquipment1
query
false
string
Accessibility equipment to use when searching for trip assistance options (AVG/PAS)

accessibilityEquipment2
query
false
string
Accessibility equipment to use when searching for trip assistance options (AVG/PAS)

searchForAccessibleTrip
query
false
boolean
Return trip advices that are accessible. (might be bookable too)

filterTransportMode
query
false
string
Could be used to filter for REGIONAL_TRAINS. This parameter is replaced by the localTrainsOnly parameter

localTrainsOnly
query
false
boolean
Search only for local train options, i.e. sprinter/sneltrein/stoptrein

excludeHighSpeedTrains
query
false
boolean
Exclude high speed trains from results (including those with a required reservation)

excludeTrainsWithReservationRequired
query
false
boolean
Exclude trains for domestic trips that require a reservation (e.g. Eurostar)

product
query
false
string
Name of the product that will be used in travel

discount
query
false
string
Discount of travel to use when calculating product prices

travelClass
query
false
integer
Format - int32. Class of travel to use when calculating product prices

passing
query
false
boolean
Show intermediate stops that the journey passes but doesn't stop at (only works for source:HARP not multi-modal trips from negentwee)

travelRequestType
query
false
string
directionsOnly only plans a google directions (walk/bike/car) advice

disabledTransportModalities
query
false
array
exclude modalities from trip search

firstMileModality
query
false
string
Shared modality origin filter to use when querying trips

lastMileModality
query
false
string
Shared modality destination filter to use when querying trips

entireTripModality
query
false
string
Shared modality total trip filter to use when querying trips

Request headers
Name
Required
Type
Description
Authorization
false
string
Account details to use when querying trip assistance options

Response: 200 OK
A traveladvice with zero or more trips


application/json
ApiV3TripsGet200ApplicationJsonResponse


Name
Required
Type
Description
[]
true
TravelAdvice[]
default
default - json
 Copy
[{
    "source": "HARP",
    "trips": [{
        "uid": "string",
        "ctxRecon": "string",
        "sourceCtxRecon": "string",
        "plannedDurationInMinutes": 0,
        "actualDurationInMinutes": 0,
        "transfers": 0,
        "status": "CANCELLED",
        "primaryMessage": {
            "title": "string",
            "nesProperties": {
                "color": "string",
                "type": "string",
                "icon": "string",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "string"
                }
            },
            "message": {
                "id": "string",
                "externalId": "string",
                "head": "string",
                "text": "string",
                "lead": "string",
                "routeIdxFrom": 0,
                "routeIdxTo": 0,
                "type": "MAINTENANCE",
                "nesProperties": {
                    "color": "string",
                    "type": "string",
                    "icon": "string",
                    "scope": "LEG_LINE",
                    "styles": {
                        "type": "string"
                    }
                },
                "startDate": "string",
                "endDate": "string",
                "startTime": "string",
                "endTime": "string",
                "phase": "PHASE_1A"
            },
            "type": "TRIP_CANCELLED"
        },
        "messages": [{
            "id": "string",
            "externalId": "string",
            "head": "string",
            "text": "string",
            "lead": "string",
            "routeIdxFrom": 0,
            "routeIdxTo": 0,
            "type": "MAINTENANCE",
            "nesProperties": {
                "color": "string",
                "type": "string",
                "icon": "string",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "string"
                }
            },
            "startDate": "string",
            "endDate": "string",
            "startTime": "string",
            "endTime": "string",
            "phase": "PHASE_1A"
        }],
        "legs": [{
            "idx": "string",
            "name": "string",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "string",
            "partCancelled": true,
            "cancelled": true,
            "changePossible": true,
            "alternativeTransport": true,
            "journeyDetailRef": "string",
            "origin": {
                "name": "string",
                "lng": 0,
                "lat": 0,
                "city": "string",
                "countryCode": "string",
                "uicCode": "string",
                "stationCode": "string",
                "type": "STATION",
                "prognosisType": "string",
                "plannedTimeZoneOffset": 0,
                "plannedDateTime": "string",
                "actualTimeZoneOffset": 0,
                "actualDateTime": "string",
                "plannedTrack": "string",
                "actualTrack": "string",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKIN",
                "travelAssistanceBookingInfo": {
                    "name": "string",
                    "tripLegIndex": "string",
                    "stationUic": "string",
                    "serviceTypeIds": ["string"],
                    "defaultAssistanceValue": true,
                    "canChangeAssistance": true,
                    "message": "string"
                },
                "travelAssistanceMeetingPoints": ["string"],
                "travelAssistanceMeetingPointDetails": [{
                    "name": "string",
                    "minutesBefore": 0
                }],
                "notes": [{
                    "value": "string",
                    "shortValue": "string",
                    "accessibilityValue": "string",
                    "key": "string",
                    "noteType": "UNKNOWN",
                    "priority": 0,
                    "routeIdxFrom": 0,
                    "routeIdxTo": 0,
                    "link": {
                        "uri": "string"
                    },
                    "isPresentationRequired": true,
                    "category": "PLATFORM_INFORMATION",
                    "nesProperties": {
                        "color": "string",
                        "type": "string",
                        "icon": "string",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "string"
                        }
                    }
                }],
                "quayCode": "string"
            },
            "destination": {
                "name": "string",
                "lng": 0,
                "lat": 0,
                "city": "string",
                "countryCode": "string",
                "uicCode": "string",
                "stationCode": "string",
                "type": "STATION",
                "prognosisType": "string",
                "plannedTimeZoneOffset": 0,
                "plannedDateTime": "string",
                "actualTimeZoneOffset": 0,
                "actualDateTime": "string",
                "plannedTrack": "string",
                "actualTrack": "string",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKIN",
                "travelAssistanceBookingInfo": {
                    "name": "string",
                    "tripLegIndex": "string",
                    "stationUic": "string",
                    "serviceTypeIds": ["string"],
                    "defaultAssistanceValue": true,
                    "canChangeAssistance": true,
                    "message": "string"
                },
                "travelAssistanceMeetingPoints": ["string"],
                "travelAssistanceMeetingPointDetails": [{
                    "name": "string",
                    "minutesBefore": 0
                }],
                "notes": [{
                    "value": "string",
                    "shortValue": "string",
                    "accessibilityValue": "string",
                    "key": "string",
                    "noteType": "UNKNOWN",
                    "priority": 0,
                    "routeIdxFrom": 0,
                    "routeIdxTo": 0,
                    "link": {
                        "uri": "string"
                    },
                    "isPresentationRequired": true,
                    "category": "PLATFORM_INFORMATION",
                    "nesProperties": {
                        "color": "string",
                        "type": "string",
                        "icon": "string",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "string"
                        }
                    }
                }],
                "quayCode": "string"
            },
            "product": {
                "displayName": "string",
                "type": "TRAIN",
                "number": "string",
                "operatorCode": "string",
                "operatorName": "string",
                "categoryCode": "string",
                "longCategoryName": "string",
                "shortCategoryName": "string",
                "operatorAdministrativeCode": 0,
                "productType": "string"
            },
            "sharedModality": {
                "provider": "string",
                "name": "string",
                "availability": true,
                "nearByMeMapping": "OV_FIETS",
                "planIcon": "string"
            },
            "notes": [{
                "value": "string",
                "shortValue": "string",
                "accessibilityValue": "string",
                "key": "string",
                "noteType": "UNKNOWN",
                "priority": 0,
                "routeIdxFrom": 0,
                "routeIdxTo": 0,
                "link": {
                    "uri": "string"
                },
                "isPresentationRequired": true,
                "category": "PLATFORM_INFORMATION",
                "nesProperties": {
                    "color": "string",
                    "type": "string",
                    "icon": "string",
                    "scope": "LEG_LINE",
                    "styles": {
                        "type": "string"
                    }
                }
            }],
            "messages": [{
                "id": "string",
                "externalId": "string",
                "head": "string",
                "text": "string",
                "lead": "string",
                "routeIdxFrom": 0,
                "routeIdxTo": 0,
                "type": "MAINTENANCE",
                "nesProperties": {
                    "color": "string",
                    "type": "string",
                    "icon": "string",
                    "scope": "LEG_LINE",
                    "styles": {
                        "type": "string"
                    }
                },
                "startDate": "string",
                "endDate": "string",
                "startTime": "string",
                "endTime": "string",
                "phase": "PHASE_1A"
            }],
            "transferMessages": [{
                "message": "string",
                "accessibilityMessage": "string",
                "type": "IMPOSSIBLE_TRANSFER",
                "messageNesProperties": {
                    "color": "string",
                    "type": "string",
                    "icon": "string",
                    "scope": "LEG_LINE",
                    "styles": {
                        "type": "string"
                    }
                },
                "iconNesProperties": {
                    "color": "string",
                    "type": "string",
                    "icon": "string",
                    "scope": "LEG_LINE",
                    "styles": {
                        "type": "string"
                    }
                }
            }],
            "stops": [{
                "uicCode": "string",
                "name": "string",
                "lat": 0,
                "lng": 0,
                "countryCode": "string",
                "notes": [{
                    "value": "string",
                    "key": "string",
                    "type": "U",
                    "priority": 0
                }],
                "routeIdx": 0,
                "departurePrognosisType": "string",
                "plannedDepartureDateTime": "string",
                "plannedDepartureTimeZoneOffset": 0,
                "actualDepartureDateTime": "string",
                "actualDepartureTimeZoneOffset": 0,
                "plannedArrivalDateTime": "string",
                "plannedArrivalTimeZoneOffset": 0,
                "actualArrivalDateTime": "string",
                "actualArrivalTimeZoneOffset": 0,
                "plannedPassingDateTime": "string",
                "actualPassingDateTime": "string",
                "arrivalPrognosisType": "string",
                "actualDepartureTrack": "string",
                "plannedDepartureTrack": "string",
                "plannedArrivalTrack": "string",
                "actualArrivalTrack": "string",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": true,
                "borderStop": true,
                "passing": true,
                "quayCode": "string"
            }],
            "steps": [{
                "text": {
                    "color": "string",
                    "text": "string",
                    "accessibilityText": "string",
                    "backgroundColor": "string",
                    "styles": {
                        "strikethrough": true,
                        "bold": true
                    }
                },
                "duration": {
                    "color": "string",
                    "text": "string",
                    "accessibilityText": "string",
                    "backgroundColor": "string",
                    "styles": {
                        "strikethrough": true,
                        "bold": true
                    }
                },
                "icon": {
                    "color": "string",
                    "icon": "string",
                    "backgroundColor": "string"
                },
                "line": {
                    "color": "string",
                    "styles": {
                        "dashed": true
                    }
                }
            }],
            "coordinates": [
                [0]
            ],
            "crowdForecast": "UNKNOWN",
            "bicycleSpotCount": 0,
            "punctuality": 0,
            "crossPlatformTransfer": true,
            "shorterStock": true,
            "changeCouldBePossible": true,
            "shorterStockWarning": "string",
            "shorterStockClassification": "BUSY",
            "journeyDetail": [{
                "type": "BTM",
                "link": {
                    "uri": "string"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 0,
            "travelAssistanceDeparture": {
                "name": "string",
                "tripLegIndex": "string",
                "stationUic": "string",
                "serviceTypeIds": ["string"],
                "defaultAssistanceValue": true,
                "canChangeAssistance": true,
                "message": "string"
            },
            "travelAssistanceArrival": {
                "name": "string",
                "tripLegIndex": "string",
                "stationUic": "string",
                "serviceTypeIds": ["string"],
                "defaultAssistanceValue": true,
                "canChangeAssistance": true,
                "message": "string"
            },
            "overviewPolyLine": [{
                "lat": 0,
                "lng": 0
            }],
            "nesProperties": {
                "color": "string",
                "type": "string",
                "icon": "string",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "string"
                }
            },
            "duration": {
                "value": "string",
                "accessibilityValue": "string",
                "nesProperties": {
                    "color": "string",
                    "type": "string",
                    "icon": "string",
                    "scope": "LEG_LINE",
                    "styles": {
                        "type": "string"
                    }
                }
            },
            "preSteps": [{
                "text": {
                    "color": "string",
                    "text": "string",
                    "accessibilityText": "string",
                    "backgroundColor": "string",
                    "styles": {
                        "strikethrough": true,
                        "bold": true
                    }
                },
                "duration": {
                    "color": "string",
                    "text": "string",
                    "accessibilityText": "string",
                    "backgroundColor": "string",
                    "styles": {
                        "strikethrough": true,
                        "bold": true
                    }
                },
                "icon": {
                    "color": "string",
                    "icon": "string",
                    "backgroundColor": "string"
                },
                "line": {
                    "color": "string",
                    "styles": {
                        "dashed": true
                    }
                }
            }],
            "postSteps": [{
                "text": {
                    "color": "string",
                    "text": "string",
                    "accessibilityText": "string",
                    "backgroundColor": "string",
                    "styles": {
                        "strikethrough": true,
                        "bold": true
                    }
                },
                "duration": {
                    "color": "string",
                    "text": "string",
                    "accessibilityText": "string",
                    "backgroundColor": "string",
                    "styles": {
                        "strikethrough": true,
                        "bold": true
                    }
                },
                "icon": {
                    "color": "string",
                    "icon": "string",
                    "backgroundColor": "string"
                },
                "line": {
                    "color": "string",
                    "styles": {
                        "dashed": true
                    }
                }
            }]
        }],
        "overviewPolyLine": [{
            "lat": 0,
            "lng": 0
        }],
        "crowdForecast": "UNKNOWN",
        "punctuality": 0,
        "optimal": true,
        "fareRoute": {
            "routeId": "string",
            "origin": {
                "varCode": 0,
                "name": "string"
            },
            "destination": {
                "varCode": 0,
                "name": "string"
            }
        },
        "fares": [{
            "priceInCents": 0,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "priceInCentsExcludingSupplement": 0,
            "discountType": "NO_DISCOUNT",
            "supplementInCents": 0,
            "link": "string"
        }],
        "fareLegs": [{
            "origin": {
                "name": "string",
                "lng": 0,
                "lat": 0,
                "city": "string",
                "countryCode": "string",
                "uicCode": "string",
                "stationCode": "string",
                "type": "STATION",
                "prognosisType": "string",
                "plannedTimeZoneOffset": 0,
                "plannedDateTime": "string",
                "actualTimeZoneOffset": 0,
                "actualDateTime": "string",
                "plannedTrack": "string",
                "actualTrack": "string",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKIN",
                "travelAssistanceBookingInfo": {
                    "name": "string",
                    "tripLegIndex": "string",
                    "stationUic": "string",
                    "serviceTypeIds": ["string"],
                    "defaultAssistanceValue": true,
                    "canChangeAssistance": true,
                    "message": "string"
                },
                "travelAssistanceMeetingPoints": ["string"],
                "travelAssistanceMeetingPointDetails": [{
                    "name": "string",
                    "minutesBefore": 0
                }],
                "notes": [{
                    "value": "string",
                    "shortValue": "string",
                    "accessibilityValue": "string",
                    "key": "string",
                    "noteType": "UNKNOWN",
                    "priority": 0,
                    "routeIdxFrom": 0,
                    "routeIdxTo": 0,
                    "link": {
                        "uri": "string"
                    },
                    "isPresentationRequired": true,
                    "category": "PLATFORM_INFORMATION",
                    "nesProperties": {
                        "color": "string",
                        "type": "string",
                        "icon": "string",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "string"
                        }
                    }
                }],
                "quayCode": "string"
            },
            "destination": {
                "name": "string",
                "lng": 0,
                "lat": 0,
                "city": "string",
                "countryCode": "string",
                "uicCode": "string",
                "stationCode": "string",
                "type": "STATION",
                "prognosisType": "string",
                "plannedTimeZoneOffset": 0,
                "plannedDateTime": "string",
                "actualTimeZoneOffset": 0,
                "actualDateTime": "string",
                "plannedTrack": "string",
                "actualTrack": "string",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKIN",
                "travelAssistanceBookingInfo": {
                    "name": "string",
                    "tripLegIndex": "string",
                    "stationUic": "string",
                    "serviceTypeIds": ["string"],
                    "defaultAssistanceValue": true,
                    "canChangeAssistance": true,
                    "message": "string"
                },
                "travelAssistanceMeetingPoints": ["string"],
                "travelAssistanceMeetingPointDetails": [{
                    "name": "string",
                    "minutesBefore": 0
                }],
                "notes": [{
                    "value": "string",
                    "shortValue": "string",
                    "accessibilityValue": "string",
                    "key": "string",
                    "noteType": "UNKNOWN",
                    "priority": 0,
                    "routeIdxFrom": 0,
                    "routeIdxTo": 0,
                    "link": {
                        "uri": "string"
                    },
                    "isPresentationRequired": true,
                    "category": "PLATFORM_INFORMATION",
                    "nesProperties": {
                        "color": "string",
                        "type": "string",
                        "icon": "string",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "string"
                        }
                    }
                }],
                "quayCode": "string"
            },
            "operator": "string",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 0,
                "priceInCentsExcludingSupplement": 0,
                "supplementInCents": 0,
                "buyableTicketPriceInCents": 0,
                "buyableTicketPriceInCentsExcludingSupplement": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "GEEN",
                "travelClass": "FIRST_CLASS",
                "discountType": "NO_DISCOUNT",
                "link": "string"
            }]
        }],
        "productFare": {
            "priceInCents": 0,
            "priceInCentsExcludingSupplement": 0,
            "supplementInCents": 0,
            "buyableTicketPriceInCents": 0,
            "buyableTicketPriceInCentsExcludingSupplement": 0,
            "buyableTicketSupplementPriceInCents": 0,
            "product": "GEEN",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT",
            "link": "string"
        },
        "fareOptions": {
            "isInternationalBookable": true,
            "isInternational": true,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": true,
            "supplementsBasedOnSelectedFare": [{
                "supplementPriceInCents": 0,
                "fromUICCode": "string",
                "toUICCode": "string",
                "link": {
                    "uri": "string"
                }
            }],
            "reasonEticketNotBuyable": {
                "reason": "UNKNOWN_PRICE",
                "description": "string"
            },
            "salesOptions": [{
                "type": "NS_DEAL_DISCOUNT",
                "permilleFullTariff": 0,
                "priceInCents": 0,
                "originalPrice": 0,
                "betterOption": true,
                "recommendationText": "string",
                "labelText": "string"
            }]
        },
        "bookingUrl": {
            "uri": "string"
        },
        "nsiLink": {
            "url": "string",
            "showInternationalBanner": true
        },
        "type": "NS",
        "shareUrl": {
            "uri": "string"
        },
        "realtime": true,
        "travelAssistanceInfo": {
            "termsAndConditionsLink": "string",
            "tripRequestId": 0,
            "isAssistanceRequired": true
        },
        "routeId": "string",
        "registerJourney": {
            "url": "string",
            "searchUrl": "string",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": true,
            "availability": {
                "seats": true,
                "numberOfSeats": 0,
                "bicycle": true,
                "numberOfBicyclePlaces": 0
            }
        },
        "eco": {
            "co2kg": 0
        },
        "modalityListItems": [{
            "name": "string",
            "nameNesProperties": {
                "color": "string",
                "type": "string",
                "icon": "string",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "string"
                }
            },
            "iconNesProperties": {
                "color": "string",
                "type": "string",
                "icon": "string",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "string"
                }
            },
            "actualTrack": "string",
            "accessibilityName": "string"
        }],
        "labelListItems": [{
            "label": "string",
            "stickerType": "string",
            "salesOptionType": "NS_DEAL_DISCOUNT"
        }]
    }],
    "travelAdviceMessage": {
        "title": "string",
        "nesProperties": {
            "color": "string",
            "type": "string",
            "icon": "string",
            "scope": "LEG_LINE",
            "styles": {
                "type": "string"
            }
        },
        "disruptionIds": ["string"]
    },
    "scrollRequestBackwardContext": "string",
    "scrollRequestForwardContext": "string",
    "message": "string"
}]
Response: 400 Bad Request
Bad request. One or more parameters are invalid


application/json
APIError


Name
Required
Type
Description
timestamp
true
string (date-time)
code
true
integer (int32)
message
true
string
path
true
string
exception
false
string
errors
false
LocalizedErrorDetail[]
requestId
true
string
default
default - json
 Copy
{
    "timestamp": "string",
    "code": 0,
    "message": "string",
    "path": "string",
    "exception": "string",
    "errors": [{
        "message": "string",
        "arguments": [{}],
        "type": "string",
        "lang": "string"
    }],
    "requestId": "string"
}
Response: 419 User defined status code
Backend system failed in an unrecoverable way.


application/json
APIError


Name
Required
Type
Description
timestamp
true
string (date-time)
code
true
integer (int32)
message
true
string
path
true
string
exception
false
string
errors
false
LocalizedErrorDetail[]
requestId
true
string
default
default - json
 Copy
{
    "timestamp": "string",
    "code": 0,
    "message": "string",
    "path": "string",
    "exception": "string",
    "errors": [{
        "message": "string",
        "arguments": [{}],
        "type": "string",
        "lang": "string"
    }],
    "requestId": "string"
}
Definitions
Name
Description
Coordinate
Duration
Eco
EticketNotBuyableReason
FareLeg
FareLegStop
FareRoute
JourneyDetailLink
JourneyRegistrationParameters
LabelListItem
Leg
Link
MeetingPointDetails
Message
ModalityListItem
NesIcon
NesLine
NesLineStyles
NesProperties
NesText
NesTextStyles
Note
notes is a List of Lists because this allows frontend clients to render the elements of every nested List on the same row

NsiLink
PrimaryMessage
Most important message to display

ProductInterface
RegistrationAvailability
SalesOption
ServiceBookingInfo
SharedModality
Step
Stop
StopNote
Styles
TransferMessage
TravelAdvice
TravelAdviceMessage
Possible Message about maintenance in origin and destination station

TravelAssistanceInfo
Trip
TripFareOptions
TripFareSupplement
TripOriginDestination
TripSalesFare
TripTravelFare
APIError
LocalizedErrorDetail
ApiV3TripsGet200ApplicationJsonResponse
Coordinate


Name
Required
Type
Description
lat
true
number
lng
true
number
Duration


Name
Required
Type
Description
value
true
string
accessibilityValue
true
string
nesProperties
true
NesProperties
Eco


Name
Required
Type
Description
co2kg
true
number (double)
EticketNotBuyableReason


Name
Required
Type
Description
reason
true
string
description
false
string
FareLeg


Name
Required
Type
Description
origin
true
TripOriginDestination
destination
true
TripOriginDestination
operator
false
string
productTypes
true
string[]
fares
true
TripTravelFare[]
FareLegStop


Name
Required
Type
Description
varCode
true
integer (int32)
name
false
string
FareRoute


Name
Required
Type
Description
routeId
false
string
origin
true
FareLegStop
destination
true
FareLegStop
JourneyDetailLink


Name
Required
Type
Description
type
true
string
link
true
Link
JourneyRegistrationParameters


Name
Required
Type
Description
url
false
string (uri)
searchUrl
true
string (uri)
status
true
string
bicycleReservationRequired
true
boolean
availability
false
RegistrationAvailability
LabelListItem


Name
Required
Type
Description
label
true
string
stickerType
true
string
salesOptionType
false
string
Leg


Name
Required
Type
Description
idx
false
string
name
false
string
travelType
false
string
direction
false
string
partCancelled
true
boolean
cancelled
true
boolean
changePossible
true
boolean
alternativeTransport
true
boolean
journeyDetailRef
false
string
origin
true
TripOriginDestination
destination
true
TripOriginDestination
product
false
ProductInterface
sharedModality
false
SharedModality
notes
false
Note[]
messages
false
Message[]
transferMessages
false
TransferMessage[]
stops
true
Stop[]
steps
false
Step[]
coordinates
false
array[]
crowdForecast
false
string
bicycleSpotCount
false
integer (int32)
punctuality
false
number (double)
crossPlatformTransfer
false
boolean
shorterStock
false
boolean
changeCouldBePossible
false
boolean
shorterStockWarning
false
string
shorterStockClassification
false
string
journeyDetail
false
JourneyDetailLink[]
reachable
true
boolean
plannedDurationInMinutes
false
integer (int64)
travelAssistanceDeparture
false
ServiceBookingInfo
travelAssistanceArrival
false
ServiceBookingInfo
overviewPolyLine
false
Coordinate[]
nesProperties
false
NesProperties
duration
false
Duration
preSteps
false
Step[]
postSteps
false
Step[]
Link


Name
Required
Type
Description
uri
true
string
MeetingPointDetails


Name
Required
Type
Description
name
true
string
minutesBefore
true
integer (int32)
Message


Name
Required
Type
Description
id
false
string
externalId
false
string
head
false
string
text
false
string
lead
false
string
routeIdxFrom
false
integer (int32)
routeIdxTo
false
integer (int32)
type
false
string
nesProperties
false
NesProperties
startDate
false
string
endDate
false
string
startTime
false
string
endTime
false
string
phase
false
string
ModalityListItem


Name
Required
Type
Description
name
true
string
nameNesProperties
true
NesProperties
iconNesProperties
false
NesProperties
actualTrack
false
string
accessibilityName
true
string
NesIcon


Name
Required
Type
Description
color
true
string
icon
true
string
backgroundColor
false
string
NesLine


Name
Required
Type
Description
color
true
string
styles
false
NesLineStyles
NesLineStyles


Name
Required
Type
Description
dashed
true
boolean
NesProperties


Name
Required
Type
Description
color
true
string
type
false
string
icon
false
string
scope
false
string
styles
false
Styles
NesText


Name
Required
Type
Description
color
true
string
text
true
string
accessibilityText
true
string
backgroundColor
false
string
styles
false
NesTextStyles
NesTextStyles


Name
Required
Type
Description
strikethrough
true
boolean
bold
true
boolean
Note
notes is a List of Lists because this allows frontend clients to render the elements of every nested List on the same row




Name
Required
Type
Description
value
false
string
shortValue
false
string
accessibilityValue
false
string
key
false
string
noteType
false
string
priority
false
integer (int32)
routeIdxFrom
false
integer (int32)
routeIdxTo
false
integer (int32)
link
false
Link
isPresentationRequired
true
boolean
category
false
string
nesProperties
false
NesProperties
NsiLink


Name
Required
Type
Description
url
true
string
NSI journeyplanner url with pre-filled locations and time

showInternationalBanner
true
boolean
Whether to display an NS International banner

PrimaryMessage
Most important message to display




Name
Required
Type
Description
title
true
string
nesProperties
true
NesProperties
message
false
Message
type
true
string
ProductInterface


Name
Required
Type
Description
displayName
false
string
type
true
string
number
false
string
operatorCode
false
string
operatorName
false
string
categoryCode
false
string
longCategoryName
false
string
shortCategoryName
false
string
operatorAdministrativeCode
false
integer (int32)
productType
true
string
RegistrationAvailability


Name
Required
Type
Description
seats
true
boolean
numberOfSeats
false
integer (int32)
bicycle
true
boolean
numberOfBicyclePlaces
false
integer (int32)
SalesOption


Name
Required
Type
Description
type
true
string
permilleFullTariff
false
integer (int32)
priceInCents
false
integer (int32)
originalPrice
false
integer (int32)
betterOption
true
boolean
recommendationText
false
string
labelText
false
string
ServiceBookingInfo


Name
Required
Type
Description
name
true
string
tripLegIndex
true
string
stationUic
false
string
serviceTypeIds
true
string[]
defaultAssistanceValue
true
boolean
canChangeAssistance
true
boolean
message
false
string
SharedModality


Name
Required
Type
Description
provider
true
string
name
false
string
availability
true
boolean
nearByMeMapping
true
string
planIcon
false
string
Step


Name
Required
Type
Description
text
true
NesText
duration
false
NesText
icon
false
NesIcon
line
true
NesLine
Stop


Name
Required
Type
Description
uicCode
false
string
name
false
string
lat
false
number
lng
false
number
countryCode
false
string
notes
true
StopNote[]
routeIdx
false
integer (int32)
departurePrognosisType
false
string
plannedDepartureDateTime
false
string (date-time)
plannedDepartureTimeZoneOffset
false
integer (int32)
actualDepartureDateTime
false
string (date-time)
actualDepartureTimeZoneOffset
false
integer (int32)
plannedArrivalDateTime
false
string (date-time)
plannedArrivalTimeZoneOffset
false
integer (int32)
actualArrivalDateTime
false
string (date-time)
actualArrivalTimeZoneOffset
false
integer (int32)
plannedPassingDateTime
false
string (date-time)
actualPassingDateTime
false
string (date-time)
arrivalPrognosisType
false
string
actualDepartureTrack
false
string
plannedDepartureTrack
false
string
plannedArrivalTrack
false
string
actualArrivalTrack
false
string
departureDelayInSeconds
false
integer (int64)
arrivalDelayInSeconds
false
integer (int64)
cancelled
true
boolean
borderStop
true
boolean
passing
true
boolean
quayCode
false
string
StopNote


Name
Required
Type
Description
value
true
string
key
false
string
type
true
string
priority
false
integer (int32)
Styles


Name
Required
Type
Description
type
true
string
TransferMessage


Name
Required
Type
Description
message
true
string
accessibilityMessage
true
string
type
true
string
messageNesProperties
true
NesProperties
iconNesProperties
false
NesProperties
TravelAdvice


Name
Required
Type
Description
source
true
string
Source system that has generated these travel advices

trips
true
Trip[]
List of trips

travelAdviceMessage
false
TravelAdviceMessage
Possible Message about maintenance in origin and destination station

scrollRequestBackwardContext
false
string
Scroll context to use when scrolling back in time. Can be used in scrollContext query parameter

scrollRequestForwardContext
false
string
Scroll context to use when scrolling forward in time. Can be used in scrollContext query parameter

message
false
string
Optional message indicating why the list of trips is empty.

TravelAdviceMessage
Possible Message about maintenance in origin and destination station




Name
Required
Type
Description
title
true
string
nesProperties
true
NesProperties
disruptionIds
true
string[]
TravelAssistanceInfo


Name
Required
Type
Description
termsAndConditionsLink
false
string (url)
tripRequestId
true
integer (int32)
isAssistanceRequired
true
boolean
Trip


Name
Required
Type
Description
uid
true
string
Unique identifier for this trip

ctxRecon
true
string
Reconstruction context for this trip. Can be used to reconstruct this exact trip with the v3/trips/trip endpoint

sourceCtxRecon
false
string
Reconstruction context for this trip set by the travel advice source system. Can be used to interact follow-up requests with the source system, like booking a trip with travel assistance (NSRA). Can be null if the source doesn't provide a ctxRecon

plannedDurationInMinutes
false
integer (int64)
Planned duration of this trip in minutes

actualDurationInMinutes
false
integer (int64)
Actual duration of this trip in minutes, or the planned duration if no realtime information about this trip is available.

transfers
true
integer (int32)
Number of public transit transfers

status
true
string
Status of this trip

primaryMessage
false
PrimaryMessage
Most important message to display

messages
false
Message[]
List of messages regarding maintenance or disruption that influences this trip.

legs
true
Leg[]
overviewPolyLine
false
Coordinate[]
crowdForecast
false
string
punctuality
false
number (double)
optimal
true
boolean
Whether or not this trip is regarded the best possible option of all returned trips

fareRoute
false
FareRoute
fares
false
TripSalesFare[]
fareLegs
false
FareLeg[]
productFare
false
TripTravelFare
fareOptions
false
TripFareOptions
bookingUrl
false
Link
nsiLink
false
NsiLink
type
true
string
shareUrl
false
Link
realtime
true
boolean
travelAssistanceInfo
false
TravelAssistanceInfo
routeId
false
string
registerJourney
false
JourneyRegistrationParameters
eco
false
Eco
modalityListItems
false
ModalityListItem[]
labelListItems
false
LabelListItem[]
TripFareOptions


Name
Required
Type
Description
isInternationalBookable
true
boolean
isInternational
true
boolean
isEticketBuyable
true
boolean
isPossibleWithOvChipkaart
true
boolean
isTotalPriceUnknown
true
boolean
supplementsBasedOnSelectedFare
false
TripFareSupplement[]
reasonEticketNotBuyable
false
EticketNotBuyableReason
salesOptions
false
SalesOption[]
TripFareSupplement


Name
Required
Type
Description
supplementPriceInCents
true
integer (int32)
fromUICCode
false
string
toUICCode
false
string
link
false
Link
TripOriginDestination


Name
Required
Type
Description
name
false
string
lng
false
number
lat
false
number
city
false
string
countryCode
false
string
uicCode
false
string
stationCode
false
string
type
false
string
prognosisType
false
string
plannedTimeZoneOffset
false
integer (int32)
plannedDateTime
false
string (date-time)
actualTimeZoneOffset
false
integer (int32)
actualDateTime
false
string (date-time)
plannedTrack
false
string
actualTrack
false
string
exitSide
false
string
checkinStatus
false
string
travelAssistanceBookingInfo
false
ServiceBookingInfo
travelAssistanceMeetingPoints
false
string[]
travelAssistanceMeetingPointDetails
false
MeetingPointDetails[]
notes
false
Note[]
quayCode
false
string
TripSalesFare


Name
Required
Type
Description
priceInCents
false
integer (int32)
product
false
string
travelClass
false
string
priceInCentsExcludingSupplement
false
integer (int32)
discountType
false
string
supplementInCents
false
integer (int32)
link
false
string
TripTravelFare


Name
Required
Type
Description
priceInCents
false
integer (int32)
priceInCentsExcludingSupplement
false
integer (int32)
supplementInCents
false
integer (int32)
buyableTicketPriceInCents
false
integer (int32)
buyableTicketPriceInCentsExcludingSupplement
false
integer (int32)
buyableTicketSupplementPriceInCents
false
integer (int32)
product
false
string
travelClass
false
string
discountType
true
string
link
false
string
APIError


Name
Required
Type
Description
timestamp
true
string (date-time)
code
true
integer (int32)
message
true
string
path
true
string
exception
false
string
errors
false
LocalizedErrorDetail[]
requestId
true
string
LocalizedErrorDetail


Name
Required
Type
Description
message
true
string
arguments
true
object[]
type
true
string
lang
true
string
ApiV3TripsGet200ApplicationJsonResponse


Name
Required
Type
Description
[]
true
TravelAdvice[]

Reisinformatie API
 Trips
/api/v3/trips
Authorization 
Subscription key
Primary: ns-app-fork

Parameters 
lang
value
fromStation
Eindhoven
originUicCode
value
originLat
value
originLng
value
originName
value
toStation
Rotterdam
destinationUicCode
value
destinationLat
value
destinationLng
value
destinationName
value
viaStation
value
viaUicCode
value
viaLat
value
viaLng
value
originWalk
false
originBike
false
originCar
false
destinationWalk
false
destinationBike
false
destinationCar
false
dateTime
value
searchForArrival
value
departure
value
context
value
shorterChange
false
addChangeTime
value
minimalChangeTime
value
viaWaitTime
value
originAccessible
value
travelAssistance
false
nsr
value
travelAssistanceTransferTime
value
accessibilityEquipment1
value
accessibilityEquipment2
value
searchForAccessibleTrip
false
filterTransportMode
value
localTrainsOnly
false
excludeHighSpeedTrains
false
excludeTrainsWithReservationRequired
false
product

Select value...
 
discount
NO_DISCOUNT
travelClass
2
passing
false
travelRequestType

DEFAULT
 
disabledTransportModalities
value
firstMileModality
value
lastMileModality
value
entireTripModality
value
 Add parameter
Headers 
Authorization
value

Cache-Control
no-cache
Ocp-Apim-Subscription-Key
••••••••••••••••••••••••••••••••

 Add header
HTTP request 

HTTP
 Reveal secrets
 Copy
GET https://gateway.apiportal.ns.nl/reisinformatie-api/api/v3/trips?fromStation=Eindhoven&toStation=Rotterdam&originWalk=false&originBike=false&originCar=false&destinationWalk=false&destinationBike=false&destinationCar=false&shorterChange=false&travelAssistance=false&searchForAccessibleTrip=false&localTrainsOnly=false&excludeHighSpeedTrains=false&excludeTrainsWithReservationRequired=false&discount=NO_DISCOUNT&travelClass=2&passing=false&travelRequestType=DEFAULT HTTP/1.1

Cache-Control: no-cache
Ocp-Apim-Subscription-Key: ••••••••••••••••••••••••••••••••

HTTP response
HTTP/1.1 200 OK

date: Mon, 21 Oct 2024 08:05:29 GMT
content-type: application/json
content-length: 137644
connection: close
cache-control: max-age=3
via: 1.1 12d69f39c905d1c9441d392eddc25066.cloudfront.net (CloudFront)
x-amzn-requestid: d6d52dc1-24ee-4128-8f28-66ee3eda83f5
x-amzn-remapped-content-length: 137644
x-amz-apigw-id: f_azVHL-joEEV4g=
x-cache: CONFIG_NOCACHE
x-amz-cf-pop: AMS58-P4
alt-svc: h3=":443"; ma=86400
x-amz-cf-id: kxIU0c5IdHmJiqRNQevDUKrSweU9lq75Oqkmdm1ZZyCUiIg-zCWMSg==
correlation-id: d17f320d-7967-4229-af6a-5701ac66928e
access-control-allow-credentials: true
x-azure-ref: 20241021T080528Z-1778f6874c7c2xz2xm9wb3u85800000005rg00000000ha5r
accept-ranges: bytes

{
    "source": "HARP",
    "trips": [{
        "idx": 0,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:06:00+02:00|plannedArrivalTime=2024-10-21T11:40:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1065392917",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:06:00+02:00|plannedArrivalTime=2024-10-21T11:40:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1065392917",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100866@a=128@$A=1@O=Utrecht Centraal@L=1100715@a=128@$202410211006$202410211057$IC 832  $$1$$$$$$§W$A=1@O=Utrecht Centraal@L=1100715@a=128@$A=1@O=Utrecht Centraal@L=1100672@a=128@$202410211057$202410211102$$$1$$$$$$§T$A=1@O=Utrecht Centraal@L=1100672@a=128@$A=1@O=Rotterdam Centraal@L=1100690@a=128@$202410211103$202410211140$IC 2832 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#8451#HIN#0#ECK#458537|458526|458616|458620|0|0|325|458515|1|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 94,
        "actualDurationInMinutes": 90,
        "transfers": 1,
        "status": "NORMAL",
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 832",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Alkmaar",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#779578#TA#0#DA#211024#1S#1101017#1T#859#LS#1101009#LT#1203#PU#784#RT#1#CA#IC#ZE#832#ZB#IC 832  #PC#1#FR#1101017#FT#859#TO#1101009#TT#1203#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:06:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:10:00+0200",
                "plannedTrack": "4",
                "actualTrack": "4",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:57:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:57:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "exitSide": "RIGHT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "832",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Alkmaar",
                        "shortValue": "richting Alkmaar",
                        "accessibilityValue": "richting Alkmaar",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:06:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:10:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "4",
                "plannedDepartureTrack": "4",
                "plannedArrivalTrack": "4",
                "actualArrivalTrack": "4",
                "departureDelayInSeconds": 240,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedDepartureDateTime": "2024-10-21T10:28:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:29:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T10:25:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:27:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 60,
                "arrivalDelayInSeconds": 120,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 13,
                "plannedArrivalDateTime": "2024-10-21T10:57:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:57:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "MEDIUM",
            "bicycleSpotCount": 0,
            "punctuality": 87.5,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#779578#TA#0#DA#211024#1S#1101017#1T#859#LS#1101009#LT#1203#PU#784#RT#1#CA#IC#ZE#832#ZB#IC 832  #PC#1#FR#1101017#FT#859#TO#1101009#TT#1203#&train=832&datetime=2024-10-21T10:06:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 51,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "47 min.",
                "accessibilityValue": "47 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 2832",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Rotterdam Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#772251#TA#0#DA#211024#1S#1100672#1T#1103#LS#1100690#LT#1140#PU#784#RT#1#CA#IC#ZE#2832#ZB#IC 2832 #PC#1#FR#1100672#FT#1103#TO#1100690#TT#1140#",
            "origin": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:03:00+0200",
                "plannedTrack": "11",
                "actualTrack": "11",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:40:00+0200",
                "plannedTrack": "14",
                "actualTrack": "14",
                "exitSide": "RIGHT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "2832",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Rotterdam Centraal",
                        "shortValue": "richting Rotterdam Centraal",
                        "accessibilityValue": "richting Rotterdam Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "2 tussenstops",
                        "shortValue": "2 tussenstops",
                        "accessibilityValue": "2 tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "6 min. overstaptijd",
                "accessibilityMessage": "6 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:03:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "11",
                "plannedDepartureTrack": "11",
                "plannedArrivalTrack": "11",
                "actualArrivalTrack": "11",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400258",
                "name": "Gouda",
                "lat": 52.0175018310547,
                "lng": 4.70444440841675,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedDepartureDateTime": "2024-10-21T11:22:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:21:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400507",
                "name": "Rotterdam Alexander",
                "lat": 51.9519462585449,
                "lng": 4.55361127853394,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 9,
                "plannedDepartureDateTime": "2024-10-21T11:31:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:31:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "2",
                "plannedDepartureTrack": "2",
                "plannedArrivalTrack": "2",
                "actualArrivalTrack": "2",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 11,
                "plannedArrivalDateTime": "2024-10-21T11:40:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "14",
                "plannedDepartureTrack": "14",
                "plannedArrivalTrack": "14",
                "actualArrivalTrack": "14",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "MEDIUM",
            "punctuality": 81.8,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#772251#TA#0#DA#211024#1S#1100672#1T#1103#LS#1100690#LT#1140#PU#784#RT#1#CA#IC#ZE#2832#ZB#IC 2832 #PC#1#FR#1100672#FT#1103#TO#1100690#TT#1140#&train=2832&datetime=2024-10-21T11:03:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 37,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "37 min.",
                "accessibilityValue": "37 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "002cb7bc_3",
        "crowdForecast": "MEDIUM",
        "punctuality": 81.8,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1006/1140?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A06%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A40%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1065392917"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A06%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A40%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1065392917&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        },
        "modalityListItems": [{
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "4",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "11",
            "accessibilityName": "Intercity"
        }]
    }, {
        "idx": 1,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:06:00+02:00|plannedArrivalTime=2024-10-21T11:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2789241531",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:06:00+02:00|plannedArrivalTime=2024-10-21T11:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2789241531",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100866@a=128@$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$202410211006$202410211025$IC 832  $$1$$$$$$§W$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$202410211025$202410211029$$$1$$$$$$§T$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$A=1@O=Breda@L=1101034@a=128@$202410211042$202410211110$IC 3633 $$3$$$$$$§W$A=1@O=Breda@L=1101034@a=128@$A=1@O=Breda@L=1100828@a=128@$202410211110$202410211114$$$1$$$$$$§T$A=1@O=Breda@L=1100828@a=128@$A=1@O=Rotterdam Centraal@L=1100726@a=128@$202410211114$202410211136$ICD 923 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#261#HIN#0#ECK#458530|458530|458616|458616|0|0|65861|458515|1|0|2|0|0|-2147483648#¶KRCC¶#VE#1#VOLL#IST#",
        "plannedDurationInMinutes": 90,
        "actualDurationInMinutes": 86,
        "transfers": 2,
        "status": "NORMAL",
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 832",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Alkmaar",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#779578#TA#0#DA#211024#1S#1101017#1T#859#LS#1101009#LT#1203#PU#784#RT#1#CA#IC#ZE#832#ZB#IC 832  #PC#1#FR#1101017#FT#859#TO#1101009#TT#1203#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:06:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:10:00+0200",
                "plannedTrack": "4",
                "actualTrack": "4",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:25:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:27:00+0200",
                "plannedTrack": "3",
                "actualTrack": "3",
                "exitSide": "LEFT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "832",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Alkmaar",
                        "shortValue": "richting Alkmaar",
                        "accessibilityValue": "richting Alkmaar",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:06:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:10:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "4",
                "plannedDepartureTrack": "4",
                "plannedArrivalTrack": "4",
                "actualArrivalTrack": "4",
                "departureDelayInSeconds": 240,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T10:25:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:27:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "arrivalDelayInSeconds": 120,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "MEDIUM",
            "bicycleSpotCount": 0,
            "punctuality": 88.9,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#779578#TA#0#DA#211024#1S#1101017#1T#859#LS#1101009#LT#1203#PU#784#RT#1#CA#IC#ZE#832#ZB#IC 832  #PC#1#FR#1101017#FT#859#TO#1101009#TT#1203#&train=832&datetime=2024-10-21T10:06:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 19,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "17 min.",
                "accessibilityValue": "17 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 3633",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Roosendaal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932393#TA#0#DA#211024#1S#1101167#1T#850#LS#1101102#LT#1133#PU#784#RT#3#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1101102#TT#1133#",
            "origin": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:42:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:42:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:10:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:10:00+0200",
                "actualTrack": "8",
                "exitSide": "LEFT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3633",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Roosendaal",
                        "shortValue": "richting Roosendaal",
                        "accessibilityValue": "richting Roosendaal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "15 min. overstaptijd",
                "accessibilityMessage": "15 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:42:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:42:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400597",
                "name": "Tilburg",
                "lat": 51.5605545043945,
                "lng": 5.08361101150513,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 1,
                "plannedDepartureDateTime": "2024-10-21T10:58:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:58:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T10:57:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:57:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T11:10:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:10:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "actualArrivalTrack": "8",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "LOW",
            "punctuality": 90.0,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932393#TA#0#DA#211024#1S#1101167#1T#850#LS#1101102#LT#1133#PU#784#RT#3#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1101102#TT#1133#&train=3633&datetime=2024-10-21T10:42:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 28,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "28 min.",
                "accessibilityValue": "28 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "2",
            "name": "ICD 923",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Amsterdam Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#780006#TA#0#DA#211024#1S#1100828#1T#1114#LS#1100893#LT#1223#PU#784#RT#1#CA#HSN#ZE#923#ZB#ICD 923 #PC#1#FR#1100828#FT#1114#TO#1100893#TT#1223#",
            "origin": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:14:00+0200",
                "plannedTrack": "6",
                "actualTrack": "6",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:36:00+0200",
                "plannedTrack": "12",
                "actualTrack": "12",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "923",
                "categoryCode": "ICD",
                "shortCategoryName": "ICD",
                "longCategoryName": "Intercity direct",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity direct",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity direct",
                        "shortValue": "NS Intercity direct",
                        "accessibilityValue": "NS Intercity direct",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Amsterdam Centraal",
                        "shortValue": "richting Amsterdam Centraal",
                        "accessibilityValue": "richting Amsterdam Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "4 min. overstaptijd",
                "accessibilityMessage": "4 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:14:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "6",
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "actualArrivalTrack": "6",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedArrivalDateTime": "2024-10-21T11:36:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "12",
                "plannedDepartureTrack": "12",
                "plannedArrivalTrack": "12",
                "actualArrivalTrack": "12",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "LOW",
            "punctuality": 100.0,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#780006#TA#0#DA#211024#1S#1100828#1T#1114#LS#1100893#LT#1223#PU#784#RT#1#CA#HSN#ZE#923#ZB#ICD 923 #PC#1#FR#1100828#FT#1114#TO#1100893#TT#1223#&train=923&datetime=2024-10-21T11:14:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 22,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "22 min.",
                "accessibilityValue": "22 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "4fd9cb66_3",
        "crowdForecast": "MEDIUM",
        "punctuality": 88.9,
        "optimal": true,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1006/1136?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A06%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2789241531"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A06%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2789241531&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        },
        "modalityListItems": [{
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "4",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "7",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity direct",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "6",
            "accessibilityName": "Intercity direct"
        }]
    }, {
        "idx": 2,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:17:00+02:00|plannedArrivalTime=2024-10-21T11:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1399376255",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:17:00+02:00|plannedArrivalTime=2024-10-21T11:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1399376255",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100896@a=128@$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$202410211017$202410211036$IC 3534 $$3$$$$$$§W$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$202410211036$202410211040$$$1$$$$$$§T$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$A=1@O=Breda@L=1101034@a=128@$202410211042$202410211110$IC 3633 $$3$$$$$$§W$A=1@O=Breda@L=1101034@a=128@$A=1@O=Breda@L=1100828@a=128@$202410211110$202410211114$$$1$$$$$$§T$A=1@O=Breda@L=1100828@a=128@$A=1@O=Rotterdam Centraal@L=1100726@a=128@$202410211114$202410211136$ICD 923 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#261#HIN#0#ECK#458537|458537|458616|458616|0|0|65861|458515|2|0|2|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 79,
        "actualDurationInMinutes": 79,
        "transfers": 2,
        "status": "CANCELLED",
        "primaryMessage": {
            "title": "Dit reisadvies vervalt",
            "nesProperties": {
                "color": "text-alert-contrast",
                "type": "error",
                "icon": "alert"
            },
            "type": "TRIP_CANCELLED"
        },
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 3534",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Dordrecht",
            "partCancelled": false,
            "cancelled": true,
            "changePossible": false,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933897#TA#0#DA#211024#1S#1100958#1T#933#LS#1100738#LT#1256#PU#784#RT#3#CA#IC#ZE#3534#ZB#IC 3534 #PC#1#FR#1100958#FT#933#TO#1100738#TT#1256#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:17:00+0200",
                "plannedTrack": "6",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:36:00+0200",
                "plannedTrack": "3",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3534",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Dordrecht",
                        "shortValue": "richting Dordrecht",
                        "accessibilityValue": "richting Dordrecht",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }, {
                        "value": "(Rijdt niet)",
                        "shortValue": "(Rijdt niet)",
                        "accessibilityValue": "(Rijdt niet)",
                        "key": "PRODUCT_CANCELLED",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-alert-contrast",
                            "type": "error"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:17:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T10:36:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 90.0,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933897#TA#0#DA#211024#1S#1100958#1T#933#LS#1100738#LT#1256#PU#784#RT#3#CA#IC#ZE#3534#ZB#IC 3534 #PC#1#FR#1100958#FT#933#TO#1100738#TT#1256#&train=3534&datetime=2024-10-21T10:17:00+02:00"
                }
            }],
            "reachable": false,
            "plannedDurationInMinutes": 19,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "19 min.",
                "accessibilityValue": "19 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 3633",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Roosendaal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932393#TA#0#DA#211024#1S#1101167#1T#850#LS#1101102#LT#1133#PU#784#RT#3#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1101102#TT#1133#",
            "origin": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:42:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:42:00+0200",
                "actualTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:10:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:10:00+0200",
                "plannedTrack": "8",
                "actualTrack": "8",
                "exitSide": "LEFT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3633",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Roosendaal",
                        "shortValue": "richting Roosendaal",
                        "accessibilityValue": "richting Roosendaal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "6 min. overstaptijd",
                "accessibilityMessage": "6 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-ghost"
                }
            }],
            "stops": [{
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:42:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:42:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "actualArrivalTrack": "7",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400597",
                "name": "Tilburg",
                "lat": 51.5605545043945,
                "lng": 5.08361101150513,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 1,
                "plannedDepartureDateTime": "2024-10-21T10:58:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:58:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T10:57:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:57:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T11:10:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:10:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 90.0,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932393#TA#0#DA#211024#1S#1101167#1T#850#LS#1101102#LT#1133#PU#784#RT#3#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1101102#TT#1133#&train=3633&datetime=2024-10-21T10:42:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 28,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "28 min.",
                "accessibilityValue": "28 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "2",
            "name": "ICD 923",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Amsterdam Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#780006#TA#0#DA#211024#1S#1100828#1T#1114#LS#1100893#LT#1223#PU#784#RT#1#CA#HSN#ZE#923#ZB#ICD 923 #PC#1#FR#1100828#FT#1114#TO#1100893#TT#1223#",
            "origin": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:14:00+0200",
                "plannedTrack": "6",
                "actualTrack": "6",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:36:00+0200",
                "plannedTrack": "12",
                "actualTrack": "12",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "923",
                "categoryCode": "ICD",
                "shortCategoryName": "ICD",
                "longCategoryName": "Intercity direct",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity direct",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity direct",
                        "shortValue": "NS Intercity direct",
                        "accessibilityValue": "NS Intercity direct",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Amsterdam Centraal",
                        "shortValue": "richting Amsterdam Centraal",
                        "accessibilityValue": "richting Amsterdam Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "4 min. overstaptijd",
                "accessibilityMessage": "4 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-ghost"
                }
            }],
            "stops": [{
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:14:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "6",
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "actualArrivalTrack": "6",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedArrivalDateTime": "2024-10-21T11:36:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "12",
                "plannedDepartureTrack": "12",
                "plannedArrivalTrack": "12",
                "actualArrivalTrack": "12",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 100.0,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#780006#TA#0#DA#211024#1S#1100828#1T#1114#LS#1100893#LT#1223#PU#784#RT#1#CA#HSN#ZE#923#ZB#ICD 923 #PC#1#FR#1100828#FT#1114#TO#1100893#TT#1223#&train=923&datetime=2024-10-21T11:14:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 22,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "22 min.",
                "accessibilityValue": "22 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "befe0cc8_3",
        "crowdForecast": "UNKNOWN",
        "punctuality": 90.0,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1017/1136?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A17%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1399376255"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A17%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1399376255&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        }
    }, {
        "idx": 3,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:17:00+02:00|plannedArrivalTime=2024-10-21T11:46:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=168411078",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:17:00+02:00|plannedArrivalTime=2024-10-21T11:46:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=168411078",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100896@a=128@$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$202410211017$202410211036$IC 3534 $$3$$$$$$§W$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$202410211036$202410211040$$$1$$$$$$§T$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$A=1@O=Breda@L=1101034@a=128@$202410211042$202410211110$IC 3633 $$3$$$$$$§W$A=1@O=Breda@L=1101034@a=128@$A=1@O=Breda@L=1100942@a=128@$202410211110$202410211112$$$1$$$$$$§T$A=1@O=Breda@L=1100942@a=128@$A=1@O=Rotterdam Centraal@L=1100740@a=128@$202410211123$202410211146$IC 1134 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#45317#HIN#0#ECK#458537|458537|458616|458626|0|0|65861|458515|3|0|8|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 89,
        "actualDurationInMinutes": 89,
        "transfers": 2,
        "status": "CANCELLED",
        "primaryMessage": {
            "title": "Dit reisadvies vervalt",
            "nesProperties": {
                "color": "text-alert-contrast",
                "type": "error",
                "icon": "alert"
            },
            "type": "TRIP_CANCELLED"
        },
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 3534",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Dordrecht",
            "partCancelled": false,
            "cancelled": true,
            "changePossible": false,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933897#TA#0#DA#211024#1S#1100958#1T#933#LS#1100738#LT#1256#PU#784#RT#3#CA#IC#ZE#3534#ZB#IC 3534 #PC#1#FR#1100958#FT#933#TO#1100738#TT#1256#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:17:00+0200",
                "plannedTrack": "6",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:36:00+0200",
                "plannedTrack": "3",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3534",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Dordrecht",
                        "shortValue": "richting Dordrecht",
                        "accessibilityValue": "richting Dordrecht",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }, {
                        "value": "(Rijdt niet)",
                        "shortValue": "(Rijdt niet)",
                        "accessibilityValue": "(Rijdt niet)",
                        "key": "PRODUCT_CANCELLED",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-alert-contrast",
                            "type": "error"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:17:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T10:36:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 90.0,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933897#TA#0#DA#211024#1S#1100958#1T#933#LS#1100738#LT#1256#PU#784#RT#3#CA#IC#ZE#3534#ZB#IC 3534 #PC#1#FR#1100958#FT#933#TO#1100738#TT#1256#&train=3534&datetime=2024-10-21T10:17:00+02:00"
                }
            }],
            "reachable": false,
            "plannedDurationInMinutes": 19,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "19 min.",
                "accessibilityValue": "19 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 3633",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Roosendaal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932393#TA#0#DA#211024#1S#1101167#1T#850#LS#1101102#LT#1133#PU#784#RT#3#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1101102#TT#1133#",
            "origin": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:42:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:42:00+0200",
                "actualTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:10:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:10:00+0200",
                "plannedTrack": "8",
                "actualTrack": "8",
                "exitSide": "LEFT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3633",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Roosendaal",
                        "shortValue": "richting Roosendaal",
                        "accessibilityValue": "richting Roosendaal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "6 min. overstaptijd",
                "accessibilityMessage": "6 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-ghost"
                }
            }],
            "stops": [{
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:42:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:42:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "actualArrivalTrack": "7",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400597",
                "name": "Tilburg",
                "lat": 51.5605545043945,
                "lng": 5.08361101150513,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 1,
                "plannedDepartureDateTime": "2024-10-21T10:58:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:58:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T10:57:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:57:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T11:10:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:10:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 90.0,
            "crossPlatformTransfer": true,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932393#TA#0#DA#211024#1S#1101167#1T#850#LS#1101102#LT#1133#PU#784#RT#3#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1101102#TT#1133#&train=3633&datetime=2024-10-21T10:42:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 28,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "28 min.",
                "accessibilityValue": "28 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "2",
            "name": "IC 1134",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Den Haag Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#140#TA#1#DA#211024#1S#1100825#1T#1107#LS#1100684#LT#1212#PU#784#RT#1#CA#IC#ZE#1134#ZB#IC 1134 #PC#1#FR#1100825#FT#1107#TO#1100684#TT#1212#",
            "origin": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:23:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:46:00+0200",
                "plannedTrack": "9",
                "actualTrack": "9",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "1134",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Den Haag Centraal",
                        "shortValue": "richting Den Haag Centraal",
                        "accessibilityValue": "richting Den Haag Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "Overstap op zelfde perron",
                "accessibilityMessage": "Overstap op zelfde perron",
                "type": "CROSS_PLATFORM",
                "messageNesProperties": {
                    "color": "text-ghost"
                }
            }],
            "stops": [{
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:23:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedArrivalDateTime": "2024-10-21T11:46:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "9",
                "plannedDepartureTrack": "9",
                "plannedArrivalTrack": "9",
                "actualArrivalTrack": "9",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 90.9,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#140#TA#1#DA#211024#1S#1100825#1T#1107#LS#1100684#LT#1212#PU#784#RT#1#CA#IC#ZE#1134#ZB#IC 1134 #PC#1#FR#1100825#FT#1107#TO#1100684#TT#1212#&train=1134&datetime=2024-10-21T11:23:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 23,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "23 min.",
                "accessibilityValue": "23 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "9f4d1031_3",
        "crowdForecast": "UNKNOWN",
        "punctuality": 90.0,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1017/1146?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A17%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A46%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D168411078"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A17%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A46%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D168411078&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        }
    }, {
        "idx": 4,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:17:00+02:00|plannedArrivalTime=2024-10-21T11:55:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2147055894",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:17:00+02:00|plannedArrivalTime=2024-10-21T11:55:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2147055894",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100896@a=128@$A=1@O=Utrecht Centraal@L=1100715@a=128@$202410211017$202410211105$IC 3534 $$3$$$$$$§W$A=1@O=Utrecht Centraal@L=1100715@a=128@$A=1@O=Utrecht Centraal@L=1100697@a=128@$202410211105$202410211109$$$1$$$$$$§T$A=1@O=Utrecht Centraal@L=1100697@a=128@$A=1@O=Rotterdam Centraal@L=1100690@a=128@$202410211118$202410211155$IC 532  $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#8451#HIN#0#ECK#458537|458537|458616|458635|0|0|325|458515|4|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 98,
        "actualDurationInMinutes": 98,
        "transfers": 1,
        "status": "CANCELLED",
        "primaryMessage": {
            "title": "Dit reisadvies vervalt",
            "nesProperties": {
                "color": "text-alert-contrast",
                "type": "error",
                "icon": "alert"
            },
            "type": "TRIP_CANCELLED"
        },
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 3534",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Dordrecht",
            "partCancelled": false,
            "cancelled": true,
            "changePossible": false,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933897#TA#0#DA#211024#1S#1100958#1T#933#LS#1100738#LT#1256#PU#784#RT#3#CA#IC#ZE#3534#ZB#IC 3534 #PC#1#FR#1100958#FT#933#TO#1100738#TT#1256#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:17:00+0200",
                "plannedTrack": "6",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:05:00+0200",
                "plannedTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3534",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Dordrecht",
                        "shortValue": "richting Dordrecht",
                        "accessibilityValue": "richting Dordrecht",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }, {
                        "value": "(Rijdt niet)",
                        "shortValue": "(Rijdt niet)",
                        "accessibilityValue": "(Rijdt niet)",
                        "key": "PRODUCT_CANCELLED",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-alert-contrast",
                            "type": "error"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:17:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedDepartureDateTime": "2024-10-21T10:38:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T10:36:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "cancelled": true,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 13,
                "plannedArrivalDateTime": "2024-10-21T11:05:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 88.9,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933897#TA#0#DA#211024#1S#1100958#1T#933#LS#1100738#LT#1256#PU#784#RT#3#CA#IC#ZE#3534#ZB#IC 3534 #PC#1#FR#1100958#FT#933#TO#1100738#TT#1256#&train=3534&datetime=2024-10-21T10:17:00+02:00"
                }
            }],
            "reachable": false,
            "plannedDurationInMinutes": 48,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "48 min.",
                "accessibilityValue": "48 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 532",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Rotterdam Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#4742#TA#1#DA#211024#1S#1101531#1T#919#LS#1100690#LT#1155#PU#784#RT#1#CA#IC#ZE#532#ZB#IC 532  #PC#1#FR#1101531#FT#919#TO#1100690#TT#1155#",
            "origin": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:18:00+0200",
                "plannedTrack": "8",
                "actualTrack": "8",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:55:00+0200",
                "plannedTrack": "14",
                "actualTrack": "14",
                "exitSide": "RIGHT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "532",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "richting Rotterdam Centraal",
                        "shortValue": "richting Rotterdam Centraal",
                        "accessibilityValue": "richting Rotterdam Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }],
                    [{
                        "value": "2 tussenstops",
                        "shortValue": "2 tussenstops",
                        "accessibilityValue": "2 tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-ghost"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "13 min. overstaptijd",
                "accessibilityMessage": "13 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-ghost"
                }
            }],
            "stops": [{
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:18:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400258",
                "name": "Gouda",
                "lat": 52.0175018310547,
                "lng": 4.70444440841675,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedDepartureDateTime": "2024-10-21T11:36:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:35:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400507",
                "name": "Rotterdam Alexander",
                "lat": 51.9519462585449,
                "lng": 4.55361127853394,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 9,
                "plannedDepartureDateTime": "2024-10-21T11:46:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:46:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "2",
                "plannedDepartureTrack": "2",
                "plannedArrivalTrack": "2",
                "actualArrivalTrack": "2",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 11,
                "plannedArrivalDateTime": "2024-10-21T11:55:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "14",
                "plannedDepartureTrack": "14",
                "plannedArrivalTrack": "14",
                "actualArrivalTrack": "14",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "UNKNOWN",
            "punctuality": 100.0,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#4742#TA#1#DA#211024#1S#1101531#1T#919#LS#1100690#LT#1155#PU#784#RT#1#CA#IC#ZE#532#ZB#IC 532  #PC#1#FR#1101531#FT#919#TO#1100690#TT#1155#&train=532&datetime=2024-10-21T11:18:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 37,
            "nesProperties": {
                "color": "text-ghost",
                "scope": "ENTIRE_LEG",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "37 min.",
                "accessibilityValue": "37 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "1e4ed2b5_3",
        "crowdForecast": "UNKNOWN",
        "punctuality": 88.9,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1017/1155?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A17%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A55%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2147055894"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A17%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T11%3A55%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2147055894&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        }
    }, {
        "idx": 5,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:36:00+02:00|plannedArrivalTime=2024-10-21T12:10:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1242921773",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:36:00+02:00|plannedArrivalTime=2024-10-21T12:10:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1242921773",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100866@a=128@$A=1@O=Utrecht Centraal@L=1100715@a=128@$202410211036$202410211127$IC 834  $$3$$$$$$§W$A=1@O=Utrecht Centraal@L=1100715@a=128@$A=1@O=Utrecht Centraal@L=1100672@a=128@$202410211127$202410211132$$$1$$$$$$§T$A=1@O=Utrecht Centraal@L=1100672@a=128@$A=1@O=Rotterdam Centraal@L=1100690@a=128@$202410211133$202410211210$IC 2834 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#259#HIN#0#ECK#458556|458556|458650|458650|0|0|485|458538|5|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 94,
        "actualDurationInMinutes": 94,
        "transfers": 1,
        "status": "NORMAL",
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 834",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Alkmaar",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932853#TA#0#DA#211024#1S#1101011#1T#929#LS#1101009#LT#1233#PU#784#RT#3#CA#IC#ZE#834#ZB#IC 834  #PC#1#FR#1101011#FT#929#TO#1101009#TT#1233#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:36:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:36:00+0200",
                "plannedTrack": "4",
                "actualTrack": "4",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:27:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:27:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "exitSide": "RIGHT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "834",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Alkmaar",
                        "shortValue": "richting Alkmaar",
                        "accessibilityValue": "richting Alkmaar",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:36:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:36:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "4",
                "plannedDepartureTrack": "4",
                "plannedArrivalTrack": "4",
                "actualArrivalTrack": "4",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedDepartureDateTime": "2024-10-21T10:58:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:58:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T10:55:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T10:55:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 13,
                "plannedArrivalDateTime": "2024-10-21T11:27:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:27:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "LOW",
            "bicycleSpotCount": 12,
            "punctuality": 77.8,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#932853#TA#0#DA#211024#1S#1101011#1T#929#LS#1101009#LT#1233#PU#784#RT#3#CA#IC#ZE#834#ZB#IC 834  #PC#1#FR#1101011#FT#929#TO#1101009#TT#1233#&train=834&datetime=2024-10-21T10:36:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 51,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "51 min.",
                "accessibilityValue": "51 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 2834",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Rotterdam Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#772262#TA#0#DA#211024#1S#1100672#1T#1133#LS#1100690#LT#1210#PU#784#RT#1#CA#IC#ZE#2834#ZB#IC 2834 #PC#1#FR#1100672#FT#1133#TO#1100690#TT#1210#",
            "origin": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:33:00+0200",
                "plannedTrack": "11",
                "actualTrack": "11",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T12:10:00+0200",
                "plannedTrack": "14",
                "actualTrack": "14",
                "exitSide": "RIGHT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "2834",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Rotterdam Centraal",
                        "shortValue": "richting Rotterdam Centraal",
                        "accessibilityValue": "richting Rotterdam Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "2 tussenstops",
                        "shortValue": "2 tussenstops",
                        "accessibilityValue": "2 tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "6 min. overstaptijd",
                "accessibilityMessage": "6 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:33:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "11",
                "plannedDepartureTrack": "11",
                "plannedArrivalTrack": "11",
                "actualArrivalTrack": "11",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400258",
                "name": "Gouda",
                "lat": 52.0175018310547,
                "lng": 4.70444440841675,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedDepartureDateTime": "2024-10-21T11:52:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:51:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400507",
                "name": "Rotterdam Alexander",
                "lat": 51.9519462585449,
                "lng": 4.55361127853394,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 9,
                "plannedDepartureDateTime": "2024-10-21T12:01:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T12:01:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "2",
                "plannedDepartureTrack": "2",
                "plannedArrivalTrack": "2",
                "actualArrivalTrack": "2",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 11,
                "plannedArrivalDateTime": "2024-10-21T12:10:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "14",
                "plannedDepartureTrack": "14",
                "plannedArrivalTrack": "14",
                "actualArrivalTrack": "14",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "MEDIUM",
            "bicycleSpotCount": 3,
            "punctuality": 100.0,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#772262#TA#0#DA#211024#1S#1100672#1T#1133#LS#1100690#LT#1210#PU#784#RT#1#CA#IC#ZE#2834#ZB#IC 2834 #PC#1#FR#1100672#FT#1133#TO#1100690#TT#1210#&train=2834&datetime=2024-10-21T11:33:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 37,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "37 min.",
                "accessibilityValue": "37 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "5efc643e_3",
        "crowdForecast": "MEDIUM",
        "punctuality": 77.8,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1036/1210?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A36%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T12%3A10%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1242921773"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A36%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T12%3A10%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1242921773&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        },
        "modalityListItems": [{
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "4",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "11",
            "accessibilityName": "Intercity"
        }]
    }, {
        "idx": 6,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:47:00+02:00|plannedArrivalTime=2024-10-21T12:16:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=271917902",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:47:00+02:00|plannedArrivalTime=2024-10-21T12:16:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=271917902",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100896@a=128@$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$202410211047$202410211106$IC 3536 $$3$$$$$$§W$A=1@O=Hertogenbosch ('s)@L=1101032@a=128@$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$202410211106$202410211110$$$1$$$$$$§T$A=1@O=Hertogenbosch ('s)@L=1101751@a=128@$A=1@O=Breda@L=1101034@a=128@$202410211112$202410211140$IC 3635 $$1$$$$$$§W$A=1@O=Breda@L=1101034@a=128@$A=1@O=Breda@L=1100942@a=128@$202410211140$202410211142$$$1$$$$$$§T$A=1@O=Breda@L=1100942@a=128@$A=1@O=Rotterdam Centraal@L=1100740@a=128@$202410211153$202410211216$IC 1136 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#261#HIN#0#ECK#458567|458567|458656|458656|0|0|65861|458557|6|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 89,
        "actualDurationInMinutes": 89,
        "transfers": 2,
        "status": "NORMAL",
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 3536",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Dordrecht",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933895#TA#0#DA#211024#1S#1100958#1T#1003#LS#1100738#LT#1326#PU#784#RT#3#CA#IC#ZE#3536#ZB#IC 3536 #PC#1#FR#1100958#FT#1003#TO#1100738#TT#1326#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:47:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:47:00+0200",
                "plannedTrack": "6",
                "actualTrack": "6",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:06:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:06:00+0200",
                "plannedTrack": "3",
                "actualTrack": "3",
                "exitSide": "LEFT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3536",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Dordrecht",
                        "shortValue": "richting Dordrecht",
                        "accessibilityValue": "richting Dordrecht",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:47:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:47:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "6",
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "actualArrivalTrack": "6",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T11:06:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:06:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "MEDIUM",
            "bicycleSpotCount": 0,
            "punctuality": 100.0,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933895#TA#0#DA#211024#1S#1100958#1T#1003#LS#1100738#LT#1326#PU#784#RT#3#CA#IC#ZE#3536#ZB#IC 3536 #PC#1#FR#1100958#FT#1003#TO#1100738#TT#1326#&train=3536&datetime=2024-10-21T10:47:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 19,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "19 min.",
                "accessibilityValue": "19 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 3635",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Roosendaal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#3090#TA#0#DA#211024#1S#1101167#1T#920#LS#1101102#LT#1203#PU#784#RT#1#CA#IC#ZE#3635#ZB#IC 3635 #PC#1#FR#1101167#FT#920#TO#1101102#TT#1203#",
            "origin": {
                "name": "'s-Hertogenbosch",
                "lng": 5.29362,
                "lat": 51.69048,
                "countryCode": "NL",
                "uicCode": "8400319",
                "stationCode": "HT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:12:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:12:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:40:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:40:00+0200",
                "plannedTrack": "8",
                "actualTrack": "8",
                "exitSide": "LEFT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3635",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Roosendaal",
                        "shortValue": "richting Roosendaal",
                        "accessibilityValue": "richting Roosendaal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "6 min. overstaptijd",
                "accessibilityMessage": "6 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:12:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T11:12:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400597",
                "name": "Tilburg",
                "lat": 51.5605545043945,
                "lng": 5.08361101150513,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 1,
                "plannedDepartureDateTime": "2024-10-21T11:28:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T11:28:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:27:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:27:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedArrivalDateTime": "2024-10-21T11:40:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:40:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "LOW",
            "punctuality": 90.0,
            "crossPlatformTransfer": true,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#3090#TA#0#DA#211024#1S#1101167#1T#920#LS#1101102#LT#1203#PU#784#RT#1#CA#IC#ZE#3635#ZB#IC 3635 #PC#1#FR#1101167#FT#920#TO#1101102#TT#1203#&train=3635&datetime=2024-10-21T11:12:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 28,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "28 min.",
                "accessibilityValue": "28 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "2",
            "name": "IC 1136",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Den Haag Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#120#TA#3#DA#211024#1S#1100825#1T#1137#LS#1100705#LT#1241#PU#784#RT#1#CA#IC#ZE#1136#ZB#IC 1136 #PC#1#FR#1100825#FT#1137#TO#1100705#TT#1241#",
            "origin": {
                "name": "Breda",
                "lng": 4.78000020980835,
                "lat": 51.5955543518066,
                "countryCode": "NL",
                "uicCode": "8400131",
                "stationCode": "BD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:53:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T12:16:00+0200",
                "plannedTrack": "9",
                "actualTrack": "9",
                "exitSide": "LEFT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "1136",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Den Haag Centraal",
                        "shortValue": "richting Den Haag Centraal",
                        "accessibilityValue": "richting Den Haag Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "Geen tussenstops",
                        "shortValue": "Geen tussenstops",
                        "accessibilityValue": "Geen tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "Overstap op zelfde perron",
                "accessibilityMessage": "Overstap op zelfde perron",
                "type": "CROSS_PLATFORM",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400131",
                "name": "Breda",
                "lat": 51.5955543518066,
                "lng": 4.78000020980835,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:53:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedArrivalDateTime": "2024-10-21T12:16:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "9",
                "plannedDepartureTrack": "9",
                "plannedArrivalTrack": "9",
                "actualArrivalTrack": "9",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "LOW",
            "bicycleSpotCount": 16,
            "punctuality": 83.3,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#120#TA#3#DA#211024#1S#1100825#1T#1137#LS#1100705#LT#1241#PU#784#RT#1#CA#IC#ZE#1136#ZB#IC 1136 #PC#1#FR#1100825#FT#1137#TO#1100705#TT#1241#&train=1136&datetime=2024-10-21T11:53:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 23,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "23 min.",
                "accessibilityValue": "23 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "9c390870_3",
        "crowdForecast": "MEDIUM",
        "punctuality": 83.3,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1047/1216?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A47%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T12%3A16%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D271917902"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A47%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T12%3A16%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D271917902&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        },
        "modalityListItems": [{
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "6",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "7",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "7",
            "accessibilityName": "Intercity"
        }]
    }, {
        "idx": 7,
        "uid": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:47:00+02:00|plannedArrivalTime=2024-10-21T12:25:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1286215112",
        "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|plannedFromTime=2024-10-21T10:47:00+02:00|plannedArrivalTime=2024-10-21T12:25:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1286215112",
        "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100896@a=128@$A=1@O=Utrecht Centraal@L=1100715@a=128@$202410211047$202410211135$IC 3536 $$3$$$$$$§W$A=1@O=Utrecht Centraal@L=1100715@a=128@$A=1@O=Utrecht Centraal@L=1100697@a=128@$202410211135$202410211139$$$1$$$$$$§T$A=1@O=Utrecht Centraal@L=1100697@a=128@$A=1@O=Rotterdam Centraal@L=1100690@a=128@$202410211148$202410211225$IC 634  $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#8451#HIN#0#ECK#458567|458567|458656|458665|0|0|325|458557|7|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
        "plannedDurationInMinutes": 98,
        "actualDurationInMinutes": 98,
        "transfers": 1,
        "status": "NORMAL",
        "messages": [],
        "legs": [{
            "idx": "0",
            "name": "IC 3536",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Dordrecht",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933895#TA#0#DA#211024#1S#1100958#1T#1003#LS#1100738#LT#1326#PU#784#RT#3#CA#IC#ZE#3536#ZB#IC 3536 #PC#1#FR#1100958#FT#1003#TO#1100738#TT#1326#",
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T10:47:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T10:47:00+0200",
                "plannedTrack": "6",
                "actualTrack": "6",
                "checkinStatus": "CHECKIN",
                "notes": []
            },
            "destination": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:35:00+0200",
                "actualTimeZoneOffset": 120,
                "actualDateTime": "2024-10-21T11:35:00+0200",
                "plannedTrack": "7",
                "actualTrack": "7",
                "exitSide": "RIGHT",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "3536",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Dordrecht",
                        "shortValue": "richting Dordrecht",
                        "accessibilityValue": "richting Dordrecht",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "1 tussenstop",
                        "shortValue": "1 tussenstop",
                        "accessibilityValue": "1 tussenstop",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "stops": [{
                "uicCode": "8400206",
                "name": "Eindhoven Centraal",
                "lat": 51.4433326721191,
                "lng": 5.48138904571533,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T10:47:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T10:47:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "6",
                "plannedDepartureTrack": "6",
                "plannedArrivalTrack": "6",
                "actualArrivalTrack": "6",
                "departureDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400319",
                "name": "'s-Hertogenbosch",
                "lat": 51.69048,
                "lng": 5.29362,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 5,
                "plannedDepartureDateTime": "2024-10-21T11:08:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureDateTime": "2024-10-21T11:08:00+0200",
                "actualDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T11:06:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:06:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "3",
                "plannedDepartureTrack": "3",
                "plannedArrivalTrack": "3",
                "actualArrivalTrack": "3",
                "departureDelayInSeconds": 0,
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 13,
                "plannedArrivalDateTime": "2024-10-21T11:35:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualArrivalDateTime": "2024-10-21T11:35:00+0200",
                "actualArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "7",
                "plannedDepartureTrack": "7",
                "plannedArrivalTrack": "7",
                "actualArrivalTrack": "7",
                "arrivalDelayInSeconds": 0,
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "MEDIUM",
            "bicycleSpotCount": 0,
            "punctuality": 100.0,
            "crossPlatformTransfer": false,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#933895#TA#0#DA#211024#1S#1100958#1T#1003#LS#1100738#LT#1326#PU#784#RT#3#CA#IC#ZE#3536#ZB#IC 3536 #PC#1#FR#1100958#FT#1003#TO#1100738#TT#1326#&train=3536&datetime=2024-10-21T10:47:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 48,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "48 min.",
                "accessibilityValue": "48 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }, {
            "idx": "1",
            "name": "IC 634",
            "travelType": "PUBLIC_TRANSIT",
            "direction": "Rotterdam Centraal",
            "partCancelled": false,
            "cancelled": false,
            "changePossible": true,
            "alternativeTransport": false,
            "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#5268#TA#0#DA#211024#1S#1101479#1T#947#LS#1100690#LT#1225#PU#784#RT#1#CA#IC#ZE#634#ZB#IC 634  #PC#1#FR#1101479#FT#947#TO#1100690#TT#1225#",
            "origin": {
                "name": "Utrecht Centraal",
                "lng": 5.11027765274048,
                "lat": 52.0888900756836,
                "countryCode": "NL",
                "uicCode": "8400621",
                "stationCode": "UT",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T11:48:00+0200",
                "plannedTrack": "8",
                "actualTrack": "8",
                "checkinStatus": "NOTHING",
                "notes": []
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION",
                "plannedTimeZoneOffset": 120,
                "plannedDateTime": "2024-10-21T12:25:00+0200",
                "plannedTrack": "14",
                "actualTrack": "14",
                "exitSide": "RIGHT",
                "checkinStatus": "CHECKOUT",
                "notes": []
            },
            "product": {
                "productType": "Product",
                "number": "634",
                "categoryCode": "IC",
                "shortCategoryName": "IC",
                "longCategoryName": "Intercity",
                "operatorCode": "ns",
                "operatorName": "NS",
                "operatorAdministrativeCode": 100,
                "type": "TRAIN",
                "displayName": "NS Intercity",
                "nameNesProperties": {
                    "color": "text-body"
                },
                "iconNesProperties": {
                    "color": "text-body",
                    "icon": "train"
                },
                "notes": [
                    [{
                        "value": "NS Intercity",
                        "shortValue": "NS Intercity",
                        "accessibilityValue": "NS Intercity",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "richting Rotterdam Centraal",
                        "shortValue": "richting Rotterdam Centraal",
                        "accessibilityValue": "richting Rotterdam Centraal",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }],
                    [{
                        "value": "2 tussenstops",
                        "shortValue": "2 tussenstops",
                        "accessibilityValue": "2 tussenstops",
                        "noteType": "ATTRIBUTE",
                        "isPresentationRequired": true,
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }]
                ]
            },
            "transferMessages": [{
                "message": "13 min. overstaptijd",
                "accessibilityMessage": "13 minuten overstaptijd",
                "type": "TRANSFER_TIME",
                "messageNesProperties": {
                    "color": "text-default"
                }
            }],
            "stops": [{
                "uicCode": "8400621",
                "name": "Utrecht Centraal",
                "lat": 52.0888900756836,
                "lng": 5.11027765274048,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 0,
                "plannedDepartureDateTime": "2024-10-21T11:48:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400258",
                "name": "Gouda",
                "lat": 52.0175018310547,
                "lng": 4.70444440841675,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 6,
                "plannedDepartureDateTime": "2024-10-21T12:06:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T12:05:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "8",
                "plannedDepartureTrack": "8",
                "plannedArrivalTrack": "8",
                "actualArrivalTrack": "8",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400507",
                "name": "Rotterdam Alexander",
                "lat": 51.9519462585449,
                "lng": 4.55361127853394,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 9,
                "plannedDepartureDateTime": "2024-10-21T12:16:00+0200",
                "plannedDepartureTimeZoneOffset": 120,
                "plannedArrivalDateTime": "2024-10-21T12:16:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "2",
                "plannedDepartureTrack": "2",
                "plannedArrivalTrack": "2",
                "actualArrivalTrack": "2",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }, {
                "uicCode": "8400530",
                "name": "Rotterdam Centraal",
                "lat": 51.9249992370605,
                "lng": 4.46888875961304,
                "countryCode": "NL",
                "notes": [],
                "routeIdx": 11,
                "plannedArrivalDateTime": "2024-10-21T12:25:00+0200",
                "plannedArrivalTimeZoneOffset": 120,
                "actualDepartureTrack": "14",
                "plannedDepartureTrack": "14",
                "plannedArrivalTrack": "14",
                "actualArrivalTrack": "14",
                "cancelled": false,
                "borderStop": false,
                "passing": false
            }],
            "crowdForecast": "LOW",
            "bicycleSpotCount": 6,
            "punctuality": 100.0,
            "shorterStock": false,
            "journeyDetail": [{
                "type": "TRAIN_XML",
                "link": {
                    "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1729071585#PI#0#ZI#5268#TA#0#DA#211024#1S#1101479#1T#947#LS#1100690#LT#1225#PU#784#RT#1#CA#IC#ZE#634#ZB#IC 634  #PC#1#FR#1101479#FT#947#TO#1100690#TT#1225#&train=634&datetime=2024-10-21T11:48:00+02:00"
                }
            }],
            "reachable": true,
            "plannedDurationInMinutes": 37,
            "nesProperties": {
                "color": "text-info",
                "scope": "LEG_LINE",
                "styles": {
                    "type": "LineStyles",
                    "dashed": false
                }
            },
            "duration": {
                "value": "37 min.",
                "accessibilityValue": "37 minuten",
                "nesProperties": {
                    "color": "text-body"
                }
            }
        }],
        "checksum": "34a41036_3",
        "crowdForecast": "MEDIUM",
        "punctuality": 100.0,
        "optimal": false,
        "fareRoute": {
            "routeId": "=LR8ULRiEcw==",
            "origin": {
                "varCode": 206,
                "name": "Eindhoven Centraal"
            },
            "destination": {
                "varCode": 530,
                "name": "Rotterdam Centraal"
            }
        },
        "fares": [{
            "priceInCents": 3587,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 2870,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 1688,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 2152,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 1266,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 7174,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 4220,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 5740,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 3376,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_20_PERCENT"
        }, {
            "priceInCents": 4304,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "FIRST_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 2532,
            "product": "OVCHIPKAART_RETOUR",
            "travelClass": "SECOND_CLASS",
            "discountType": "DISCOUNT_40_PERCENT"
        }, {
            "priceInCents": 73850,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 43700,
            "product": "TRAJECT_VRIJ_MAAND",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 60150,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 35380,
            "product": "TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 721800,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "FIRST_CLASS",
            "discountType": "NO_DISCOUNT"
        }, {
            "priceInCents": 424560,
            "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        }],
        "fareLegs": [{
            "origin": {
                "name": "Eindhoven Centraal",
                "lng": 5.48138904571533,
                "lat": 51.4433326721191,
                "countryCode": "NL",
                "uicCode": "8400206",
                "stationCode": "EHV",
                "type": "STATION"
            },
            "destination": {
                "name": "Rotterdam Centraal",
                "lng": 4.46888875961304,
                "lat": 51.9249992370605,
                "countryCode": "NL",
                "uicCode": "8400530",
                "stationCode": "RTD",
                "type": "STATION"
            },
            "operator": "NS",
            "productTypes": ["TRAIN"],
            "fares": [{
                "priceInCents": 2110,
                "priceInCentsExcludingSupplement": 2110,
                "supplementInCents": 0,
                "buyableTicketSupplementPriceInCents": 0,
                "product": "OVCHIPKAART_ENKELE_REIS",
                "travelClass": "SECOND_CLASS",
                "discountType": "NO_DISCOUNT"
            }]
        }],
        "productFare": {
            "priceInCents": 2110,
            "priceInCentsExcludingSupplement": 2110,
            "buyableTicketPriceInCents": 2110,
            "buyableTicketPriceInCentsExcludingSupplement": 2110,
            "product": "OVCHIPKAART_ENKELE_REIS",
            "travelClass": "SECOND_CLASS",
            "discountType": "NO_DISCOUNT"
        },
        "fareOptions": {
            "isInternationalBookable": false,
            "isInternational": false,
            "isEticketBuyable": true,
            "isPossibleWithOvChipkaart": true,
            "isTotalPriceUnknown": false
        },
        "nsiLink": {
            "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20241021/1047/1225?stationType=domestic&cookieConsent=false",
            "showInternationalBanner": false
        },
        "type": "NS",
        "shareUrl": {
            "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A47%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T12%3A25%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1286215112"
        },
        "realtime": true,
        "routeId": "=LR8ULRiEcw==",
        "registerJourney": {
            "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CplannedFromTime%3D2024-10-21T10%3A47%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-10-21T12%3A25%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1286215112&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-10-21T10%3A05%3A28.291711%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
            "status": "REGISTRATION_POSSIBLE",
            "bicycleReservationRequired": false
        },
        "modalityListItems": [{
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "6",
            "accessibilityName": "Intercity"
        }, {
            "name": "Intercity",
            "nameNesProperties": {
                "color": "text-subtle",
                "styles": {
                    "type": "TextStyles",
                    "strikethrough": false,
                    "bold": false
                }
            },
            "iconNesProperties": {
                "color": "text-body",
                "icon": "train"
            },
            "actualTrack": "8",
            "accessibilityName": "Intercity"
        }]
    }],
    "scrollRequestBackwardContext": "3|OB|MTµ14µ458537µ458526µ458616µ458620µ0µ0µ325µ458515µ1µ0µ10µ0µ0µ-2147483648µ1µ2|PDHµ6592c757cbb7690d2428315010c1aad4|RDµ21102024|RTµ95500|USµ0|RSµINIT",
    "scrollRequestForwardContext": "3|OF|MTµ14µ458567µ458567µ458656µ458665µ0µ0µ325µ458557µ7µ0µ10µ0µ0µ-2147483648µ1µ2|PDHµ6592c757cbb7690d2428315010c1aad4|RDµ21102024|RTµ95500|USµ0|RSµINIT"
}
Send
Picture
> Disclaimer > Privacy
