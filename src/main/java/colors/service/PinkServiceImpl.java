package colors.service;

public class PinkServiceImpl implements ColorService, MixedColorService {
    private ColorService red;
    private ColorService white;

    public PinkServiceImpl(ColorService red, ColorService white) {
        this.red = red;
        this.white = white;
    }


    @Override
    public void define() {
        mix();
    }

    @Override
    public String toString() {
        return "pink";
    }

    @Override
    public void mix() {
        System.out.println(String.format("pink = %s + %s", red.toString(), white.toString()));
    }
}
