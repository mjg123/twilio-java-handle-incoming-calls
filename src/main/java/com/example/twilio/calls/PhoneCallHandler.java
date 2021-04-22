package com.example.twilio.calls;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Say;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneCallHandler {

    @PostMapping(value = "/", produces = "application/xml")
    @ResponseBody
    public String handleIncomingCall(){
        return new VoiceResponse.Builder()
            .say(
                new Say.Builder("Hello from Twilio").build()
            ).build().toXml();
    }


}
