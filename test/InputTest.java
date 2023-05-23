// File: InputTest.java
// Author: Ragány Dávid Gergő
// Copyright: 2023, Ragány Dávid Gergő
// Group: Szoft I-2-E
// Date: 2023.05.23
// Github: https://github.com/raganydavid/lelepi
// Licenc: GNU GPL 

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputTest {
    MainFrame mainFrame;

    @BeforeEach
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCheckInputAlpha() {
        boolean current = this.mainFrame.checkInput("h");
        assertFalse(current);
    }

    @Test
    public void testCheckInputNum() {
        boolean current = this.mainFrame.checkInput("11");
        assertTrue(current);
    }
}
