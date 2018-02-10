package freight.util.token;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Map;

/**
 * <p>创建时间: 2018/2/9</p>
 * <p>作者：tianchang</p>
 * ====================================================================<br>
 */
public class Jwt {
    private static String base64Security="MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY=";
    private static byte[] apiKeysecret=DatatypeConverter.parseBase64Binary(base64Security);
    private static SignatureAlgorithm signatureAlgorithm=SignatureAlgorithm.HS256;
    private static Key signKey=new SecretKeySpec(apiKeysecret,signatureAlgorithm.getJcaName());

    public static String createToken(String username,String role){
        String tokenstring=null;

        JwtBuilder builder=Jwts.builder().setHeaderParam("typ","JWT").setHeaderParam("alg","HS256")
                .claim("role",role).claim("username",username).signWith(signatureAlgorithm,signKey);

        return builder.compact();
    }

    public static Claims praseToken(String token){
        try{
            Claims claims=Jwts.parser().setSigningKey(apiKeysecret)
                    .parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){
            return null;
        }
    }
}
