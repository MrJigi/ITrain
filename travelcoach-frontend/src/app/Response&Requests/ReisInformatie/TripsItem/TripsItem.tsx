
export interface TripsItem {
    idx: number,
    plannedDurationInMinutes: number;
    actualDurationInMinutes: number;
    transfers:number,
    legs: Legs[],
    fareLegs: FareLegs[]

}

export interface Legs{
    idx:number,
    name:string,
    direction:string,
    cancelled:boolean,
    actualDurationInMinutes:number,
    origin: Origin,
    destination: Destination,
    stops:Stops[],
    plannedDurationInMinutes:number

}
export interface Destination{
    name:string,
    lat:number,
    lng:number,
    stationCode:string,
    plannedDateTime:string,
    plannedTrack:string,
    actualTrack:string,
    exitSide:string

}

export interface Origin{
    name:string,
    lat:number,
    lng:number,
    stationCode:string,
    plannedDateTime:string,
    plannedTrack:string,
    actualTrack:string,
}

export interface Stops{
    uicCode: number,
    name:string,
    lat:number,
    lng:number,
    plannedDepartureDateTime:string,
    actualDepartureTrack:string,
    plannedDepartureTrack:string,

}

export interface FareLegs{
    origin:Origin,
    destination:Destination,
    operator:string,
    fares:Fares[]
}

export interface Fares {
    priceInCents:number,
    product:string,
    travelClass:string,
    discountType:string
}