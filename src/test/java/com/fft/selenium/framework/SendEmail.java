package com.fft.selenium.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.internet.AddressException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class SendEmail {

/*   public static void main(String [] args) throws EmailException {    
	   //sendEmail();
   }
*/
	@Test
   	public static void sendEmail(String subject, String msg) throws EmailException, IOException, AddressException {
   		
   		Properties prop= new Properties();
   		FileInputStream fis= new FileInputStream("./src/test/resources/configurations/email.property");
   		prop.load(fis);
   		
   	   Email email = new SimpleEmail();
	   email.setHostName(prop.getProperty("hostName"));
	   email.setSmtpPort(465);
	   email.setAuthenticator(new DefaultAuthenticator(prop.getProperty("senderEmail"), prop.getProperty("senderPassword")));
	   email.setSSLOnConnect(true);
	   email.setFrom(prop.getProperty("senderEmail"));
	   email.setSubject(subject);
	   email.setMsg(msg);
	   email.addTo(prop.getProperty("toEmail"));
	   email.send();
	   System.out.println("<<==============Email Sent Successfully==============>>");
}
}