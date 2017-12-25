package org.xavier.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 描述信息：<br/>
 * 邮箱配置参数
 *
 * @author Xavier
 * @version 1.0
 * @date 2017.12.25
 * @since Jdk 1.8
 */
@ConfigurationProperties(prefix = "xavier.email")
public class EmailProperties {
    private String hostName;
    private String smtpPort;
    private Boolean sslOnConnect;
    private String sslSmtpPort;
    private String ac;
    private String pw;

    public EmailProperties() {
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    public Boolean getSslOnConnect() {
        return sslOnConnect;
    }

    public void setSslOnConnect(Boolean sslOnConnect) {
        this.sslOnConnect = sslOnConnect;
    }

    public String getSslSmtpPort() {
        return sslSmtpPort;
    }

    public void setSslSmtpPort(String sslSmtpPort) {
        this.sslSmtpPort = sslSmtpPort;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
