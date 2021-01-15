package io.eventuate.messaging.kafka.quarkus.consumer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import io.eventuate.messaging.kafka.basic.consumer.DefaultKafkaConsumerFactory;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;
import io.quarkus.arc.DefaultBean;

@ApplicationScoped
public class KafkaConsumerFactoryConfiguration {
  @Produces
  @DefaultBean
  public KafkaConsumerFactory kafkaConsumerFactory() {
    return new DefaultKafkaConsumerFactory();
  }
}
