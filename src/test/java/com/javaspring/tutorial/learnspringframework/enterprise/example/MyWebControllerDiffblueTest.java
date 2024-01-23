package com.javaspring.tutorial.learnspringframework.enterprise.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.javaspring.tutorial.learnspringframework.business.BusinessService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MyWebController.class})
@ExtendWith(SpringExtension.class)
class MyWebControllerDiffblueTest {
    @MockBean
    private BusinessService businessService;

    @Autowired
    private MyWebController myWebController;

    /**
     * Method under test: {@link MyWebController#returnValueFromBusinessService()}
     */
    @Test
    void testReturnValueFromBusinessService() {
        // Arrange
        when(businessService.calculateSum()).thenReturn(1L);

        // Act
        long actualReturnValueFromBusinessServiceResult = myWebController.returnValueFromBusinessService();

        // Assert
        verify(businessService).calculateSum();
        assertEquals(1L, actualReturnValueFromBusinessServiceResult);
    }
}
