package xyz.eazyfree.service;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/14.11:22
 */
public interface MailService {

     void sendSimpleMail(String to, String subject, String content);

     void sendHtmlMail(String to, String subject, String content);

     void sendAttachmentsMail(String to, String subject, String content, String filePath);

     void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

}
