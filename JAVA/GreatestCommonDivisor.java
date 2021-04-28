public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstValue, int secondValue) {
        if (firstValue < 10 || secondValue < 10) {
            return -1;
        }

        int divisor = Math.min(firstValue, secondValue);
        while (firstValue % divisor != 0 || secondValue % divisor != 0) {
            divisor--;
        }
        return divisor;
    }
    
    public static void main(String[] args) {
        System.out.println("G.C.D (12, 30) = " + GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println("G.C.D (12, 12) = " + GreatestCommonDivisor.getGreatestCommonDivisor(12, 12));
        System.out.println("G.C.D (25, 15) = " + GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println("G.C.D (9, 18) = " + GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println("G.C.D (25, 15) = " + GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }

}
