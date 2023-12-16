package com.yubi.BRMS.service.geolocation;

import com.yubi.BRMS.dao.geolocation.GeoLocationDao;
import com.yubi.BRMS.model.Geolocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GeoLocationServiceImpl implements GeoLocationService {

    @Autowired
    private GeoLocationDao geoLocationDao;
    @Override
    public List<Geolocation> getAllLocation() {
        return geoLocationDao.findAllLocation();
    }

    @Override
    public Geolocation findByName (String name){
        return geoLocationDao.findByName(name);
    }

}
