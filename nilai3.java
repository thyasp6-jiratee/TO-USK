import javax.swing.JOptionPane;

public class nilai3 {
    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2"));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3"));

        double rata = (nilai1 + nilai2 + nilai3) / 3.0;
        
        String hasil = (rata >= 60) ? "LULUS" : "GAGAL";

        JOptionPane.showMessageDialog(null,
            "Rata-rata : %.2f" + rata + "\nHasil " + hasil);
    }
}
//nambahin 2 nilai di belakang koma