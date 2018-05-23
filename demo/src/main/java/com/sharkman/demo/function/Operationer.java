package com.sharkman.demo.function;

import java.util.List;

@FunctionalInterface
public interface Operationer {
    public abstract void operation(List<?> list);
}
