package View;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

public class StoreMain {
    public static void main(String[] args) {
        try {
            FlatArcDarkOrangeIJTheme.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ManageProduct a = new ManageProduct();
            a.setVisible(true);
            // LogIn frame = new LogIn();
            // frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
