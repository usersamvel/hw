package edu.hw2.Task3;

import java.util.Random;
import java.util.logging.Logger;

public interface Connection extends AutoCloseable {

    String MESSAGE = "Closed";
    Logger LOGGER = Logger.getGlobal();

    void execute(String command);

    class StableConnection implements Connection {

        @Override
        public void execute(String command) {

        }

        @Override
        public void close() throws Exception {
            LOGGER.info(MESSAGE);
        }
    }

    class FaultyConnection implements Connection {

        @Override
        public void execute(String command) {
            Random r = new Random();
            int chance = r.nextInt(2);
            if (chance == 0) {
                throw new ConnectionException();
            }
        }

        @Override
        public void close() throws Exception {
            LOGGER.info(MESSAGE);
        }
    }
}
