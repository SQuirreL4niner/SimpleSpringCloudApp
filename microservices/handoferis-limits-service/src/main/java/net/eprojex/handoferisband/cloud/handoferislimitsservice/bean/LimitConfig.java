package net.eprojex.handoferisband.cloud.handoferislimitsservice.bean;

public class LimitConfig {

    int max;
    int min;

    public LimitConfig(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public LimitConfig() {
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
