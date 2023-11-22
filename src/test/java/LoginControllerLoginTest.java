import mockito.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import javax.security.auth.login.LoginException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LoginControllerLoginTest {

//    @InjectMocks
//    LoginController loginController;

    @InjectMocks
    LoginService loginService;

//    @Mock
//    LoginService loginService;
    @Spy
        LoginRepository loginRepository;

    UserForm userForm = new UserForm("tomek","pass");
    UserForm userOK = new UserForm("user1","p1");

//    @Test
//    void testLoginOk() throws LoginException {
//        when(loginService.login(userForm)).thenReturn(true);
//        String responseLogin = loginController.login(userForm);
//        assertEquals("OK", responseLogin);
//        verify(loginService).login(userForm);
//        verifyNoMoreInteractions(loginService);
//    }
//
//    @Test
//    void testLoginError(){
//        assertEquals("ERROR", loginController.login(null));
//    }

    @Test
    void testLoginOK1() throws LoginException {
        assertTrue(loginService.login(userOK));
    }



}
