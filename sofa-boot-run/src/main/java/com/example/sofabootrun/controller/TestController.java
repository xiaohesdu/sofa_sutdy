package com.example.sofabootrun.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.servicefacade.SampleJvmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceAnnotationImpl;

    @GetMapping("/annotationImplService")
    public String serviceAnnotationImplService(){
        return sampleJvmServiceAnnotationImpl.message();
    }

}
