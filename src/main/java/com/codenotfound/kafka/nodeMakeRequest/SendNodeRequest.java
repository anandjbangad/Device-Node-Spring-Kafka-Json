package com.codenotfound.kafka.nodeMakeRequest;
import com.codenotfound.model.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class SendNodeRequest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendNodeRequest.class);

    @Autowired
    KafkaTemplate<String,Request> kafkaTemplate;

    public void send(Request request){
        LOGGER.info("sending request = ", request.toString());
        kafkaTemplate.send(request.getrequestSentTo(),request);
    }

    public String print(){
        return "Hello";
    }

}



