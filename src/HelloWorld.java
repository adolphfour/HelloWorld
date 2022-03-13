import java.text.DecimalFormat;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello adolphfour");

        int num =5;

        double price = 12.34;

        String name = "Samart";

        boolean isCondition = false;

        System.out.println("number : "+num);


//        System.out.println("hello adolphfour");
//        System.out.println("number : "+num);

        double price1 = 5.6;
        System.out.println("\nprice = "+price1);

        double total =9999.00;
        double vat =0.07;
        double grandtotal= total +(total*vat);
        String namee = "฿";

        DecimalFormat df = new DecimalFormat("#,###.00");
        String totalString = df.format(total);
        String vatString = df.format(total*vat);
        String grandTotalString = df.format(grandtotal);


//        System.out.println("\ntotal "+total+namee);
        System.out.println("\ntotal "+ totalString +" ฿");
//        System.out.printf(namee+"\n");

        System.out.println("Vat7% "+vatString+" ฿");
        System.out.println("Grand total "+grandTotalString+" ฿");



    }
}
