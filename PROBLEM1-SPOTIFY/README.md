# Problem Statement

Create a class Spotify with the below attributes:

spotifyId - int<br>
profileName - String<br>
subscriptionType - String<br>
subscription Price - double<br>
groupSessionAvailable - String<br>

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement one static method - findAvgSpotifySubsByType in Solution class.

findAvgSpotifySubsByType method:
This method will take three input parameters - array of Spotify objects and two String parameters.
The method will return the average subscriptionPrice of Spotify's(as a double value) from array of Spotify objects for the given subscription type(String parameter passed) and groupSession available option(String parameter passed).
If no Spotify with the above condition is present in the array of Spotify objects, then the method should return 0.0.

Note: No two Spotify object would have the same spotifyId.

All the searches should be case insensitive.

The above mentioned static method should be called from the main method.

For findAvgSpotifySubsByType method - The main method should print the returned average subscription Price of Spotify's as it is, if the returned value is greater than 0, or it should print "There are no such Spotify Subscription".

Before calling these static methods in main, use Scanner object to read the values of four Spotify objects referring attributes in the above mentioned attribute sequence.

Next, read two String values for capturing subscription type and groupSession available option.

Consider below sample input and output:

Testcasel:

Input:

1001
John
Yearly
1000
Yes
1002
Wick
Monthly
200
Yes
1003
Jack
Yearly
2000
Yes
1004
Jack
Monthly
199
No
Yearly
Yes

Output:

1500.0
