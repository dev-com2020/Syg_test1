import mockito.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.security.auth.login.LoginException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LoginControllerLoginTest {
    @InjectMocks
    LoginController loginController;

    @Mock
    LoginService loginService;

    UserForm userForm = new UserForm("tomek","pass");

    @Test
    void testLoginOk() throws LoginException {
        when(loginService.login(userForm)).thenReturn(true);
        String responseLogin = loginController.login(userForm);
        assertEquals("OK", responseLogin);
        verify(loginService).login(userForm);
        verifyNoMoreInteractions(loginService);
    }

}
