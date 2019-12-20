package io.renren.wcs.client.init.Thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：zzwy
 * @date ：Created in 2019/12/20 12:06
 * @description：初始化服务线程
 * @modified By：
 * @version: 1.0
 */
public class initThread implements Runnable{
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void run() {
       logger.info("======================初始化服务线程============================");
    }
}
