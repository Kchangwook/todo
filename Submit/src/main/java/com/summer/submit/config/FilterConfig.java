package com.summer.submit.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/** 필터 설정 빈을 생성하는 클래스 **/
@Configuration
public class FilterConfig {

	/** PUT, DELETE 실행을 위한 HiddenHttpMethodFilter를 등록하기 위한 빈 **/
	@Bean
	public FilterRegistrationBean<HiddenHttpMethodFilter> hiddenMethodBean() {
		return new FilterRegistrationBean<>(new HiddenHttpMethodFilter());
	}//end of hiddenMethodBean
	
}//end of FilterConfig
