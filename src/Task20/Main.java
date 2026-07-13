package src.Task20;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Path outputDir = Paths.get("output_files");
        if (!Files.exists(outputDir)) {
            Files.createDirectories(outputDir);
        }

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<List<String>>> tasks = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            tasks.add(new FileGeneratorTask(i, outputDir));
        }

        List<Future<List<String>>> futures = new ArrayList<>();

        System.out.println("Main thread: " + Thread.currentThread().getName());

        for (Callable<List<String>> task : tasks) {
            futures.add(executor.submit(task));
        }

        List<String> allFiles = new ArrayList<>();

        for (Future<List<String>> future : futures) {
            List<String> result = future.get();
            allFiles.addAll(result);
        }

        executor.shutdown();

        System.out.println("All created files:");
        allFiles.forEach(System.out::println);
    }
}