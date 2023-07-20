package techproed.tests.day27_SmokeTest_Excel;

import org.testng.annotations.Test;

public class C01_NegatifTest {
    @Test
    public void test01() {
        //Description:
        //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        //Acceptance Criteria
        //Customer email: fake@bluerentalcars.com
        //Customer password: fakepass
        //Error:
        //User with email fake@bluerentalcars.com not found
    }
}
