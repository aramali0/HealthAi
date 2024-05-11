package fsts.ma.HealthAi.service;



import fsts.ma.HealthAi.DTO.AuthenticationDTO;
import fsts.ma.HealthAi.Exceptions.RefreshTokenExpiredException;

import java.util.Map;

public interface JwtService {
    public Map<String,String> generateToken(AuthenticationDTO authenticationDTO) throws RefreshTokenExpiredException;
}
