class HammingDistance {
    public int hammingDistance(int x, int y) {
        int placesDifferent = 0;
        int count = 0;

        if(x < y) {
            count = y;
        }
        else {
            count = x;
        }

        while (count > 0) {
            if((x % 2 != 0) ^ (y % 2 != 0)) {
                placesDifferent += 1;
            }
            count = count / 2;
            x = x / 2;
            y = y / 2;
        }

        return placesDifferent;
    }

    public static void main(String[] args) {
        HammingDistance solution = new HammingDistance();
        int x = 1;
        int y = 4;
        int result = solution.hammingDistance(x, y);
        System.out.println(x + " " + y);
        System.out.println("Hamming distance: " + result);
    }
}