public class SendMail {  

     public static void main(String[] args) {  

         String smtp = "smtp.163.com";// smtp������  

         String from = "jinyubing12345@163.com";// �ʼ���ʾ����  

         String to = "jinyubing@lymsh.com";// �ռ��˵��ʼ���ַ����������ʵ��ַ  

         String copyto = "";// �������ʼ���ַ  

         String subject = "�����ʼ�";// �ʼ�����  

         String content = "��ã���˫������˫�����������ۻ�";// �ʼ�����  

         String username = "jinyubing12345@163.com";// ��������ʵ���˻���  

         String password = "jinchen12345";// ����������  

         Mail.sendAndCc(smtp, from, to, copyto, subject, content, username, password);  

     }  

 } 
