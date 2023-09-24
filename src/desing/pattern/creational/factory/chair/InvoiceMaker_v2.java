package desing.pattern.creational.factory.chair;

public class InvoiceMaker_v2 {

    public void makeBill(BaseChair chair) {
        System.out.println(" the total invoice is: " + getFreightBill(chair));
    }

    private double getFreightBill(BaseChair chair) {
        return (chair.getArea() > 100) ? 1000 : chair.getVolume() > 100 ? 1800 : 500;
    }
}


