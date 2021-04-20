package com.example.twilio.calls;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneCallHandler {

    @PostMapping("/")
    @ResponseBody
    public String handleIncomingCall(){
        return "Hello from your app 👋";
    }
}
