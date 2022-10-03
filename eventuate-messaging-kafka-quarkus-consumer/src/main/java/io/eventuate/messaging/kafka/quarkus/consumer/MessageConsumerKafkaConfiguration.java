package io.eventuate.messaging.kafka.quarkus.consumer;

import io.eventuate.messaging.kafka.basic.consumer.EventuateKafkaConsumerConfigurationProperties;
import io.eventuate.messaging.kafka.basic.consumer.KafkaConsumerFactory;
import io.eventuate.messaging.kafka.common.EventuateKafkaConfigurationProperties;
import io.eventuate.messaging.kafka.consumer.MessageConsumerKafkaImpl;
import io.eventuate.messaging.kafka.consumer.OriginalTopicPartitionToSwimlaneMapping;
import io.eventuate.messaging.kafka.consumer.TopicPartitionToSwimlaneMapping;
import io.quarkus.arc.DefaultBean;

import javax.inject.Singleton;

@Singleton
public class MessageConsumerKafkaConfiguration {

  @Singleton
  @DefaultBean
  private TopicPartitionToSwimlaneMapping partitionToSwimLaneMapping() {
    return new OriginalTopicPartitionToSwimlaneMapping();
  }

  @Singleton
  public MessageConsumerKafkaImpl messageConsumerKafka(EventuateKafkaConfigurationProperties props,
                                                       EventuateKafkaConsumerConfigurationProperties eventuateKafkaConsumerConfigurationProperties,
                                                       KafkaConsumerFactory kafkaConsumerFactory,
                                                       TopicPartitionToSwimlaneMapping partitionToSwimLaneMapping) {
    return new MessageConsumerKafkaImpl(props.getBootstrapServers(), eventuateKafkaConsumerConfigurationProperties, kafkaConsumerFactory, partitionToSwimLaneMapping);
  }
}
