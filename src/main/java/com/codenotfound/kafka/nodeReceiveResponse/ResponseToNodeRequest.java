package com.codenotfound.kafka.nodeReceiveResponse;

import com.codenotfound.kafka.consumer.Receiver;
import com.codenotfound.model.Car;
import com.codenotfound.model.Request;
import com.codenotfound.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

public class ResponseToNodeRequest {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.codenotfound.kafka.consumer.Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    //String deviceNodeResponse [] = null;
    public CountDownLatch getLatch() {
        return latch;
    }

//    @KafkaListener(topics = "${kafka.topic.json}")
//    public void receive(Car car) {
//        LOGGER.info("received car='{}'", car.toString());
//        latch.countDown();
//    }

    //TODO add in application.xml
    @KafkaListener(topics = "${kafka.topic.DEVICE_NODE_RESP_1}")
    public void receive1(Response response){

        LOGGER.info("received respose ='{}" , response.toString());
    }

    //TODO add in application.xml
//    @KafkaListener(topics = "${kafka.topic.cloudNodeRequest}")
//    public void receive2(Request request){
//        Response response = new Response();
//        String requestValue = request.requestValue;
//        response.result = requestValue + "Key By Cloud XXXXX";
//        //send this response to deviceNodeResponse
//
//
//
//    }
}
