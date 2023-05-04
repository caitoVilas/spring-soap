package com.caito.springsoap;

import com.caito.springsoap.client.SoapClient;
import com.caito.springsoap.wsdl.AddResponse;
import com.caito.springsoap.wsdl.DivideResponse;
import com.caito.springsoap.wsdl.MultiplyResponse;
import com.caito.springsoap.wsdl.SubtractResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class SpringSoapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSoapApplication.class, args);
    }

    @Bean
    CommandLineRunner init(SoapClient soapClient){
        return args -> {
            AddResponse addResponse = soapClient.getAddResponse(2,2);
            log.info("el resultado de la suma {} y {} es {} ", 2,2,addResponse.getAddResult());
            SubtractResponse subtractResponse = soapClient.getSubtractResponse(2, 2);
            log.info("el resultado de la resta {} y {} es {} ", 2,2,subtractResponse.getSubtractResult());
            MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(2,2);
            log.info("el resultado de la multiplicacion {} y {} es {} ", 2,2, multiplyResponse.getMultiplyResult());
            DivideResponse divideResponse = soapClient.getDivideResponse(2, 2);
            log.info("el resultado de la division {} y {} es {} ", 2,2,divideResponse.getDivideResult());
        };
    }

}
