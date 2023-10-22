package edu.hw2.Task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager = new ConnectionManager.DefaultConnectionManager();
    private final int maxAttempts = 10;

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) {
        int count = 0;
        while (count <= maxAttempts) {
            try {
                Connection.execute(command);
            } catch (Exception e) {
                if (count == maxAttempts) {
                    throw new ConnectionException();
                }
            }
            ++count;
        }
    }
}
