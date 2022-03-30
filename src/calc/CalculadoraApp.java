
package calc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraApp {

	private JFrame frame;
	private JTextField textField;

	Calculadora c = new Calculadora();
	double first;
	double second;
	double result;
	int value;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraApp window = new CalculadoraApp();
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
	public CalculadoraApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 425, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(10, 11, 389, 84);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn_0 = new JButton("0");
		btn_0.setBounds(10, 465, 89, 77);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_0);

		JButton btn_1 = new JButton("1");
		btn_1.setBounds(10, 377, 89, 77);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.setBounds(110, 377, 89, 77);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.setBounds(210, 377, 89, 77);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_3);

		JButton btn_4 = new JButton("4");
		btn_4.setBounds(10, 289, 89, 77);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.setBounds(110, 289, 89, 77);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.setBounds(210, 289, 89, 77);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_6);

		JButton btn_7 = new JButton("7");
		btn_7.setBounds(10, 201, 89, 77);
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.setBounds(110, 201, 89, 77);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.setBounds(210, 201, 89, 77);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_9);

		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn_00.getText();
				textField.setText(number);
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_00.setBounds(210, 113, 89, 77);
		frame.getContentPane().add(btn_00);

		JButton btn_dot = new JButton(".");
		btn_dot.setBounds(110, 465, 89, 77);
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty() && screen.contains(".") == false) {
					String number = textField.getText() + btn_dot.getText();
					textField.setText(number);
				} else {
					if (screen.contains(".") == true) {
					} else {
						String number = "0" + btn_dot.getText();
						textField.setText(number);
					}
				}
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_dot);

		JButton btn_sum = new JButton("+");
		btn_sum.setBounds(310, 113, 89, 77);
		btn_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "+";
				} else {
					textField.setText("Acción no permitida");
				}
			}
		});
		btn_sum.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_sum);

		JButton btn_res = new JButton("-");
		btn_res.setBounds(310, 201, 89, 77);
		btn_res.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty()) {
					first = Double.parseDouble(screen);
					textField.setText("");
					operation = "-";
				} else {
					textField.setText("-");
					if (screen == "-") {
						first = Double.parseDouble(textField.getText().substring(0));
						first = first * (-1);
						textField.setText("");
						operation = "-";
					}
				}
			}
		});
		btn_res.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_res);

		JButton btn_mult = new JButton("*");
		btn_mult.setBounds(310, 289, 89, 77);
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
				} else {
					textField.setText("Acción no permitida");
				}
			}
		});
		btn_mult.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_mult);

		JButton btn_div = new JButton("/");
		btn_div.setBounds(310, 377, 89, 77);
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty()) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
				} else {
					textField.setText("Acción no permitida");
				}
			}
		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_div);

		JButton btn_fact = new JButton("!");
		btn_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty()) {
					value = Integer.parseInt(textField.getText());
					textField.setText("");
					operation = "!";
				} else {
					textField.setText("Acción no permitida");
				}
			}
		});
		btn_fact.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_fact.setBounds(310, 465, 89, 77);
		frame.getContentPane().add(btn_fact);

		JButton btn_prim = new JButton("?");
		btn_prim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = textField.getText();
				if (screen != null && !screen.isEmpty()) {
					value = Integer.parseInt(textField.getText());
					textField.setText("");
					operation = "?";
				} else {
					textField.setText("Acción no permitida");
				}
			}
		});
		btn_prim.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_prim.setBounds(210, 465, 89, 77);
		frame.getContentPane().add(btn_prim);

		JButton btn_equal = new JButton("=");
		btn_equal.setBounds(10, 553, 389, 77);
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				if (operation == "+") {
					second = Double.parseDouble(textField.getText());
					result = c.suma(first, second);
					answer = String.format("%s", result);
					textField.setText(answer);
				}
				if (operation == "-") {
					second = Double.parseDouble(textField.getText());
					result = c.resta(first, second);
					answer = String.format("%s", result);
					textField.setText(answer);
				}
				if (operation == "*") {
					second = Double.parseDouble(textField.getText());
					result = c.mult(first, second);
					answer = String.format("%s", result);
					textField.setText(answer);
				}
				if (operation == "/") {
					second = Double.parseDouble(textField.getText());
					if (second != 0) {
						result = c.divide(first, second);
						answer = String.format("%s", result);
						textField.setText(answer);
					} else {
						textField.setText("Error: división entre 0");
					}
				}
				if (operation == "!") {
					if (value >= 0 && value < 13) {
						result = c.fact(value);
						answer = String.format("%s", result);
						textField.setText(answer);
					} else {
						textField.setText("Error: valor no disponible");
					}

				}
				if (operation == "?") {
					if (c.esPrimo(value) == true) {
						answer = String.format("Es primo");
						textField.setText(answer);
					} else {
						answer = String.format("No es primo");
						textField.setText(answer);
					}
				}
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(btn_equal);

		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_C.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_C.setBounds(110, 113, 89, 77);
		frame.getContentPane().add(btn_C);

		JButton btn_del = new JButton("<-");
		btn_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btn_del.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_del.setBounds(10, 113, 89, 77);
		frame.getContentPane().add(btn_del);
	}
}
