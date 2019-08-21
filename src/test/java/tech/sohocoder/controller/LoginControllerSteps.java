//package tech.sohocoder.controller;
//
//import com.alibaba.fastjson.JSONPath;
//import org.junit.Assert;
//import tech.sohocoder.SpringbootCucumberTest;
//import tech.sohocoder.util.PasswordUtil;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class LoginControllerSteps extends tech.sohocoder.SpringbootCucumberTest {
//
//    private String account;
//    private String password;
//
//    private String result;
//
//    public LoginControllerSteps() {
//        loginSuccess();
//
//    }
//
//    public void loginSuccess() {
//        Given("账号名 {string}", (String account) -> {
//            this.account = account;
//        });
//        Given("密码 {string}", (String password) -> {
//            this.password = PasswordUtil.encode(password);
//        });
//        When("访问 {string}", (String string) -> {
//            // Write code here that turns the phrase above into concrete actions
//            Map<String, String> params = new HashMap<>();
//            params.put("account", account);
//            params.put("password", password);
//            result = restTemplate.postForObject("/login", params, String.class);
//        });
//
//        Then("code返回 {string}", (String code) -> {
//            // Write code here that turns the phrase above into concrete action
//            Assert.assertTrue(JSONPath.containsValue(result, "$.code", code));
//        });
//
//        Then("cookie字段不为空", () -> {
//            // Write code here that turns the phrase above into concrete actions
////            throw new PendingException();
//        });
//    }
//}
