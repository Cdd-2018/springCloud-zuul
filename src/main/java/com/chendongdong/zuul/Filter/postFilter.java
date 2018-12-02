package com.chendongdong.zuul.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class postFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("==============post==============");
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.set("error","--------------error-------------");
        return null;
//        throw new RuntimeException();
    }
}
