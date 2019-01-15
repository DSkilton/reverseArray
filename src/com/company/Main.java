import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        String line;
        String stNew;

        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));

        //first input which sets array length
        line = inp.readLine();
        stNew = inp.readLine();

        //first input as array size and create array
        int iArrayLength = Integer.parseInt(line);
        int[] list = new int[iArrayLength];

        //second input to populate array
        String[] stArray = stNew.split(" ");

        for (int i = 0; i < iArrayLength; i++ ){
            list[i] = Integer.parseInt(stArray[i]);
        }

            for (int i = 0; i < iArrayLength; i++) {
                list[i] = Integer.parseInt(stArray[i]);
            }

            for (int i = 0; i < list.length / 2; i++) {
                int temp = list[i];
                list[i] = list[list.length - 1 - i];
                list[list.length - 1 - i] = temp;
            }

        System.out.println(Arrays.toString(list));
    }
}
