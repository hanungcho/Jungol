package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
 
public class UiTest extends JFrame {
          JTextField tf1, tf2, tf3, tf4, tf5;
          JButton l1, l2, l3, l4, l5;
          JButton bt1, bt2;
          JFrame fr; 
          JPasswordField t3;
          Font f1;
          JLabel name,ib,pw,email;

          public UiTest() {
        	fr=new JFrame("회원 가입"); 
        	f1 = new Font("맑은 고딕", Font.BOLD, 22);
      		fr.setSize(600, 500);
      		fr.setVisible(true);
      		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    l1 = new JButton("이름");
                    l1.setBounds(30, 30, 250, 30);
                    l1.setFont(f1);
                    l1.setBackground(Color.BLACK);
    				l1.setForeground(Color.WHITE);
                    fr.add(l1);
                    
                    tf1 = new JTextField();
                    tf1.setBounds(300, 30 , 250, 32);
                    tf1.setFont(f1);
                    fr.add(tf1);
                    
                    l2 = new JButton("아이디");
                    l2.setBounds(30, 90, 250, 30);
                    l2.setBackground(Color.BLACK);
    				l2.setForeground(Color.WHITE);
                    l2.setFont(f1);
                    fr.add(l2);
                    
                    tf2 = new JTextField();
                    tf2.setFont(f1);
                    tf2.setBounds(300, 90 , 250, 32);
                    fr.add(tf2);
                    
                    l3 = new JButton("비밀번호");
                    l3.setFont(f1);
                    l3.setFont(f1);
                    l3.setBackground(Color.BLACK);
    				l3.setForeground(Color.WHITE);
                    l3.setBounds(30, 150, 250, 30);
                    fr.add(l3);
                    
                    t3 = new JPasswordField();
                    t3.setBounds(300, 150 , 250, 32);
                    t3.setFont(f1);
                    fr.add(t3);
                    
                    
                    
                    l4 = new JButton("이메일");
                    l4.setFont(f1);
                    l4.setBackground(Color.BLACK);
    				l4.setForeground(Color.WHITE);
                    l4.setBounds(30, 210, 250, 30);
                    fr.add(l4);
                    
                    tf4 = new JTextField();
                    tf4.setFont(f1);
                    tf4.setBounds(300, 210 , 250, 32);
                    fr.add(tf4);
                    
                    bt1 = new JButton("회원 가입");
                    bt1.setFont(f1);
                    bt1.setBounds(30, 300, 530, 30);
                    bt1.setBackground(Color.LIGHT_GRAY);
                    bt1.setForeground(Color.WHITE);
                    
                    tf3 = new JTextField();
                    tf3.setFont(f1);
                    tf3.setBounds(30,360,530,30);
                    tf3.setBackground(Color.LIGHT_GRAY);
                    tf3.setForeground(Color.WHITE);
                    fr.add(tf3);
                    
                    fr.add(bt1);
          
          bt1.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String name = tf1.getText();
  				String pw = t3.getText();
            			String id = tf2.getText();
            			if(name.equals("")) {
            				tf3.setText("이름은 입력하세요");
            			}else if(getType(name)) {
            				tf3.setText("이름은 한글과 영문만 입력가능합니다");
            			}
            			else if(id.equals("")) {
            				tf3.setText("아이디를 입력하세요");
            	
            			}else if(checkInputOnlyNumberAndAlphabet(id)) {
            				tf3.setText("아이디는 특수문자 포함이 불가");
            				
            			}else if(checkPWDMethod(pw)==1) {
            				tf3.setText("비밀번호 특수문자는 !@#만 가능");
            				
            			}else if(tf4.equals("")) {
            				tf3.setText("이메일 입력");
            			}else if(emailCheck(tf4.getText())==1) {
            				tf3.setText("잘못된 이메일을 입력하셨습니다");
            			}
            			
            			}
          
          });
          }
                  
                		
                 
                				
               
          public static void main(String[] args){
                    new UiTest();
          }
                				

public int checkIDMethod(String id) {
	int check= 0;
	char alpha;
	int code;
	for(int i=0; i<id.length(); i++) {
		alpha = id.charAt(i);
		code = (int)alpha;
		if(code>=0 && code<=47 || code>=58 && code<=63 || code>=91 && code <=96 || code>=123 && code <= 127) {
			check = 1;
		}
	}
	return check;
}

public int checkPWDMethod(String pwd) {
	int check= 0;
	char alpha;
	int code;
	for(int i=0; i<pwd.length(); i++) {
		alpha = pwd.charAt(i);
		code = (int)alpha;
		if(code>=0 && code<=32 || code>=36 && code<=47 || code>=58 && code<=63 || code>=91 && code <=96 || code>=123 && code <= 127) {
			check = 1;
			
		}
	}
	return check;
}

public int emailCheck(String email) {
	int emailCheck =0;
	// email에 @ 가 있는가? email에 .이 올바르게 있나 ? email에 특수문자가 있나?
	if(email.indexOf("@")== -1 || period(email)==true ||specialCharacter(email)==0) {
		emailCheck = 1;
	}
	// 0이면 이메일 체크결과 이상 없다, 1이면 이상 있다
	return emailCheck;
}

public Boolean period(String email) {
	String spl[] = email.split("@");
	// split은 @ 기준으로 앞뒤로 나눈다
	// spl[0] = id,  spl[1] = email주소
	int num = spl[1].lastIndexOf(".") - spl[1].indexOf("."); // last와 index의 값차이를 검사
	
	boolean clear = false;
	
	// "@"의 앞단 "." 있는지 확인
	if(spl[0].indexOf(".")==-1);
	else clear=true;
	
	// "@"의 뒷단 도메인 부분의 "." 들의 간격이 4칸이상 떨어지면 이메일이 아니다
	if(num <4);
	else clear = true;
	
	// 이메일에 .이 잘못되었을 경우 true를 보낸다
	return clear;
}

public int specialCharacter(String email) {
	String text[] = { "#", "!","$","%","^","&","*","(",")","-", "_","+","=",",","[","]","{","}",":",";","'","?","<",">"};
	
	int result = 0;
	for(int i=0; i<text.length; i++) {
		if(email.indexOf(text[i]) == -1) {
			result = 1;
		} else {
			break;
		}
	}
	// 이메일 검사했을때 특수문자가 있으면 1을 보내고 없으면 0을 보낸다
	return result;
}
public static boolean getType(String word) {
	return Pattern.matches("^[가-힣a-zA-Z]*$", word);
}
public boolean checkInputOnlyNumberAndAlphabet(String textInput) {

	 

char chrInput;

 

for (int i = 0; i < textInput.length(); i++) {

 

chrInput =textInput.charAt(i); // 입력받은 텍스트에서 문자 하나하나 가져와서 체크

   

if (chrInput >= 0x61 && chrInput <= 0x7A) {
    // 영문(소문자) OK!
} 
else if (chrInput >=0x41 && chrInput <= 0x5A) {
    // 영문(대문자) OK!
}
else if (chrInput >= 0x30 && chrInput <= 0x39) {

    // 숫자 OK!
} 
else {
    return false;   // 영문자도 아니고 숫자도 아님!
}

}

 

return true;

}

}