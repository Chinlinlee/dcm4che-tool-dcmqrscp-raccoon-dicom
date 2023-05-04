package org.dcm4che3.tool.dcmqrscp;

import com.google.gson.Gson;
import com.mongodb.MongoException;

import java.io.*;
import java.lang.reflect.Type;

class RaccoonAppConfig {
    public static class MongodbConfig {
        private String[] hosts;
        private int[] ports;
        private String username;
        private String password;
        private String authSource;
        private String database;
        private boolean debug;

        public String[] getHosts() {
            return hosts;
        }

        public int[] getPorts() {
            return ports;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getAuthSource() {
            return authSource;
        }

        public String getDatabase() {
            return database;
        }

        public boolean isDebug() {
            return debug;
        }
    }

    public static class RaccoonConfig {
        private String dicomStoreRoot;
        private String raccoonUploadScriptPath;
        private String mode;
        private String stowUrl;

        public String getDicomStoreRoot() {
            return dicomStoreRoot;
        }

        public String getRaccoonUploadScriptPathPath() {
            return raccoonUploadScriptPath;
        }

        public String getMode() { return mode; }

        public String getStowUrl() {
            return stowUrl;
        }
    }

    public MongodbConfig mongodb;
    public RaccoonConfig raccoon;

}

public class RaccoonAppConfigReader {
    private RaccoonAppConfig raccoonAppConfig;

    public RaccoonAppConfigReader(String raccoonConfigJsonPath) {
        this.readConfigFromJson(raccoonConfigJsonPath);
    }

    private void readConfigFromJson(String raccoonConfigJsonPath) {
        try {
            File f = new File(raccoonConfigJsonPath);
            this.raccoonAppConfig = new Gson().fromJson(new FileReader(f), (Type) RaccoonAppConfig.class);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public RaccoonAppConfig getConfig() {
        return raccoonAppConfig;
    }
}