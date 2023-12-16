package com.yubi.BRMS.service.geolocation;

import com.yubi.BRMS.model.Geolocation;

import java.util.List;

public interface GeoLocationService {

    List<Geolocation> getAllLocation();

    Geolocation findByName(String name);
}
