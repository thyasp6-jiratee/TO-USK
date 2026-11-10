
import javax.swing.JOptionPane;

public class kali4 {
    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2"));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3"));

        int hasilkali = nilai1 * nilai2;
        int hasilbagi = nilai3 / nilai2;

        JOptionPane.showMessageDialog(null, 
            "Nilai 1 : " + nilai1 +
            "\nNilai2 : " + nilai2 +
            "\nNilai3 : " + nilai3 +
            "\nhasilkali : " + hasilkali +
            "\nhasilbagi : " + hasilbagi);
        
    }
}
