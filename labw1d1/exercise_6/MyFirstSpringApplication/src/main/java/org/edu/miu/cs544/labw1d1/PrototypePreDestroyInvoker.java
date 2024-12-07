package org.edu.miu.cs544.labw1d1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PrototypePreDestroyInvoker implements BeanPostProcessor, BeanFactoryAware, DisposableBean {
    private BeanFactory beanFactory;

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public Object postProcessAfteInObject

}
