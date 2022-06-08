public class Solution {
    public void checkDay(int number) {
        String s;
        s = switch (number) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "wrong number";
        };
        System.out.printf("number = %d -> %s%n", number, s);
    }
}
