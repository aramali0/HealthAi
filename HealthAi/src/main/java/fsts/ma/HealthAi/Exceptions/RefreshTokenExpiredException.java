package fsts.ma.HealthAi.Exceptions;

public class RefreshTokenExpiredException extends Exception{
    public RefreshTokenExpiredException(String message){
        super(message);
    }
}
