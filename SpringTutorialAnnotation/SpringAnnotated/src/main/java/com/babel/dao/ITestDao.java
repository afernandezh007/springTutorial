package com.babel.dao;

import com.babel.model.TestEntity;

/**
 * Created by antonio.fernandez on 12/04/2016.
 */
public interface ITestDao {

    public TestEntity readData();

    public TestEntity updateData(TestEntity entity);
}
