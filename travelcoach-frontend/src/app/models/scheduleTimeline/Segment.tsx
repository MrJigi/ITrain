class Segment {
    name: string;        // Optional name for the segment
    idx: number;         // Original index in the data
    routeidx: number;    // Route index for internal use
    station: string;     // Name of the station
    time: string;        // Time of arrival or departure
    lat: number;         // Latitude of the station
    lng: number;         // Longitude of the station
    track: string;       // Track information

    isMainTrip: boolean; // True if part of main trip (origin/destination)
    tripId: number;      // Identifier for the trip
    isStop: boolean;     // True if it's an actual stop
    sequence: number;    // Sequence within the trip

    constructor(idx: number, station: string, time: string, tripId: number) {
        this.idx = idx;
        this.station = station;
        this.time = time;
        this.tripId = tripId;
        this.isMainTrip = false; // Default
        this.isStop = false;     // Default
        this.sequence = 0;       // Default
    }
}