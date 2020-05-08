package com.demo.ehCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Cache {
    //1、将结果缓存进缓存池
    @Cacheable(value = "demoCache",key="#val") //对应ehcache.xml中的缓存池名称
    public Object getObject(String val){
        return  new Object();//这是数据库查询操作
    }

    //2、清楚这个缓存池
    @CacheEvict(value = "demoCache",allEntries = true)
    public void evictCache(){
        System.out.println("清楚缓存demoCache成功");
    }

    //2、清楚这个缓存池指定key值
    @CacheEvict(value = "demoCache",key = "#name")
    public void evictCacheByName(String name){
        System.out.println("清楚缓存demoCache"+name+"成功");
    }

}
