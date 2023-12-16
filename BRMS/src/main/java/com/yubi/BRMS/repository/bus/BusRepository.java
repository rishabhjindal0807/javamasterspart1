package com.yubi.BRMS.repository.bus;

import com.yubi.BRMS.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByRegNumber(String regNumber);
}
