
/**
* ��������� �� ��, ��� ����� ����������� ������ 
*/
package audio_1;
/**
* ����������� �����, ������� ��������� ���� �� �����,��������, ��������, ��������� � ����������� ������� 
*/
import java.awt.BorderLayout; 
/**
* ����������� ����� ��� ������� ����� �� ������ ������� 
*/
import java.awt.EventQueue; 
/**
* ����������� ����� ��� �������� ������ 
*/
import javax.swing.JFrame; 
/**
* ����������� ����� ��� �������� ������ 
*/
import javax.swing.JPanel; 
/**
* ����������� ����� ��� �������� ������ �����, ������� ��������� ������� ������� ������ ������ 
*/
import javax.swing.border.EmptyBorder; 
/**
* ����������� ����� ��� ���������� ���� � ������������ ���������� ������ 
*/
import javax.swing.JTextArea; 
/**
* ����������� ����� ��� ������������� ������ 
*/
import javax.swing.JLabel; 
/**
* ����������� ����� ���  ���������� ���� 
*/
import javax.swing.JTextField; 
/**
* ����������� ����� ��� ����������� ������ � ���� ������ 
*/
import javax.swing.JList; 
/**
* ����������� ����� ����������� ������ 
*/
import javax.swing.JComboBox; 
/**
*����������� ����� �������� �� ��������� ��� ����������� ������ 
*/
import javax.swing.DefaultComboBoxModel; 
/**
* ����������� ����� ��� ���-����� 
*/
import javax.swing.JRadioButton; 
/**
* ����������� ����� ��� ������ 
*/
import javax.swing.JButton; 
/**
* ����������� ����� ������� 
*/
import java.awt.Font; 
/**
* ����������� ����� ��� ��������� ������� �� ������ 
*/
import java.awt.event.ActionListener; 
/**
* ����������� ����� ��� ��������� ������� 
*/
import java.awt.event.ActionEvent; 
/**
* ����������� ����� ��������� ����� 
*/
import java.awt.TextField; 
/**
* ����������� ����� ��������� ������� 
*/
import javax.swing.JTextPane; 
/**
* ����������� ����� ������ 
*/
import java.awt.Button; 
/**
* ����������� ����� ������� ����� 
*/
import java.awt.Color; 
/**
* ����������� ����� ������� ���������� ����� 
*/
import java.awt.SystemColor; 
/**
* ����������� ����� � ���������� 
*/
import javax.swing.SwingConstants; 
/**
* ����������� ����� ��������������� ����� 
*/
import javax.swing.JFormattedTextField;  
/**
* 
*/
import Calc.physhicalCalc;

public class physhical extends JFrame {
/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField; 
	/**
* ����� ���������� ��� ���������� ������ 
*/
	private JTextField textField_1; 
	public JButton button_1; 

	public physhical() {
		/**
* ����� ��������� ��� ������ 
*/
		setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432"); 
		/**
* ��������� ��������, ������� ���������� ��������� ����� ������������ ��������� ����� �������� �� �������. � ������ ������ ������� ����� 
*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/**
* ����� ���������� 
*/
		setBounds(100, 100, 921, 586);  
		/**
*  ������������� �������� ���������� 
*/
		getContentPane().setLayout(null);
		
		/**
* ����� ����� 
*/
		JButton btnNewButton_1 = new JButton("Ok");  
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ������ ������� ��� ������� �� ������ 
*/
		btnNewButton_1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
			/**
*����� �� �������� ���� 
*/
				setVisible(false); 
			}
		});
		/**
* ����� ���������� 
*/
		btnNewButton_1.setBounds(401, 439, 89, 29); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(btnNewButton_1); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane = new JTextPane(); 
		/**
* ����� ����� ��� ������ 
*/
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/**
* ����� ���� ��� ������ 
*/
		textPane.setBackground(SystemColor.control);
		/**
* ����� ����� 
*/
		textPane.setText("\u0420\u0430\u0441\u0447\u0435\u0442 \u043E\u0431\u044A\u0435\u043C\u0430 \u043F\u0430\u043C\u044F\u0442\u0438 \u0434\u043B\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0430\u0443\u0434\u0438\u043E\u0444\u0430\u0439\u043B\u043E\u0432 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u043D\u044B\u0445 \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u043E\u0432 \u0434\u043B\u044F \u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043A\u0438\u0445 \u043B\u0438\u0446");  
		/**
* ����� ���������� 
*/
		textPane.setBounds(10, 11, 867, 34); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_3 = new JTextPane(); 
		textPane_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textPane_3.setText("\u0412\u0440\u0435\u043C\u044F \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F \u0444\u0430\u0439\u043B\u043E\u0432 (\u0434\u043D\u0435\u0439)");  
		/**
* ����� ���� 
*/
		textPane_3.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_3.setBounds(37, 157, 313, 49); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_3); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_4 = new JTextPane(); 
		textPane_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����� 
*/
		textPane_4.setText("\u0414\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C \u0440\u0430\u0437\u0433\u043E\u0432\u043E\u0440\u0430 (\u0447)"); 
		/**
* ����� ���� 
*/
		textPane_4.setBackground(SystemColor.menu); 
		
		/**
* ����� ���������� 
*/
		textPane_4.setBounds(37, 231, 265, 29); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_4);
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_7 = new JTextPane(); 
		/**
* ����� ����� 
*/
		textPane_7.setText("\u041D\u0435\u043E\u0431\u0445\u043E\u0434\u0438\u043C\u044B\u0439 \u0440\u0430\u0437\u043C\u0435\u0440 \u043C\u0435\u0441\u0442\u0430 \u0445\u0440\u0430\u043D\u0435\u043D\u0438\u044F");  
		/**
* ����� ����� ��� ������ 
*/
		textPane_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ���� ��� ������ 
*/
		textPane_7.setBackground(SystemColor.menu);
		/**
* ����� ���������� 
*/
		textPane_7.setBounds(22, 368, 394, 30); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_7); 

		/**
* ������ ���� ��� ������ ���������� 
*/
		final JFormattedTextField formattedTextField = new JFormattedTextField(); 
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ��������� ��� �������������� 
*/
		formattedTextField.setEditable(false);
		/**
* ����� ���������� 
*/
		formattedTextField.setBounds(511, 368, 132, 30); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(formattedTextField); 
		
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_8 = new JTextPane(); 
		/**
* ����� ����� 
*/
		textPane_8.setText("\u0413\u0411");  
		/**
* ����� ����� ��� ������ 
*/
		textPane_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ���� 
*/
		textPane_8.setBackground(SystemColor.menu); 
		/**
* ����� ���������� 
*/
		textPane_8.setBounds(701, 368, 76, 30); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_8); 
		/**
* ������ ��������� ������ 
*/
		JTextPane textPane_1 = new JTextPane(); 
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 /**
* ����� ����� 
*/
		textPane_1.setText("\u0420\u0435\u0436\u0438\u043C \u043A\u043E\u043C\u043F\u0440\u0435\u0441\u0441\u0438\u0438");
		 /**
* ����� ���� 
*/
		textPane_1.setBackground(SystemColor.menu);
		/**
* ����� ���������� 
*/
		textPane_1.setBounds(37, 86, 180, 49); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textPane_1); 
		
		/**
* ������ ���������� ������ 
*/
		final JComboBox comboBox = new JComboBox(); 
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ����������� �������� ��� ������������ 
*/
		comboBox.setEditable(true); 
		/**
* ����� �������� ��� ����������� ������ 
*/
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"G.711 (\u041C\u044E-\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435)", "G.711 (\u0410-\u043A\u043E\u0434\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435)", "PCMGSM 0610", "GSM 0610"})); 
		/**
* ����� ���������� 
*/
		comboBox.setBounds(378, 91, 265, 39); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(comboBox); 
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField = new JTextField(); 
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ���������� 
*/
		textField.setBounds(378, 162, 86, 29); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textField);
		/**
* ����� ������ ���� 
*/
		textField.setColumns(10);
		
		
		/**
* ������ ��������� ���� ��� ����� ������ 
*/
		textField_1 = new JTextField(); 
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
* ����� ���������� �������� 
*/
		textField_1.setColumns(10); 
		/**
* ����� ���������� 
*/
		textField_1.setBounds(378, 231, 86, 29); 
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(textField_1);
		/**
* ����� ����� 
*/
		JButton button = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");  
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
*	������������� ���������� ��� �������� ������������ ���������� 
*/
				double m = 0;
				/**
*	������������� ���������� ��� ������������ ���������
*/
				int t = 0;
				
				/**
*	������������� ���������� ��� ������� �������� ������
*/
				int d = 0;
				/**
*	������������� ���������� ��� ������� ��������� ���������� 
*/
				double V = 0;
				
				/**
* ��������� ����� ����������  
*/
				int model = comboBox.getSelectedIndex(); 
				
				/**
* � ����������� �� ������ ��������� ���������� ����������� ���������  
*/
				switch(model){ 
				/**
* ���� ������ ������ ������ �� ����������� ��������� ���������� ���������� 
*/
				case 0: m = 27.5; break;
				/**
* ���� ������ ������ ������ �� ����������� ��������� ���������� ���������� 
*/
				case 1: m = 27.5; break;
				/**
* ���� ������ ������ ������ �� ����������� ��������� ���������� ���������� 
*/
				case 2: m = 55; break;
				/**
* ���� �������� ������ ������ �� ����������� ��������� ���������� ���������� 
*/
				case 3: m = 5.6; break; 
						
			}
				/**
* ����� ���������� ��� ������������ ���������
*/
				t = Integer.parseInt(textField.getText()); 
				
				/**
* ����� ���������� ��� ������� �������� ���� 
*/
				d = Integer.parseInt(textField_1.getText());
				
				/**
* ��������� �� ����� ������� ������ ������
*/
				physhicalCalc cc = new physhicalCalc();
				
				/**
* ������� ��������� � ��������� ���� � ���������� � ������ ��� ������� ������ 
*/
				formattedTextField.setText("" + cc.getK(t, d, m));  
				
			}
		});
		/**
*  ����� ���������� 
*/
		button.setBounds(315, 308, 181, 29);
		/**
* ��������� �� ���� ������ 
*/
		getContentPane().add(button); 
		
		JButton button_1 = new JButton("\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u043E\u0435 \u043B\u0438\u0446\u043E");
		button_1.setVerticalTextPosition(SwingConstants.TOP);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
				* �������� ����� ��� ���������� ��������
				*/	
				setVisible(false);
				/**
				* ��������� ���� ��� ����������� ��������
				*/
				korporate nc = new korporate(); 
				/**
				* ����� ��������� �����
				*/
				nc.setVisible(true); 
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBounds(694, 439, 183, 71);
		getContentPane().add(button_1);
	}
}
