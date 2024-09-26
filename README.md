# ITrain

{
    "source": "HARP",
    "trips": [
        {
            "idx": 0,
            "uid": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:14:00+02:00|plannedArrivalTime=2024-09-26T13:51:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=630829828",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:14:00+02:00|plannedArrivalTime=2024-09-26T13:51:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=630829828",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Breda@L=1100942@a=128@$202409261314$202409261351$IC 1144 $$3$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#422714|422714|422751|422751|0|0|185|422700|1|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 37,
            "actualDurationInMinutes": 37,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1144",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#769242#TA#0#DA#260924#1S#1100921#1T#1314#LS#1100705#LT#1441#PU#784#RT#1#CA#IC#ZE#1144#ZB#IC 1144 #PC#1#FR#1100921#FT#1314#TO#1100705#TT#1441#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T13:14:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-26T13:51:00+0200",
                        "plannedTrack": "7",
                        "actualTrack": "7",
                        "exitSide": "RIGHT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "1144",
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
                            [
                                {
                                    "value": "NS Intercity",
                                    "shortValue": "NS Intercity",
                                    "accessibilityValue": "NS Intercity",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Den Haag Centraal",
                                    "shortValue": "richting Den Haag Centraal",
                                    "accessibilityValue": "richting Den Haag Centraal",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "1 tussenstop",
                                    "shortValue": "1 tussenstop",
                                    "accessibilityValue": "1 tussenstop",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "stops": [
                        {
                            "uicCode": "8400206",
                            "name": "Eindhoven Centraal",
                            "lat": 51.4433326721191,
                            "lng": 5.48138904571533,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T13:14:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "5",
                            "plannedDepartureTrack": "5",
                            "plannedArrivalTrack": "5",
                            "actualArrivalTrack": "5",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 5,
                            "plannedDepartureDateTime": "2024-09-26T13:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T13:35:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 9,
                            "plannedArrivalDateTime": "2024-09-26T13:51:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 16,
                    "punctuality": 84.6,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#769242#TA#0#DA#260924#1S#1100921#1T#1314#LS#1100705#LT#1441#PU#784#RT#1#CA#IC#ZE#1144#ZB#IC 1144 #PC#1#FR#1100921#FT#1314#TO#1100705#TT#1441#&train=1144&datetime=2024-09-26T13:14:00+02:00"
                            }
                        }
                    ],
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
                }
            ],
            "checksum": "9a6e6d48_3",
            "crowdForecast": "LOW",
            "punctuality": 84.6,
            "optimal": true,
            "fareRoute": {
                "routeId": "=LR8cnxSHcA==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 131,
                    "name": "Breda"
                }
            },
            "fares": [
                {
                    "priceInCents": 2142,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1260,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1714,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1008,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1285,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 756,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 4284,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2520,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 3428,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2016,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2570,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1512,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 62530,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 37000,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 50130,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 29490,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 601560,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 353880,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                }
            ],
            "fareLegs": [
                {
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
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 1260,
                            "priceInCentsExcludingSupplement": 1260,
                            "supplementInCents": 0,
                            "buyableTicketSupplementPriceInCents": 0,
                            "product": "OVCHIPKAART_ENKELE_REIS",
                            "travelClass": "SECOND_CLASS",
                            "discountType": "NO_DISCOUNT"
                        }
                    ]
                }
            ],
            "productFare": {
                "priceInCents": 1260,
                "priceInCentsExcludingSupplement": 1260,
                "buyableTicketPriceInCents": 1260,
                "buyableTicketPriceInCentsExcludingSupplement": 1260,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/BD/20240926/1314/1351?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T13%3A51%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D630829828"
            },
            "realtime": true,
            "routeId": "=LR8cnxSHcA==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T13%3A51%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D630829828&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "status": "REGISTRATION_POSSIBLE",
                "bicycleReservationRequired": false
            },
            "modalityListItems": [
                {
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
                    "actualTrack": "5",
                    "accessibilityName": "Intercity"
                }
            ]
        },
        {
            "idx": 1,
            "uid": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:21:00+02:00|plannedArrivalTime=2024-09-26T14:10:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2285458633",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:21:00+02:00|plannedArrivalTime=2024-09-26T14:10:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2285458633",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100866@a=128@$A=1@O=Tilburg@L=1100825@a=128@$202409261321$202409261350$SPR 6448$$1$$$$$$§W$A=1@O=Tilburg@L=1100825@a=128@$A=1@O=Tilburg@L=1100811@a=128@$202409261350$202409261352$$$1$$$$$$§T$A=1@O=Tilburg@L=1100811@a=128@$A=1@O=Breda@L=1101034@a=128@$202409261358$202409261410$IC 3645 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#3#HIN#0#ECK#422721|422721|422770|422770|0|0|325|422715|2|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 49,
            "actualDurationInMinutes": 49,
            "transfers": 1,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "SPR 6448",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Tilburg Universiteit",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#4991#TA#10#DA#260924#1S#1101398#1T#1250#LS#1101318#LT#1358#PU#784#RT#1#CA#SPR#ZE#6448#ZB#SPR 6448#PC#3#FR#1101398#FT#1250#TO#1101318#TT#1358#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T13:21:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T13:21:00+0200",
                        "plannedTrack": "4",
                        "actualTrack": "4",
                        "checkinStatus": "CHECKIN",
                        "notes": []
                    },
                    "destination": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T13:50:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T13:50:00+0200",
                        "plannedTrack": "2",
                        "actualTrack": "2",
                        "exitSide": "RIGHT",
                        "checkinStatus": "NOTHING",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "6448",
                        "categoryCode": "SPR",
                        "shortCategoryName": "SPR",
                        "longCategoryName": "Sprinter",
                        "operatorCode": "ns",
                        "operatorName": "NS",
                        "operatorAdministrativeCode": 100,
                        "type": "TRAIN",
                        "displayName": "NS Sprinter",
                        "nameNesProperties": {
                            "color": "text-body"
                        },
                        "iconNesProperties": {
                            "color": "text-body",
                            "icon": "train"
                        },
                        "notes": [
                            [
                                {
                                    "value": "NS Sprinter",
                                    "shortValue": "NS Sprinter",
                                    "accessibilityValue": "NS Sprinter",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Tilburg Universiteit",
                                    "shortValue": "richting Tilburg Universiteit",
                                    "accessibilityValue": "richting Tilburg Universiteit",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "4 tussenstops",
                                    "shortValue": "4 tussenstops",
                                    "accessibilityValue": "4 tussenstops",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "stops": [
                        {
                            "uicCode": "8400206",
                            "name": "Eindhoven Centraal",
                            "lat": 51.4433326721191,
                            "lng": 5.48138904571533,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T13:21:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T13:21:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "4",
                            "plannedDepartureTrack": "4",
                            "plannedArrivalTrack": "4",
                            "actualArrivalTrack": "4",
                            "departureDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400196",
                            "name": "Eindhoven Strijp-S",
                            "lat": 51.4511108398438,
                            "lng": 5.45583343505859,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 1,
                            "plannedDepartureDateTime": "2024-09-26T13:24:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T13:24:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T13:24:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T13:24:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "1",
                            "plannedDepartureTrack": "1",
                            "plannedArrivalTrack": "1",
                            "actualArrivalTrack": "1",
                            "departureDelayInSeconds": 0,
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400112",
                            "name": "Best",
                            "lat": 51.5099983215332,
                            "lng": 5.38916683197022,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 2,
                            "plannedDepartureDateTime": "2024-09-26T13:30:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T13:30:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T13:30:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T13:30:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "1",
                            "plannedDepartureTrack": "1",
                            "plannedArrivalTrack": "1",
                            "actualArrivalTrack": "1",
                            "departureDelayInSeconds": 0,
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400129",
                            "name": "Boxtel",
                            "lat": 51.58433,
                            "lng": 5.31912,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 3,
                            "plannedDepartureDateTime": "2024-09-26T13:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T13:37:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T13:37:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T13:37:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "6",
                            "plannedDepartureTrack": "6",
                            "plannedArrivalTrack": "6",
                            "actualArrivalTrack": "6",
                            "departureDelayInSeconds": 0,
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400482",
                            "name": "Oisterwijk",
                            "lat": 51.5822219848633,
                            "lng": 5.19416666030884,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 4,
                            "plannedDepartureDateTime": "2024-09-26T13:44:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T13:44:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T13:44:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T13:44:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "departureDelayInSeconds": 0,
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 5,
                            "plannedArrivalDateTime": "2024-09-26T13:50:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T13:50:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 4,
                    "punctuality": 92.3,
                    "crossPlatformTransfer": true,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#4991#TA#10#DA#260924#1S#1101398#1T#1250#LS#1101318#LT#1358#PU#784#RT#1#CA#SPR#ZE#6448#ZB#SPR 6448#PC#3#FR#1101398#FT#1250#TO#1101318#TT#1358#&train=6448&datetime=2024-09-26T13:21:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 29,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "29 min.",
                        "accessibilityValue": "29 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                },
                {
                    "idx": "1",
                    "name": "IC 3645",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Vlissingen",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#773453#TA#0#DA#260924#1S#1101167#1T#1150#LS#1100748#LT#1539#PU#784#RT#1#CA#IC#ZE#3645#ZB#IC 3645 #PC#1#FR#1101167#FT#1150#TO#1100748#TT#1539#",
                    "origin": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T13:58:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T13:58:00+0200",
                        "plannedTrack": "3",
                        "actualTrack": "3",
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
                        "plannedDateTime": "2024-09-26T14:10:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T14:10:00+0200",
                        "plannedTrack": "8",
                        "actualTrack": "8",
                        "exitSide": "LEFT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "3645",
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
                            [
                                {
                                    "value": "NS Intercity",
                                    "shortValue": "NS Intercity",
                                    "accessibilityValue": "NS Intercity",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Vlissingen",
                                    "shortValue": "richting Vlissingen",
                                    "accessibilityValue": "richting Vlissingen",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "Geen tussenstops",
                                    "shortValue": "Geen tussenstops",
                                    "accessibilityValue": "Geen tussenstops",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "transferMessages": [
                        {
                            "message": "Overstap op zelfde perron",
                            "accessibilityMessage": "Overstap op zelfde perron",
                            "type": "CROSS_PLATFORM",
                            "messageNesProperties": {
                                "color": "text-default"
                            }
                        }
                    ],
                    "stops": [
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T13:58:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T13:58:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "3",
                            "plannedDepartureTrack": "3",
                            "plannedArrivalTrack": "3",
                            "actualArrivalTrack": "3",
                            "departureDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 4,
                            "plannedArrivalDateTime": "2024-09-26T14:10:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T14:10:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "8",
                            "plannedDepartureTrack": "8",
                            "plannedArrivalTrack": "8",
                            "actualArrivalTrack": "8",
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 0,
                    "punctuality": 90.9,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#773453#TA#0#DA#260924#1S#1101167#1T#1150#LS#1100748#LT#1539#PU#784#RT#1#CA#IC#ZE#3645#ZB#IC 3645 #PC#1#FR#1101167#FT#1150#TO#1100748#TT#1539#&train=3645&datetime=2024-09-26T13:58:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 12,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "12 min.",
                        "accessibilityValue": "12 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "a7b2c96c_3",
            "crowdForecast": "LOW",
            "punctuality": 90.9,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8cnxSHcA==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 131,
                    "name": "Breda"
                }
            },
            "fares": [
                {
                    "priceInCents": 2142,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1260,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1714,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1008,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1285,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 756,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 4284,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2520,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 3428,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2016,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2570,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1512,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 62530,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 37000,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 50130,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 29490,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 601560,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 353880,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                }
            ],
            "fareLegs": [
                {
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
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 1260,
                            "priceInCentsExcludingSupplement": 1260,
                            "supplementInCents": 0,
                            "buyableTicketSupplementPriceInCents": 0,
                            "product": "OVCHIPKAART_ENKELE_REIS",
                            "travelClass": "SECOND_CLASS",
                            "discountType": "NO_DISCOUNT"
                        }
                    ]
                }
            ],
            "productFare": {
                "priceInCents": 1260,
                "priceInCentsExcludingSupplement": 1260,
                "buyableTicketPriceInCents": 1260,
                "buyableTicketPriceInCentsExcludingSupplement": 1260,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/BD/20240926/1321/1410?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A10%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2285458633"
            },
            "realtime": true,
            "routeId": "=LR8cnxSHcA==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A10%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2285458633&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "status": "REGISTRATION_POSSIBLE",
                "bicycleReservationRequired": false
            },
            "modalityListItems": [
                {
                    "name": "Sprinter",
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
                    "accessibilityName": "Sprinter"
                },
                {
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
                    "actualTrack": "3",
                    "accessibilityName": "Intercity"
                }
            ]
        },
        {
            "idx": 2,
            "uid": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:44:00+02:00|plannedArrivalTime=2024-09-26T14:21:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=3287766147",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:44:00+02:00|plannedArrivalTime=2024-09-26T14:21:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=3287766147",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Breda@L=1100942@a=128@$202409261344$202409261421$IC 1146 $$3$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#422744|422744|422781|422781|0|0|185|422722|3|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 37,
            "actualDurationInMinutes": 37,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1146",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#769230#TA#1#DA#260924#1S#1100921#1T#1344#LS#1100684#LT#1511#PU#784#RT#1#CA#IC#ZE#1146#ZB#IC 1146 #PC#1#FR#1100921#FT#1344#TO#1100684#TT#1511#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T13:44:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-26T14:21:00+0200",
                        "plannedTrack": "7",
                        "actualTrack": "7",
                        "exitSide": "RIGHT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "1146",
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
                            [
                                {
                                    "value": "NS Intercity",
                                    "shortValue": "NS Intercity",
                                    "accessibilityValue": "NS Intercity",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Den Haag Centraal",
                                    "shortValue": "richting Den Haag Centraal",
                                    "accessibilityValue": "richting Den Haag Centraal",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "1 tussenstop",
                                    "shortValue": "1 tussenstop",
                                    "accessibilityValue": "1 tussenstop",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "stops": [
                        {
                            "uicCode": "8400206",
                            "name": "Eindhoven Centraal",
                            "lat": 51.4433326721191,
                            "lng": 5.48138904571533,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T13:44:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "5",
                            "plannedDepartureTrack": "5",
                            "plannedArrivalTrack": "5",
                            "actualArrivalTrack": "5",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 5,
                            "plannedDepartureDateTime": "2024-09-26T14:07:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:05:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 9,
                            "plannedArrivalDateTime": "2024-09-26T14:21:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 8,
                    "punctuality": 80.0,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#769230#TA#1#DA#260924#1S#1100921#1T#1344#LS#1100684#LT#1511#PU#784#RT#1#CA#IC#ZE#1146#ZB#IC 1146 #PC#1#FR#1100921#FT#1344#TO#1100684#TT#1511#&train=1146&datetime=2024-09-26T13:44:00+02:00"
                            }
                        }
                    ],
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
                }
            ],
            "checksum": "5d7d6076_3",
            "crowdForecast": "LOW",
            "punctuality": 80.0,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8cnxSHcA==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 131,
                    "name": "Breda"
                }
            },
            "fares": [
                {
                    "priceInCents": 2142,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1260,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1714,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1008,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1285,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 756,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 4284,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2520,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 3428,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2016,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2570,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1512,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 62530,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 37000,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 50130,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 29490,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 601560,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 353880,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                }
            ],
            "fareLegs": [
                {
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
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 1260,
                            "priceInCentsExcludingSupplement": 1260,
                            "supplementInCents": 0,
                            "buyableTicketSupplementPriceInCents": 0,
                            "product": "OVCHIPKAART_ENKELE_REIS",
                            "travelClass": "SECOND_CLASS",
                            "discountType": "NO_DISCOUNT"
                        }
                    ]
                }
            ],
            "productFare": {
                "priceInCents": 1260,
                "priceInCentsExcludingSupplement": 1260,
                "buyableTicketPriceInCents": 1260,
                "buyableTicketPriceInCentsExcludingSupplement": 1260,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/BD/20240926/1344/1421?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A44%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A21%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D3287766147"
            },
            "realtime": true,
            "routeId": "=LR8cnxSHcA==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A44%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A21%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D3287766147&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "status": "REGISTRATION_POSSIBLE",
                "bicycleReservationRequired": false
            },
            "modalityListItems": [
                {
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
                    "actualTrack": "5",
                    "accessibilityName": "Intercity"
                }
            ]
        },
        {
            "idx": 3,
            "uid": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:51:00+02:00|plannedArrivalTime=2024-09-26T14:40:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=782861232",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T13:51:00+02:00|plannedArrivalTime=2024-09-26T14:40:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=782861232",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100866@a=128@$A=1@O=Tilburg@L=1100825@a=128@$202409261351$202409261420$SPR 6450$$1$$$$$$§W$A=1@O=Tilburg@L=1100825@a=128@$A=1@O=Tilburg@L=1100811@a=128@$202409261420$202409261422$$$1$$$$$$§T$A=1@O=Tilburg@L=1100811@a=128@$A=1@O=Breda@L=1101034@a=128@$202409261428$202409261440$IC 3647 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#3#HIN#0#ECK#422751|422751|422800|422800|0|0|325|422745|4|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 49,
            "actualDurationInMinutes": 49,
            "transfers": 1,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "SPR 6450",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Tilburg Universiteit",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#4991#TA#11#DA#260924#1S#1101398#1T#1320#LS#1101318#LT#1428#PU#784#RT#1#CA#SPR#ZE#6450#ZB#SPR 6450#PC#3#FR#1101398#FT#1320#TO#1101318#TT#1428#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T13:51:00+0200",
                        "plannedTrack": "4",
                        "actualTrack": "4",
                        "checkinStatus": "CHECKIN",
                        "notes": []
                    },
                    "destination": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T14:20:00+0200",
                        "plannedTrack": "2",
                        "actualTrack": "2",
                        "exitSide": "RIGHT",
                        "checkinStatus": "NOTHING",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "6450",
                        "categoryCode": "SPR",
                        "shortCategoryName": "SPR",
                        "longCategoryName": "Sprinter",
                        "operatorCode": "ns",
                        "operatorName": "NS",
                        "operatorAdministrativeCode": 100,
                        "type": "TRAIN",
                        "displayName": "NS Sprinter",
                        "nameNesProperties": {
                            "color": "text-body"
                        },
                        "iconNesProperties": {
                            "color": "text-body",
                            "icon": "train"
                        },
                        "notes": [
                            [
                                {
                                    "value": "NS Sprinter",
                                    "shortValue": "NS Sprinter",
                                    "accessibilityValue": "NS Sprinter",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Tilburg Universiteit",
                                    "shortValue": "richting Tilburg Universiteit",
                                    "accessibilityValue": "richting Tilburg Universiteit",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "4 tussenstops",
                                    "shortValue": "4 tussenstops",
                                    "accessibilityValue": "4 tussenstops",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "stops": [
                        {
                            "uicCode": "8400206",
                            "name": "Eindhoven Centraal",
                            "lat": 51.4433326721191,
                            "lng": 5.48138904571533,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T13:51:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "4",
                            "plannedDepartureTrack": "4",
                            "plannedArrivalTrack": "4",
                            "actualArrivalTrack": "4",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400196",
                            "name": "Eindhoven Strijp-S",
                            "lat": 51.4511108398438,
                            "lng": 5.45583343505859,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 1,
                            "plannedDepartureDateTime": "2024-09-26T13:54:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T13:54:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "1",
                            "plannedDepartureTrack": "1",
                            "plannedArrivalTrack": "1",
                            "actualArrivalTrack": "1",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400112",
                            "name": "Best",
                            "lat": 51.5099983215332,
                            "lng": 5.38916683197022,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 2,
                            "plannedDepartureDateTime": "2024-09-26T14:00:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:00:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "1",
                            "plannedDepartureTrack": "1",
                            "plannedArrivalTrack": "1",
                            "actualArrivalTrack": "1",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400129",
                            "name": "Boxtel",
                            "lat": 51.58433,
                            "lng": 5.31912,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 3,
                            "plannedDepartureDateTime": "2024-09-26T14:07:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:07:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "6",
                            "plannedDepartureTrack": "6",
                            "plannedArrivalTrack": "6",
                            "actualArrivalTrack": "6",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400482",
                            "name": "Oisterwijk",
                            "lat": 51.5822219848633,
                            "lng": 5.19416666030884,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 4,
                            "plannedDepartureDateTime": "2024-09-26T14:14:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:14:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 5,
                            "plannedArrivalDateTime": "2024-09-26T14:20:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 4,
                    "punctuality": 100.0,
                    "crossPlatformTransfer": true,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#4991#TA#11#DA#260924#1S#1101398#1T#1320#LS#1101318#LT#1428#PU#784#RT#1#CA#SPR#ZE#6450#ZB#SPR 6450#PC#3#FR#1101398#FT#1320#TO#1101318#TT#1428#&train=6450&datetime=2024-09-26T13:51:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 29,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "29 min.",
                        "accessibilityValue": "29 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                },
                {
                    "idx": "1",
                    "name": "IC 3647",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Vlissingen",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#2731#TA#0#DA#260924#1S#1101167#1T#1220#LS#1101755#LT#1551#PU#784#RT#1#CA#IC#ZE#3647#ZB#IC 3647 #PC#1#FR#1101167#FT#1220#TO#1101755#TT#1551#",
                    "origin": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T14:28:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T14:28:00+0200",
                        "plannedTrack": "3",
                        "actualTrack": "3",
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
                        "plannedDateTime": "2024-09-26T14:40:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T14:40:00+0200",
                        "plannedTrack": "8",
                        "actualTrack": "8",
                        "exitSide": "LEFT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "3647",
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
                            [
                                {
                                    "value": "NS Intercity",
                                    "shortValue": "NS Intercity",
                                    "accessibilityValue": "NS Intercity",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Vlissingen",
                                    "shortValue": "richting Vlissingen",
                                    "accessibilityValue": "richting Vlissingen",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "Geen tussenstops",
                                    "shortValue": "Geen tussenstops",
                                    "accessibilityValue": "Geen tussenstops",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "transferMessages": [
                        {
                            "message": "Overstap op zelfde perron",
                            "accessibilityMessage": "Overstap op zelfde perron",
                            "type": "CROSS_PLATFORM",
                            "messageNesProperties": {
                                "color": "text-default"
                            }
                        }
                    ],
                    "stops": [
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T14:28:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T14:28:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "3",
                            "plannedDepartureTrack": "3",
                            "plannedArrivalTrack": "3",
                            "actualArrivalTrack": "3",
                            "departureDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 4,
                            "plannedArrivalDateTime": "2024-09-26T14:40:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T14:40:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "8",
                            "plannedDepartureTrack": "8",
                            "plannedArrivalTrack": "8",
                            "actualArrivalTrack": "8",
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 0,
                    "punctuality": 91.7,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#2731#TA#0#DA#260924#1S#1101167#1T#1220#LS#1101755#LT#1551#PU#784#RT#1#CA#IC#ZE#3647#ZB#IC 3647 #PC#1#FR#1101167#FT#1220#TO#1101755#TT#1551#&train=3647&datetime=2024-09-26T14:28:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 12,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "12 min.",
                        "accessibilityValue": "12 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "7d6d037e_3",
            "crowdForecast": "LOW",
            "punctuality": 91.7,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8cnxSHcA==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 131,
                    "name": "Breda"
                }
            },
            "fares": [
                {
                    "priceInCents": 2142,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1260,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1714,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1008,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1285,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 756,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 4284,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2520,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 3428,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2016,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2570,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1512,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 62530,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 37000,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 50130,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 29490,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 601560,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 353880,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                }
            ],
            "fareLegs": [
                {
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
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 1260,
                            "priceInCentsExcludingSupplement": 1260,
                            "supplementInCents": 0,
                            "buyableTicketSupplementPriceInCents": 0,
                            "product": "OVCHIPKAART_ENKELE_REIS",
                            "travelClass": "SECOND_CLASS",
                            "discountType": "NO_DISCOUNT"
                        }
                    ]
                }
            ],
            "productFare": {
                "priceInCents": 1260,
                "priceInCentsExcludingSupplement": 1260,
                "buyableTicketPriceInCents": 1260,
                "buyableTicketPriceInCentsExcludingSupplement": 1260,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/BD/20240926/1351/1440?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A51%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A40%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D782861232"
            },
            "realtime": true,
            "routeId": "=LR8cnxSHcA==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T13%3A51%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A40%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D782861232&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "status": "REGISTRATION_POSSIBLE",
                "bicycleReservationRequired": false
            },
            "modalityListItems": [
                {
                    "name": "Sprinter",
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
                    "accessibilityName": "Sprinter"
                },
                {
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
                    "actualTrack": "3",
                    "accessibilityName": "Intercity"
                }
            ]
        },
        {
            "idx": 4,
            "uid": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T14:14:00+02:00|plannedArrivalTime=2024-09-26T14:51:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=3199456859",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T14:14:00+02:00|plannedArrivalTime=2024-09-26T14:51:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=3199456859",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Breda@L=1100942@a=128@$202409261414$202409261451$IC 1148 $$3$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#422774|422774|422811|422811|0|0|185|422752|5|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 37,
            "actualDurationInMinutes": 37,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1148",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#769215#TA#1#DA#260924#1S#1100921#1T#1414#LS#1100705#LT#1541#PU#784#RT#1#CA#IC#ZE#1148#ZB#IC 1148 #PC#1#FR#1100921#FT#1414#TO#1100705#TT#1541#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T14:14:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-26T14:51:00+0200",
                        "plannedTrack": "7",
                        "actualTrack": "7",
                        "exitSide": "RIGHT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "1148",
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
                            [
                                {
                                    "value": "NS Intercity",
                                    "shortValue": "NS Intercity",
                                    "accessibilityValue": "NS Intercity",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Den Haag Centraal",
                                    "shortValue": "richting Den Haag Centraal",
                                    "accessibilityValue": "richting Den Haag Centraal",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "1 tussenstop",
                                    "shortValue": "1 tussenstop",
                                    "accessibilityValue": "1 tussenstop",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "stops": [
                        {
                            "uicCode": "8400206",
                            "name": "Eindhoven Centraal",
                            "lat": 51.4433326721191,
                            "lng": 5.48138904571533,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T14:14:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "5",
                            "plannedDepartureTrack": "5",
                            "plannedArrivalTrack": "5",
                            "actualArrivalTrack": "5",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 5,
                            "plannedDepartureDateTime": "2024-09-26T14:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:35:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 9,
                            "plannedArrivalDateTime": "2024-09-26T14:51:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "punctuality": 91.7,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#769215#TA#1#DA#260924#1S#1100921#1T#1414#LS#1100705#LT#1541#PU#784#RT#1#CA#IC#ZE#1148#ZB#IC 1148 #PC#1#FR#1100921#FT#1414#TO#1100705#TT#1541#&train=1148&datetime=2024-09-26T14:14:00+02:00"
                            }
                        }
                    ],
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
                }
            ],
            "checksum": "48581000_3",
            "crowdForecast": "LOW",
            "punctuality": 91.7,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8cnxSHcA==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 131,
                    "name": "Breda"
                }
            },
            "fares": [
                {
                    "priceInCents": 2142,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1260,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1714,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1008,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1285,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 756,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 4284,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2520,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 3428,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2016,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2570,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1512,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 62530,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 37000,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 50130,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 29490,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 601560,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 353880,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                }
            ],
            "fareLegs": [
                {
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
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 1260,
                            "priceInCentsExcludingSupplement": 1260,
                            "supplementInCents": 0,
                            "buyableTicketSupplementPriceInCents": 0,
                            "product": "OVCHIPKAART_ENKELE_REIS",
                            "travelClass": "SECOND_CLASS",
                            "discountType": "NO_DISCOUNT"
                        }
                    ]
                }
            ],
            "productFare": {
                "priceInCents": 1260,
                "priceInCentsExcludingSupplement": 1260,
                "buyableTicketPriceInCents": 1260,
                "buyableTicketPriceInCentsExcludingSupplement": 1260,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/BD/20240926/1414/1451?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T14%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A51%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D3199456859"
            },
            "realtime": true,
            "routeId": "=LR8cnxSHcA==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T14%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T14%3A51%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D3199456859&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "status": "REGISTRATION_POSSIBLE",
                "bicycleReservationRequired": false
            },
            "modalityListItems": [
                {
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
                    "actualTrack": "5",
                    "accessibilityName": "Intercity"
                }
            ]
        },
        {
            "idx": 5,
            "uid": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T14:21:00+02:00|plannedArrivalTime=2024-09-26T15:10:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=742275919",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400131|plannedFromTime=2024-09-26T14:21:00+02:00|plannedArrivalTime=2024-09-26T15:10:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=742275919",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100866@a=128@$A=1@O=Tilburg@L=1100825@a=128@$202409261421$202409261450$SPR 6452$$1$$$$$$§W$A=1@O=Tilburg@L=1100825@a=128@$A=1@O=Tilburg@L=1100811@a=128@$202409261450$202409261452$$$1$$$$$$§T$A=1@O=Tilburg@L=1100811@a=128@$A=1@O=Breda@L=1101034@a=128@$202409261458$202409261510$IC 3649 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#3#HIN#0#ECK#422781|422781|422830|422830|0|0|325|422775|6|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 49,
            "actualDurationInMinutes": 49,
            "transfers": 1,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "SPR 6452",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Tilburg Universiteit",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#4991#TA#12#DA#260924#1S#1101398#1T#1350#LS#1101318#LT#1458#PU#784#RT#1#CA#SPR#ZE#6452#ZB#SPR 6452#PC#3#FR#1101398#FT#1350#TO#1101318#TT#1458#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T14:21:00+0200",
                        "plannedTrack": "4",
                        "actualTrack": "4",
                        "checkinStatus": "CHECKIN",
                        "notes": []
                    },
                    "destination": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T14:50:00+0200",
                        "plannedTrack": "2",
                        "actualTrack": "2",
                        "exitSide": "RIGHT",
                        "checkinStatus": "NOTHING",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "6452",
                        "categoryCode": "SPR",
                        "shortCategoryName": "SPR",
                        "longCategoryName": "Sprinter",
                        "operatorCode": "ns",
                        "operatorName": "NS",
                        "operatorAdministrativeCode": 100,
                        "type": "TRAIN",
                        "displayName": "NS Sprinter",
                        "nameNesProperties": {
                            "color": "text-body"
                        },
                        "iconNesProperties": {
                            "color": "text-body",
                            "icon": "train"
                        },
                        "notes": [
                            [
                                {
                                    "value": "NS Sprinter",
                                    "shortValue": "NS Sprinter",
                                    "accessibilityValue": "NS Sprinter",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Tilburg Universiteit",
                                    "shortValue": "richting Tilburg Universiteit",
                                    "accessibilityValue": "richting Tilburg Universiteit",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "4 tussenstops",
                                    "shortValue": "4 tussenstops",
                                    "accessibilityValue": "4 tussenstops",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "stops": [
                        {
                            "uicCode": "8400206",
                            "name": "Eindhoven Centraal",
                            "lat": 51.4433326721191,
                            "lng": 5.48138904571533,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T14:21:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "4",
                            "plannedDepartureTrack": "4",
                            "plannedArrivalTrack": "4",
                            "actualArrivalTrack": "4",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400196",
                            "name": "Eindhoven Strijp-S",
                            "lat": 51.4511108398438,
                            "lng": 5.45583343505859,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 1,
                            "plannedDepartureDateTime": "2024-09-26T14:24:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:24:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "1",
                            "plannedDepartureTrack": "1",
                            "plannedArrivalTrack": "1",
                            "actualArrivalTrack": "1",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400112",
                            "name": "Best",
                            "lat": 51.5099983215332,
                            "lng": 5.38916683197022,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 2,
                            "plannedDepartureDateTime": "2024-09-26T14:30:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:30:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "1",
                            "plannedDepartureTrack": "1",
                            "plannedArrivalTrack": "1",
                            "actualArrivalTrack": "1",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400129",
                            "name": "Boxtel",
                            "lat": 51.58433,
                            "lng": 5.31912,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 3,
                            "plannedDepartureDateTime": "2024-09-26T14:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:37:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "6",
                            "plannedDepartureTrack": "6",
                            "plannedArrivalTrack": "6",
                            "actualArrivalTrack": "6",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400482",
                            "name": "Oisterwijk",
                            "lat": 51.5822219848633,
                            "lng": 5.19416666030884,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 4,
                            "plannedDepartureDateTime": "2024-09-26T14:44:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-26T14:44:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 5,
                            "plannedArrivalDateTime": "2024-09-26T14:50:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "2",
                            "plannedDepartureTrack": "2",
                            "plannedArrivalTrack": "2",
                            "actualArrivalTrack": "2",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 4,
                    "punctuality": 92.3,
                    "crossPlatformTransfer": true,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#4991#TA#12#DA#260924#1S#1101398#1T#1350#LS#1101318#LT#1458#PU#784#RT#1#CA#SPR#ZE#6452#ZB#SPR 6452#PC#3#FR#1101398#FT#1350#TO#1101318#TT#1458#&train=6452&datetime=2024-09-26T14:21:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 29,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "29 min.",
                        "accessibilityValue": "29 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                },
                {
                    "idx": "1",
                    "name": "IC 3649",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Vlissingen",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#2684#TA#1#DA#260924#1S#1101167#1T#1250#LS#1100748#LT#1639#PU#784#RT#1#CA#IC#ZE#3649#ZB#IC 3649 #PC#1#FR#1101167#FT#1250#TO#1100748#TT#1639#",
                    "origin": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-26T14:58:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T14:58:00+0200",
                        "plannedTrack": "3",
                        "actualTrack": "3",
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
                        "plannedDateTime": "2024-09-26T15:10:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-26T15:10:00+0200",
                        "plannedTrack": "8",
                        "actualTrack": "8",
                        "exitSide": "LEFT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "3649",
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
                            [
                                {
                                    "value": "NS Intercity",
                                    "shortValue": "NS Intercity",
                                    "accessibilityValue": "NS Intercity",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Vlissingen",
                                    "shortValue": "richting Vlissingen",
                                    "accessibilityValue": "richting Vlissingen",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "Geen tussenstops",
                                    "shortValue": "Geen tussenstops",
                                    "accessibilityValue": "Geen tussenstops",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ]
                        ]
                    },
                    "transferMessages": [
                        {
                            "message": "Overstap op zelfde perron",
                            "accessibilityMessage": "Overstap op zelfde perron",
                            "type": "CROSS_PLATFORM",
                            "messageNesProperties": {
                                "color": "text-default"
                            }
                        }
                    ],
                    "stops": [
                        {
                            "uicCode": "8400597",
                            "name": "Tilburg",
                            "lat": 51.5605545043945,
                            "lng": 5.08361101150513,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-26T14:58:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-26T14:58:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "3",
                            "plannedDepartureTrack": "3",
                            "plannedArrivalTrack": "3",
                            "actualArrivalTrack": "3",
                            "departureDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 4,
                            "plannedArrivalDateTime": "2024-09-26T15:10:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-26T15:10:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "8",
                            "plannedDepartureTrack": "8",
                            "plannedArrivalTrack": "8",
                            "actualArrivalTrack": "8",
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "MEDIUM",
                    "punctuality": 91.7,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1726660500#PI#0#ZI#2684#TA#1#DA#260924#1S#1101167#1T#1250#LS#1100748#LT#1639#PU#784#RT#1#CA#IC#ZE#3649#ZB#IC 3649 #PC#1#FR#1101167#FT#1250#TO#1100748#TT#1639#&train=3649&datetime=2024-09-26T14:58:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 12,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "12 min.",
                        "accessibilityValue": "12 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "630b7ff6_3",
            "crowdForecast": "MEDIUM",
            "punctuality": 91.7,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8cnxSHcA==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 131,
                    "name": "Breda"
                }
            },
            "fares": [
                {
                    "priceInCents": 2142,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1260,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 1714,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1008,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1285,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 756,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 4284,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2520,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 3428,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2016,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2570,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1512,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 62530,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 37000,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 50130,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 29490,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 601560,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 353880,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                }
            ],
            "fareLegs": [
                {
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
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 1260,
                            "priceInCentsExcludingSupplement": 1260,
                            "supplementInCents": 0,
                            "buyableTicketSupplementPriceInCents": 0,
                            "product": "OVCHIPKAART_ENKELE_REIS",
                            "travelClass": "SECOND_CLASS",
                            "discountType": "NO_DISCOUNT"
                        }
                    ]
                }
            ],
            "productFare": {
                "priceInCents": 1260,
                "priceInCentsExcludingSupplement": 1260,
                "buyableTicketPriceInCents": 1260,
                "buyableTicketPriceInCentsExcludingSupplement": 1260,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/BD/20240926/1421/1510?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T14%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T15%3A10%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D742275919"
            },
            "realtime": true,
            "routeId": "=LR8cnxSHcA==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400131%7CplannedFromTime%3D2024-09-26T14%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-26T15%3A10%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D742275919&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400131&dateTime=2024-09-26T13%3A10%3A30.707063%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "status": "REGISTRATION_POSSIBLE",
                "bicycleReservationRequired": false
            },
            "modalityListItems": [
                {
                    "name": "Sprinter",
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
                    "accessibilityName": "Sprinter"
                },
                {
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
                    "actualTrack": "3",
                    "accessibilityName": "Intercity"
                }
            ]
        }
    ],
    "scrollRequestBackwardContext": "3|OB|MTµ14µ422714µ422714µ422751µ422751µ0µ0µ185µ422700µ1µ0µ10µ0µ0µ-2147483648µ1µ2|PDHµ04d04c8e0921ef6709b59a5913fad13d|RDµ26092024|RTµ130000|USµ0|RSµINIT",
    "scrollRequestForwardContext": "3|OF|MTµ14µ422781µ422781µ422830µ422830µ0µ0µ325µ422775µ6µ0µ10µ0µ0µ-2147483648µ1µ2|PDHµ04d04c8e0921ef6709b59a5913fad13d|RDµ26092024|RTµ130000|USµ0|RSµINIT"
}

