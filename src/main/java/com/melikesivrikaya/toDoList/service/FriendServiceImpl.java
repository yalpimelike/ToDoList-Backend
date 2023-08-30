package com.melikesivrikaya.toDoList.service;

import com.melikesivrikaya.toDoList.model.Friend;
import com.melikesivrikaya.toDoList.model.FriendState;
import com.melikesivrikaya.toDoList.model.User;
import com.melikesivrikaya.toDoList.repository.FriendRepository;
import com.melikesivrikaya.toDoList.repository.UserRepository;
import com.melikesivrikaya.toDoList.request.UpdateFriendRequest;
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
        User user = userRepository.findById(friend.getUserId()).get();
        friend.setName(user.getName());
        if(friend.getFriendState()== null){
            friend.setFriendState(FriendState.WAIT);
        }
        return friendRepository.save(friend);
    }
    @Override
    public Friend updateFriend( UpdateFriendRequest updateFriend) {
        Friend friend = friendRepository.findById(updateFriend.getId()).get();
        friend.setFriendState(updateFriend.getFriendState());
        return friendRepository.save(friend);
    }

    @Override
    public void deleteFriend(Long id) {
        friendRepository.deleteById(id);
    }


    //Arkadaşımın arkadaşlarını bu fonksiyonla görebilirim
    @Override
    public List<Friend> getFriendsByUserId(Long userId) {
        return friendRepository.findAllByUserId(userId);
    }

    @Override
    public List<Friend> getFriendsByFriendsId(Long friendId) {
        return friendRepository.findAllByFriendId(friendId);
    }
}
