package edu.hw2.Task3;

import java.util.Random;

public interface ConnectionManager {

    Connection getConnection();

    record DefaultConnectionManager() implements ConnectionManager {

        @Override
        public Connection getConnection() {
            Random r = new Random();
            int chance = r.nextInt(2);
            if (chance == 0) {
                return new Connection.FaultyConnection();
            } else {
                return new Connection.StableConnection();
            }
        }
    }

    record FaultyConnectionManager() implements ConnectionManager {

        @Override
        public Connection getConnection() {
            return new Connection.StableConnection();
        }
    }
}
