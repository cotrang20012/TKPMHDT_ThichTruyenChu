package mobile.Service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mobile.Service.RoleService;
import mobile.repository.RoleRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class RoleServiceImpl implements RoleService {

    final RoleRepository roleRepository;

    @Override
    public Boolean existsByRoleName(String RoleName) {
        return roleRepository.existsByName(RoleName);
    }
}
