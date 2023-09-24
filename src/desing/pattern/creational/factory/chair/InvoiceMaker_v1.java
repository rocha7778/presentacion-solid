package desing.pattern.creational.factory.chair;

public class InvoiceMaker_v1 {

    public void makeBill(BaseChair chair) {

        double costByArea = 0;
        double costByVolume = 0;

        if (getArea(chair) > 100) {
            costByArea = 1000;
        }
        
        if (getVolume(chair)> 100) {
            costByVolume = 1800;
        }
        System.out.println(" the total invoice is: " +
                ((costByArea > costByVolume) ? costByArea : costByVolume));
    }

    private double getArea(BaseChair chair){
        return (chair.getHeight() * chair.getHeight());

    }
    private double getVolume(BaseChair chair) {
        return getArea(chair) * chair.getWeight();
    }
}
