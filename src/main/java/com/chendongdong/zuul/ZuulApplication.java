package com.chendongdong.zuul;

import com.chendongdong.zuul.Filter.errorFilter;
import com.chendongdong.zuul.Filter.preFilter;
import com.chendongdong.zuul.Filter.routeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.chendongdong.zuul.Filter.postFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public postFilter postfilter(){
		return new postFilter();
	}

	@Bean
	public preFilter prefilter(){
		return new preFilter();
	}

	@Bean
	public routeFilter routingfilter(){
		return new routeFilter();
	}

	@Bean
	public errorFilter errorfilter(){
		return new errorFilter();
	}

}
