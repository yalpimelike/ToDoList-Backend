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
            friend.setFriendState(FriendState.SENTED_REQUEST);
        }
        User user1= userRepository.findById(friend.getFriendId()).get();
        Friend userFriend = new Friend(user.getId(), friend.getFriendId(), user1.getName(), FriendState.REQUEST);
        friendRepository.save(userFriend);
        return friendRepository.save(friend);
    }
    @Override
    public Friend updateFriend( UpdateFriendRequest updateFriend) {
        Friend friend = friendRepository.findById(updateFriend.getId()).get();
        friend.setFriendState(updateFriend.getFriendState());
        Friend friendByRequest = friendRepository.findByUserIdAndFriendId(friend.getFriendId(),friend.getUserId());
        if (updateFriend.getFriendState() == FriendState.SUCCESS){
            friendByRequest.setFriendState(FriendState.SUCCESS);
        }
        friendRepository.save(friendByRequest);
        return friendRepository.save(friend);
    }

    @Override
    public void deleteFriend(Long id) {
        Friend friend = friendRepository.findById(id).get();
        Friend friendByRequest = friendRepository.findByUserIdAndFriendId(friend.getFriendId(), friend.getUserId());
        friendRepository.deleteById(id);
        friendRepository.deleteById(friendByRequest.getId());
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
