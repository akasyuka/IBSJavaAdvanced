package Four;

public class CalculatorIntegerImpl extends CalculatorInteger {

    public CalculatorIntegerImpl(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public String sum() {
        return String.valueOf(this.one + this.two);
    }

    public String sub() {
        return String.valueOf(this.one - this.two);
    }

    public String mult() {
        return String.valueOf(this.one * this.two);
    }

    public String div() {
        return String.valueOf(this.one / this.two);
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }
}
