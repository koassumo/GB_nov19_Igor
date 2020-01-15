package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI_Swing extends JFrame {

        JTextArea bigField = new JTextArea(20,20);                // поле с отображением переписки

        public GUI_Swing (){
                this.setTitle("Client Swing");
                this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                this.setBounds(300, 300, 500, 500);

                this.setLayout (new BorderLayout());     // подложка для всего окна

                bigField.setFont(new Font("Arial", Font.BOLD,14));             // шрифт
                bigField.setEditable(false);                                               // запрет на редактирование (чтобы с клавы нельзя было поменять текст)
                this.add("Center", bigField);

                JPanel southPanel = new JPanel();                                       // нижняя панель (будет состоять из 2х частей)
                add("South", southPanel);

                FlowLayout southLayout = new FlowLayout(FlowLayout.CENTER);                // разметка нижней панели
                southPanel.setLayout(southLayout);

                JTextField inputTextField = new JTextField("", 28);           // строка для ввода текста
                inputTextField.setHorizontalAlignment(JTextField.LEFT);                    // выровнить текст по краю
                inputTextField.setFont(new Font("Courier", Font.BOLD,16));     // шрифт
                inputTextField.setEditable(true);
                southPanel.add("Left", inputTextField);

                JButton buttonEnter = new JButton("Ввод");                      //кнопка
                southPanel.add("Right", buttonEnter);

                // вывод окна
                setVisible(true);


//                // вариант 1. Анонимный лиссенер
//                buttonEnter.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                                System.out.println("Button pressed...");
//                        }
//                });

                // вариант 2. Один поименованный лиссенер на 2 события
                ActionListener inputListener = new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) { bigField.setText(bigField.getText() + "\n" + inputTextField.getText()); inputTextField.setText(""); }
                };

                //обработчик событий
                inputTextField.addActionListener(inputListener);    //  заполнение поля с клавы
                buttonEnter.addActionListener(inputListener);    //  нажатие на кнопку ввод


                addWindowListener(new WindowAdapter() {                   //  действие при закрытии окна
                        @Override
                        public void windowClosing(WindowEvent e) {
                                System.out.println("Bye");
                        }
                });

        }

        protected void setNewText (String newText){
                bigField.setText(bigField.getText() + "\n" + newText);
        }

}
