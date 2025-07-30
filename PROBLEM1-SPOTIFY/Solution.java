import java.util.*;

class Spotify {
    private int spotifyId;
    private String profileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private String groupSessionAvailable;

    public Spotify(int spotifyId, String profileName, String subscriptionType, double subscriptionPrice, String groupSessionAvailable) {
        this.spotifyId = spotifyId;
        this.profileName = profileName;
        this.subscriptionType = subscriptionType;
        this.subscriptionPrice = subscriptionPrice;
        this.groupSessionAvailable = groupSessionAvailable;
    }

    public int getSpotifyId() {
        return spotifyId;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public String getGroupSessionAvailable() {
        return groupSessionAvailable;
    }
}
public class Solution {
    public static double findAvgSpotifySubsByType(Spotify[] list, String type, String session) {
        double sum = 0;
        int count = 0;

        for (Spotify s : list) {
            if (s.getSubscriptionType().equalsIgnoreCase(type) &&
                    s.getGroupSessionAvailable().equalsIgnoreCase(session)) {
                sum += s.getSubscriptionPrice();
                count++;
            }
        }

        if (count > 0) {
            return sum / count;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Spotify[] spotifyArr = new Spotify[4];

        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String type = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            String groupSession = sc.nextLine();

            spotifyArr[i] = new Spotify(id, name, type, price, groupSession);
        }

        String searchType = sc.nextLine();
        String searchSession = sc.nextLine();

        double result = findAvgSpotifySubsByType(spotifyArr, searchType, searchSession);

        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("There are no such Spotify Subscription");
        }

        sc.close();
    }
}