package com.skyraining.web;

import java.util.HashMap;
import java.util.Map;

import com.skyraining.util.SkyrainingProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {

	
	@Autowired
    private SkyrainingProperties skyrainingProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(skyrainingProperties.getTitle());
        Assert.assertEquals(skyrainingProperties.getTitle(), "了解一下");
        Assert.assertEquals(skyrainingProperties.getDescription(), "问题不大");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	long xx=orderMinTime.get("123");
    }

}