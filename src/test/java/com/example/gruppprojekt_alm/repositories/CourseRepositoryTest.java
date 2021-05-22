package com.example.gruppprojekt_alm.repositories;

import com.example.gruppprojekt_alm.models.Course;
import com.example.gruppprojekt_alm.services.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Christoffer Grännby
 * Date: 2021-05-20
 * Time: 10:54
 * Project: GruppProjekt_ALM
 * Copyright: MIT
 */

class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @Test
    void existsCourseById(){
        int expextedId = 1;

        Course mockCoures = new Course();
        mockCoures.setId(expextedId);

        int expected = expextedId;

        boolean actual = courseRepository.existsById(expextedId);

        assertEquals(expected, actual);
    }

}