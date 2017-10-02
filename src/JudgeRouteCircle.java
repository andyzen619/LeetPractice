public class JudgeRouteCircle {

    public static void main (String[] args) {
        JudgeRouteCircle solution = new JudgeRouteCircle();
        String input1 = "lrrrr";
        String input2 = "ddddlll";
        String input3 = "uuuddd";
        String input4 = "uldr";
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4 + "\n\n");

        System.out.println(solution.judgeCircle(input1));
        System.out.println(solution.judgeCircle(input2));
        System.out.println(solution.judgeCircle(input3));
        System.out.println(solution.judgeCircle(input4));



    }

    public boolean judgeCircle(String moves) {
        int vertical =  0;
        int horizontal = 0;
        boolean result = false;

        char[] movesArray = moves.toCharArray();

        for(int i = 0; i < movesArray.length; i++) {
            switch (movesArray[i]) {
                case 'u':
                    vertical+=1;
                    break;
                case 'd':
                    vertical-=1;
                    break;
                case 'l':
                    horizontal+=1;
                    break;
                case 'r':
                    horizontal-=1;
                    break;
                }
            }
        if(vertical == 0 && horizontal == 0) {
            result = true;
        }

        return result;
    }
}
