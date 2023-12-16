package com.yubi.BRMS.service.route;

import com.yubi.BRMS.model.Route;
import com.yubi.BRMS.model.RouteResponse;

import java.util.List;

public interface RouteService {

    Route addRoute(Route route) throws Exception;

    List<RouteResponse> getAllRoute();
}
