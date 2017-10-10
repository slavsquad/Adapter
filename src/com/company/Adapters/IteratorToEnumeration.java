package com.company.Adapters;

import java.util.Enumeration;
import java.util.Iterator;
//Для того чтобы адаптер воспринимался клиентом как Enumeration, он реализует интерфейс Enumeration
public class IteratorToEnumeration<E> implements Enumeration{
    private Iterator iterator;
    //Адаптируемый объект сохраняется в переменной(композиция)
    public IteratorToEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    //Метод hasMoreElements интерфейса Enumeration передает управление методу hasNext интерфейса Iterator
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    //Метод nextElements интерфейса Enumeration передает управление методу next интерфейса Iterator
    @Override
    public E nextElement() {
        return (E)iterator.next();
    }
}
