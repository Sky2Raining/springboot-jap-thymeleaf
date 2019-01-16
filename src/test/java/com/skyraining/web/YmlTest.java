package com.skyraining.web;

import java.util.HashMap;
import java.util.Map;

import com.skyraining.util.SkyrainingYmlUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YmlTest {

	
	@Autowired
    private SkyrainingYmlUtil skyrainingYmlUtil;


    @Test
    public void getHello() throws Exception {
    	System.out.println(skyrainingYmlUtil.getTitle());
        Assert.assertEquals(skyrainingYmlUtil.getTitle(), "了解一下");
        Assert.assertEquals(skyrainingYmlUtil.getDescription(), "问题不大");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	long xx=orderMinTime.get("123");
    }

}