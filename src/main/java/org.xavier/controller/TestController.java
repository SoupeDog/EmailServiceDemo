package org.xavier.controller;

import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xavier.EmailEmitter;
import org.xavier.config.EmailProperties;
import org.xavier.domain.SendEmailBO;

import java.util.Map;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.25
 * @since Jdk 1.8
 */
@RestController
public class TestController {
    @Autowired
    EmailEmitter emailEmitter;
    @Autowired
    EmailProperties emailProperties;

    @PostMapping("/")
    public String send(@RequestBody SendEmailBO sendEmailBO) throws EmailException {
        emailEmitter.send(sendEmailBO.getSubject(), sendEmailBO.getContent(), emailProperties.getAc(), sendEmailBO.getTo());
        return "success";
    }
}
