package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "web.config")  //这表示这个类将从属性文件中读取web.config开头的属性值
public class WebConfig {

    private String webTitle;

    private String authorName;

    private String authorBlogUrl;

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorBlogUrl() {
        return authorBlogUrl;
    }

    public void setAuthorBlogUrl(String authorBlogUrl) {
        this.authorBlogUrl = authorBlogUrl;
    }
}
