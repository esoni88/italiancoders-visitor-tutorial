package visitor.impl;

import model.ItemSoldInPieces;
import model.ItemSoldInWeight;
import visitor.Visitor;

public class ShoppingVisitor implements Visitor {
    @Override
    public Double visit(ItemSoldInWeight item) {
        return item.getWeight()*item.getUnitPrice();
    }

    @Override
    public Double visit(ItemSoldInPieces item) {
        return item.getNumberOfPieces()*item.getUnitPrice();
    }
}
