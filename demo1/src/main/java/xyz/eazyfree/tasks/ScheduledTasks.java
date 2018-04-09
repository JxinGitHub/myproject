package xyz.eazyfree.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Component
@Slf4j
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
//        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void reportCurrentTime2() {
//        log.info("现在是 {}", dateFormat.format(new Date()));
    }

}
