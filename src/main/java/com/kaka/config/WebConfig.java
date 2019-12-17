package com.kaka.config;

import com.kaka.filter.KakaFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu.Gong
 * @date 12/4/2019
 */
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        KakaFilter myFilter = new KakaFilter();
        filterRegistrationBean.setFilter(myFilter);
        // 设置MyFile在指定url起作用
        List<String> urlList = new ArrayList<>();
        urlList.add("/hello");
        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }
}
