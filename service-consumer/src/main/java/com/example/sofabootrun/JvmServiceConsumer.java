package com.example.sofabootrun;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.servicefacade.SampleJvmService;

public class JvmServiceConsumer {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceByFieldAnnotation;

    public void init(){
        sampleJvmServiceByFieldAnnotation.message();
    }
}
