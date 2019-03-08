package com.kangce.main.dto;

import com.kangce.mybatis.mapper.UserlevelMapper;
import com.kangce.mybatis.model.User;
import com.kangce.mybatis.model.Userlevel;
import com.kangce.mybatis.model.UserlevelExample;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MemberDetails implements UserDetails {

    private User user;
    private List<String> ranks =Arrays.asList("tourist", "primary_administrator", "superior_administrator");

    public MemberDetails(User user) {
        this.user = user;
    }

    /**
     * 授权等级
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        for (int i = 0; i < user.getLevel(); i++) {
            authorities.add(new SimpleGrantedAuthority(ranks.get(i)));
        }

        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
