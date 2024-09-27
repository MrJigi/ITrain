{
    "source": "HARP",
    "trips": [
        {
            "idx": 0,
            "uid": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T10:14:00+02:00|plannedArrivalTime=2024-09-27T11:16:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=655327232",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T10:14:00+02:00|plannedArrivalTime=2024-09-27T11:16:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=655327232",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Rotterdam Centraal@L=1100740@a=128@$202409271014$202409271116$IC 1132 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#423974|423974|424036|424036|0|0|325|423965|1|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 62,
            "actualDurationInMinutes": 61,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1132",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#133#TA#0#DA#270924#1S#1100921#1T#1014#LS#1100705#LT#1141#PU#784#RT#1#CA#IC#ZE#1132#ZB#IC 1132 #PC#1#FR#1100921#FT#1014#TO#1100705#TT#1141#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T10:14:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-27T10:15:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-27T11:16:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-27T11:16:00+0200",
                        "plannedTrack": "9",
                        "actualTrack": "9",
                        "exitSide": "LEFT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "1132",
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
                                    "value": "2 tussenstops",
                                    "shortValue": "2 tussenstops",
                                    "accessibilityValue": "2 tussenstops",
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
                            "plannedDepartureDateTime": "2024-09-27T10:14:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-27T10:15:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "5",
                            "plannedDepartureTrack": "5",
                            "plannedArrivalTrack": "5",
                            "actualArrivalTrack": "5",
                            "departureDelayInSeconds": 60,
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
                            "plannedDepartureDateTime": "2024-09-27T10:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-27T10:37:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T10:35:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-27T10:35:00+0200",
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
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 9,
                            "plannedDepartureDateTime": "2024-09-27T10:53:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-27T10:53:00+0200",
                            "actualDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T10:51:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-27T10:51:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "departureDelayInSeconds": 0,
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400530",
                            "name": "Rotterdam Centraal",
                            "lat": 51.9249992370605,
                            "lng": 4.46888875961304,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 15,
                            "plannedArrivalDateTime": "2024-09-27T11:16:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-27T11:16:00+0200",
                            "actualArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "9",
                            "plannedDepartureTrack": "9",
                            "plannedArrivalTrack": "9",
                            "actualArrivalTrack": "9",
                            "arrivalDelayInSeconds": 0,
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 0,
                    "punctuality": 72.7,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#133#TA#0#DA#270924#1S#1100921#1T#1014#LS#1100705#LT#1141#PU#784#RT#1#CA#IC#ZE#1132#ZB#IC 1132 #PC#1#FR#1100921#FT#1014#TO#1100705#TT#1141#&train=1132&datetime=2024-09-27T10:14:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 62,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "1:01 u.",
                        "accessibilityValue": "1 uur en 1 minuut",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "a3b4ba3a_3",
            "crowdForecast": "LOW",
            "punctuality": 72.7,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8Unh6Ecw==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 530,
                    "name": "Rotterdam Centraal"
                }
            },
            "fares": [
                {
                    "priceInCents": 3587,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2110,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2870,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1688,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2152,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1266,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 7174,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 4220,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 5740,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 3376,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 4304,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 2532,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 73850,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 43700,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 60150,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 35380,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 721800,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 424560,
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
                        "name": "Rotterdam Centraal",
                        "lng": 4.46888875961304,
                        "lat": 51.9249992370605,
                        "countryCode": "NL",
                        "uicCode": "8400530",
                        "stationCode": "RTD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 2110,
                            "priceInCentsExcludingSupplement": 2110,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20240927/1014/1116?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T10%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T11%3A16%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D655327232"
            },
            "realtime": true,
            "routeId": "=LR8Unh6Ecw==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T10%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T11%3A16%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D655327232&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
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
            "uid": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T10:21:00+02:00|plannedArrivalTime=2024-09-27T11:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2693013208",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T10:21:00+02:00|plannedArrivalTime=2024-09-27T11:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2693013208",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100851@a=128@$A=1@O=Tilburg@L=1100825@a=128@$202409271021$202409271050$SPR 6436$$1$$$$$$§W$A=1@O=Tilburg@L=1100825@a=128@$A=1@O=Tilburg@L=1100811@a=128@$202409271050$202409271052$$$1$$$$$$§T$A=1@O=Tilburg@L=1100811@a=128@$A=1@O=Breda@L=1101034@a=128@$202409271058$202409271110$IC 3633 $$1$$$$$$§W$A=1@O=Breda@L=1101034@a=128@$A=1@O=Breda@L=1100828@a=128@$202409271110$202409271114$$$1$$$$$$§T$A=1@O=Breda@L=1100828@a=128@$A=1@O=Rotterdam Centraal@L=1100726@a=128@$202409271114$202409271136$ICD 923 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#5#HIN#0#ECK#423981|423981|424056|424056|0|0|325|423975|2|0|2|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 75,
            "actualDurationInMinutes": 75,
            "transfers": 2,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "SPR 6436",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Tilburg Universiteit",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#5028#TA#1#DA#270924#1S#1100851#1T#1021#LS#1101318#LT#1058#PU#784#RT#1#CA#SPR#ZE#6436#ZB#SPR 6436#PC#3#FR#1100851#FT#1021#TO#1101318#TT#1058#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T10:21:00+0200",
                        "plannedTrack": "3",
                        "actualTrack": "3",
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
                        "plannedDateTime": "2024-09-27T10:50:00+0200",
                        "plannedTrack": "2",
                        "actualTrack": "2",
                        "exitSide": "RIGHT",
                        "checkinStatus": "NOTHING",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "6436",
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
                            "plannedDepartureDateTime": "2024-09-27T10:21:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "3",
                            "plannedDepartureTrack": "3",
                            "plannedArrivalTrack": "3",
                            "actualArrivalTrack": "3",
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
                            "plannedDepartureDateTime": "2024-09-27T10:24:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T10:24:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T10:30:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T10:30:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T10:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T10:37:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T10:44:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T10:44:00+0200",
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
                            "plannedArrivalDateTime": "2024-09-27T10:50:00+0200",
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
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#5028#TA#1#DA#270924#1S#1100851#1T#1021#LS#1101318#LT#1058#PU#784#RT#1#CA#SPR#ZE#6436#ZB#SPR 6436#PC#3#FR#1100851#FT#1021#TO#1101318#TT#1058#&train=6436&datetime=2024-09-27T10:21:00+02:00"
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
                    "name": "IC 3633",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Vlissingen",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#2774#TA#0#DA#270924#1S#1101167#1T#850#LS#1100748#LT#1239#PU#784#RT#1#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1100748#TT#1239#",
                    "origin": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T10:58:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-27T10:58:00+0200",
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
                        "plannedDateTime": "2024-09-27T11:10:00+0200",
                        "actualTimeZoneOffset": 120,
                        "actualDateTime": "2024-09-27T11:10:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T10:58:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureDateTime": "2024-09-27T10:58:00+0200",
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
                            "plannedArrivalDateTime": "2024-09-27T11:10:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualArrivalDateTime": "2024-09-27T11:10:00+0200",
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
                    "punctuality": 75.0,
                    "crossPlatformTransfer": false,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#2774#TA#0#DA#270924#1S#1101167#1T#850#LS#1100748#LT#1239#PU#784#RT#1#CA#IC#ZE#3633#ZB#IC 3633 #PC#1#FR#1101167#FT#850#TO#1100748#TT#1239#&train=3633&datetime=2024-09-27T10:58:00+02:00"
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
                },
                {
                    "idx": "2",
                    "name": "ICD 923",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Amsterdam Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#6391#TA#0#DA#270924#1S#1100828#1T#1114#LS#1100893#LT#1223#PU#784#RT#1#CA#HSN#ZE#923#ZB#ICD 923 #PC#1#FR#1100828#FT#1114#TO#1100893#TT#1223#",
                    "origin": {
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T11:14:00+0200",
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
                        "plannedDateTime": "2024-09-27T11:36:00+0200",
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
                            [
                                {
                                    "value": "NS Intercity direct",
                                    "shortValue": "NS Intercity direct",
                                    "accessibilityValue": "NS Intercity direct",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Amsterdam Centraal",
                                    "shortValue": "richting Amsterdam Centraal",
                                    "accessibilityValue": "richting Amsterdam Centraal",
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
                            "message": "4 min. overstaptijd",
                            "accessibilityMessage": "4 minuten overstaptijd",
                            "type": "TRANSFER_TIME",
                            "messageNesProperties": {
                                "color": "text-default"
                            }
                        }
                    ],
                    "stops": [
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-27T11:14:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "6",
                            "plannedDepartureTrack": "6",
                            "plannedArrivalTrack": "6",
                            "actualArrivalTrack": "6",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400530",
                            "name": "Rotterdam Centraal",
                            "lat": 51.9249992370605,
                            "lng": 4.46888875961304,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 6,
                            "plannedArrivalDateTime": "2024-09-27T11:36:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "12",
                            "plannedDepartureTrack": "12",
                            "plannedArrivalTrack": "12",
                            "actualArrivalTrack": "12",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "punctuality": 87.5,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#6391#TA#0#DA#270924#1S#1100828#1T#1114#LS#1100893#LT#1223#PU#784#RT#1#CA#HSN#ZE#923#ZB#ICD 923 #PC#1#FR#1100828#FT#1114#TO#1100893#TT#1223#&train=923&datetime=2024-09-27T11:14:00+02:00"
                            }
                        }
                    ],
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
                }
            ],
            "checksum": "ea42cbec_3",
            "crowdForecast": "LOW",
            "punctuality": 75.0,
            "optimal": true,
            "fareRoute": {
                "routeId": "=LR8Unh6Ecw==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 530,
                    "name": "Rotterdam Centraal"
                }
            },
            "fares": [
                {
                    "priceInCents": 3587,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2110,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2870,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1688,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2152,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1266,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 7174,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 4220,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 5740,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 3376,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 4304,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 2532,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 73850,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 43700,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 60150,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 35380,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 721800,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 424560,
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
                        "name": "Rotterdam Centraal",
                        "lng": 4.46888875961304,
                        "lat": 51.9249992370605,
                        "countryCode": "NL",
                        "uicCode": "8400530",
                        "stationCode": "RTD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 2110,
                            "priceInCentsExcludingSupplement": 2110,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20240927/1021/1136?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T10%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T11%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2693013208"
            },
            "realtime": true,
            "routeId": "=LR8Unh6Ecw==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T10%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T11%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2693013208&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
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
                    "actualTrack": "3",
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
                },
                {
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
                }
            ]
        },
        {
            "idx": 2,
            "uid": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T10:44:00+02:00|plannedArrivalTime=2024-09-27T11:46:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=3166472657",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T10:44:00+02:00|plannedArrivalTime=2024-09-27T11:46:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=3166472657",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Rotterdam Centraal@L=1100740@a=128@$202409271044$202409271146$IC 1134 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#424004|424004|424066|424066|0|0|325|423982|3|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 62,
            "actualDurationInMinutes": 62,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1134",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#136#TA#0#DA#270924#1S#1100921#1T#1044#LS#1100684#LT#1211#PU#784#RT#1#CA#IC#ZE#1134#ZB#IC 1134 #PC#1#FR#1100921#FT#1044#TO#1100684#TT#1211#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T10:44:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-27T11:46:00+0200",
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
                                    "value": "2 tussenstops",
                                    "shortValue": "2 tussenstops",
                                    "accessibilityValue": "2 tussenstops",
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
                            "plannedDepartureDateTime": "2024-09-27T10:44:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:07:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:05:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:23:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:21:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400530",
                            "name": "Rotterdam Centraal",
                            "lat": 51.9249992370605,
                            "lng": 4.46888875961304,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 15,
                            "plannedArrivalDateTime": "2024-09-27T11:46:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "9",
                            "plannedDepartureTrack": "9",
                            "plannedArrivalTrack": "9",
                            "actualArrivalTrack": "9",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "bicycleSpotCount": 8,
                    "punctuality": 100.0,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#136#TA#0#DA#270924#1S#1100921#1T#1044#LS#1100684#LT#1211#PU#784#RT#1#CA#IC#ZE#1134#ZB#IC 1134 #PC#1#FR#1100921#FT#1044#TO#1100684#TT#1211#&train=1134&datetime=2024-09-27T10:44:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 62,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "1:02 u.",
                        "accessibilityValue": "1 uur en 2 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "bbba00a6_3",
            "crowdForecast": "LOW",
            "punctuality": 100.0,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8Unh6Ecw==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 530,
                    "name": "Rotterdam Centraal"
                }
            },
            "fares": [
                {
                    "priceInCents": 3587,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2110,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2870,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1688,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2152,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1266,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 7174,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 4220,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 5740,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 3376,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 4304,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 2532,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 73850,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 43700,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 60150,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 35380,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 721800,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 424560,
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
                        "name": "Rotterdam Centraal",
                        "lng": 4.46888875961304,
                        "lat": 51.9249992370605,
                        "countryCode": "NL",
                        "uicCode": "8400530",
                        "stationCode": "RTD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 2110,
                            "priceInCentsExcludingSupplement": 2110,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20240927/1044/1146?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T10%3A44%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T11%3A46%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D3166472657"
            },
            "realtime": true,
            "routeId": "=LR8Unh6Ecw==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T10%3A44%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T11%3A46%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D3166472657&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
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
            "uid": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T11:14:00+02:00|plannedArrivalTime=2024-09-27T12:16:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1683171655",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T11:14:00+02:00|plannedArrivalTime=2024-09-27T12:16:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=1683171655",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Rotterdam Centraal@L=1100740@a=128@$202409271114$202409271216$IC 1136 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#424034|424034|424096|424096|0|0|325|424005|4|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 62,
            "actualDurationInMinutes": 62,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1136",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#125#TA#1#DA#270924#1S#1100921#1T#1114#LS#1100705#LT#1241#PU#784#RT#1#CA#IC#ZE#1136#ZB#IC 1136 #PC#1#FR#1100921#FT#1114#TO#1100705#TT#1241#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T11:14:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-27T12:16:00+0200",
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
                                    "value": "2 tussenstops",
                                    "shortValue": "2 tussenstops",
                                    "accessibilityValue": "2 tussenstops",
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
                            "plannedDepartureDateTime": "2024-09-27T11:14:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:35:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:53:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:51:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400530",
                            "name": "Rotterdam Centraal",
                            "lat": 51.9249992370605,
                            "lng": 4.46888875961304,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 15,
                            "plannedArrivalDateTime": "2024-09-27T12:16:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "9",
                            "plannedDepartureTrack": "9",
                            "plannedArrivalTrack": "9",
                            "actualArrivalTrack": "9",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "punctuality": 72.7,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#125#TA#1#DA#270924#1S#1100921#1T#1114#LS#1100705#LT#1241#PU#784#RT#1#CA#IC#ZE#1136#ZB#IC 1136 #PC#1#FR#1100921#FT#1114#TO#1100705#TT#1241#&train=1136&datetime=2024-09-27T11:14:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 62,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "1:02 u.",
                        "accessibilityValue": "1 uur en 2 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "efff0564_3",
            "crowdForecast": "LOW",
            "punctuality": 72.7,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8Unh6Ecw==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 530,
                    "name": "Rotterdam Centraal"
                }
            },
            "fares": [
                {
                    "priceInCents": 3587,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2110,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2870,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1688,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2152,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1266,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 7174,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 4220,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 5740,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 3376,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 4304,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 2532,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 73850,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 43700,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 60150,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 35380,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 721800,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 424560,
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
                        "name": "Rotterdam Centraal",
                        "lng": 4.46888875961304,
                        "lat": 51.9249992370605,
                        "countryCode": "NL",
                        "uicCode": "8400530",
                        "stationCode": "RTD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 2110,
                            "priceInCentsExcludingSupplement": 2110,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20240927/1114/1216?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T11%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T12%3A16%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1683171655"
            },
            "realtime": true,
            "routeId": "=LR8Unh6Ecw==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T11%3A14%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T12%3A16%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D1683171655&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
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
            "idx": 4,
            "uid": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T11:21:00+02:00|plannedArrivalTime=2024-09-27T12:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2683390657",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T11:21:00+02:00|plannedArrivalTime=2024-09-27T12:36:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2683390657",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100851@a=128@$A=1@O=Tilburg@L=1100825@a=128@$202409271121$202409271150$SPR 6440$$1$$$$$$§W$A=1@O=Tilburg@L=1100825@a=128@$A=1@O=Tilburg@L=1100811@a=128@$202409271150$202409271152$$$1$$$$$$§T$A=1@O=Tilburg@L=1100811@a=128@$A=1@O=Breda@L=1101034@a=128@$202409271158$202409271210$IC303637$$2$$$$$$§W$A=1@O=Breda@L=1101034@a=128@$A=1@O=Breda@L=1100828@a=128@$202409271210$202409271214$$$1$$$$$$§T$A=1@O=Breda@L=1100828@a=128@$A=1@O=Rotterdam Centraal@L=1100726@a=128@$202409271214$202409271236$ICD 927 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#5#HIN#0#ECK#424041|424041|424116|424116|0|0|325|424035|5|0|2|0|0|-2147483648#¶KRCC¶#VE#1#VOLL#IST#",
            "plannedDurationInMinutes": 75,
            "actualDurationInMinutes": 75,
            "transfers": 2,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "SPR 6440",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Tilburg Universiteit",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#5028#TA#2#DA#270924#1S#1100851#1T#1121#LS#1101318#LT#1158#PU#784#RT#1#CA#SPR#ZE#6440#ZB#SPR 6440#PC#3#FR#1100851#FT#1121#TO#1101318#TT#1158#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T11:21:00+0200",
                        "plannedTrack": "3",
                        "actualTrack": "3",
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
                        "plannedDateTime": "2024-09-27T11:50:00+0200",
                        "plannedTrack": "2",
                        "actualTrack": "2",
                        "exitSide": "RIGHT",
                        "checkinStatus": "NOTHING",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "6440",
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
                            "plannedDepartureDateTime": "2024-09-27T11:21:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "3",
                            "plannedDepartureTrack": "3",
                            "plannedArrivalTrack": "3",
                            "actualArrivalTrack": "3",
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
                            "plannedDepartureDateTime": "2024-09-27T11:24:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:24:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:30:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:30:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:37:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:37:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T11:44:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T11:44:00+0200",
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
                            "plannedArrivalDateTime": "2024-09-27T11:50:00+0200",
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
                    "punctuality": 91.7,
                    "crossPlatformTransfer": true,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#5028#TA#2#DA#270924#1S#1100851#1T#1121#LS#1101318#LT#1158#PU#784#RT#1#CA#SPR#ZE#6440#ZB#SPR 6440#PC#3#FR#1100851#FT#1121#TO#1101318#TT#1158#&train=6440&datetime=2024-09-27T11:21:00+02:00"
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
                    "name": "IC 303637",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Vlissingen",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#931534#TA#0#DA#270924#1S#1101164#1T#1028#LS#1100748#LT#1339#PU#784#RT#2#CA#IC#ZE#303637#ZB#IC303637#PC#1#FR#1101164#FT#1028#TO#1100748#TT#1339#",
                    "origin": {
                        "name": "Tilburg",
                        "lng": 5.08361101150513,
                        "lat": 51.5605545043945,
                        "countryCode": "NL",
                        "uicCode": "8400597",
                        "stationCode": "TB",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T11:58:00+0200",
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
                        "plannedDateTime": "2024-09-27T12:10:00+0200",
                        "plannedTrack": "8",
                        "actualTrack": "8",
                        "checkinStatus": "NOTHING",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "303637",
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
                            "plannedDepartureDateTime": "2024-09-27T11:58:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "3",
                            "plannedDepartureTrack": "3",
                            "plannedArrivalTrack": "3",
                            "actualArrivalTrack": "3",
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
                            "routeIdx": 1,
                            "plannedArrivalDateTime": "2024-09-27T12:10:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "8",
                            "plannedDepartureTrack": "8",
                            "plannedArrivalTrack": "8",
                            "actualArrivalTrack": "8",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "UNKNOWN",
                    "crossPlatformTransfer": false,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#931534#TA#0#DA#270924#1S#1101164#1T#1028#LS#1100748#LT#1339#PU#784#RT#2#CA#IC#ZE#303637#ZB#IC303637#PC#1#FR#1101164#FT#1028#TO#1100748#TT#1339#&train=303637&datetime=2024-09-27T11:58:00+02:00"
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
                },
                {
                    "idx": "2",
                    "name": "ICD 927",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Amsterdam Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#6379#TA#1#DA#270924#1S#1100828#1T#1214#LS#1100893#LT#1323#PU#784#RT#1#CA#HSN#ZE#927#ZB#ICD 927 #PC#1#FR#1100828#FT#1214#TO#1100893#TT#1323#",
                    "origin": {
                        "name": "Breda",
                        "lng": 4.78000020980835,
                        "lat": 51.5955543518066,
                        "countryCode": "NL",
                        "uicCode": "8400131",
                        "stationCode": "BD",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T12:14:00+0200",
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
                        "plannedDateTime": "2024-09-27T12:36:00+0200",
                        "plannedTrack": "12",
                        "actualTrack": "12",
                        "exitSide": "LEFT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "927",
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
                            [
                                {
                                    "value": "NS Intercity direct",
                                    "shortValue": "NS Intercity direct",
                                    "accessibilityValue": "NS Intercity direct",
                                    "noteType": "ATTRIBUTE",
                                    "isPresentationRequired": true,
                                    "nesProperties": {
                                        "color": "text-body"
                                    }
                                }
                            ],
                            [
                                {
                                    "value": "richting Amsterdam Centraal",
                                    "shortValue": "richting Amsterdam Centraal",
                                    "accessibilityValue": "richting Amsterdam Centraal",
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
                            "message": "4 min. overstaptijd",
                            "accessibilityMessage": "4 minuten overstaptijd",
                            "type": "TRANSFER_TIME",
                            "messageNesProperties": {
                                "color": "text-default"
                            }
                        }
                    ],
                    "stops": [
                        {
                            "uicCode": "8400131",
                            "name": "Breda",
                            "lat": 51.5955543518066,
                            "lng": 4.78000020980835,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 0,
                            "plannedDepartureDateTime": "2024-09-27T12:14:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "actualDepartureTrack": "6",
                            "plannedDepartureTrack": "6",
                            "plannedArrivalTrack": "6",
                            "actualArrivalTrack": "6",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400530",
                            "name": "Rotterdam Centraal",
                            "lat": 51.9249992370605,
                            "lng": 4.46888875961304,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 6,
                            "plannedArrivalDateTime": "2024-09-27T12:36:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "12",
                            "plannedDepartureTrack": "12",
                            "plannedArrivalTrack": "12",
                            "actualArrivalTrack": "12",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "MEDIUM",
                    "punctuality": 83.3,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#6379#TA#1#DA#270924#1S#1100828#1T#1214#LS#1100893#LT#1323#PU#784#RT#1#CA#HSN#ZE#927#ZB#ICD 927 #PC#1#FR#1100828#FT#1214#TO#1100893#TT#1323#&train=927&datetime=2024-09-27T12:14:00+02:00"
                            }
                        }
                    ],
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
                }
            ],
            "checksum": "48deb900_3",
            "crowdForecast": "MEDIUM",
            "punctuality": 83.3,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8Unh6Ecw==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 530,
                    "name": "Rotterdam Centraal"
                }
            },
            "fares": [
                {
                    "priceInCents": 3587,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2110,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2870,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1688,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2152,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1266,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 7174,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 4220,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 5740,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 3376,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 4304,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 2532,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 73850,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 43700,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 60150,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 35380,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 721800,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 424560,
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
                        "name": "Rotterdam Centraal",
                        "lng": 4.46888875961304,
                        "lat": 51.9249992370605,
                        "countryCode": "NL",
                        "uicCode": "8400530",
                        "stationCode": "RTD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 2110,
                            "priceInCentsExcludingSupplement": 2110,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20240927/1121/1236?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T11%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T12%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2683390657"
            },
            "realtime": true,
            "routeId": "=LR8Unh6Ecw==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T11%3A21%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T12%3A36%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2683390657&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
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
                    "actualTrack": "3",
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
                },
                {
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
                }
            ]
        },
        {
            "idx": 5,
            "uid": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T11:44:00+02:00|plannedArrivalTime=2024-09-27T12:46:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2048008564",
            "ctxRecon": "arnu|fromStation=8400206|toStation=8400530|originWalk=true|plannedFromTime=2024-09-27T11:44:00+02:00|plannedArrivalTime=2024-09-27T12:46:00+02:00|excludeHighSpeedTrains=false|searchForAccessibleTrip=false|localTrainsOnly=false|disabledTransportModalities=BUS,FERRY,TRAM,METRO|travelAssistance=false|tripSummaryHash=2048008564",
            "sourceCtxRecon": "¶HKI¶T$A=1@O=Eindhoven Centraal@L=1100921@a=128@$A=1@O=Rotterdam Centraal@L=1100740@a=128@$202409271144$202409271246$IC 1138 $$1$$$$$$¶KC¶#VE#2#CF#100#CA#0#CM#0#SICT#0#AM#16481#AM2#0#RT#31#¶KCC¶#VE#0#ERG#1#HIN#0#ECK#424064|424064|424126|424126|0|0|325|424042|6|0|10|0|0|-2147483648#¶KRCC¶#VE#1#MRTF#",
            "plannedDurationInMinutes": 62,
            "actualDurationInMinutes": 62,
            "transfers": 0,
            "status": "NORMAL",
            "messages": [],
            "legs": [
                {
                    "idx": "0",
                    "name": "IC 1138",
                    "travelType": "PUBLIC_TRANSIT",
                    "direction": "Den Haag Centraal",
                    "partCancelled": false,
                    "cancelled": false,
                    "changePossible": true,
                    "alternativeTransport": false,
                    "journeyDetailRef": "HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#140#TA#0#DA#270924#1S#1100921#1T#1144#LS#1100684#LT#1311#PU#784#RT#1#CA#IC#ZE#1138#ZB#IC 1138 #PC#1#FR#1100921#FT#1144#TO#1100684#TT#1311#",
                    "origin": {
                        "name": "Eindhoven Centraal",
                        "lng": 5.48138904571533,
                        "lat": 51.4433326721191,
                        "countryCode": "NL",
                        "uicCode": "8400206",
                        "stationCode": "EHV",
                        "type": "STATION",
                        "plannedTimeZoneOffset": 120,
                        "plannedDateTime": "2024-09-27T11:44:00+0200",
                        "plannedTrack": "5",
                        "actualTrack": "5",
                        "checkinStatus": "CHECKIN",
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
                        "plannedDateTime": "2024-09-27T12:46:00+0200",
                        "plannedTrack": "9",
                        "actualTrack": "9",
                        "exitSide": "LEFT",
                        "checkinStatus": "CHECKOUT",
                        "notes": []
                    },
                    "product": {
                        "productType": "Product",
                        "number": "1138",
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
                                    "value": "2 tussenstops",
                                    "shortValue": "2 tussenstops",
                                    "accessibilityValue": "2 tussenstops",
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
                            "plannedDepartureDateTime": "2024-09-27T11:44:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T12:07:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T12:05:00+0200",
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
                            "plannedDepartureDateTime": "2024-09-27T12:23:00+0200",
                            "plannedDepartureTimeZoneOffset": 120,
                            "plannedArrivalDateTime": "2024-09-27T12:21:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "7",
                            "plannedDepartureTrack": "7",
                            "plannedArrivalTrack": "7",
                            "actualArrivalTrack": "7",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        },
                        {
                            "uicCode": "8400530",
                            "name": "Rotterdam Centraal",
                            "lat": 51.9249992370605,
                            "lng": 4.46888875961304,
                            "countryCode": "NL",
                            "notes": [],
                            "routeIdx": 15,
                            "plannedArrivalDateTime": "2024-09-27T12:46:00+0200",
                            "plannedArrivalTimeZoneOffset": 120,
                            "actualDepartureTrack": "9",
                            "plannedDepartureTrack": "9",
                            "plannedArrivalTrack": "9",
                            "actualArrivalTrack": "9",
                            "cancelled": false,
                            "borderStop": false,
                            "passing": false
                        }
                    ],
                    "crowdForecast": "LOW",
                    "punctuality": 90.9,
                    "shorterStock": false,
                    "journeyDetail": [
                        {
                            "type": "TRAIN_XML",
                            "link": {
                                "uri": "/api/v2/journey?id=HARP_MM-2|#VN#1#ST#1727260672#PI#0#ZI#140#TA#0#DA#270924#1S#1100921#1T#1144#LS#1100684#LT#1311#PU#784#RT#1#CA#IC#ZE#1138#ZB#IC 1138 #PC#1#FR#1100921#FT#1144#TO#1100684#TT#1311#&train=1138&datetime=2024-09-27T11:44:00+02:00"
                            }
                        }
                    ],
                    "reachable": true,
                    "plannedDurationInMinutes": 62,
                    "nesProperties": {
                        "color": "text-info",
                        "scope": "LEG_LINE",
                        "styles": {
                            "type": "LineStyles",
                            "dashed": false
                        }
                    },
                    "duration": {
                        "value": "1:02 u.",
                        "accessibilityValue": "1 uur en 2 minuten",
                        "nesProperties": {
                            "color": "text-body"
                        }
                    }
                }
            ],
            "checksum": "bdfae5dd_3",
            "crowdForecast": "LOW",
            "punctuality": 90.9,
            "optimal": false,
            "fareRoute": {
                "routeId": "=LR8Unh6Ecw==",
                "origin": {
                    "varCode": 206,
                    "name": "Eindhoven Centraal"
                },
                "destination": {
                    "varCode": 530,
                    "name": "Rotterdam Centraal"
                }
            },
            "fares": [
                {
                    "priceInCents": 3587,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2110,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 2870,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 1688,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 2152,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 1266,
                    "product": "OVCHIPKAART_ENKELE_REIS",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 7174,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 4220,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 5740,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 3376,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_20_PERCENT"
                },
                {
                    "priceInCents": 4304,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 2532,
                    "product": "OVCHIPKAART_RETOUR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "DISCOUNT_40_PERCENT"
                },
                {
                    "priceInCents": 73850,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 43700,
                    "product": "TRAJECT_VRIJ_MAAND",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 60150,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 35380,
                    "product": "TRAJECT_VRIJ_JAAR",
                    "travelClass": "SECOND_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 721800,
                    "product": "BUSINESS_CARD_TRAJECT_VRIJ_JAAR",
                    "travelClass": "FIRST_CLASS",
                    "discountType": "NO_DISCOUNT"
                },
                {
                    "priceInCents": 424560,
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
                        "name": "Rotterdam Centraal",
                        "lng": 4.46888875961304,
                        "lat": 51.9249992370605,
                        "countryCode": "NL",
                        "uicCode": "8400530",
                        "stationCode": "RTD",
                        "type": "STATION"
                    },
                    "operator": "NS",
                    "productTypes": [
                        "TRAIN"
                    ],
                    "fares": [
                        {
                            "priceInCents": 2110,
                            "priceInCentsExcludingSupplement": 2110,
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
                "url": "https://www.nsinternational.com/nl/treintickets-v3/#/search/EHV/RTD/20240927/1144/1246?stationType=domestic&cookieConsent=false",
                "showInternationalBanner": false
            },
            "type": "NS",
            "shareUrl": {
                "uri": "https://www.ns.nl/rpx?ctx=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T11%3A44%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T12%3A46%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2048008564"
            },
            "realtime": true,
            "routeId": "=LR8Unh6Ecw==",
            "registerJourney": {
                "url": "https://treinwijzer.ns.nl/idp/login?ctxRecon=arnu%7CfromStation%3D8400206%7CtoStation%3D8400530%7CoriginWalk%3Dtrue%7CplannedFromTime%3D2024-09-27T11%3A44%3A00%2B02%3A00%7CplannedArrivalTime%3D2024-09-27T12%3A46%3A00%2B02%3A00%7CexcludeHighSpeedTrains%3Dfalse%7CsearchForAccessibleTrip%3Dfalse%7ClocalTrainsOnly%3Dfalse%7CdisabledTransportModalities%3DBUS%2CFERRY%2CTRAM%2CMETRO%7CtravelAssistance%3Dfalse%7CtripSummaryHash%3D2048008564&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
                "searchUrl": "https://treinwijzer.ns.nl/idp/login?search=true&originUicCode=8400206&destinationUicCode=8400530&dateTime=2024-09-27T10%3A15%3A20.137643%2B02%3A00&searchForArrival=false&excludeHighSpeedTrains=false&localTrainsOnly=false&searchForAccessibleTrip=false&lang=nl&travelAssistance=false",
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
        }
    ],
    "scrollRequestBackwardContext": "3|OB|MTµ14µ423974µ423974µ424036µ424036µ0µ0µ325µ423965µ1µ0µ10µ0µ0µ-2147483648µ1µ2|PDHµa630dc3bd49b42bb6c85359a2469b676|RDµ27092024|RTµ100500|USµ0|RSµINIT",
    "scrollRequestForwardContext": "3|OF|MTµ14µ424064µ424064µ424126µ424126µ0µ0µ325µ424042µ6µ0µ10µ0µ0µ-2147483648µ1µ2|PDHµa630dc3bd49b42bb6c85359a2469b676|RDµ27092024|RTµ100500|USµ0|RSµINIT"
}
