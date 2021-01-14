package io.eventuate.messaging.kafka.quarkus.producer;

import io.eventuate.messaging.kafka.producer.EventuateKafkaProducerConfigurationProperties;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class EventuateKafkaProducerConfigurationTest {

  @Inject
  EventuateKafkaProducerConfigurationProperties eventuateKafkaProducerConfigurationProperties;

  @Test
  public void testPropertyParsing() {

    Assert.assertEquals(2, eventuateKafkaProducerConfigurationProperties.getProperties().size());

    Assert.assertEquals("1000000", eventuateKafkaProducerConfigurationProperties.getProperties().get("buffer.memory"));

    Assert.assertEquals("org.apache.kafka.common.serialization.ByteArraySerializer",
            eventuateKafkaProducerConfigurationProperties.getProperties().get("value.serializer"));
  }
}
