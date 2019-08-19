package tech.sohocoder;

import cucumber.api.java8.En;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class HelloSteps extends SpringbootCucumberTest implements En{

    String name;
    String path;
    ResultActions resultActions;

    public HelloSteps() {
        Given("name is {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            this.name = string;
        });

        When("the client calls {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            this.path = string;
            this.resultActions = mockMvc.perform(MockMvcRequestBuilders.get(path + "?name=" + name));
        });

        Then("the client receives status code of {int}", (Integer status) -> {
            // Write code here that turns the phrase above into concrete actions
            resultActions.andExpect(status().is(status));
        });

        Then("the client receives content {string}", (String result) -> {
            // Write code here that turns the phrase above into concrete actions
            resultActions.andExpect(jsonPath("message").value(result));
        });
    }

}
