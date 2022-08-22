package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {


    @Test
    void shouldReturnAreaAsTwentyFiveWhenSideIsFive(){
        final double side=5;
        final double expected=25;
        Rectangle square=new Rectangle(side);
        final double actual= square.area();
        assertEquals(expected,actual);

    }
    @Test
    void shouldReturnAreaAsTwentyWhenSideIsFive(){
        final double side=5;
        final double expected=20;
        Rectangle square=new Rectangle(side);
        final double actual=square.perimeter();
        assertEquals(expected,actual);

    }


}
