public class SendMail {  

     public static void main(String[] args) {  

         String smtp = "smtp.163.com";// smtp������  

         String from = "aaaa@163.com";// �ʼ���ʾ����  

         String to = "bbbb@lymsh.com";// �ռ��˵��ʼ���ַ����������ʵ��ַ  

         String copyto = "";// �������ʼ���ַ  

         String subject = "�����ʼ�";// �ʼ�����  

         String content = "��ã���˫������˫�����������ۻ�";// �ʼ�����  

         String username = "aaaa@163.com";// ��������ʵ���˻���  

         String password = "******";// ����������  

         Mail.sendAndCc(smtp, from, to, copyto, subject, content, username, password);  

     }  

 } 
