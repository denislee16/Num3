package Game;

public class Money {
    private float money;
    private int silver;

    public Money(float money, int silver) {
        this.money = money;
        this.silver = silver;
    }

    public float getMoney() {
        return money;
    }

    public int getSilver() {
        return silver;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }
}
