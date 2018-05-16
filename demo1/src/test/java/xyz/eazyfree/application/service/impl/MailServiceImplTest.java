package xyz.eazyfree.application.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import xyz.eazyfree.Demo1ApplicationTests;
import xyz.eazyfree.application.service.MailService;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/14.11:34
 */
public class MailServiceImplTest extends Demo1ApplicationTests {


    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private MailService service;

    @Value("${spring.mail.from-addr}")
    private String from;


    @Test
    public void sendSimpleMail() throws Exception {
        service.sendSimpleMail("526413543@qq.com","这是一个测试邮件","I will spend all my life showing" +
                "you how much i love you");
    }

    @Test
    public void sendHtmlMail() throws Exception {
        service.sendHtmlMail("526413543@qq.com","我给你发邮件了","<h1 color='red' width='600px'>I will spend all my life showing" +
                " you how much i love you</h1>");
    }

    @Test
    public void sendAttachmentsMail() throws Exception {
    }

    @Test
    public void sendInlineResourceMail() throws Exception {
    }

}