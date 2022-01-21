package core.basesyntax;

public class Main {

    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[ARRAY_SIZE];

        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure el : figures) {
            el.printInfo();
        }
    }
}
