package org.zerock.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author easyh
 * @date 2019.04.24
 * web.xml(톰캣 서버 설정)을 대신하는 클래스 
 */
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	//root-context.xml을 대신하는 클래스 지정 메소드
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
