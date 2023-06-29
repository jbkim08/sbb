package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passEncoder; //암호화 패스워드객체 주입
	
	// 새로운 유저 생성하고 비밀번호 암호화하여 리턴
    public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passEncoder.encode(password)); //암호화된 패스워드 입력
        this.userRepo.save(user);
        return user;
    }
    
    //유저이름으로 유저객체를 리턴
    public SiteUser getUser(String username) {
        Optional<SiteUser> siteUser = this.userRepo.findByUsername(username);
        if (siteUser.isPresent()) {
            return siteUser.get();
        } else {
            throw new DataNotFoundException("siteuser not found");
        }
    }

}
