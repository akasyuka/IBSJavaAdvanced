package Four;

import Six.CustomNullException;

public interface Calculator {
    default String sum() {
        return null;
    }

    default String sub() {
        return null;
    }

    default String div() throws CustomNullException {
        return null;
    }

    default String mult() {
        return null;
    }
}
