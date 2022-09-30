package ir.maktab.model;

import ir.maktab.db.IdGenerator;

import java.util.Random;
import java.util.UUID;

public class NumericIdGenerator implements IdGenerator<Long> {
    @Override
    public Long generate() {
        Random random = new Random();
        return random.nextLong();
    }
}
