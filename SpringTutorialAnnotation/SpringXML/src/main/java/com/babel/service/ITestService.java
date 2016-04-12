package com.babel.service;

import com.babel.dto.TestDto;

/**
 * Created by antonio.fernandez on 12/04/2016.
 */

public interface ITestService {

    TestDto readData();

    TestDto updateData(TestDto dto);
}
