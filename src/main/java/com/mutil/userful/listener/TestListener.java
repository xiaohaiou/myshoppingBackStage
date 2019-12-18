package com.mutil.userful.listener;

import com.lc.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestListener implements CommandLineRunner{

    private static final Logger logger = LoggerFactory.getLogger(TestListener.class);

    @Autowired
    private RedisService redisService;

    @Override
    public void run(String... args) throws Exception {
        //strategytest();
        //redisutiltest();
    }


    public void redisutiltest(){
        redisService.set("zhu","liang");
        System.out.println("---------------------------------------------------"+redisService.get("zhu"));
    }


}
