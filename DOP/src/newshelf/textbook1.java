package newshelf;

public record textbook1(String subject) implements IBook {
    @Override
    public String toString() {
        return "TextBook Subject: " + subject;
    }
}