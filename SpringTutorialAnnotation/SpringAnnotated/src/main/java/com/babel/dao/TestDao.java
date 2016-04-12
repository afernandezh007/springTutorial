package com.babel.dao;

import com.babel.model.TestEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by antonio.fernandez on 12/04/2016.
 */
@Repository
public class TestDao implements ITestDao {

    public TestDao() {
        super();
    }

    @Override
    public TestEntity readData() {
        System.out.println("Dao - readData()");
        return new TestEntity();
    }

    @Override
    public TestEntity updateData(TestEntity entity) {
        System.out.println("Dao - updateData()");
        return entity;
    }
}
