package xyz.eazyfree.common.demo.kafkademo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;


/**
 * Created by ZhaoZhi qiang
 * on 2018/4/13.
 */
public class KafkaProducers {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put("bootstrap.servers", "140.143.157.245:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");


        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 10; i < 20; i++)
            producer.send(new ProducerRecord<String, String>("foo", Integer.toString(i), Integer.toString(i)));

        producer.close();
    }



}
