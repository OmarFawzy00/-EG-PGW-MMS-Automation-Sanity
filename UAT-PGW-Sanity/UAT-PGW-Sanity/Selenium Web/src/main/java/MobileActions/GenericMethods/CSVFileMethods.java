package MobileActions.GenericMethods;

import java.io.*;

public class CSVFileMethods {

    public static void editCSVCell(String filePath, int rowIndex, int colIndex, String newValue) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String line;
        int currentRow = 0;
        while ((line = reader.readLine()) != null) {
            if (currentRow == rowIndex) {
                String[] cells = line.split(",");
                cells[colIndex] = newValue;
                line = String.join(",", cells);
            }
            sb.append(line).append("\n");
            currentRow++;
        }
        reader.close();
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write(sb.toString());
        writer.close();
    }

    public static void readCSVFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            System.out.println(data[0] + " " + data[1]); // prints the first and second columns of each row
        }

        reader.close();
    }
}
