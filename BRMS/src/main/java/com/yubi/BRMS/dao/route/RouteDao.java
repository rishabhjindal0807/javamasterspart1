package com.yubi.BRMS.dao.route;

import com.yubi.BRMS.model.Route;

import java.util.List;

public interface RouteDao {

    Route addRoute(Route route);

    Route updateRoute(Route route);

    Route deleteRoute(Route route);

    List<Route> findAllRoute();

}
