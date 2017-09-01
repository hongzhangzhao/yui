package com.MyJavaBase.Enumerated;

public interface Competitor<T extends Competitor> {
           Outcome compete(T competitor);

}
