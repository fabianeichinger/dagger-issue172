package dagger.issue172;

import dagger.Component;

import javax.inject.Singleton;

public interface SuperInterface {
    TestObjectFactory factory();
}
