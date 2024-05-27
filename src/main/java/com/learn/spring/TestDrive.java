package com.learn.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestDrive {

    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(
                new FileSystemResource("F:/learning/Spring/Spring_Core/SpringCore/src/Car.xml")
        );
        Drive dr = (Drive) factory.getBean("car");
        dr.driveCar();
    }
}

//https://docs.google.com/forms/d/1jo_U96-95sVCXDvRQrb8hO9pzvxhNpYr2HpH7D5aH2g/edit#responses
