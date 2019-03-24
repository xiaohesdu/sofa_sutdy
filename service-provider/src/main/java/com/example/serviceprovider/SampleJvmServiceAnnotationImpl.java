package com.example.serviceprovider;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.example.servicefacade.SampleJvmService;

@SofaService(uniqueId = "annotationImpl")
public class SampleJvmServiceAnnotationImpl implements SampleJvmService {

    @Override
    public String message() {
        String message = "Hello, jvm service annotation implementataion.";
        System.out.println(message);
        return message;
    }
}
