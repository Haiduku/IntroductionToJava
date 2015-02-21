import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabel {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int Fah = 0;
        int Celsius = 0;
        int x = 0;


        Object rowData[][]= new Object[201][2];
        for (x = 0; x < 201; x++) {


            Celsius = (Fah - 32) * 5 / 9;

            rowData[x][0]  = Fah;
            rowData[x][1] = Celsius;

            Fah = Fah + 1 ;

        }

        Object columnNames[] = {"Fahrenheit", "Celsius"};
        JTable table = new JTable(rowData, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(300, 900);
        frame.setVisible(true);


    }
}