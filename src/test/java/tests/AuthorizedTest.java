package tests;

import org.junit.jupiter.api.BeforeEach;
import pages.*;

import java.util.Map;

import static utils.YAMLDeserializer.fromFileToMap;

public abstract class AuthorizedTest extends BaseTest {

    protected Map<String, String> user;

    protected MyParcelsPage myParcelsPage;

    public AuthorizedTest() {
        super();

        user = fromFileToMap("user.yaml");
        myParcelsPage = new MyParcelsPage(driver);
    }

    public AuthorizedTest(String file) {
        this();

        user = fromFileToMap(file);

    }

    @BeforeEach
    public void beforeEach() {
        super.beforeEach();

        myParcelsPage = homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(user.get("name"), user.get("password"))
                .clkSubmitLogin();

    }

}
