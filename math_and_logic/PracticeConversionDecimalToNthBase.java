public class PracticeConversionDecimalToNthBase {
    public static void main(String[] args) {
        int decimal=255;
        int base = 16;
        String result=Integer.toString(decimal,base).toUpperCase();
        System.out.println("The Decimal to Nth base :\t"+result);
    }
}
