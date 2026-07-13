package src.Task20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class FileGeneratorTask implements Callable<List<String>> {
    private final int taskNumber;
    private final Path outputDir;

    public FileGeneratorTask(int taskNumber, Path outputDir) {
        this.taskNumber = taskNumber;
        this.outputDir = outputDir;
    }

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] Task " + taskNumber + " started");

        List<String> fileNames = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String fileName = "task_" + taskNumber + "_file_" + i + ".txt";
            Path filePath = outputDir.resolve(fileName);

            try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
                for (int line = 1; line <= 10; line++) {
                    writer.write(RandomStringUtil.randomString(20));
                    writer.newLine();
                }
            }

            fileNames.add(fileName);
            System.out.println("[" + threadName + "] Task " + taskNumber + " created file: " + fileName);
        }

        int sleepSeconds = ThreadLocalRandom.current().nextInt(1, 4);
        System.out.println("[" + threadName + "] Task " + taskNumber + " sleeping for " + sleepSeconds + " sec");
        Thread.sleep(sleepSeconds * 1000L);

        System.out.println("[" + threadName + "] Task " + taskNumber + " finished");
        return fileNames;
    }
}
