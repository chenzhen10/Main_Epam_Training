package by.epam.training.kimbar.model.logic;

import by.epam.training.kimbar.model.entity.Triangle;

public class TriangleLogic {

    public double getSquareOfTriangle(Triangle tr) {
        double hPerim = getPerimeterOfTriangle(tr) / 2;

        return Math.sqrt(hPerim *
                (hPerim - tr.getA().getValue()) *
                (hPerim - tr.getB().getValue()) *
                (hPerim - tr.getC().getValue()));
    }//finding square by Geron's method

    public double getPerimeterOfTriangle(Triangle tr) {
        return tr.getA().getValue() + tr.getB().getValue() + tr.getC().getValue();
    }

    public boolean isTriangle(Triangle tr) {
        return tr.getA().getValue() == tr.getC().getValue() && tr.getA().getValue() != tr.getB().getValue() ||
                tr.getA().getValue() == tr.getB().getValue() && tr.getA().getValue() != tr.getC().getValue() ||
                 tr.getB().getValue() == tr.getC().getValue() && tr.getB().getValue() != tr.getA().getValue()||
                  tr.getB().getValue() != tr.getC().getValue() && tr.getB().getValue() != tr.getA().getValue();
    }

    public boolean isRectangular(Triangle tr) {
        return hasNinetyDegrees(tr);
    }

    public boolean isIsosceles(Triangle tr) {
        return tr.getA().getValue() == tr.getB().getValue() && tr.getA().getValue() != tr.getC().getValue() ||
                tr.getA().getValue() == tr.getC().getValue()  && tr.getA().getValue() != tr.getB().getValue() ||
                 tr.getB().getValue() == tr.getC().getValue() && tr.getB().getValue() != tr.getA().getValue();
    }

    public boolean isEquilateral(Triangle tr) {
      return   tr.getA().getValue() == tr.getB().getValue() && tr.getA().getValue() == tr.getC().getValue();
    }

    public boolean isAcuteAngled(Triangle tr) {
            return ((tr.getA().getValue() + tr.getB().getValue() > tr.getC().getValue()) &&
                    (tr.getA().getValue() + tr.getC().getValue() > tr.getB().getValue()) &&
                    (tr.getB().getValue() + tr.getC().getValue() > tr.getA().getValue()));
    }

    public boolean isObtuse(Triangle tr) {
       return  ((tr.getA().getValue() + tr.getB().getValue() < tr.getC().getValue()) ||
                (tr.getA().getValue() + tr.getC().getValue() < tr.getB().getValue()) ||
                (tr.getB().getValue() + tr.getC().getValue() < tr.getA().getValue()));
    }


    public boolean hasNinetyDegrees(Triangle tr) {
        return tr.getA().getValue() * tr.getA().getValue() + tr.getB().getValue() * tr.getB().getValue() ==
                tr.getC().getValue() * tr.getC().getValue();
    }
}
