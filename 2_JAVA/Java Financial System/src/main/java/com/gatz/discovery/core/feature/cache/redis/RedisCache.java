package com.gatz.discovery.core.feature.cache.redis;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.gatz.discovery.core.util.SerializeUtil;
/**
 * RedisCache : redis 缓存 插件
 *
 * @author xiayiliang
 * @since 2016-03-10 11:12
 */
@Component(value = "redisCache")
public class RedisCache {
//    private static int port = 6379;
//    private static String host = "123.56.204.228";
//    private static Jedis jedis = new Jedis(host, port);
    private static JedisPool pool = null;  
    
    /** 
     * 构建redis连接池 
     *  
     * @param ip 
     * @param port 
     * @return JedisPool 
     */  
    public static JedisPool getPool() {  
        if (pool == null) {  
            JedisPoolConfig config = new JedisPoolConfig();  
            //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；  
            //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。  
            config.setMaxTotal(500);
            //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。  
            config.setMaxIdle(5);  
            //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；  
            config.setMaxWaitMillis(1000 * 100);
            //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；  
            config.setTestOnBorrow(true);  
            pool = new JedisPool(config, "10.16.21.57", 6379);  
        }  
        return pool;  
    }  
      
    /** 
     * 返还到连接池 
     *  
     * @param pool  
     * @param redis 
     */  
    public static void returnResource(JedisPool pool, Jedis redis) {  
        if (redis != null) {  
            pool.returnResource(redis);  
        }  
    }  
    
    public String cache(String key, String value, int seconds) {
    	JedisPool pool = null;  
        Jedis jedis = null;  
        String result = null;
        try {  
            pool = getPool();  
            jedis = pool.getResource();  
            result = jedis.set(key, value);
            jedis.expire(key, seconds);
            
        } catch (Exception e) {  
            //释放redis对象  
            pool.returnBrokenResource(jedis);  
            e.printStackTrace();  
        } finally {  
            //返还到连接池  
            returnResource(pool, jedis);  
        }  
        return result;
    }

    public String get(String key) {
        String value = null;  
        
        JedisPool pool = null;  
        Jedis jedis = null;  
        try {  
            pool = getPool();  
            jedis = pool.getResource();  
            value = jedis.get(key);  
        } catch (Exception e) {  
            //释放redis对象  
            pool.returnBrokenResource(jedis);  
            e.printStackTrace();  
        } finally {  
            //返还到连接池  
            returnResource(pool, jedis);  
        }  
          
        return value;  
    }
    
    public Long remove(String key) {
        Long value = null;  
        
        JedisPool pool = null;  
        Jedis jedis = null;  
        try {  
            pool = getPool();  
            jedis = pool.getResource();  
            value = jedis.del(key);  
        } catch (Exception e) {  
            //释放redis对象  
            pool.returnBrokenResource(jedis);  
            e.printStackTrace();  
        } finally {  
            //返还到连接池  
            returnResource(pool, jedis);  
        }  
          
        return value;  
    }
    
    public static void  setObject(String key , Object obj , int seconds){
    	JedisPool pool = null;  
        Jedis jedis = null;  
        try {  
            pool = getPool();  
            jedis = pool.getResource();  
            jedis.set(key.getBytes(), SerializeUtil.serialize(obj));
        	jedis.expire(key.getBytes(), seconds);  
        } catch (Exception e) {  
            //释放redis对象  
            pool.returnBrokenResource(jedis);  
            e.printStackTrace();  
        } finally {  
            //返还到连接池  
            returnResource(pool, jedis);  
        } 
    	
    }
    
    public static Object getObject(String key){
    	Object obj = null;
    	JedisPool pool = null;  
        Jedis jedis = null;  
        try {  
            pool = getPool();  
            jedis = pool.getResource();  
            obj= SerializeUtil.unserialize(jedis.get(key.getBytes()));
        } catch (Exception e) {  
            //释放redis对象  
            pool.returnBrokenResource(jedis);  
            e.printStackTrace();  
        } finally {  
            //返还到连接池  
            returnResource(pool, jedis);  
        } 
    	return obj;
    }
    
    public static Long removeObject(String key) {
Long value = null;  
        
        JedisPool pool = null;  
        Jedis jedis = null;  
        try {  
            pool = getPool();  
            jedis = pool.getResource();  
            value = jedis.del(key.getBytes());  
        } catch (Exception e) {  
            //释放redis对象  
            pool.returnBrokenResource(jedis);  
            e.printStackTrace();  
        } finally {  
            //返还到连接池  
            returnResource(pool, jedis);  
        }  
          
        return value; 
    }
}
