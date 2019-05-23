package com.baiyu.hello;

import com.baiyu.hello.pojo.Category;
import com.baiyu.hello.pojo.Product;
import com.baiyu.hello.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        ProductService service = (ProductService) context.getBean("s");
        service.doSomeService();
    }
}
