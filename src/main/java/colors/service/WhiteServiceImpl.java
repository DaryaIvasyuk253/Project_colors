package colors.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("white")
@Qualifier("white")
public class WhiteServiceImpl implements ColorService {
    @Override
    public String toString() {
        return "white";
    }

}
