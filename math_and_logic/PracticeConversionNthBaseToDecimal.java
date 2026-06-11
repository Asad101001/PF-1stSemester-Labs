public class PracticeConversionNthBaseToDecimal {
    public static void main(String[] args) {
        String nbasenumber  ="FF";
        int base = 16;
        int result=Integer.parseInt(nbasenumber,base);
        System.out.println("The nth base to decimal is :\t"+result);
    }
}
