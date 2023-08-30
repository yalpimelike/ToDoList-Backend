package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.FriendRepository;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import com.melikesivrikaya.toDoList.responce.UserResponce;
import com.melikesivrikaya.toDoList.responce.UserWithFriendResponce;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    public List<UserResponce> getUsersWitoutFriendByUserId(Long userId) {
        List<Friend> friends = friendRepository.findAllByFriendId(userId); // userId'ye ait kullanıcının arkadaşları
        List<User> allUsers = userRepository.findAll(); // Tüm kullanıcılar
        List<UserResponce> usersWithoutMyFriends = new ArrayList<>();
        allUsers.forEach(user -> {
            boolean isFriend = friends.stream().anyMatch(friend -> friend.getUserId() == user.getId());
            if (!isFriend) {
                usersWithoutMyFriends.add(new UserResponce(user));
            }
        });
        return usersWithoutMyFriends;
    }
}
