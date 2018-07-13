package com.zengqiang.project.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @FileName: <p>TestJob</p>
 * @Description: <p>测试定时任务</p>
 * @Author <p>zengqiang</p>
 * @Date <p>18-7-6</p>
 * <p>============================</p>
 * @Company: <p></p>
 * @Copyright: <p></p>
 *
 * <p>============================</p>
 */
public class TestJob {
    private static final Logger logger = LoggerFactory.getLogger(TestJob.class);
    public void executeJob() {
        logger.info("定时任务3进行中.......");
        // do something else
    }
}
