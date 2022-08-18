package com.thoughtworks.rectangle;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven(){
        Rectangle r= new Rectangle(5.8 , 4.2);
        double actual = r.area();
        BigDecimal actual1 = new BigDecimal(Double.toString(actual));
        BigDecimal operand = new BigDecimal("24.36");
        BigDecimal error = new BigDecimal("0.0005");
        assertThat(actual1, is(closeTo(operand, error)));
    }
    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthAreGiven(){
        Rectangle r= new Rectangle(5.8 , 4.2);
        double actual = r.perimeter();
        BigDecimal actual1 = new BigDecimal(Double.toString(actual));
        BigDecimal operand = new BigDecimal("20.00");
        BigDecimal error = new BigDecimal("0.0005");
        assertThat(actual1, is(closeTo(operand, error)));
    }





}
