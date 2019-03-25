package com.example.sofabootrun.controller;


import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.servicefacade.SampleJvmService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gonghe.hogan
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestControllerTest {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceAnnotationImpl;


    @Test
    public void test(){
        String message = "Hello, jvm service annotation implementataion.";
        Assert.assertEquals(message, sampleJvmServiceAnnotationImpl.message());
    }
}