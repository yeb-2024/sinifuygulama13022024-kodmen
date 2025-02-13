package org.example;

import javax.swing.*;
import java.awt.*;

public class GirisSayfa {

    JFrame frame;
    JTextField kullaniciAdi;
    public GirisSayfa(){
        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200, 30));

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        panel.add(new JLabel("Kullanıcı Adı:"));
        panel.add(kullaniciAdi);

        frame.add(panel);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
