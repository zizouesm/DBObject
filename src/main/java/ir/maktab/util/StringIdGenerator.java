package ir.maktab.util;

import ir.maktab.util.IdGenerator;

import java.util.UUID;

public class StringIdGenerator implements IdGenerator<String> {
    @Override
    public String generate() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
