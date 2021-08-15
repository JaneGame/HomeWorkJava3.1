public class Main {
    public static void main(String[] args) {
       long price = 110;


       if (price<40_000_000_000L) {
           int mili = (int) price/20;
           System.out.println("Ваши мили =" + mili);
       }else{
           long mili2 = price/20;
           System.out.println("Ваши мили =" + mili2);
       }

    }
}
