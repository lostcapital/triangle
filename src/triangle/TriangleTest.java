package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleTest {
	
	Triangle T1 = new Triangle(2, 3, 4);
    Triangle T2 = new Triangle(1, 4, 5);
    Triangle T3 = new Triangle(3, 3, 4);
    Triangle T4 = new Triangle(4, 4, 4);
    String s1 = "Illegal";//非三角形
    String s2 = "Regular";//等边
    String s3 = "Scalene";
    String s4 = "Isosceles";//等腰
	@Test
	public void testIsTriangle() {
		assertEquals(true, T1.isTriangle(T1));
        assertSame(s3, T1.getType(T1));
        assertEquals(false, T2.isTriangle(T2));
        assertSame(s1, T2.getType(T2));
        assertSame(s4, T3.getType(T3));
        assertSame(s2, T4.getType(T4));
        assertEquals(false, T3.compareTriangles(T3, T4));
        assertEquals(true, T2.compareTriangles(T2, T1));
	}
}
