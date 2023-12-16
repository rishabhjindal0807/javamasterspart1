package com.yubi.BRMS.repository.GeoLocation;

import com.yubi.BRMS.model.Geolocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoLocationRepository extends MongoRepository<Geolocation, String> {
    Geolocation findByName(String name);

}
