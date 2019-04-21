package colors.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("black")
@Qualifier("black")
public class BlackServiceImpl implements ColorService {
    @Override
    public String toString() {
        return "black";
    }
}
