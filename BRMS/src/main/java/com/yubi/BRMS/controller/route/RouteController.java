package com.yubi.BRMS.controller.route;

import com.yubi.BRMS.model.Route;
import com.yubi.BRMS.model.RouteResponse;
import com.yubi.BRMS.service.route.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/route")
public class RouteController {

    @Autowired
    RouteService routeService;

    @PostMapping("/add")
    public ResponseEntity<?> addRoute(@RequestBody Route route){
        try{
            Route newRoute =  routeService.addRoute(route);
            return ResponseEntity.ok(newRoute);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllRoutes(){
        List<RouteResponse> routes = routeService.getAllRoute();
        return ResponseEntity.ok(routes);
    }

}
