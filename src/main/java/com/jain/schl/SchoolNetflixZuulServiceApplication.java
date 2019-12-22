package com.jain.schl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.jain.schl.filter.ZuulLoggingFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SchoolNetflixZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolNetflixZuulServiceApplication.class, args);
	}
	@Bean
    public ZuulLoggingFilter preFilter() {
        return new ZuulLoggingFilter();
    }
}
