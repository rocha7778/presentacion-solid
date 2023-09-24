package desing.pattern.creational.factory.chair;

import java.util.HashMap;
import java.util.Map;

public class TransportCompany {

    private static Map<Integer, String> chairInventory = new HashMap<>();

    // database 
	static {

		chairInventory.put(1, "CLASICA");
		chairInventory.put(2, "MODERNA");
		chairInventory.put(3, "VINTAGE");
		chairInventory.put(4, "ROCKERA");
	}

    public static void main(String[] args)  {

        InvoiceMaker_v1 invoiceMaker = new InvoiceMaker_v1();
        ChairFactory chairFactory = new ChairFactory();

        BaseChair chair = chairFactory.getChair(chairInventory.get(1));

        invoiceMaker.makeBill(chair);




    }
    
}
