package Keywords;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderFile{
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String fileName = "\\Users\\19293\\IdeaProjects\\note.txt";
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception ex) {
            System.out.println("File was not found");
        } finally {
            try {
                fr.close();
                br.close();
            } catch (Exception ex2) {
            }

        }
    }
}
