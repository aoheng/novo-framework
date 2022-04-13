package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.HashMap;

/**
 * @author of Aoheng
 * @TODO 邮件请求协议
 * @date 2020-03-12 14:42
 **/

public class EmailRequestProtocol extends PaginationRequestProtocol {


    private Long id;
    /**
     * 接收方邮件
     */
    private String[] email;
    /**
     * 主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;

    /**
     * 模板
     */
    private String template;
    /**
     * 自定义参数
     */
    private HashMap<String, String> kvMap;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public HashMap<String, String> getKvMap() {
        return kvMap;
    }

    public void setKvMap(HashMap<String, String> kvMap) {
        this.kvMap = kvMap;
    }
}
