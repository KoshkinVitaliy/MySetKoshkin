import java.util.List;

public class Main {
    public static void main(String[] args) {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = List.of(1,1,2,3,3,4,5);
        System.out.println(extractor.extractUniqueNumbers(numbers));
    }
}
