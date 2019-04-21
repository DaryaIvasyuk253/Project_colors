package colors.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("red")
@Qualifier("red")
@Scope("prototype")
public class RedServiceImpl implements ColorService {
    @Override
    public String toString() {
        return "red";
    }
}
