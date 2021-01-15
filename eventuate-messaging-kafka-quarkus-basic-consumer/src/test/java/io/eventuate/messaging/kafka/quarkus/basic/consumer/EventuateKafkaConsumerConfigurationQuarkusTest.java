package io.eventuate.messaging.kafka.quarkus.basic.consumer;

import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class EventuateKafkaConsumerConfigurationQuarkusTest {

  @Inject
  EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties;

  @Test
  public void testPropertyParsing() {

    assertEquals(2, eventuateKafkaConsumerConfigurationProperties.getProperties().size());

    assertEquals("10000", eventuateKafkaConsumerConfigurationProperties.getProperties().get("session.timeout.ms"));

    assertEquals("org.apache.kafka.common.serialization.StringSerializer",
            eventuateKafkaConsumerConfigurationProperties.getProperties().get("key.serializer"));

    assertEquals(5, eventuateKafkaConsumerConfigurationProperties.getBackPressure().getLow());
    assertEquals(100, eventuateKafkaConsumerConfigurationProperties.getBackPressure().getHigh());
    assertEquals(200, eventuateKafkaConsumerConfigurationProperties.getPollTimeout());
  }
}
