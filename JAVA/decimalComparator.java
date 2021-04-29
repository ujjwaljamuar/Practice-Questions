

public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        int moveThreeDecimalPlacesToRight = (int) Math.pow(10, 3);
        return (int) (firstValue * moveThreeDecimalPlacesToRight) == (int) (secondValue * moveThreeDecimalPlacesToRight);
    }
    public static void main(String[] args) {
        boolean areEqualByThreeDecimalPlaces = decimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = decimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = decimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = decimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(areEqualByThreeDecimalPlaces);
    }
}
