package test2;

public class TestMail {
	public static void main(String[] args){   
      //�������Ҫ�������ʼ�   
   MailSenderInfo mailInfo = new MailSenderInfo();    
   mailInfo.setMailServerHost("smtp.163.com");    
   mailInfo.setMailServerPort("25");    
   mailInfo.setValidate(true);    
   mailInfo.setUserName("jinyubing12345@163.com");    
   mailInfo.setPassword("jinchen12345");//������������   
   mailInfo.setFromAddress("jinyubing12345@163.com");    
   mailInfo.setToAddress("jinyubing@lymsh.com");    
   mailInfo.setSubject("�����������");    
   mailInfo.setContent("������������");    
      //�������Ҫ�������ʼ�   
   SimpleMailSender sms = new SimpleMailSender();   
       sms.sendTextMail(mailInfo);//���������ʽ   
       sms.sendHtmlMail(mailInfo);//����html��ʽ  
 }  

}
