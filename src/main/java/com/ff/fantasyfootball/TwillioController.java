package com.ff.fantasyfootball;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwillioController {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "xxx";
  public static final String AUTH_TOKEN = "xxx";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+xxx"),
        new PhoneNumber("+xxx"), 
        "I love you :)").create();

    System.out.println(message.getSid());
  }
}
