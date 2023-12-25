package org.zbm.auth.service;

import org.springframework.stereotype.Service;
import org.zbm.auth.model.AuthRequest;
import org.zbm.auth.model.AuthResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtService jwtService;

    public AuthResponse register(AuthRequest authRequest) {
        String accessToken = jwtService.generate(authRequest.getEmail(), "ACCESS");
        String refreshToken = jwtService.generate(authRequest.getEmail(), "REFRESH");

        return new AuthResponse(accessToken, refreshToken);
    }
}
