package xyz.eazyfree.common.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import xyz.eazyfree.application.service.MailService;

import java.text.SimpleDateFormat;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Component
@Slf4j
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private MailService service;

    @Scheduled(fixedRate = 15000)
    public void reportCurrentTime() {
//        log.info("The time is now {}", dateFormat.format(new Date()));

//        service.sendSimpleMail("526413543@qq.com" ,"how are you " ,dateFormat.format(new Date()));

    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void reportCurrentTime2() {
//        log.info("现在是 {}", dateFormat.format(new Date()));
    }

}
