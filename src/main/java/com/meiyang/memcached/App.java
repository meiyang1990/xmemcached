package com.meiyang.memcached;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
    	 MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses("203.195.211.193:30001"));
    	 MemcachedClient client = builder.build();
//    	 client.set("memberTest", 0, "memberTestValue");
    	 
    	 Object value = client.get("memberTest");
    	 System.out.println(value);
    	 
    
    }
    
    
}
