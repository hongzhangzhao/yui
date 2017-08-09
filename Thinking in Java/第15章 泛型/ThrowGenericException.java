package Generics;

/**
 * 15.14
 *
 */
import java.util.*;

interface Processor <T,E extends Exception>{
    void prosess (List resultCollector) throws E;
}

public class ThrowGenericException {
}
