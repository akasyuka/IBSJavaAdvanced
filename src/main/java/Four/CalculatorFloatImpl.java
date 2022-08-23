package Four;

import Six.CustomNullException;

public class CalculatorFloatImpl extends CalculatorFloat {

    public CalculatorFloatImpl(float one, float two) {
        this.one = one;
        this.two = two;
    }

    public String sum() {
        return String.valueOf(one + two);
    }

    public String sub() {
        return String.valueOf(one - two);
    }

    public String mult() {
        return String.valueOf(one * two);
    }

    public String div() throws CustomNullException {
        if (two == 0) {
            throw new CustomNullException("На ноль делить нельзя", String.valueOf(two));
        }
        return String.valueOf(one / two);
    }

    public float getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public float getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }
}
