package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class main extends JPanel {

	public static void main(String[] args) {

		//the frame
		JFrame obj=new JFrame();
		obj.setBounds(20, 10, 500, 620); //10-left start, 10-up start, 600- rohav size, 650-orech size 
		obj.setVisible(true);     
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//the black ribua
		calculator cl=new calculator();
		obj.add(cl);
		cl.setVisible(true);

		//text feild (the screen of the calculator,the numbers on the black ribua)
		final JTextField tf=new JTextField(); 
		tf.setBounds(40,10, 400,91);
		tf.setForeground(Color.white);
		Font font1 = new Font("David", Font.BOLD, 30);
		tf.setFont(font1);
		tf.setBackground(Color.BLACK);
		tf.setBorder(new LineBorder(Color.black,1));

		ArrayList a=new ArrayList();

		init(obj,cl,tf,a);

	} 

	public static void init(JFrame obj,calculator cl,JTextField tf,ArrayList a) {


		//first row  
		JButton button1 = new JButton("CE");
		button1.setBounds(24, 110, 100, 80);
		Font f1=new Font("David",30,30);
		button1.setFont(f1);
		button1.setBackground(Color.red);
		button1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
				tf.setText(""); 
				a.clear();
			} 
		}); 
		button1.setVisible(true);
		obj.add(button1);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button2 = new JButton("7");
		button2.setBounds(24, 200, 100, 80);
		Font f2=new Font("David",30,30);
		button2.setFont(f2);
		button2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				a.add(7);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button2.setVisible(true);
		obj.add(button2);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);



		JButton button3 = new JButton("4");
		button3.setBounds(24, 290, 100, 80);
		Font f3=new Font("David",30,30);
		button3.setFont(f3);
		button3.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(4);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button3.setVisible(true);
		obj.add(button3);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button4 = new JButton("1");
		button4.setBounds(24, 380, 100, 80);
		Font f4=new Font("David",30,30);
		button4.setFont(f4);
		button4.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(1);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button4.setVisible(true);
		obj.add(button4);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button5 = new JButton("?");
		button5.setBounds(24, 470, 100, 80);
		Font f5=new Font("David",30,30);
		button5.setFont(f5);
		button5.setBackground(Color.lightGray);
		button5.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				tf.setText("?"); 	
			}  
		}); 
		button5.setVisible(true);
		obj.add(button5);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		//second row
		JButton button6 = new JButton("C");
		button6.setBounds(134, 110, 100, 80);
		Font f6=new Font("David",30,30);
		button6.setFont(f6);
		button6.setBackground(Color.red);
		button6.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				a.remove(a.get(a.size()-1));
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				}

			}  
		}); 
		button6.setVisible(true);
		obj.add(button6);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button7 = new JButton("8");
		button7.setBounds(134, 200, 100, 80);
		Font f7=new Font("David",30,30);
		button7.setFont(f7);
		button7.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(8);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button7.setVisible(true);
		obj.add(button7);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button8 = new JButton("5");
		button8.setBounds(134, 290, 100, 80);
		Font f8=new Font("David",30,30);
		button8.setFont(f8);
		button8.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(5);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button8.setVisible(true);
		obj.add(button8);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button9 = new JButton("2");
		button9.setBounds(134, 380, 100, 80);
		Font f9=new Font("David",30,30);
		button9.setFont(f9);
		button9.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  	
				a.add(2);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button9.setVisible(true);
		obj.add(button9);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button10 = new JButton("0");
		button10.setBounds(134, 470, 100, 80);
		Font f10=new Font("David",30,30);
		button10.setFont(f10);
		button10.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  	
				a.add(0);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button10.setVisible(true);
		obj.add(button10);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		//3th row
		JButton button11 = new JButton("<");
		button11.setBounds(244, 110, 100, 80);
		Font f11=new Font("David",30,30);
		button11.setFont(f11);
		button11.setBackground(Color.red);
		button11.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				tf.setText("<"); 	
			}  
		}); 
		button11.setVisible(true);
		obj.add(button11);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button12 = new JButton("9");
		button12.setBounds(244, 200, 100, 80);
		Font f12=new Font("David",30,30);
		button12.setFont(f12);
		button12.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(9);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button12.setVisible(true);
		obj.add(button12);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button13 = new JButton("6");
		button13.setBounds(244, 290, 100, 80);
		Font f13=new Font("David",30,30);
		button13.setFont(f13);
		button13.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(6);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button13.setVisible(true);
		obj.add(button13);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button14 = new JButton("3");
		button14.setBounds(244, 380, 100, 80);
		Font f14=new Font("David",30,30);
		button14.setFont(f14);
		button14.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add(3);
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button14.setVisible(true);
		obj.add(button14);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button15 = new JButton(".");
		button15.setBounds(244, 470, 100, 80);
		Font f15=new Font("David",30,30);
		button15.setFont(f15);
		button15.setBackground(Color.lightGray);
		button15.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				a.add('.');
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				}  
			}  
		}); 
		button15.setVisible(true);
		obj.add(button15);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		//4th row
		JButton button16 = new JButton("/");
		button16.setBounds(354, 110, 100, 80);
		Font f16=new Font("David",30,30);
		button16.setFont(f16);
		button16.setBackground(Color.lightGray);
		button16.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){   
				a.add('/');
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button16.setVisible(true);
		obj.add(button16);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button17 = new JButton("*");
		button17.setBounds(354, 200, 100, 80);
		Font f17=new Font("David",30,30);
		button17.setFont(f17);
		button17.setBackground(Color.lightGray);
		button17.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add('*');
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button17.setVisible(true);
		obj.add(button17);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button18 = new JButton("-");
		button18.setBounds(354, 290, 100, 80);
		Font f18=new Font("David",30,30);
		button18.setFont(f18);
		button18.setBackground(Color.lightGray);
		button18.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add('-');
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button18.setVisible(true);
		obj.add(button18);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button19 = new JButton("+");
		button19.setBounds(354, 380, 100, 80);
		Font f19=new Font("David",30,30);
		button19.setFont(f19);
		button19.setBackground(Color.lightGray);
		button19.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				a.add('+');
				String s="";
				for(int i=0;i<a.size();i++){
					s=s+a.get(i);
					tf.setText(s);
				} 
			}  
		}); 
		button19.setVisible(true);
		obj.add(button19);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);

		JButton button20 = new JButton("=");
		button20.setBounds(354, 470, 100, 80);
		Font f20=new Font("David",30,30);
		button20.setFont(f20);
		button20.setBackground(Color.green);
		button20.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  

				ArrayList charsIndex=new ArrayList();
				ArrayList chars=new ArrayList();

				for(int i=0;i<a.size();i++){
					if((a.get(i).equals('+'))||(a.get(i).equals('-'))||(a.get(i).equals('*'))||(a.get(i).equals('/'))){
						charsIndex.add(i);
						chars.add(a.get(i));
					}
				}

				ArrayList newArrayNumbers=new ArrayList();

				//create the new array of numbers (strings)
				for(int j=0;j<charsIndex.size()+1;j++){
					if(j==0){
						String s="";
						for(int i=0;i<(int)charsIndex.get(j);i++){
							s=s+a.get(i);
						}
						newArrayNumbers.add(s);
					}
					else if(j!=0&&j<charsIndex.size()){
						String s="";
						for(int i=(int)charsIndex.get(j-1)+1;i<(int)charsIndex.get(j);i++){
							s=s+a.get(i);
						}
						newArrayNumbers.add(s);
					}
					else{
						String s="";
						for(int i=(int)charsIndex.get(j-1)+1;i<a.size();i++){
							s=s+a.get(i);
						}
						newArrayNumbers.add(s);
					}
				}

				ArrayList finalArrayNumbers=new ArrayList(); //integers

				for(int j=0;j<newArrayNumbers.size();j++){
					String s=(String)newArrayNumbers.get(j);
					int foo = Integer.parseInt(s);
					finalArrayNumbers.add(foo);
				}

				int result=(int)finalArrayNumbers.get(0);
				int x = 0;
				
				for(int i=1;i<finalArrayNumbers.size();i++){
					if(chars.get(i-1).equals('*')){
						x=result*(int)finalArrayNumbers.get(i);
					}
					else if(chars.get(i-1).equals('+')){
						x=result+(int)finalArrayNumbers.get(i);
					}
					else if(chars.get(i-1).equals('-')){
						x=result-(int)finalArrayNumbers.get(i);
					}
					else{
						x=result/(int)finalArrayNumbers.get(i);
					}
					result=x;

				}

				tf.setText(""+result);
				
				a.clear();
				a.add(result);

			}  
		}); 
		button20.setVisible(true);
		obj.add(button20);
		obj.add(tf);   
		obj.setLayout(null);  
		obj.setVisible(true);
	}
}

