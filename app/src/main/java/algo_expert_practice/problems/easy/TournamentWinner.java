package algo_expert_practice.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TournamentWinner {

    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        Map<String, Integer> map = new HashMap<>();
        competitions.stream().forEach(c -> {
            c.stream().forEach(t -> map.put(t, 0));
        });

        String team;
        for (int i = 0; i < results.size(); i++) {
            if (results.get(i) == 1)
                team = competitions.get(i).get(0);
            else
                team = competitions.get(i).get(1);

            map.put(team, map.get(team) + 1);
        }

        return map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getKey();
    }
    
    public static void main(String[] args) {
        TournamentWinner t = new TournamentWinner();
        System.out.printf("1. %s\n", t.tournamentWinner(
            Arrays.asList(
                Arrays.asList("HTML", "C#"),
                Arrays.asList("C#", "Python"),
                Arrays.asList("Python", "HTML")),
            Arrays.asList(0, 0, 1)
        )); // Python
    }
}
