package io.eventuate.messaging.kafka.quarkus.integration.tests;

import io.eventuate.messaging.kafka.basic.consumer.AbstractEventuateKafkaBasicConsumerTest;
import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;
import io.eventuate.messaging.kafka.common.EventuateKafkaConfigurationProperties;
import io.eventuate.messaging.kafka.consumer.MessageConsumerKafkaImpl;
import io.eventuate.messaging.kafka.producer.EventuateKafkaProducer;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class EventuateKafkaBasicConsumerQuarkusTest extends AbstractEventuateKafkaBasicConsumerTest {

  @Inject
  EventuateKafkaConfigurationProperties kafkaProperties;

  @Inject
  EventuateKafkaConsumerConfigurationProperties consumerProperties;

  @Inject
  EventuateKafkaProducer producer;

  @Inject
  MessageConsumerKafkaImpl consumer;

  @Inject
  KafkaConsumerFactory kafkaConsumerFactory;

  @Test
  @Override
  public void shouldStopWhenHandlerThrowsException() {
    super.shouldStopWhenHandlerThrowsException();
  }

  @Test
  @Override
  public void shouldConsumeMessages() {
    super.shouldConsumeMessages();
  }

  @Test
  @Override
  public void shouldConsumeMessagesWithBackPressure() {
    super.shouldConsumeMessagesWithBackPressure();
  }

  @Test
  @Override
  public void shouldConsumeBatchOfMessage() {
    super.shouldConsumeBatchOfMessage();
  }

  @Override
  protected EventuateKafkaConfigurationProperties getKafkaProperties() {
    return kafkaProperties;
  }

  @Override
  protected EventuateKafkaConsumerConfigurationProperties getConsumerProperties() {
    return consumerProperties;
  }

  @Override
  protected EventuateKafkaProducer getProducer() {
    return producer;
  }

  @Override
  protected MessageConsumerKafkaImpl getConsumer() {
    return consumer;
  }

  @Override
  protected KafkaConsumerFactory getKafkaConsumerFactory() {
    return kafkaConsumerFactory;
  }
}