package com.jh.lovespace;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lombok.SneakyThrows;
import lombok.var;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class LovespaceApplicationTests {

    @Autowired
    Cache<String, String> caffeineCache;

    @Autowired
    LoadingCache<String,String> loadingCache;
    @Test
    void contextLoads() {
    }

    @Test
    @SneakyThrows
    public void testCache(){
        //caffeineCache.put("a","11");
        /*for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            new Thread(()->{
                var b = caffeineCache.getIfPresent("a");
                System.out.println(Thread.currentThread().getId()+"-"+b);
            }).start();
            new Thread(()->{
                var b = caffeineCache.getIfPresent("a");
                System.out.println(Thread.currentThread().getId()+"-"+b);
            }).start();

        }*/
        //System.out.println(caffeineCache.get("b", key -> key));
        //System.out.println(caffeineCache.asMap().get("a"));
        loadingCache.put("a","3");
        System.out.println(loadingCache.get("a"));
        System.out.println(loadingCache.get("b"));
    }

}
