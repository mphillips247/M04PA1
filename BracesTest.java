import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BracesTest {

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "myCode.java"; //input file to check
        String lines = readFile(fileName);
        ParenthesisChecker.checkParens(lines);
    }

    //read and return file
    private static String readFile(String fileName) throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File(fileName));
        StringBuilder content = new StringBuilder();

        while (fileReader.hasNextLine()) {
            content.append(fileReader.nextLine());
        }

        return content.toString();
    }
}
