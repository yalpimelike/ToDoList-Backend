package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.repository.FriendRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FriendServiceImpl implements FriendService{
    private FriendRepository friendRepository;
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
}
