package colors.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("blue")
@Scope("prototype")
@Qualifier("blue")
public class BlueServiceImpl implements ColorService {

    @Override
    public String toString() {
        return "blue";
    }
}