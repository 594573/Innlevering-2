package trinnskatt;
import javax.swing.JOptionPane;

public class Trinnskatt {

    public double beregnSkatt(int brutto) {
        double skatt = 0;
        if (brutto < 164100) {
            return skatt;
        }

        if (brutto <= 230950) {
            double TRINN1 = (brutto - 164100) * 0.0093;
            skatt = skatt + TRINN1;
            return  skatt;
        }

        if (brutto <= 580650) {
            double TRINN1 = (230950 - 164100) * 0.0093;
            double TRINN2 = (brutto - 230950) * 0.0241;
            skatt = TRINN1 + TRINN2;
            return  skatt;
        }

        if (brutto <= 934050) {
            double TRINN1 = (230950 - 164100) * 0.0093;
            double TRINN2 = (580650 - 230950) * 0.0241;
            double TRINN3 = (brutto - 580650) * 0.1152;
            skatt = TRINN1 + TRINN2 + TRINN3;
            return  skatt;
        }

        if (brutto > 934050) {
             double TRINN1 = (230950 - 164100) * 0.0093;
             double TRINN2 = (580650 - 230950) * 0.0241;
             double TRINN3 = (934050 - 580650) * 0.1152;
             double TRINN4 = (brutto - 934050) * 0.1452;
             skatt = TRINN1 + TRINN2 + TRINN3 + TRINN4;
             return  skatt;
        }
        return 0;
    }

    public static void main(String[] args) {
        Trinnskatt s = new Trinnskatt();
        String brutto = JOptionPane.showInputDialog("Hva er din lønn?");
        double skatt = s.beregnSkatt(Integer.parseInt(brutto));
        System.out.println("Skatten blir: " + String.valueOf(skatt));
    }
}