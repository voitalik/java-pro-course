public class NonNullDouble {
    private double value;

    public NonNullDouble(double value) {
        if (value == 0d) {
            this.value = 1d;
        } else {
            this.value = value;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
