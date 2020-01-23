package gridsearch

import org.junit.Test

/**
 * Tests for GridSearch.
 *
 * @author rahulsomasunderam
 * @since 2/18/13 5:55 PM
 */
public class GridSearchTest {
  static final int[][] miniSet = [// Start list of lists
                                  [1, 2, 3],
                                  [3, 4, 6],
                                  [4, 6, 7],
                                  /* end list of lists */] as int[][]

  static final int[][] decaSet = readFile('input10.txt')
  static final int[][] hectoSet = readFile('input100.txt')
  static final int[][] kiloSet = readFile('input1000.txt')

  static int[][] readFile(String fileName) {
    def text = GridSearchTest.class.classLoader.getResourceAsStream(fileName).text
    def lines = text.split('\n')
    lines[1..-1].collect {it.split(' ').collect {Integer.parseInt(it)}}
  }

  static final GridSearch gridSearch = new GridSearch()

  private int valueAt(int[][] grid, GridSearch.Position pos) {
    grid[pos.i][pos.j]
  }

  @Test
  void testInit() {
    assert decaSet
    assert hectoSet
    assert kiloSet
  }

  @Test
  void testOne() {
    // This just primes the system
    gridSearch.findInGrid(miniSet, 2000)
  }

  @Test(timeout = 100L)
  void testPositive() {
    assert valueAt(miniSet, gridSearch.findInGrid(miniSet, 3)) == 3
    assert valueAt(miniSet, gridSearch.findInGrid(miniSet, 2)) == 2
    assert valueAt(miniSet, gridSearch.findInGrid(miniSet, 6)) == 6
    assert valueAt(miniSet, gridSearch.findInGrid(miniSet, 7)) == 7
    assert valueAt(miniSet, gridSearch.findInGrid(miniSet, 1)) == 1
  }

  @Test(timeout = 100L)
  void testNegative() {
    assert !gridSearch.findInGrid(miniSet, 5)
    assert !gridSearch.findInGrid(miniSet, 0)
    assert !gridSearch.findInGrid(miniSet, 8)
  }

  @Test(timeout = 100L)
  void testDecaPositive() {
    assert valueAt(decaSet, gridSearch.findInGrid(decaSet, 83)) == 83
    assert valueAt(decaSet, gridSearch.findInGrid(decaSet, 79)) == 79
    assert valueAt(decaSet, gridSearch.findInGrid(decaSet, 55)) == 55
    assert valueAt(decaSet, gridSearch.findInGrid(decaSet, 67)) == 67

  }

  @Test(timeout = 100L)
  void testDecaNegative() {
    assert !gridSearch.findInGrid(decaSet, 72)
    assert !gridSearch.findInGrid(decaSet, 0)
    assert !gridSearch.findInGrid(decaSet, 170)
  }

  @Test(timeout = 150L)
  void testHectoPositive() {
    assert valueAt(hectoSet, gridSearch.findInGrid(hectoSet, 70)) == 70
    assert valueAt(hectoSet, gridSearch.findInGrid(hectoSet, 5066)) == 5066
    assert valueAt(hectoSet, gridSearch.findInGrid(hectoSet, 5191)) == 5191
    assert valueAt(hectoSet, gridSearch.findInGrid(hectoSet, 5750)) == 5750
  }

  @Test(timeout = 150L)
  void testHectoNegative() {
    assert !gridSearch.findInGrid(hectoSet, 5751)
    assert !gridSearch.findInGrid(hectoSet, 69)
    assert !gridSearch.findInGrid(hectoSet, 14487)
    assert !gridSearch.findInGrid(hectoSet, 14600)
  }

  @Test(timeout = 250L)
  void testKiloPositive() {
    assert valueAt(kiloSet, gridSearch.findInGrid(kiloSet, 566)) == 566
    assert valueAt(kiloSet, gridSearch.findInGrid(kiloSet, 501189)) == 501189
    assert valueAt(kiloSet, gridSearch.findInGrid(kiloSet, 510923)) == 510923
    assert valueAt(kiloSet, gridSearch.findInGrid(kiloSet, 1497341)) == 1497341
    assert valueAt(kiloSet, gridSearch.findInGrid(kiloSet, 791906)) == 791906
  }

  @Test(timeout = 250L)
  void testKiloNegative() {
    assert !gridSearch.findInGrid(kiloSet, 791901)
    assert !gridSearch.findInGrid(kiloSet, 69)
    assert !gridSearch.findInGrid(kiloSet, 1497342)
    assert !gridSearch.findInGrid(kiloSet, 1497340)
  }
}
