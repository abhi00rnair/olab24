package newshelf;

public record comic1(String title, int ageOfMainCharacter) implements IBook {
    
    @Override
    public String toString() {
        return "Comic Title: " + title + ", Age of Main Character: " + ageOfMainCharacter;
    }
}
