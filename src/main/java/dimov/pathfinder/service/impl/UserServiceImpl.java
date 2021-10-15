package dimov.pathfinder.service.impl;

import dimov.pathfinder.model.entity.User;
import dimov.pathfinder.model.enums.LevelUserEnum;
import dimov.pathfinder.model.service.UserServiceModel;
import dimov.pathfinder.repository.UserRepository;
import dimov.pathfinder.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        User user = modelMapper.map(userServiceModel, User.class);
        user.setLevel(LevelUserEnum.BEGINNER);

        userRepository.save(user);
    }
}
