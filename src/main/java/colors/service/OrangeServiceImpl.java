package colors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("orange")
@Qualifier("orange")
@Scope("prototype")
public class OrangeServiceImpl implements ColorService, MixedColorService {
    @Autowired
    @Qualifier("red")
    private ColorService red;
    @Autowired
    @Qualifier("yellow")
    private ColorService yellow;

    @Override
    public void define() {
        mix();
    }

    @Override
    public String toString() {
        return "orange";
    }

    @Override
    public void mix() {
        System.out.println(String.format("orange = %s + %s", red.toString(), yellow.toString()));
    }
}
