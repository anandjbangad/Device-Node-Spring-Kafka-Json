package com.codenotfound.deviceNode;

import com.codenotfound.Config1;
import com.codenotfound.kafka.nodeMakeRequest.SendNodeRequest;
import com.codenotfound.model.Request;
import org.springframework.beans.factory.annotation.Autowired;



public class InitiateRequests {

    @Autowired
    private SendNodeRequest sendNodeRequest;

    @Autowired
    private Test123 test123;

    public void Requests(String service){
    if(service == "service1"){
     //   SendNodeRequest sendNodeRequest1 = new SendNodeRequest();
        Request request = new Request(Config1.DEVICE_NODE_RESP_1,"deviceNode","ABC",Config1.CLOUD_NODE_REQ);
        System.out.println(sendNodeRequest.print());
        sendNodeRequest.send(request);
        test123.hello();

    }
}
}
