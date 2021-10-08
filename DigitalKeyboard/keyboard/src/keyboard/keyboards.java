package keyboard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
public class keyboards {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					keyboards window = new keyboards();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public keyboards() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setForeground(new Color(184, 134, 11));
		frame.setBounds(100, 100, 1703, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(10, 229, 47, 217);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnG = new JButton("G");
		btnG.setBackground(Color.WHITE);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnG.setBounds(191, 229, 47, 217);
		frame.getContentPane().add(btnG);
		
		JButton btnD = new JButton("D");
		btnD.setBackground(Color.WHITE);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD.setBounds(57, 229, 47, 217);
		frame.getContentPane().add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.setBackground(Color.WHITE);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnF.setBounds(147, 229, 47, 217);
		frame.getContentPane().add(btnF);
		
		JButton btnE = new JButton("E");
		btnE.setBackground(Color.WHITE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\E.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnE.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnE.setBounds(103, 229, 47, 217);
		frame.getContentPane().add(btnE);
		
		JButton btnA = new JButton("A");
		btnA.setBackground(Color.WHITE);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A.wav"));
			    Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
				catch(Exception ex)
				{	
				}
			}
		});
		btnA.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnA.setBounds(237, 229, 47, 217);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBackground(Color.WHITE);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\B.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB.setBounds(283, 229, 47, 217);
		frame.getContentPane().add(btnB);
		
		JButton button_6 = new JButton("C");
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_6.setBounds(329, 229, 47, 217);
		frame.getContentPane().add(button_6);
		
		JButton btnD_1 = new JButton("D");
		btnD_1.setBackground(Color.WHITE);
		btnD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_1.setBounds(375, 229, 47, 217);
		frame.getContentPane().add(btnD_1);
		
		JButton btnE_1 = new JButton("E");
		btnE_1.setBackground(Color.WHITE);
		btnE_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\E.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnE_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnE_1.setBounds(421, 229, 47, 217);
		frame.getContentPane().add(btnE_1);
		
		JButton btnF_1 = new JButton("F");
		btnF_1.setBackground(Color.WHITE);
		btnF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnF_1.setBounds(468, 229, 47, 217);
		frame.getContentPane().add(btnF_1);
		
		JButton btnG_1 = new JButton("G");
		btnG_1.setBackground(Color.WHITE);
		btnG_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnG_1.setBounds(515, 229, 47, 217);
		frame.getContentPane().add(btnG_1);
		
		JButton btnA_1 = new JButton("A");
		btnA_1.setBackground(Color.WHITE);
		btnA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnA_1.setBounds(562, 229, 47, 217);
		frame.getContentPane().add(btnA_1);
		
		JButton btnB_1 = new JButton("B");
		btnB_1.setBackground(Color.WHITE);
		btnB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\B.wav"));
			    Clip clip =AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			}
				catch(Exception ex)
				{	
				}
			}
		});
		btnB_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB_1.setBounds(608, 229, 47, 217);
		frame.getContentPane().add(btnB_1);
		
		JButton button_13 = new JButton("C");
		button_13.setBackground(Color.WHITE);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_13.setBounds(655, 229, 47, 217);
		frame.getContentPane().add(button_13);
		
		JButton btnD_2 = new JButton("D");
		btnD_2.setBackground(Color.WHITE);
		btnD_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_2.setBounds(702, 229, 47, 217);
		frame.getContentPane().add(btnD_2);
		
		JButton btnE_2 = new JButton("E");
		btnE_2.setBackground(Color.WHITE);
		btnE_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\E.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnE_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnE_2.setBounds(748, 229, 47, 217);
		frame.getContentPane().add(btnE_2);
		
		JButton btnF_2 = new JButton("F");
		btnF_2.setBackground(Color.WHITE);
		btnF_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnF_2.setBounds(795, 229, 47, 217);
		frame.getContentPane().add(btnF_2);
		
		JButton btnG_2 = new JButton("G");
		btnG_2.setBackground(Color.WHITE);
		btnG_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnG_2.setBounds(841, 229, 47, 217);
		frame.getContentPane().add(btnG_2);
		
		JButton btnA_2 = new JButton("A");
		btnA_2.setBackground(Color.WHITE);
		btnA_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnA_2.setBounds(887, 229, 47, 217);
		frame.getContentPane().add(btnA_2);
		
		JButton btnB_2 = new JButton("B");
		btnB_2.setBackground(Color.WHITE);
		btnB_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\B.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnB_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB_2.setBounds(934, 229, 47, 217);
		frame.getContentPane().add(btnB_2);
		
		JButton button_20 = new JButton("C");
		button_20.setBackground(Color.WHITE);
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_20.setBounds(981, 229, 47, 217);
		frame.getContentPane().add(button_20);
		
		JButton btnD_3 = new JButton("D");
		btnD_3.setBackground(Color.WHITE);
		btnD_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_3.setBounds(1028, 229, 47, 217);
		frame.getContentPane().add(btnD_3);
		
		JButton btnE_3 = new JButton("E");
		btnE_3.setBackground(Color.WHITE);
		btnE_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\E.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnE_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnE_3.setBounds(1075, 229, 47, 217);
		frame.getContentPane().add(btnE_3);
		
		JButton btnF_3 = new JButton("F");
		btnF_3.setBackground(Color.WHITE);
		btnF_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnF_3.setBounds(1122, 229, 47, 217);
		frame.getContentPane().add(btnF_3);
		
		JButton btnA_3 = new JButton("G");
		btnA_3.setBackground(Color.WHITE);
		btnA_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnA_3.setBounds(1168, 229, 47, 217);
		frame.getContentPane().add(btnA_3);
		
		JButton btnB_3 = new JButton("A");
		btnB_3.setBackground(Color.WHITE);
		btnB_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnB_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB_3.setBounds(1215, 229, 47, 217);
		frame.getContentPane().add(btnB_3);
		
		JButton btnB_5 = new JButton("B");
		btnB_5.setBackground(Color.WHITE);
		btnB_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\B.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnB_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB_5.setBounds(1262, 229, 47, 217);
		frame.getContentPane().add(btnB_5);
		
		JButton btnD_4 = new JButton("C");
		btnD_4.setBackground(Color.WHITE);
		btnD_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_4.setBounds(1309, 229, 47, 217);
		frame.getContentPane().add(btnD_4);
		
		JButton btnF_4 = new JButton("E");
		btnF_4.setBackground(Color.WHITE);
		btnF_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\E.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnF_4.setBounds(1401, 229, 47, 217);
		frame.getContentPane().add(btnF_4);
		
		JButton btnA_4 = new JButton("F");
		btnA_4.setBackground(Color.WHITE);
		btnA_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnA_4.setBounds(1446, 229, 47, 217);
		frame.getContentPane().add(btnA_4);
		
		JButton btnB_4 = new JButton("G");
		btnB_4.setBackground(Color.WHITE);
		btnB_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnB_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB_4.setBounds(1492, 229, 47, 217);
		frame.getContentPane().add(btnB_4);
		
		JButton btnA_5 = new JButton("A");
		btnA_5.setBackground(Color.WHITE);
		btnA_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnA_5.setBounds(1537, 229, 47, 217);
		frame.getContentPane().add(btnA_5);
		
		JButton btnB_6 = new JButton("B");
		btnB_6.setBackground(Color.WHITE);
		btnB_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\B.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnB_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnB_6.setBounds(1583, 229, 47, 217);
		frame.getContentPane().add(btnB_6);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC.setBounds(1630, 229, 47, 217);
		frame.getContentPane().add(btnC);
		
		JButton btnD_5 = new JButton("D");
		btnD_5.setBackground(Color.WHITE);
		btnD_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnD_5.setBounds(1355, 229, 47, 217);
		frame.getContentPane().add(btnD_5);
		
		JButton btnC_1 = new JButton("C#");
		btnC_1.setBackground(Color.BLACK);
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC_1.setForeground(Color.WHITE);
		btnC_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC_1.setBounds(33, 102, 47, 128);
		frame.getContentPane().add(btnC_1);
		
		JButton btnD_6 = new JButton("D#");
		btnD_6.setBackground(Color.BLACK);
		btnD_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_6.setForeground(Color.WHITE);
		btnD_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnD_6.setBounds(79, 102, 47, 128);
		frame.getContentPane().add(btnD_6);
		
		JButton btnF_5 = new JButton("F#");
		btnF_5.setBackground(Color.BLACK);
		btnF_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_5.setForeground(Color.WHITE);
		btnF_5.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnF_5.setBounds(173, 102, 47, 128);
		frame.getContentPane().add(btnF_5);
		
		JButton btnG_3 = new JButton("G#");
		btnG_3.setBackground(Color.BLACK);
		btnG_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_3.setForeground(Color.WHITE);
		btnG_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnG_3.setBounds(218, 102, 47, 128);
		frame.getContentPane().add(btnG_3);
		
		JButton btnA_6 = new JButton("A#");
		btnA_6.setBackground(Color.BLACK);
		btnA_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_6.setForeground(Color.WHITE);
		btnA_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnA_6.setBounds(264, 102, 47, 128);
		frame.getContentPane().add(btnA_6);
		
		JButton btnC_3 = new JButton("C#");
		btnC_3.setBackground(Color.BLACK);
		btnC_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC_3.setForeground(Color.WHITE);
		btnC_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC_3.setBounds(352, 102, 47, 128);
		frame.getContentPane().add(btnC_3);
		
		JButton btnC_2 = new JButton("D#");
		btnC_2.setBackground(Color.BLACK);
		btnC_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC_2.setForeground(Color.WHITE);
		btnC_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC_2.setBounds(399, 102, 47, 128);
		frame.getContentPane().add(btnC_2);
		
		JButton btnF_6 = new JButton("F#");
		btnF_6.setBackground(Color.BLACK);
		btnF_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_6.setForeground(Color.WHITE);
		btnF_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnF_6.setBounds(491, 102, 47, 128);
		frame.getContentPane().add(btnF_6);
		
		JButton btnG_4 = new JButton("G#");
		btnG_4.setBackground(Color.BLACK);
		btnG_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_4.setForeground(Color.WHITE);
		btnG_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnG_4.setBounds(537, 102, 47, 128);
		frame.getContentPane().add(btnG_4);
		
		JButton btnA_7 = new JButton("A#");
		btnA_7.setBackground(Color.BLACK);
		btnA_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_7.setForeground(Color.WHITE);
		btnA_7.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnA_7.setBounds(583, 102, 47, 128);
		frame.getContentPane().add(btnA_7);
		
		JButton btnC_4 = new JButton("C#");
		btnC_4.setBackground(Color.BLACK);
		btnC_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC_4.setForeground(Color.WHITE);
		btnC_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC_4.setBounds(680, 102, 47, 128);
		frame.getContentPane().add(btnC_4);
		
		JButton btnD_7 = new JButton("D#");
		btnD_7.setBackground(Color.BLACK);
		btnD_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_7.setForeground(Color.WHITE);
		btnD_7.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnD_7.setBounds(726, 102, 47, 128);
		frame.getContentPane().add(btnD_7);
		
		JButton btnF_7 = new JButton("F#");
		btnF_7.setBackground(Color.BLACK);
		btnF_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_7.setForeground(Color.WHITE);
		btnF_7.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnF_7.setBounds(819, 102, 47, 128);
		frame.getContentPane().add(btnF_7);
		
		JButton btnG_5 = new JButton("G#");
		btnG_5.setBackground(Color.BLACK);
		btnG_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_5.setForeground(Color.WHITE);
		btnG_5.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnG_5.setBounds(866, 102, 47, 128);
		frame.getContentPane().add(btnG_5);
		
		JButton btnA_8 = new JButton("A#");
		btnA_8.setBackground(Color.BLACK);
		btnA_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_8.setForeground(Color.WHITE);
		btnA_8.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnA_8.setBounds(913, 102, 47, 128);
		frame.getContentPane().add(btnA_8);
		
		JButton btnC_5 = new JButton("C#");
		btnC_5.setBackground(Color.BLACK);
		btnC_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC_5.setForeground(Color.WHITE);
		btnC_5.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC_5.setBounds(1005, 102, 47, 128);
		frame.getContentPane().add(btnC_5);
		
		JButton btnD_8 = new JButton("D#");
		btnD_8.setBackground(Color.BLACK);
		btnD_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_8.setForeground(Color.WHITE);
		btnD_8.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnD_8.setBounds(1052, 102, 47, 128);
		frame.getContentPane().add(btnD_8);
		
		JButton btnF_8 = new JButton("F#");
		btnF_8.setBackground(Color.BLACK);
		btnF_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_8.setForeground(Color.WHITE);
		btnF_8.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnF_8.setBounds(1145, 102, 47, 128);
		frame.getContentPane().add(btnF_8);
		
		JButton btnG_6 = new JButton("G#");
		btnG_6.setBackground(Color.BLACK);
		btnG_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_6.setForeground(Color.WHITE);
		btnG_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnG_6.setBounds(1192, 102, 47, 128);
		frame.getContentPane().add(btnG_6);
		
		JButton btnA_9 = new JButton("A#");
		btnA_9.setBackground(Color.BLACK);
		btnA_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_9.setForeground(Color.WHITE);
		btnA_9.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnA_9.setBounds(1239, 102, 47, 128);
		frame.getContentPane().add(btnA_9);
		
		JButton btnC_6 = new JButton("C#");
		btnC_6.setBackground(Color.BLACK);
		btnC_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\C_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnC_6.setForeground(Color.WHITE);
		btnC_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnC_6.setBounds(1333, 102, 47, 128);
		frame.getContentPane().add(btnC_6);
		
		JButton btnD_9 = new JButton("D#");
		btnD_9.setBackground(Color.BLACK);
		btnD_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\D_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnD_9.setForeground(Color.WHITE);
		btnD_9.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnD_9.setBounds(1380, 102, 47, 128);
		frame.getContentPane().add(btnD_9);
		
		JButton btnF_9 = new JButton("F#");
		btnF_9.setBackground(Color.BLACK);
		btnF_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\F_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnF_9.setForeground(Color.WHITE);
		btnF_9.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnF_9.setBounds(1471, 102, 47, 128);
		frame.getContentPane().add(btnF_9);
		
		JButton btnG_7 = new JButton("G#");
		btnG_7.setBackground(Color.BLACK);
		btnG_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\G_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnG_7.setForeground(Color.WHITE);
		btnG_7.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnG_7.setBounds(1516, 102, 47, 128);
		frame.getContentPane().add(btnG_7);
		
		JButton btnA_10 = new JButton("A#");
		btnA_10.setBackground(Color.BLACK);
		btnA_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream =AudioSystem.getAudioInputStream(new File("D:\\music\\Music_Note\\A_Drum.wav"));
				    Clip clip =AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				}
					catch(Exception ex)
					{	
					}
			}
		});
		btnA_10.setForeground(Color.WHITE);
		btnA_10.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnA_10.setBounds(1562, 102, 47, 128);
		frame.getContentPane().add(btnA_10);
	}
}