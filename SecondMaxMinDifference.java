import java.io.*;

public class SecondMaxMinDifference {
    public static int[] FindDartAndRoundWinner(int[][] rounds) {
        int score = 501;

        for (int round = 0; round < rounds.length; round++) {
            int tempScore = score; // simulate score
            boolean isValid = true;

            for (int dart = 0; dart < 3; dart++) {
                tempScore -= rounds[round][dart];

                if (tempScore < 0) {
                    isValid = false; // round bust
                    break;
                }

                if (tempScore == 0) {
                    return new int[] { round + 1, dart + 1 };
                }
            }

            if (isValid) {
                score = tempScore; // apply only if valid
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int rounds = Integer.parseInt(reader.readLine().trim());

        int[][] intArray = new int[rounds][];

        for (int i = 0; i < rounds; i += 1) {
            String[] arTemp = reader.readLine().trim().split(" ");
            int[] intArr = strArrayToIntArray(arTemp);
            intArray[i] = intArr;
        }

        int[] result = FindDartAndRoundWinner(intArray);

        writer.write(result[0] + " " + result[1]);

        writer.flush();
        writer.close();
    }

    public static int[] strArrayToIntArray(String[] arr) {
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i].trim());
        }
        return intArr;
    }
}