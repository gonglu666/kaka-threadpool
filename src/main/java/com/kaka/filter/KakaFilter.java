package com.kaka.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
import java.util.logging.LogRecord;

/**
 * @author Lu.Gong
 * @date 12/4/2019
 */
public class KakaFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("kaka filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("kaka filter start");
        long start = new Date().getTime();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("kaka filter 耗时:" + (new Date().getTime() - start));
        System.out.println("kaka filter finish");
    }

    @Override
    public void destroy() {
        System.out.println("kaka filter destroy");
    }
}
