package com.forum.config;

import com.forum.mapper.*;
import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan({"com.forum.mapper"})
@EnableTransactionManagement
public class MapperConfig {

    /**
     * 此处因EL表达式取不到值
     * 为摆设
     */
    @Value("${jdbc.driver}")
    public String driverClassName;
    @Value("${jdbc.url}")
    public String url;
    @Value("${jdbc.username}")
    public String username;
    @Value("${jdbc.password}")
    public String password;


    @Autowired
    Environment env;

    /**
     * 配置数据源
     * @return
     */
    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driver"));
        ds.setUrl(env.getProperty("jdbc.url"));
        ds.setUsername(env.getProperty("jdbc.username"));
        ds.setPassword(env.getProperty("jdbc.password"));

        ds.setInitialSize(5);
        ds.setMaxIdle(10);
        ds.setMinIdle(5);
        ds.setMaxTotal(15);
        return ds;
    }

    @Bean
    DataSourceTransactionManager DataSourceTransactionManager(BasicDataSource dataSource) {
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(dataSource);

        return dstm;
    }

    @Bean
    JdbcTemplate jdbcTemplate (BasicDataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

    @Bean
    SqlSessionFactoryBean sqlSessionFactoryBean(BasicDataSource dataSource) {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(dataSource);

        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration() ;

        sqlSessionFactoryBean.setConfiguration(configuration);

        return sqlSessionFactoryBean;
    }

//    @Bean
//    public DriverManagerDataSource dataSource(){
//        //配置数据源
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println("数据源配置成功");
//        return  dataSource;
//    }

//    @Bean
//    public DataSourceTransactionManager transactionManager(){
//        return new DataSourceTransactionManager(dataSource());
//    }

//    /**
//     * 配置SqlSessionFactoryBean
//     * @return
//     */
//    @Bean()
//    public SqlSessionFactoryBean sqlSessionFactoryBean(){
//        SqlSessionFactoryBean sqlsessionFactoryBean = new SqlSessionFactoryBean();
//        sqlsessionFactoryBean.setDataSource(dataSource());
    //配置类型别名
//        sessionFactory.setTypeAliasesPackage("");
//        return sqlsessionFactoryBean;
//    }

    /**
     * 配置数据映射类
     * MapperFactoryBean接口指定映射类
     * ConferenceMapper
     * @return
     */
//    @Bean
//    public MapperFactoryBean<ConferenceMapper> mapperFactoryBean4ConferenceMapper(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
//        MapperFactoryBean<ConferenceMapper> mapperFactoryBean = new MapperFactoryBean<ConferenceMapper>();
//        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
//        mapperFactoryBean.setMapperInterface(ConferenceMapper.class);
//        return mapperFactoryBean;
//    }
//
    @Bean
    public MapperFactoryBean<UserMapper> mapperFactoryBean4UserMapperMapper(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
        MapperFactoryBean<UserMapper> mapperFactoryBean = new MapperFactoryBean<UserMapper>();
        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        mapperFactoryBean.setMapperInterface(UserMapper.class);
        return mapperFactoryBean;
    }

    @Bean
    public MapperFactoryBean<PostMapper> mapperFactoryBean4PostMapper(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
        MapperFactoryBean<PostMapper> mapperFactoryBean = new MapperFactoryBean<PostMapper>();
        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        mapperFactoryBean.setMapperInterface(PostMapper.class);
        return mapperFactoryBean;
    }

    @Bean
    public MapperFactoryBean<FloorMapper> mapperFactoryBean4FloorMapper(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
        MapperFactoryBean<FloorMapper> mapperFactoryBean = new MapperFactoryBean<FloorMapper>();
        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        mapperFactoryBean.setMapperInterface(FloorMapper.class);
        return mapperFactoryBean;
    }

    @Bean
    public MapperFactoryBean<IssueMapper> mapperFactoryBean4IssueMapper(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
        MapperFactoryBean<IssueMapper> mapperFactoryBean = new MapperFactoryBean<IssueMapper>();
        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        mapperFactoryBean.setMapperInterface(IssueMapper.class);
        return mapperFactoryBean;
    }

    @Bean
    public MapperFactoryBean<ReplyMapper> mapperFactoryBean4ReplyMapper(SqlSessionFactoryBean sqlSessionFactoryBean) throws Exception {
        MapperFactoryBean<ReplyMapper> mapperFactoryBean = new MapperFactoryBean<ReplyMapper>();
        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactoryBean.getObject());
        mapperFactoryBean.setMapperInterface(ReplyMapper.class);
        return mapperFactoryBean;
    }







//    /**
//     * 配置数据映射
//     * MapperScannerConfigurer 进行自动扫描
//     * 有问题
//     * @param basepackage 扫描包
//     * @return
//     */
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(@Value("com.fehead.mapper") String basepackage){
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage(basepackage);
//        return mapperScannerConfigurer;
//    }
}
