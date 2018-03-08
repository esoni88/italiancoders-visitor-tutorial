package model;

import visitor.Visitable;
import visitor.Visitor;

public class ItemSoldInWeight extends Item  implements Visitable {

    private Double unitPrice;
    private Double weight;


    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public ItemSoldInWeight(String code, String description, Double unitPrice, Double weight) {
        super(code,description);
        this.unitPrice = unitPrice;
        this.weight = weight;

    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}
