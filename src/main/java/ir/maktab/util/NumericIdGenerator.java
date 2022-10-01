package ir.maktab.util;

import ir.maktab.util.IdGenerator;

import java.util.Random;

public class NumericIdGenerator implements IdGenerator<Long> {
    @Override
    public Long generate() {
        Random random = new Random();
        return random.nextLong();
    }
}
