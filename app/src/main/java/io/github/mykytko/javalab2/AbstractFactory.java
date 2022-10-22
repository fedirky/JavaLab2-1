package io.github.mykytko.javalab2;

public class AbstractFactory {
    public static BaseFactory getFactory(Color color) {
        switch (color) {
            case WHITE:
                return new WhiteFactory();
            case BLACK:
                return new BlackFactory();
            default:
                throw new UnsupportedColorException();
        }
    }
}