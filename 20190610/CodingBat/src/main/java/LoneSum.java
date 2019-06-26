public class LoneSum {

    public class SomeMath {
        public static void main(String[] args) {
            System.out.println(loneSum(1,2,3));
        }

        public static int loneSum(int a, int b, int c) {
            if (a == b || a == c) {
                return c;
            } else if (a == b && a == c){
                return 0;
            } else if ((a != b) && (a == c)){
                return b;
            } else if ((a == b) && (a != c)){
                return c;
            } else if ((a == b) || (a == c)){
                return 0;
            } else if (b == c) {
                return a;
            } else if (a == c) {
                return b;
            } else {
                return a + b + c;
            }
        }

}
