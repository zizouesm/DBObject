package ir.maktab.model;

import ir.maktab.db.IdGenerator;

import java.util.UUID;

public class StringIdGenerator implements IdGenerator<String> {
    @Override
    public String generate() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
