package com.ff.fantasyfootball;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwillioController {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC233f5f8fa27e1bd28f50f41e2735bbc0";
  public static final String AUTH_TOKEN = "29aef58ca574fca483ea66ba144b0730";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+18165194669"),
        new PhoneNumber("+13345085180"), 
        "I love you :)").create();

    System.out.println(message.getSid());
  }
}