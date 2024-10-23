package newshelf;

import oldshelf.FictionType;

public record Fiction1(String name, FictionType p1) implements IBook{
    @Override
    public String toString(){
        return name  + "" + p1;
    }
}
