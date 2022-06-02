package main;

import view.Game_window;

public class Program
{
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_window().setVisible(true);
            }
        });
    }
}
