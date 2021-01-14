package io.eventuate.messaging.kafka.quarkus.consumer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import io.eventuate.messaging.kafka.basic.consumer.DefaultKafkaConsumerFactory;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;

@ApplicationScoped
public class KafkaConsumerFactoryConfiguration {
  @Produces
  public KafkaConsumerFactory kafkaConsumerFactory() {
    return new DefaultKafkaConsumerFactory();
  }
}
