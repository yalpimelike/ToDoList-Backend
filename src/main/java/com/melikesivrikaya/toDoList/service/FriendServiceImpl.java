package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.FriendRepository;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FriendServiceImpl implements FriendService{
    private FriendRepository friendRepository;
    private UserRepository userRepository;
    @Override
    public List<Friend> getFriends() {
        return friendRepository.findAll();
    }

    @Override
    public Optional<Friend> getFriendById(Long id) {
        return friendRepository.findById(id);
    }

    @Override
    public Friend createFriend(Friend friend) {
        return friendRepository.save(friend);
    }
    @Override
    public Friend updateFriend(Friend friend) {
        return friendRepository.save(friend);
    }

    @Override
    public void deleteFriend(Long id) {
        friendRepository.deleteById(id);
    }

    @Override
    public List<Friend> getFriendsByUserId(Long id) {
        return friendRepository.findAllByUserId(id);
    }
}
