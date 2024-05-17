package com.abhi.twilio.sms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/sms")
public class SMSController {
	
	//TWILIO RECOVERY CODE
	//VYAKTUW358HSPH2C11JS29PQ
	
	@GetMapping("/send")
	public ResponseEntity<String> sendSms(){
		Twilio.init(System.getenv("TWILIO_ACCOUNT_SID"),System.getenv("TWILIO_AUTH_TOKEN"));
		Message.creator(new PhoneNumber("8381833858"),
						new PhoneNumber(""),
						"Hello From Twilio SMS Service").create();
		return new ResponseEntity<>("Messaage sent Successfully",HttpStatus.OK);
	}

}
