package org.xavier.manager;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述信息：<br/>
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.25
 * @since Jdk 1.8
 */
@Component
public class EmailEmitter {
    @Autowired
    HtmlEmail htmlEmail;


    public Boolean send(String subject, String content, String from, List<String> to) throws EmailException {
        htmlEmail.setCharset("utf-8");
        htmlEmail.setFrom(from);
        for (String temp : to) {
            htmlEmail.addTo(temp);
        }
        htmlEmail.setSubject(subject);
        htmlEmail.setMsg(content);
        htmlEmail.send();
        return true;
    }


}
