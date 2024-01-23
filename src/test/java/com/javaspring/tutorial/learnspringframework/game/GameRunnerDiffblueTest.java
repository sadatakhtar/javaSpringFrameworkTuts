package com.javaspring.tutorial.learnspringframework.game;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {GameRunner.class})
@ExtendWith(SpringExtension.class)
class GameRunnerDiffblueTest {
    @MockBean
    private GameConsole gameConsole;

    @Autowired
    private GameRunner gameRunner;

    /**
     * Method under test: {@link GameRunner#run()}
     */
    @Test
    void testRun() {
        // Arrange
        doNothing().when(gameConsole).down();
        doNothing().when(gameConsole).left();
        doNothing().when(gameConsole).right();
        doNothing().when(gameConsole).up();

        // Act
        gameRunner.run();

        // Assert that nothing has changed
        verify(gameConsole).down();
        verify(gameConsole).left();
        verify(gameConsole).right();
        verify(gameConsole).up();
    }
}
