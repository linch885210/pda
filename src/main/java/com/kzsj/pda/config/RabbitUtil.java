package com.kzsj.pda.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class RabbitUtil {
  public static Queue queue=new Queue("atguigu.emps");
  public static DirectExchange exchange = new DirectExchange("exchange.direct");
}
