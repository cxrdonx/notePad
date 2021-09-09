package com.project.NotePad.persistence.web.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class JWTutil {
    private static final String KEY = "hU^#@CHDe0zS";
    public String generateToken(UserDetails userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 *48))
                .signWith(SignatureAlgorithm.HS256, KEY).compact();
    }

    public boolean validaTeToken(String token, UserDetails userDetails){
        //verificar si esta creado para ese usuario, par esa sesion, y ver si la fecha de expiracion paso
           return userDetails.getUsername().equals(extractUsername(token)) && !isTokenExpired(token);
    }

    public String extractUsername(String token){
        return getClaims(token).getSubject();
    }


    public boolean isTokenExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }



    private Claims getClaims(String token){
        return Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
    }




}
