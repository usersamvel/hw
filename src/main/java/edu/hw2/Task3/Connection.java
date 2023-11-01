package edu.hw2.Task3;

import java.util.Random;
import java.util.logging.Logger;

public interface Connection extends AutoCloseable {

    String MESSAGE = "Close";
    Logger LOGGER = Logger.getGlobal();



        }

        @Override
        public void close() throws Exception {
            LOGGER.info(MESSAGE);
        }
    }

    class FaultyConnection implements Connection {


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
