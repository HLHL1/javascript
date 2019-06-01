package com.forum.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 代替applicationContext.xml
 * 作为springmvc的javaconfig
 * @author lmwis on create 2019-01-19
 */
@Configuration
@ComponentScan
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //加载spring容器
        System.out.println("加载spring容器");
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(com.forum.config.MVCConfig.class);
        ctx.register(MapperConfig.class);
        ctx.register(this.getClass());
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));

        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }

//    @Autowired
//    SqlSession sqlSession;
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer mapperConfig = new MapperScannerConfigurer();
//        mapperConfig.setBasePackage("com.fehead.mapper");
//        return mapperConfig;
//    }
}
