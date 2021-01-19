package io.eventuate.messaging.kafka.quarkus.consumer;

import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;
import io.eventuate.messaging.kafka.common.EventuateKafkaConfigurationProperties;
import io.eventuate.messaging.kafka.consumer.MessageConsumerKafkaImpl;

import javax.inject.Singleton;

@Singleton
public class MessageConsumerKafkaConfiguration {
  @Singleton
  public MessageConsumerKafkaImpl messageConsumerKafka(EventuateKafkaConfigurationProperties props,
                                                       EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties,
                                                       KafkaConsumerFactory kafkaConsumerFactory) {
    return new MessageConsumerKafkaImpl(props.getBootstrapServers(), eventuateKafkaConsumerConfigurationProperties, kafkaConsumerFactory);
  }
}
