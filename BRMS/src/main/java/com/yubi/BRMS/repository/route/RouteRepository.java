package com.yubi.BRMS.repository.route;

import com.yubi.BRMS.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, String> {
}
