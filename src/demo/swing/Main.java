package demo.swing;

import demo.swing.ui.MainFrame;




import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            JFrame frame = new MainFrame();
            frame.setVisible(true);
            MainFrame mmm = new MainFrame();

        });

    }
}
