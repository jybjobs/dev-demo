public class SendMail {  

     public static void main(String[] args) {  

         String smtp = "smtp.163.com";// smtp服务器  

         String from = "jinyubing12345@163.com";// 邮件显示名称  

         String to = "jinyubing@lymsh.com";// 收件人的邮件地址，必须是真实地址  

         String copyto = "";// 抄送人邮件地址  

         String subject = "测试邮件";// 邮件标题  

         String content = "你好！我双方建立双方联赛积分累积";// 邮件内容  

         String username = "jinyubing12345@163.com";// 发件人真实的账户名  

         String password = "jinchen12345";// 发件人密码  

         Mail.sendAndCc(smtp, from, to, copyto, subject, content, username, password);  

     }  

 } 
