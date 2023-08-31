package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.FriendState;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.FriendRepository;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import com.melikesivrikaya.toDoList.response.UserListWithFriendStateResponce;
import com.melikesivrikaya.toDoList.response.UserResponce;
import com.melikesivrikaya.toDoList.response.UserWithFriendResponce;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private FriendService friendService;
    private FriendRepository friendRepository;
    @Override
    public List<UserResponce> getUsers() {
        List<User> users = userRepository.findAll();
         return users.stream().map(user -> new UserResponce(user)).collect(Collectors.toList());
    }
    @Override
    public UserWithFriendResponce getUser(Long id) {
        User user = userRepository.findById(id).get();
        List<Friend> friends = friendService.getFriendsByFriendsId(id);
         return new UserWithFriendResponce(user,friends);
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public UserResponce createUser(User user) {
        userRepository.save(user);
        return new UserResponce(user);
    }
    @Override
    public UserResponce updateUser(User user) {
        userRepository.save(user);
        return new UserResponce(user);
    }

    @Override
    public List<UserListWithFriendStateResponce> getUsersWitoutFriendByUserId(Long userId) {
        List<Friend> friends = friendRepository.findAllByFriendId(userId); // userId'ye ait kullanıcının arkadaşları
        List<User> allUsers = userRepository.findAll(); // Tüm kullanıcılar
        List<UserListWithFriendStateResponce> usersWithoutMyFriends = new ArrayList<>();
        allUsers.forEach(user -> {
            if (friends.stream().anyMatch(friend -> friend.getUserId() == user.getId() && friend.getFriendState() == FriendState.SENTED_REQUEST)) {
                usersWithoutMyFriends.add(new UserListWithFriendStateResponce(user,FriendState.SENTED_REQUEST));
            } else if (friends.stream().anyMatch(friend -> friend.getUserId() == user.getId() && friend.getFriendState() == FriendState.REQUEST)) {

            }else if (friends.stream().anyMatch(friend -> friend.getUserId() == user.getId() && friend.getFriendState() == FriendState.SUCCESS)) {

            }else if (friends.stream().anyMatch(friend -> friend.getUserId() != user.getId() )) {
                usersWithoutMyFriends.add(new UserListWithFriendStateResponce(user));
            }
        });
        return usersWithoutMyFriends;
    }
}
