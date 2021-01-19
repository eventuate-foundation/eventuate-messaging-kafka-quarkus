package io.eventuate.messaging.kafka.quarkus.integration.tests;

import io.eventuate.messaging.kafka.basic.consumer.DefaultKafkaConsumerFactory;
import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;
import io.eventuate.messaging.kafka.common.EventuateKafkaConfigurationProperties;
import io.eventuate.messaging.kafka.consumer.MessageConsumerKafkaImpl;
import io.eventuate.messaging.kafka.producer.EventuateKafkaProducer;
import io.eventuate.messaging.kafka.producer.EventuateKafkaProducerConfigurationProperties;

import javax.inject.Singleton;

@Singleton
public class EventuateKafkaProducerConsumerConfiguration {
  @Singleton
  public EventuateKafkaProducer producer(EventuateKafkaConfigurationProperties kafkaProperties, EventuateKafkaProducerConfigurationProperties producerProperties) {
    return new EventuateKafkaProducer(kafkaProperties.getBootstrapServers(), producerProperties);
  }

  @Singleton
  public MessageConsumerKafkaImpl messageConsumerKafka(EventuateKafkaConfigurationProperties props,
                                                       EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties,
                                                       KafkaConsumerFactory kafkaConsumerFactory) {
    return new MessageConsumerKafkaImpl(props.getBootstrapServers(), eventuateKafkaConsumerConfigurationProperties, kafkaConsumerFactory);
  }

  @Singleton
  public KafkaConsumerFactory kafkaConsumerFactory() {
    return new DefaultKafkaConsumerFactory();
  }
}
