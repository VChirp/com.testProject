class King {

    static int cutTrees(int n, int m) {
        if (m < 0 || n < 0) {
            throw new IllegalArgumentException("Wrong args! n: " + n + " < 0, and m: " + m + "< 0");
        }

        if (m >= n || n >= 1000) {
            throw new IllegalArgumentException("Wrong args! m: " + m + ">= n: " + n + ", OR n: " + n + " >= 1000");
        }
        int waysOfCutting = 0;

        switch (m) {
            case 0:
                waysOfCutting = 1;
                break;
            case 1:
                waysOfCutting = n;
                break;
            default:
                //            j - number of steps
                final int j = (n - 1) / (m - 1);
                for (int i = 1; i <= j; i++) {
                    waysOfCutting += n - (m - 1) * i;
                }
                break;
        }

        return waysOfCutting;
    }
}
