package chatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class chatbot extends JFrame
{
	private JTextArea ca=new JTextArea();
	private JTextField cf=new JTextField();
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	private Color colorcyan;
	
	chatbot(){
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);    
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(400,400);
		Object color;
		f.getContentPane().setBackground(colorcyan);
		f.setTitle("chatbot"); 
		f.add(ca);
		f.add(cf);
		ca.setSize(300,310);
		ca.setLocation(1,1);
		Color colorblack;
		ca.setBackground(colorblack);
		b.setSize(400,20);
		b.setLocation(300,320);
		cf.setSize(300,20);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(400,20);
		b.setLocation(300,320);
		
		b.addActionListener( new ActionListener()) {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==b) {
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					if(text.contains("hi")) {
						replyMeth("Hi there");						
					}
					else if(text.contains("How are you?")) {
						replyMeth("I'm good :). Thank you for asking. What about you?");
					}
					else if(text.contains("What is your name?")) {
						replyMeth("I'm the trending BINOD");
					}
					else if(text.contains("what are your hobbies?")) {
						replyMeth("sleeping");
					}
					else if(text.contains("Lmao")) {
						replyMeth("haha");
					}
					else if(text.contains("bye")) {
						replyMeth("Too soon :( Anyways"+"\n"+"STAY HOME STAY SAFE");
					}
					else
						replyMeth("I can't understand");
				}
				
			}
		}
	};

		
		}
		public void replyMeth(String s) {
			ca.append("ChatBot-->"+s+"\n");
		}
}


public class ChatBotDemo {
	
	 public static void main (Strings[] args) {
		
	chatbot obj= new chatbot();
	}
}