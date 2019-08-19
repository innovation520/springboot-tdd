Feature: 插入客户信息
  Scenario: 客户调用POST /addMessage
    Given message是 "我是客户"
    When 用户调用 "/addMessage"
    Then 返回状态码 200
    Then 返回信息code为 "000000"