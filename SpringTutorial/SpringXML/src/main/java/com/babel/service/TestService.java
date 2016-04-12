package com.babel.service;

import com.babel.dao.ITestDao;
import com.babel.dto.TestDto;
import com.babel.model.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by antonio.fernandez on 12/04/2016.
 */
public class TestService implements ITestService {

    private ITestDao testDao;

    @Override
    public TestDto readData() {
        System.out.println("Service - readData()");
        TestEntity testEntity = getTestDao().readData();

        //Map entityToDto

        TestDto dto = new TestDto();
        dto.setData(testEntity.getData());

        return dto;
    }

    @Override
    public TestDto updateData(TestDto dto) {
        System.out.println("Service - updateData()");
        //Map dtoToEntity

        TestEntity entity = new TestEntity();
        entity.setData(dto.getData());

        entity = getTestDao().updateData(entity);

        //Map entityToDto updated

        dto = new TestDto();
        dto.setData(entity.getData());

        return dto;
    }

    public ITestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(ITestDao testDao) {
        this.testDao = testDao;
    }
}
