package com.example.demomail;

import com.weiyun.mail.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemomailApplicationTests {

    @Autowired
    private MailService service;

    @Test
    public void test() {
        for (int i = 0; i < 100; i++)
            service.SendEmail("yangloveyoualways@126.com", "first", "第一次测试邮件");
    }

    @Test
    public void testSendHtml() {
        String content = "<html>\n" + "<body style='color:red'>\n"
                + "<div style='color:blue'>hello world!测试发送html格式邮件lelelelele</div>\n"
                + "</body>\n" + "</html>";
        service.sendHtmlEmail("yangloveyoualways@126.com", "first", content);
    }
}
