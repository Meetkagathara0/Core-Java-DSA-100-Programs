public class Main {
    public static int[] FindDartAndRoundWinner(int[][] rounds) {
        int score = 501;

        for (int i = 0; i < rounds.length; i++) {
            int roundSum = rounds[i][0] + rounds[i][1] + rounds[i][2];

            // Check if round sum exceeds current score
            if (roundSum > score) {
                continue; // skip entire round
            }

            // Process dart by dart
            for (int j = 0; j < 3; j++) {
                int dartScore = rounds[i][j];
                score -= dartScore;

                if (score == 0) {
                    // Return 1-based round and dart index
                    return new int[]{i + 1, j + 1};
                }

                if (score < 0) {
                    break; // should never happen due to sum check
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roundsCount = Integer.parseInt(reader.readLine().trim());
        int[][] intArray = new int[roundsCount][];

        for (int i = 0; i < roundsCount; i++) {
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
