public class Main {
    public static void main(String[] args) {
        BubbleTeaMaker maker = new BubbleTeaMaker(new ClassicPreparationStrategy());
        System.out.println("~ Classic Bubble Tea was prepared. ~");
        maker.makeTea();

        maker.setStrategy(new BrownSugarPreparationStrategy());
        System.out.println("\n ~ Brown Sugar was prepared. ~");
        maker.makeTea();

        maker.setStrategy(new FruitTeaPrepareationStrategy());
        System.out.println("\n ~ Fruit Tea was prepared. ~");
        maker.makeTea();
    }
}