package io.renren.wcs.client.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author ：zzwy
 * @date ：Created in 2019/12/20 12:01
 * @description：服务初始化
 * @modified By：
 * @version: 1.0
 **/
@Component
public class init {

    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * @author     ：zzwy
     * @date       ：2019/12/20
     * @description：初始化服务类
     * @modified By：
     * @version: 1.0
     */
    @PostConstruct
    public void init()
    {
       logger.info("初始化启动类");
    }
}
