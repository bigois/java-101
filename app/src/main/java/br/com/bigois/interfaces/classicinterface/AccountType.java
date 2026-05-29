package br.com.bigois.interfaces.classicinterface;

public enum AccountType {
    BUSINESS(500),
    PERSONAL(750);

    private final int minScore;

    // Enum constructors are always private, so the 'private' modifier is optional
    /* private */ AccountType(int minScore) {
        this.minScore = minScore;
    }

    public int getMinScore() {
        return this.minScore;
    }
}
