package com.chendongdong.zuul.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.util.StringUtils;

public class preFilter extends ZuulFilter{

    private final String PRE = "pre";//表示路由之前
    private final String ROUTE = "route";//表示路由当中
    private final String POST = "post";//表示路由之后
    private final String ERROR = "error";//表示路由发生错误

    @Override
    public String filterType() {
        return PRE;
    }

    @Override
    public int filterOrder() {
        return 0;//执行时序， 值是0,1,2....N等自然数。 0的优先级最高，即最先执行。
    }

    @Override
    public boolean shouldFilter() {
        return true;//写逻辑，是否需要执行过滤。true会执行run函数，false不执行run函数
    }

    @Override
    public Object run() {
        System.out.println("==============pre==============");
        RequestContext ctx = RequestContext.getCurrentContext();
        Object token = ctx.get("token");
        if (StringUtils.isEmpty(token)) {
            ctx.set("isSuccess",false);
        }
        return null;
    }
}

