package org.example;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    ImportTool fc;

    public MainFrame() {
        super("Choose CSV file");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fc = new ImportTool(this);

        add(fc, BorderLayout.CENTER);

        pack();
    }
}
