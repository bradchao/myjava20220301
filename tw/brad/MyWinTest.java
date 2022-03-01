package tw.brad;

import javax.swing.JFrame;

public class MyWinTest extends JFrame {
    public MyWinTest(){
        super("My Window");
        setVisible(true);
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new MyWinTest();
    }
}
