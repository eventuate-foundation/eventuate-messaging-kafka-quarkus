package io.eventuate.messaging.kafka.quarkus.producer;

import io.eventuate.messaging.kafka.producer.EventuateKafkaProducerConfigurationProperties;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class EventuateKafkaProducerConfigurationTest {

  @Inject
  EventuateKafkaProducerConfigurationProperties eventuateKafkaProducerConfigurationProperties;

  @Test
  public void testPropertyParsing() {

    assertEquals(2, eventuateKafkaProducerConfigurationProperties.getProperties().size());

    assertEquals("1000000", eventuateKafkaProducerConfigurationProperties.getProperties().get("buffer.memory"));

    assertEquals("org.apache.kafka.common.serialization.ByteArraySerializer",
            eventuateKafkaProducerConfigurationProperties.getProperties().get("value.serializer"));
  }
}
