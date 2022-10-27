package vkg.springframework.vkgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifecycleDemoBean() {
        System.out.println("LIFECYCLE DEMO : LifeCycleDemoBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LIFECYCLE DEMO : BeanFactory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LIFECYCLE DEMO : BeanName has been set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LIFECYCLE DEMO : Bean Lifecycle has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LIFECYCLE DEMO : Properties have been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LIFECYCLE DEMO : Application Context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("LIFECYCLE DEMO : PostConstruct method invoked");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("LIFECYCLE DEMO : PreDestroy method invoked");
    }

    public void beforeInit() {
        System.out.println("-- LIFECYCLE DEMO : beforeInit method invoked");
    }

    public void afterInit() {
        System.out.println("-- LIFECYCLE DEMO : afterInit method invoked");
    }
}
