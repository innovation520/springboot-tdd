package tech.sohocoder.controller;

import tech.sohocoder.dao.MessageDao;
import tech.sohocoder.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(MessageController.class)
public class MessageControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MessageService messageService;

    @MockBean
    private MessageDao messageDao;

    @Test
    public void getMessage_returnHello() throws Exception {
//        MessageEntity messageEntity = new MessageEntity();
//        messageEntity.setMessage("hello");
//        given(messageDao.findById(1)).willReturn(messageEntity);
        given(messageService.getMessage(anyInt())).willReturn("hello");
        mockMvc.perform(MockMvcRequestBuilders.get("/getMessage?type=1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("000000"))
                .andExpect(jsonPath("message").value("hello"));
    }

    @Test
    public void getMessage_invalidType() throws Exception {
//        given(messageService.getMessage(anyInt())).willReturn("hello");
        mockMvc.perform(MockMvcRequestBuilders.get("/getMessage?type=2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("code").value("000001"))
                .andExpect(jsonPath("message").value("Invalid Parameter"));
    }

}
