package io.eventuate.messaging.kafka.quarkus.consumer;

import javax.inject.Singleton;

import io.eventuate.messaging.kafka.basic.consumer.DefaultKafkaConsumerFactory;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;
import io.quarkus.arc.DefaultBean;

@Singleton
public class KafkaConsumerFactoryConfiguration {
  @Singleton
  @DefaultBean
  public KafkaConsumerFactory kafkaConsumerFactory() {
    return new DefaultKafkaConsumerFactory();
  }
}
