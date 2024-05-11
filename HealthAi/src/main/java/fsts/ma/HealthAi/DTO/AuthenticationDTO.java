package fsts.ma.HealthAi.DTO;

public record AuthenticationDTO(
        String username,
        String password,
        boolean withRefreshToken,
        String refreshToken,
        String grantType
) {}