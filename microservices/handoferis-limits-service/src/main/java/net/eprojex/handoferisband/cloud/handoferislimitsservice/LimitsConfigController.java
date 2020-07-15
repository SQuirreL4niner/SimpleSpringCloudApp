package net.eprojex.handoferisband.cloud.handoferislimitsservice;

import net.eprojex.handoferisband.cloud.handoferislimitsservice.bean.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

    @Autowired
    private Config config;

    @GetMapping("/limits")
    public LimitConfig retrieveLimitsFromConfig(){
        return new LimitConfig(config.getMax(),config.getMin());
    }
}
