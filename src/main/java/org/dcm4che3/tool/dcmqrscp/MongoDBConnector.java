package org.dcm4che3.tool.dcmqrscp;


import com.google.gson.Gson;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MongoDBConnector {

    public MongoClient mongoClient;
    private RaccoonAppConfig.MongodbConfig mongoDbConfig;

    public MongoDBConnector(RaccoonAppConfig.MongodbConfig iMongoDbConfig) throws IOException {
        this.mongoDbConfig = iMongoDbConfig;
        this.readConfig();
    }

    void readConfig() {

        MongoCredential credential = MongoCredential.createCredential(
                this.mongoDbConfig.getUsername(),
                this.mongoDbConfig.getAuthSource(),
                this.mongoDbConfig.getPassword().toCharArray()
        );
        List<ServerAddress> serverAddresses = new ArrayList<>();

        String[] hosts = mongoDbConfig.getHosts();
        int[] ports = mongoDbConfig.getPorts();
        for (int i = 0 ; i < hosts.length ; i++) {
            ServerAddress serverAddress = new ServerAddress(hosts[i], ports[i]);
            serverAddresses.add(serverAddress);
        }


        this.mongoClient = MongoClients.create(
            MongoClientSettings.builder()
            .applyToClusterSettings(builder ->
                    builder.hosts(serverAddresses)
            )
            .credential(credential)
            .build()
        );

    }
}
