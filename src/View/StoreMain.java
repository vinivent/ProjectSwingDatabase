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
            // ManageProduct manageProduct = new ManageProduct();
            // manageProduct.setVisible(true);
            // Operations operations = new Operations();
            // operations.setVisible(true);
            // RegisterProduct registerFrame = new RegisterProduct();
            // registerFrame.setVisible(true);
            LogIn frame = new LogIn();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
