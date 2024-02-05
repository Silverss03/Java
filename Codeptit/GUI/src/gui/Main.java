package gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Font;
import java.awt.HeadlessException ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame ;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main extends JFrame implements ActionListener, DocumentListener{
    private JLabel lbln1, lbln2, lblkq ;
    private JTextField txtn1, txtn2 ;
    private JButton bt1, bt2, bt3 ;
    public Main(){
        initGUI() ;
    }
    private void initGUI(){
        setTitle("Tinh Toan") ;
        setSize(700,600) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setLocationRelativeTo(this) ;
        setLayout(null) ;
        lbln1 = new JLabel("Nhap so 1") ;
        lbln2 = new JLabel("Nhap so 2") ;
        lblkq = new JLabel("Ket qua:") ;
        lbln1.setBounds(100, 100, 240, 40);
        lbln2.setBounds(100, 200, 240, 40);
        lblkq.setBounds(160, 300, 400, 40);
        add(lbln1) ;
        add(lbln2) ;
        add(lblkq) ;
        txtn1 = new JTextField() ; 
        txtn2 = new JTextField() ;
        txtn1.setBounds(200, 100, 300, 40);
        txtn2.setBounds(200, 200, 300, 40);
        add(txtn1) ;
        add(txtn2) ;
        bt1 = new JButton("Nhap Lai") ;
        bt2 = new JButton("Tinh") ;
        bt3 = new JButton("Dong") ;
        bt1.setBounds(150, 400, 200, 40);
        bt2.setBounds(400,400 , 200, 40);
        bt3.setBounds(250,500,200,40 );
        add(bt1) ;
        add(bt2) ;
        add(bt3);
        Font f = new Font("Arial", Font.PLAIN, 20) ;
        lbln1.setFont(f);
        lbln2.setFont(f);
        lblkq.setFont(f);
        txtn1.setFont(f);
        txtn2.setFont(f);
        bt1.setFont(f);
        bt2.setFont(f);
        bt1.setEnabled(false);
        bt2.setEnabled(false) ;
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        txtn1.getDocument().addDocumentListener(this);
        txtn2.getDocument().addDocumentListener(this);
        
    }
    public static void main(String[] args) {
        Main m = new Main() ;
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1){
            txtn1.setText("");
            txtn2.setText("");
        }
        if(e.getSource() == bt2){
            int n1 = Integer.parseInt(txtn1.getText()) ;
            int n2 = Integer.parseInt(txtn2.getText()) ;
            int kq = n1 + n2 ; 
            lblkq.setText("Ket qua:" + kq);
        }
        if(e.getSource() == bt3){
            if(JOptionPane.showConfirmDialog(this, "Co thoat khong", "Thoat", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                System.exit(0) ;
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        String s1 = txtn1.getText() ;
        String s2 = txtn2.getText() ;
        if(s1.isEmpty() && s2.isEmpty())
            bt1.setEnabled(false);
        else
            bt1.setEnabled(true);
        String reg = "\\d+" ;
        if(s1.matches(reg) && s2.matches(reg)){
            bt2.setEnabled(true);
        }
        else{
            bt2.setEnabled(false);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String s1 = txtn1.getText() ;
        String s2 = txtn2.getText() ;
        if(s1.isEmpty() && s2.isEmpty())
            bt1.setEnabled(false);
        else
            bt1.setEnabled(true);
        String reg = "\\d+" ;
        if(s1.matches(reg) && s2.matches(reg)){
            System.out.println("yes");
            bt2.setEnabled(true);
        }
        else{
            bt2.setEnabled(false);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
