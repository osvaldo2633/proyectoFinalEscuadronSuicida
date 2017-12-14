package com.reor.vitivinicola.security;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
 
 
public class CustomJdbcDaoImpl extends JdbcDaoImpl implements UserDetailsService {
     
    public static final String DEF_USERS_BY_USERNAME_QUERY = "select " +
            "user_id, username, password, enabled, nombre, " +
            "apellidos, " +
            "email, tracking " +
            "from users " +
            "where username  = ? ";
     
    public CustomJdbcDaoImpl() {}
 
    protected List<UserDetails> loadUsersByUsername(String username) {
         
        return getJdbcTemplate().query(DEF_USERS_BY_USERNAME_QUERY, new String[] {username}, new RowMapper<UserDetails>() {
            public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
                 
                Long userId = rs.getLong(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                boolean enabled = rs.getBoolean(4);
                String nombre =  rs.getString(5);
                String apellidos =  rs.getString(6);
                String correoElectronico = rs.getString(7);
                 
                return new SecurityUser(username, password, enabled, true, true, true, AuthorityUtils.NO_AUTHORITIES,
                        userId, nombre, apellidos, correoElectronico);
            }
        });
    }
 
    protected UserDetails createUserDetails(String username, UserDetails userFromUserQuery,
            List<GrantedAuthority> combinedAuthorities) {
 
        SecurityUser securityUser = (SecurityUser)userFromUserQuery;
        return new SecurityUser(
                securityUser.getUsername(),
                securityUser.getPassword(),
                securityUser.isEnabled(), true, true, true, combinedAuthorities,
                securityUser.getUserId(),
                securityUser.getNombre(),
                securityUser.getApellidos(),
                securityUser.getEmail()
              
                );
    }
}






