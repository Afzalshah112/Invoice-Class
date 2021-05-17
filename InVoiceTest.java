import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InvoiceTest
{
    public static void main(String [] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Invoice inv1 = new Invoice();

        inv1.get_part_num();
        inv1.get_part_des();
        inv1.get_num_of_items();
        inv1.get_price_of_items();
        inv1.Invoice_amount();
        inv1.displayInfo();





    }
}