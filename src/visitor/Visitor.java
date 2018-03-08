package visitor;

import model.ItemSoldInPieces;
import model.ItemSoldInWeight;

import java.util.Collection;

public interface Visitor {
    Double visit (ItemSoldInWeight item);
    Double visit (ItemSoldInPieces item);

}
