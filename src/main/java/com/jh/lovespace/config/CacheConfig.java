package com.jh.lovespace.config;

import com.github.benmanes.caffeine.cache.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangjuchao
 * @create 2020/9/2
 */
@Configuration
public class CacheConfig {

    @Bean
    public Cache<String,String> caffeineCache() {
        return Caffeine.newBuilder()
                .refreshAfterWrite(5, TimeUnit.SECONDS)
                .initialCapacity(100)
                .maximumSize(1000)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String s) throws Exception {
                        return s+"ok";
                    }
                });
    }

    @Bean
    public LoadingCache caffeineLoadingCache() {
        return Caffeine.newBuilder()
                .refreshAfterWrite(5, TimeUnit.SECONDS)
                .initialCapacity(100)
                .maximumSize(1000)
                .build(key -> createExpensiveGraph(key));
    }
    @Bean
    public AsyncLoadingCache caffeineAsyncLoadingCache() {
        return Caffeine.newBuilder()
                .refreshAfterWrite(5, TimeUnit.SECONDS)
                .initialCapacity(100)
                .maximumSize(1000)
                .buildAsync(key -> createExpensiveGraph(key));
    }

    private Object createExpensiveGraph(Object key) {
        //重写load方法
        return "lala";
    }

}
