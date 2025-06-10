package jun10;
import java.util.*;

public class Friendsuggester {
    private Map<String, List<String>> network;

    public Friendsuggester(Map<String, List<String>> network) {
        this.network = network;
    }

    public List<String> suggestFriends(String person, int maxSuggestions) {
        
        List<String> directFriends = network.getOrDefault(person, new ArrayList<>());

        Map<String, Integer> friendsOfFriends = new HashMap<>();

        for (String friend : directFriends) {
           
            List<String> friendsOfFriend = network.getOrDefault(friend, new ArrayList<>());

            for (String potentialFriend : friendsOfFriend) {
                if (!potentialFriend.equals(person) && !directFriends.contains(potentialFriend)) {
                    friendsOfFriends.put(potentialFriend, friendsOfFriends.getOrDefault(potentialFriend, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> sortedFriendsOfFriends = new ArrayList<>(friendsOfFriends.entrySet());
        sortedFriendsOfFriends.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        List<String> suggestions = new ArrayList<>();
        for (int i = 0; i < maxSuggestions && i < sortedFriendsOfFriends.size(); i++) {
            suggestions.add(sortedFriendsOfFriends.get(i).getKey());
        }

        return suggestions;
    }

    public Map<String, Integer> getMutualFriendsCount(String person) {
        List<String> directFriends = network.getOrDefault(person, new ArrayList<>());

        Map<String, Integer> mutualFriendsCount = new HashMap<>();

        for (String friend : directFriends) {
            List<String> friendsOfFriend = network.getOrDefault(friend, new ArrayList<>());

            for (String potentialFriend : friendsOfFriend) {
                if (!potentialFriend.equals(person) && !directFriends.contains(potentialFriend)) {
                    mutualFriendsCount.put(potentialFriend, mutualFriendsCount.getOrDefault(potentialFriend, 0) + 1);
                }
            }
        }

        return mutualFriendsCount;
    }

    public static void main(String[] args) {
        Map<String, List<String>> network = new HashMap<>();
        network.put("Alice", Arrays.asList("Bob", "Charlie"));
        network.put("Bob", Arrays.asList("Alice", "David", "Eve"));

        Friendsuggester suggester = new Friendsuggester(network);
        List<String> suggestions = suggester.suggestFriends("Alice", 2);
        System.out.println("Friend Suggestions for Alice: " + suggestions);

        Map<String, Integer> mutualFriendsCount = suggester.getMutualFriendsCount("Alice");
        System.out.println("Mutual Friends Count for Alice: " + mutualFriendsCount);
    }
}