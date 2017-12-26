package com.codenotfound.deviceNode;

import org.springframework.context.annotation.Bean;

public class Test123Config {
    @Bean
    Test123 test123(){
        return new Test123();
    }
}
