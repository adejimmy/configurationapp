//package security;
//
//import io.jsonwebtoken.Jwts;
//import org.springframework.core.env.Environment;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class AuthorizationFilter extends BasicAuthenticationFilter {
//    public static final long jwtExpirationMs = 864000000; // 10 days
//    public static final long PASSWORD_RESET_EXPIRATION_TIME = 3600000; // 1 hour
//    public static final String TOKEN_PREFIX = "Bearer ";
//    public static final String HEADER_STRING = "Authorization";
//    public static final String SIGN_UP_URL = "/users";
//    public static final String VERIFICATION_EMAIL_URL = "/users/email-verification";
//    public static final String PASSWORD_RESET_REQUEST_URL = "/users/password-reset-request";
//    public static final String PASSWORD_RESET_URL = "/users/password-reset";
//    public static final String H2_CONSOLE = "/h2-console/**";
//    public static final String jwtSecret= "998899KMKJJHHG";
//    Environment environment;
//
//    public AuthorizationFilter(AuthenticationManager authManager, Environment environment) {
//        super(authManager);
//        this.environment = environment;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest req,
//                                    HttpServletResponse res,
//                                    FilterChain chain) throws IOException, ServletException {
//
//        String authorizationHeader = req.getHeader(HEADER_STRING);
//
//        if (authorizationHeader == null || !authorizationHeader.startsWith(TOKEN_PREFIX)) {
//            chain.doFilter(req, res);
//            return;
//        }
//
//        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        chain.doFilter(req, res);
//    }
//
//    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest req) {
//        String authorizationHeader = req.getHeader(HEADER_STRING);
//
//        if (authorizationHeader == null) {
//            return null;
//        }
//
//        String token = authorizationHeader.replace(TOKEN_PREFIX, "");
//
//        String userId = Jwts.parser()
//                .setSigningKey(jwtSecret)
//                .parseClaimsJws(token)
//                .getBody()
//                .getSubject();
//
//        if (userId == null) {
//            return null;
//        }
//
//        return new UsernamePasswordAuthenticationToken(userId, null, new ArrayList<>());
//
//    }
//}
