package cwicz61do90.cwicz68;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MachAnalyzer {

    public static void main(String[] args) {
        Stream<MatchResult> results = createStream();

        System.out.println("Wszystkie mecze");
        printAllSortedMatches(results);

        results = createStream();
        System.out.println(">>>>");
        getMatchesWithTeam(results, "Polska").forEach(System.out::println);

        results = createStream();
        System.out.println(">>>>");
        countDistinctTeam(results);

        results = createStream();
        System.out.println("We wszystkich meczach padło " + countAllGoals(results) + " goli");
    }

    private static int countAllGoals(Stream<MatchResult> results) {
        return results.mapToInt(MatchResult::sumGoals).sum();
    }

    private static long countDistinctTeam(Stream<MatchResult> results) {
        return results.map(MatchResult::getTeamNames)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
    }

    private static List<MatchResult> getMatchesWithTeam(Stream<MatchResult> results, String team) {
        return results.filter(result -> result.containsTeam(team)).collect(Collectors.toList());
    }

    private static void printAllSortedMatches(Stream<MatchResult> results) {
        results.sorted(Comparator.comparing(MatchResult::getGoalDifference).reversed())
                .forEach(System.out::println);
    }

    private static Stream<MatchResult> createStream() {
        return Stream.of(
                new MatchResult("Polska", "Irlandia", 2, 0),
                new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Włochy", "Polska", 2, 1),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Anglia", "Francja", 3, 0),
                new MatchResult("Polska", "Portugalia", 1, 0),
                new MatchResult("Brazylia", "Niemcy", 3, 3)
        );
    }


}
