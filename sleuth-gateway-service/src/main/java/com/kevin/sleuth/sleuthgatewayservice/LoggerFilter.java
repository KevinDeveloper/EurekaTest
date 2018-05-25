package com.kevin.sleuth.sleuthgatewayservice;

import com.netflix.zuul.ZuulFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * @ClassName: LoggerFilter
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 20:13
 */
@Component
public class LoggerFilter extends ZuulFilter {
    @Autowired
    Tracer tracer;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operator", "kevin");
        System.out.println("traceId ="+tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
