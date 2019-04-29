package pi.KR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalcMain extends JFrame {
	
	/** используется для указания версии сериализованных данных. */
	private static final long serialVersionUID = 1L;
	
    /* Константы для расположения объектов */
    final int x = 40; final int y = 20; final int xO = 99; final int yO = 29;
    
    /* Объявление объектов: кнопок, надписей, текстовых полей, выпадающих списков */
    JLabel labelHeight = new JLabel("Ширина (см)");
    JLabel labelWeight = new JLabel("Высота (см)");
    JLabel labelMaterial = new JLabel("Материал");
    JLabel labelGasket = new JLabel("Уплотнение");
    JLabel labelAnswer = new JLabel("Ответ: ");
    JTextField fieldHeight = new JTextField(10);
    JTextField fieldWeight = new JTextField(10);
    JButton buttonCalculate = new JButton("Рассчитать");
    String[] comboitems1 = {"Дерево", "Алюминий", "ПВХ"};
    JComboBox<String> comboBox1 = new JComboBox<String>(comboitems1);
    String[] comboitems2 = {"Резиновое"};
    JComboBox<String> comboBox2 = new JComboBox<String>(comboitems2);
	
	/* Конструктор */
	public CalcMain() {
		super("Расчет оконной конструкции");
		createGUI();
    }
	
	/* Главный метод */
	public void createGUI() {
		/* Закрытие окна при нажатии кнопки закрыть */
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/* Указание размера окна. */
        setSize(510,700);
        /* Задание начальной позиции окна – в центре экрана */
        setLocationRelativeTo(null);
        /* Сделать окно видимым */
        setVisible(true);
        /* Запрещение изменения размеров окна */
        setResizable(false);
        /* Установка менеджера компоновки */
        setLayout(new BorderLayout());
        /* Добавление изображения под тип конструкции */
        setContentPane(new JLabel(new ImageIcon("src\\prom.png")));
        
        /* Установка действий над объектами */
        labelHeight.setBounds(x+13, y, xO+1, yO+1);
        add(labelHeight);
        labelWeight.setBounds(x+113, y, xO+1, yO+1);
        add(labelWeight);
        fieldHeight.setBounds(x, y+33, xO+1, yO+1);
        add(fieldHeight);
        fieldWeight.setBounds(x+100, y+33, xO+1, yO+1);
        add(fieldWeight);
        labelMaterial.setBounds(x+220, y, xO+1, yO+1);
        add(labelMaterial);
        labelGasket.setBounds(x+313, y, xO+1, yO+1);
        add(labelGasket);
        comboBox1.setBounds(x+200, y+33, xO, yO);
        add(comboBox1);
        comboBox2.setBounds(x+300, y+33, xO, yO);
        add(comboBox2);
        buttonCalculate.setBounds(x, y+70, xO+300, yO+1);
        buttonCalculate.setActionCommand("Рассчитать");
        add(buttonCalculate);
        labelAnswer.setBounds(x, y+100, xO+301, yO+1);
        add(labelAnswer);
        
        ActionListener actionListener = new Actions();
        buttonCalculate.addActionListener(actionListener);
	}
	
    /* Метод расчета оконной конструкции */
	public int calculation(String sw, String sh) {
		/* r = 10 при деревянной раме, u = 1 при резиновом уплотнении */
		int S = 0; int h = Integer.valueOf(sh); int w = Integer.valueOf(sw); int u = 1; //int r = 10;
		S = (h+u)*(w+u);
		return S;
	}
	
	public class Actions implements ActionListener {
		
		/* Функция, в которой обрабатываются события всех кнопок */
		public void actionPerformed(ActionEvent e){
			switch (e.getActionCommand()) {
				case "Рассчитать":
					labelAnswer.setText("Ответ: "+calculation(fieldHeight.getText(),fieldWeight.getText())+" (полная площадь оконной конструкции)");
					break;
			}
		}
	}
	
    public static void main(String args[]) {
        /* SwingUtilities.invokeLater предназначена для запуска асинхронной операции.
		 * Она сохраняет действие (Runnable), и запускает его на одной из следующих итераций цикла сообщений. */
		SwingUtilities.invokeLater(new Runnable() {
			/* Обращение к конструктору через метод */
			public void run() {
				new CalcMain();
			}
		});
    }
    
}