import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Input data:100 200
 * Output data:100 200 125
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file_input = new File("./src/main/resources/input.txt");

        Scanner scanner = new Scanner(file_input);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int max_count = getSequence(start, end);
        File file_output = new File("./src/main/resources/output.txt");

        if(file_output.createNewFile()){
            System.out.println("File created");
        }

        try(FileWriter writer = new FileWriter(file_output, false)){
            writer.write(String.format("%d %d %d", start, end, max_count));

            writer.flush();
        }
    }

    static int getSequence(int start, int end){
        int count;
        int max_count = 0;

        for (int i = start; i <= end; i++) {
            int num = i;
            count = 0;

            while (num != 1) {
                count++;
                num = sequenceNextNum(num);
            }
            count++;

            if (max_count < count) {
                max_count = count;
            }
        }

        return max_count;
    }

    static int sequenceNextNum(int num) {
        if ((num & 1) == 0) {
            return num >> 1;
        } else {
            return num * 3 + 1;
        }
    }
}
