import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Puzzle extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    Puzzle() {
        super("Puzzle Daffa.143 - JavaTpoint");

        // saya mengguunakan JFrame dan JButton buat tampilanya lebih bagus dan modern
        setLayout(new GridLayout(3, 3, 5, 5));

        b1 = buatTombol("1", Color.BLUE, new Font("Arial", Font.BOLD, 18));
        b2 = buatTombol("2", Color.GREEN, new Font("Arial", Font.BOLD, 18));
        b3 = buatTombol("3", Color.RED, new Font("Arial", Font.BOLD, 18));
        b4 = buatTombol("4", Color.YELLOW, new Font("Arial", Font.BOLD, 18));
        b5 = buatTombol("5", Color.MAGENTA, new Font("Arial", Font.BOLD, 18));
        b6 = buatTombol("6", Color.PINK, new Font("Arial", Font.BOLD, 18));
        b7 = buatTombol("7", Color.CYAN, new Font("Arial", Font.BOLD, 18));
        b8 = buatTombol("", Color.ORANGE, new Font("Arial", Font.BOLD, 18));
        b9 = buatTombol("8", Color.GRAY, new Font("Arial", Font.BOLD, 18));

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        setSize(500, 400);
        setVisible(true);
    }
    private Button buatTombol(String label, Color warna, Font font) {
        Button tombol = new Button(label);
        tombol.setBackground(warna);
        tombol.setFont(font);
        tombol.addActionListener(this);
        return tombol;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String label = b1.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b1.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b1.setLabel("");
            }
        }
        if (e.getSource() == b2) {
            String label = b2.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b2.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b2.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b2.setLabel("");
            }
        }
        if (e.getSource() == b3) {
            String label = b3.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b3.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b3.setLabel("");
            }
        }
        if (e.getSource() == b4) {
            String label = b4.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b4.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b4.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b4.setLabel("");
            }
        }
        if (e.getSource() == b5) {
            String label = b5.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b5.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b5.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b5.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b5.setLabel("");
            }
        }
        if (e.getSource() == b6) {
            String label = b6.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b6.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b6.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b6.setLabel("");
            }
        }
        if (e.getSource() == b7) {
            String label = b7.getLabel();
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b7.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b7.setLabel("");
            }
        }
        if (e.getSource() == b8) {
            String label = b8.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b8.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b8.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b8.setLabel("");
            }
        }
        if (e.getSource() == b9) {
            String label = b9.getLabel();
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b9.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b9.setLabel("");
            }
        }

        if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel()
                .equals("3") && b4.getLabel().equals("4") && b5.getLabel().equals("5")
                && b6.getLabel().equals("6") && b7.getLabel().equals("7") && b8.getLabel()
                .equals("8") && b9.getLabel().equals("")) {
            JOptionPane.showMessageDialog(this, "Gokill jago juga! selamat anda menang.");
        }
    }
}