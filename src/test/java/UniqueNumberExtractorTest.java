import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueNumberExtractorTest {
    @Test
    public void testExtractUniqueNumbersWithDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers should match the expected set.");
    }

    @Test
    public void testExtractUniqueNumbersEmptyList() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList();

        Set<Integer> expectedUniqueNumbers = new HashSet<>();
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers from an empty list should be an empty set.");
    }

    @Test
    public void testExtractUniqueNumbersNoDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers should match the input when there are no duplicates.");
    }

    @Test
    public void testExtractUniqueNumbersWithNegativeNumbers() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -2, -1, 0);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(-1, -2, -3, 0));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers should match the expected set for negative numbers.");
    }

    @Test
    public void testExtractUniqueNumbersAllDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(2, 2, 2, 2);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(2));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers,
                "The unique numbers from an all duplicates list should only contain the one unique number.");
    }
}
