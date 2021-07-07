package com.gatz.discovery.test.bean;

import com.gatz.discovery.core.feature.test.TestSupport;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * SpiderTest : 爬虫测试类
 *
 * @author
 * @since 2014-10-27 22:44
 */
public class SpiderTest extends TestSupport {

    @Resource
    private Spider spider;

    @Test
    public void testInjectSpider() throws Exception {
        System.out.println(spider);
    }
}
