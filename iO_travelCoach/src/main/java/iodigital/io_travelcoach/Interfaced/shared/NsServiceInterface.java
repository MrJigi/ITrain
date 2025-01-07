package iodigital.io_travelcoach.Interfaced.shared;

import iodigital.io_travelcoach.model.TripResponse;

public interface NsServiceInterface
{
    TripResponse getInfoForTrip(String startStation, String endStation);
}
