public class BubbleTeaMaker {
    private BubbleTeaStrategy strategy;

    public BubbleTeaMaker(BubbleTeaStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(BubbleTeaStrategy strategy) {
        this.strategy = strategy;
    }

    public void makeTea() {
        strategy.prepareTea();
    }
}
