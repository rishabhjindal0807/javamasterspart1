package com.yubi.BRMS.service.bus;

import com.yubi.BRMS.model.Bus;

import java.util.List;

public interface BusService {

    List<Bus> getAllBus();

    Bus addBus(Bus bus) throws Exception;

    Bus updateBus(Bus bus, String id) throws Exception;

    String getREgNoById(String Id);
}
