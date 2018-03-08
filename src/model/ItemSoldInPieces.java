package model;

import visitor.Visitable;
import visitor.Visitor;

public class ItemSoldInPieces extends Item implements Visitable {

    private Double unitPrice;
    private Integer numberOfPieces;


    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);

    }

    public ItemSoldInPieces(String code, String description, Double unitPrice, Integer numberOfPieces) {
        super(code,description);
        this.unitPrice = unitPrice;
        this.numberOfPieces = numberOfPieces;

    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(Integer numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
}
