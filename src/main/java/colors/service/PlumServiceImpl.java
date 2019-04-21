package colors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("plum")
@Qualifier("plum")
public class PlumServiceImpl implements ColorService, MixedColorService {
    @Autowired
    @Qualifier("red")
    private ColorService red;
    @Autowired
    @Qualifier("white")
    private ColorService white;
    @Autowired
    @Qualifier("black")
    private ColorService black;
    @Autowired
    @Qualifier("blue")
    private ColorService blue;

    @Override
    public void define() {
        mix();
    }

    @Override
    public String toString() {
        return "plum";
    }

    @Override
    public void mix() {
        System.out.println(String.format("plum = %s + %s + %s + %s", red.toString(), white.toString(), black.toString(),
                blue.toString()));
    }
}
