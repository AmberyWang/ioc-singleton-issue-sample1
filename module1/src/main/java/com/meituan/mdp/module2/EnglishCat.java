package com.meituan.mdp.module2;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author wangtingting
 * @date 2022/6/20
 */
@Configuration
public class EnglishCat implements BeanNameAware {

    String beanName;

    @PostConstruct
    public void sayHello() {
        System.out.println(this.beanName +":hello");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
