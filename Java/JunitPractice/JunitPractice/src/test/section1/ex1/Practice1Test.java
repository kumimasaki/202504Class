package test.section1.ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import section1.ex1.Practice1;

public class Practice1Test {
	
	// 正の数のテスト
	@Test
	public void testFindMax_WithPositiveNumber() {
		int[] arr = {1, 5, 3, 9, 2};
		assertEquals(9, Practice1.findMax(arr));
	}
	
	// 負の数のテスト
    @Test
    public void testFindMax_WithNegativeNumbers() {
        int[] arr = {-1, -5, -3, -9, -2};
        assertEquals(-1, Practice1.findMax(arr));
    }

    // 境界値テスト
    @Test
    public void testFindMax_WithSingleElement() {
        int[] arr = {10};
        assertEquals(10, Practice1.findMax(arr));
    }
}
