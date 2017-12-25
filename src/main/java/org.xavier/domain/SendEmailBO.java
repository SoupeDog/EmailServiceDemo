package org.xavier.domain;

import java.util.ArrayList;

/**
 * 描述信息：<br/>
 * 发送邮件业务对象
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.25
 * @since Jdk 1.8
 */
public class SendEmailBO {
    private String subject;
    private String content;
    private ArrayList<String> to;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getTo() {
        return to;
    }

    public void setTo(ArrayList<String> to) {
        this.to = to;
    }
}
