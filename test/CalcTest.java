// File: CalcTest.java
// Author: Ragány Dávid Gergő
// Copyright: 2023, Ragány Dávid Gergő
// Group: Szoft I-2-E
// Date: 2023.05.23
// Github: https://github.com/raganydavid/lelepi
// Licenc: GNU GPL 

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalcTest {
    MainFrame mainFrame;

    @BeforeEach                     
    public void initEach() {
        this.mainFrame = new MainFrame();
    }

    @Test
    public void testCalcVolumetricOne() {
        double current = this.mainFrame.calcVolumetric(2, 2, 2);
        double expected = 8.0;
        assertEquals(expected, current, 0.1);
    }

    @Test
    public void testCalcVolumetricTwo() {
        double current = this.mainFrame.calcVolumetric(3, 3, 3);
        double expected = 27.0;
        assertEquals(expected, current, 0.1);
    }
}
