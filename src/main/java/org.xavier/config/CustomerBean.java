package org.xavier.config;

import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述信息：<br/>
 * 自定义Bean
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.25
 * @since Jdk 1.8
 */
@Configuration
public class CustomerBean {
    @Autowired
    EmailProperties emailProperties;

    @Bean
    public HtmlEmail htmlEmail() {
        HtmlEmail htmlEmail = new HtmlEmail() {{
            setHostName(emailProperties.getHostName());
            setSSLOnConnect(emailProperties.getSslOnConnect());
            setSslSmtpPort(emailProperties.getSslSmtpPort());
            setAuthentication(emailProperties.getAc(), emailProperties.getPw());
        }};
        return htmlEmail;
    }
}
