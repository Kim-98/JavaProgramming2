package java_project;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PFrame extends JFrame implements ActionListener{

	char Arr[] = {'+', '-', '*', '/'};
	int ran1, ran2, index, result;
	double fresult, fran1, fran2;
	String str;
	
	int win = 0, lose = 0, cnt = 0, cnt2 = 0;
	char inp[] = new char[5]; //선택한 연산자
	char out[] = new char[5]; //랜덤생성 연산자(정답)

	CardLayout card = new CardLayout();
	Random R = new Random();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel finish = new JPanel();

	JPanel south, north, center;
	JLabel Q, img1, img2, lresult, lfresult;
	JButton b1, b2, b3, b4, next;
	Font font1, font2, font3, font4, font5;

	public void Function() {
		while(true)
		{
			ran1 = R.nextInt(100) + 1;
			ran2 = R.nextInt(50) + 1;
			fran1 = R.nextInt(100) + 1;
			fran2 = R.nextInt(50) + 1;
			index = R.nextInt(4);

			if(ran1 <= ran2) {
				ran1 = R.nextInt(100) + 1;
				continue;
			}
			else if((ran1 * ran2) == (ran1 / ran2))
				continue;
			break;
		}
		
		if(index == 3) // 나누기일 경우
		{
			fresult = fran1 / fran2;
			str = String.format("%.2f", fresult);
			System.out.println(ran1 + "\t" + Arr[index] + "\t" + ran2 + "\t=\t" + str);
		}
		
		else
		{
			if(index == 0)
				result = ran1 + ran2;
			else if(index == 1)
				result = ran1 - ran2;
			else if(index == 2)
				result = ran1 * ran2;
			System.out.println(ran1 + "\t" + Arr[index] + "\t" + ran2 + "\t=\t" + result);
		}
		out[cnt2] = Arr[index];
		cnt2++;
	}

	public PFrame() {
		
		setBounds(450, 200, 600, 280);
		setTitle("Calculation Game");
		
		north = new JPanel();
		south = new JPanel();
		center = new JPanel();

		font1 = new Font("궁서", Font.PLAIN, 80);
		font2 = new Font("굴림", Font.BOLD, 15);
		font3 = new Font("돋움", Font.PLAIN, 60);		
		font4 = new Font("궁서", Font.PLAIN, 45);
		font5 = new Font("궁서", Font.PLAIN, 35);

		//JPanel North
		Q = new JLabel("안에 들어갈 연산자를 고르시오.");
		img1 = new JLabel(new ImageIcon("info.png"));	
		Q.setFont(font2);

		north.add(img1);
		north.add(Q);

		//JPanel South(Button)
		
		b1 = new JButton("+");
		b2 = new JButton("-");
		b3 = new JButton("*");
		b4 = new JButton("/");
		next = new JButton("Next");

		b1.setPreferredSize(new Dimension(125, 60));
		b1.setFont(font3);
		b2.setPreferredSize(new Dimension(125, 60));
		b2.setFont(font3);
		b3.setPreferredSize(new Dimension(125, 60));
		b3.setFont(font3);
		b4.setPreferredSize(new Dimension(125, 60));
		b4.setFont(font3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		next.addActionListener(this);

		south.add(b1);
		south.add(b2);
		south.add(b3);
		south.add(b4);
		
		//JPanel center
		center.setLayout(card);
		
		Function();
		p1.add(new JLabel(ran1 + "")).setFont(font1);
		p1.add(new JLabel(new ImageIcon("info2.png")));
		p1.add(new JLabel(ran2 + "")).setFont(font1);
		p1.add(new JLabel("=")).setFont(font1);
		
		if(index == 3)
			p1.add(new JLabel(str + "")).setFont(font1);
		else
			p1.add(new JLabel(result + "")).setFont(font1);

		Function();
		p2.add(new JLabel(ran1 + "")).setFont(font1);
		p2.add(new JLabel(new ImageIcon("info2.png")));
		p2.add(new JLabel(ran2 + "")).setFont(font1);
		p2.add(new JLabel("=")).setFont(font1);
		
		if(index == 3)
			p2.add(new JLabel(str + "")).setFont(font1);
		else
			p2.add(new JLabel(result + "")).setFont(font1);

		Function();
		p3.add(new JLabel(ran1 + "")).setFont(font1);
		p3.add(new JLabel(new ImageIcon("info2.png")));
		p3.add(new JLabel(ran2 + "")).setFont(font1);
		p3.add(new JLabel("=")).setFont(font1);
		
		if(index == 3)
			p3.add(new JLabel(str + "")).setFont(font1);
		else
			p3.add(new JLabel(result + "")).setFont(font1);

		Function();
		p4.add(new JLabel(ran1 + "")).setFont(font1);
		p4.add(new JLabel(new ImageIcon("info2.png")));
		p4.add(new JLabel(ran2 + "")).setFont(font1);
		p4.add(new JLabel("=")).setFont(font1);
		
		if(index == 3)
			p4.add(new JLabel(str + "")).setFont(font1);
		else
			p4.add(new JLabel(result + "")).setFont(font1);

		Function();
		p5.add(new JLabel(ran1 + "")).setFont(font1);
		p5.add(new JLabel(new ImageIcon("info2.png")));
		p5.add(new JLabel(ran2 + "")).setFont(font1);
		p5.add(new JLabel("=")).setFont(font1);
		
		if(index == 3)
			p5.add(new JLabel(str + "")).setFont(font1);
		else
			p5.add(new JLabel(result + "")).setFont(font1);
		//
		
		center.add(p1);
		center.add(p2);
		center.add(p3);
		center.add(p4);
		center.add(p5);
		center.add(p6);
		center.add(finish);
		
		//add
		add(center, BorderLayout.CENTER);
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) 
			inp[cnt] = '+';
		
		else if(e.getSource() == b2) 
			inp[cnt] = '-';
			
		else if(e.getSource() == b3) 
			inp[cnt] = '*';
		
		else if(e.getSource() == b4)
			inp[cnt] = '/';
		
		else if(e.getActionCommand().equals("Next")) {
			next.setText("Exit");;
		}
		
		else if(e.getActionCommand().equals("Exit")) {
			System.exit(0);
		}

		JLabel w = new JLabel("선택한 연산자 : ");
		JLabel l = new JLabel("정답 : ");
		w.setForeground(Color.BLUE);
		l.setForeground(Color.RED);
		
		JLabel a1 = new JLabel("맞은 개수 : ");
		JLabel a2 = new JLabel("틀린 개수 : ");
		a1.setForeground(Color.RED);
		a2.setForeground(Color.BLUE);
		
		if(cnt == 4) {	//정답 공개
			north.removeAll();
			south.removeAll();
			
			for(int i=0; i < 5; i++) {
				if(inp[i] == out[i])
					win++;
				else
					lose++;
			}
			System.out.println("맞은 개수 : " + win + "\n틀린 개수 : " + lose);
			
			next.setFont(font3);
			add(next, BorderLayout.SOUTH);
			
			p6.add(w).setFont(font4);
			for(int i=0; i < 5; i++)
				p6.add(new JLabel(inp[i] + "")).setFont(font4);
			
			p6.add(l).setFont(font4);
			for(int i=0; i < 5; i++)
				p6.add(new JLabel(out[i] + "")).setFont(font4);
			
			add(p7, BorderLayout.CENTER);
		}
		
		else if(cnt == 5) {		//맞춘 개수, 틀린 개수
			finish.add(a1).setFont(font5);
			finish.add(new JLabel(win + "   / ")).setFont(font5);
			
			finish.add(a2).setFont(font5);
			finish.add(new JLabel(lose + "")).setFont(font5);
			
		}

		card.next(center);
		cnt++;
	}
}
