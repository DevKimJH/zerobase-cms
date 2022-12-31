package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail(){

        SendMailForm form = SendMailForm.builder()
                .from("zerobase@test.com")
                .to("hg116701@naver.com")
                .subject("Test email from zerobase")
                .text("my text")
                .build();

        return mailgunClient.sendEmail(form).getBody();
    }
}
