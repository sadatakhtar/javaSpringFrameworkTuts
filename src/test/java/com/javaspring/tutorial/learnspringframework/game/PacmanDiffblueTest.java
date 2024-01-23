package com.javaspring.tutorial.learnspringframework.game;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {Pacman.class})
@ExtendWith(SpringExtension.class)
class PacmanDiffblueTest {
    @Autowired
    private Pacman pacman;

    /**
     * Method under test: {@link Pacman#up()}
     */
    @Test
    void testUp() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        pacman.up();
    }

    /**
     * Method under test: {@link Pacman#down()}
     */
    @Test
    void testDown() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        pacman.down();
    }

    /**
     * Method under test: {@link Pacman#left()}
     */
    @Test
    void testLeft() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        pacman.left();
    }

    /**
     * Method under test: {@link Pacman#right()}
     */
    @Test
    void testRight() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        pacman.right();
    }
}
