package com.niit.cde.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.cde.Model.Blog;
import com.niit.cde.Model.BlogComment;
import com.niit.cde.Model.Forum;
import com.niit.cde.Model.Friend;
import com.niit.cde.Model.Job;
import com.niit.cde.Model.JobApplied;
import com.niit.cde.Model.User;




@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class ApplicationContextConfig
{
	
		@Bean(name ="dataSource")
		public DataSource getDataSource()
		{
/*			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			dataSource.setUsername("SYSTEM");
			dataSource.setPassword("root");
			
			return dataSource;*/
			
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("org.h2.Driver");
			ds.setUrl("jdbc:h2:tcp://localhost/~/collabDb");
			ds.setUsername("sa");
			ds.setPassword("");
			return ds;			
		}
		
		private Properties getHibernateProperties()
		{
/*			Properties properties = new Properties();
			
			properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
			properties.put("hibernate.show_sql", "true");
			
			return properties;*/
			Properties prop = new Properties();
			prop.put("hibernate.show_sql", "true");
			prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			prop.put("hibernate.format_sql", "true");
			prop.put("hibernate.hbm2ddl.auto", "update");
			return prop;			
		}
		
		@Autowired
		@Bean(name = "sessionFactory")
		public SessionFactory getSessionFactory(DataSource dataSource)
		{
			LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
			
			sessionBuilder.addProperties(getHibernateProperties());
			sessionBuilder.addAnnotatedClass(User.class);
			sessionBuilder.addAnnotatedClass(Blog.class);
			sessionBuilder.addAnnotatedClass(Job.class);
			sessionBuilder.addAnnotatedClass(JobApplied.class);
			sessionBuilder.addAnnotatedClass(Friend.class);
			sessionBuilder.addAnnotatedClass(Forum.class);
			sessionBuilder.addAnnotatedClass(BlogComment.class);
			//sessionBuilder.addAnnotatedClass(Event.class);
			return sessionBuilder.buildSessionFactory();
		}
		
		@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
		{
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
			return transactionManager;
		}
}