//560_Friendship_Service


public class FriendshipService {
    public HashMap<Integer, Set<Integer>> followerMap;
    public HashMap<Integer, Set<Integer>> followingMap;
    
    public FriendshipService() {
        followerMap = new HashMap<>();
        followingMap = new HashMap<>();
    }

    /*
     * @param user_id: An integer
     * @return: all followers and sort by user_id
     */
    public List<Integer> getFollowers(int user_id) {
        if(followerMap.containsKey(user_id)) {
            return new ArrayList<Integer>(followerMap.get(user_id));
        } else {
            return new ArrayList<Integer>();
        }
    }

    /*
     * @param user_id: An integer
     * @return: all followings and sort by user_id
     */
    public List<Integer> getFollowings(int user_id) {
        if(followingMap.containsKey(user_id)) {
            return new ArrayList<Integer>(followingMap.get(user_id));
        } else {
            return new ArrayList<Integer>();
        }
    }

    /*
     * @param from_user_id: An integer
     * @param to_user_id: An integer
     * @return: nothing
     */
     
    //use TreeSet 
    public void follow(int to_user_id, int from_user_id) {
        if (!followerMap.containsKey(to_user_id))
            followerMap.put(to_user_id, new TreeSet<Integer>());

        followerMap.get(to_user_id).add(from_user_id);

        if (!followingMap.containsKey(from_user_id))
            followingMap.put(from_user_id, new TreeSet<Integer>());

        followingMap.get(from_user_id).add(to_user_id);
    }

    /*
     * @param from_user_id: An integer
     * @param to_user_id: An integer
     * @return: nothing
     */
    public void unfollow(int to_user_id, int from_user_id) {
        if(followerMap.containsKey(to_user_id)) {
            followerMap.get(to_user_id).remove(from_user_id);
        }
        if(followingMap.containsKey(from_user_id)) {
            followingMap.get(from_user_id).remove(to_user_id);
        }
    }
}