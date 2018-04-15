package xyz.eazyfree.demo.kafkademo;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhaoZhi qiang on 2018/4/14.
 */
public class KafkaSteams {

    public static void main(String[] args) {

        Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "my-stream-processing-application");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        StreamsConfig config = new StreamsConfig(props);

        StreamsBuilder builder = new StreamsBuilder();
       /* builder.<String, String>stream("my-input-topic").mapValues(value -> value.length().toString()).to("my-output-topic");

        KafkaStreams streams = new KafkaStreams(builder.build(), config);
        streams.start();*/

    }


}
