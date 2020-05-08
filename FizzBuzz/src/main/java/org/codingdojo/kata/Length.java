package org.codingdojo.kata;

public class Length {
    private int amountInInches;

    public Length(int rawAmount, Unit unit) {
        this.amountInInches = unit.getAmountInInches(rawAmount);
    }

    // 坏味道：字符串类型的 unit → Unit 对象
    // 重构口诀
    // 旧的不变，新的创建
    // 一步切换，旧的再见
    @Override
    public boolean equals(Object object) {
        Length another = (Length)object;
        return this.amountInInches == another.amountInInches;
    }
}
