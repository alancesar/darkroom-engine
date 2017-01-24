package org.alancesar.darkroom.engine.filter;

import org.alancesar.darkroom.engine.effect.Effect;

public interface Filter {

    Effect effect();

    String name();

    String shortName();
}
