package com.ff.fantasyfootball;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class ExportToZipFileService {

    public static void export() {

        Path source = Paths.get("C:/Users/Student/Documents/testing.csv");
        String zipFileName = "example.zip";

        try {

        	ExportToZipFileService.zipSingleFileNio(source, zipFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");

    }

    // Zip a single file
    public static void zipSingleFileNio(Path source, String zipFileName)
        throws IOException {

        if (!Files.isRegularFile(source)) {
            System.err.println("Please provide a file.");
            return;
        }

        Map<String, String> env = new HashMap<>();
        // Create the zip file if it doesn't exist
        env.put("create", "true");

        URI uri = URI.create("jar:file:/Users/Student/Documents/" + zipFileName);

        try (FileSystem zipfs = FileSystems.newFileSystem(uri, env)) {
            Path pathInZipfile = zipfs.getPath(source.getFileName().toString());

            // Copy a file into the zip file path
            Files.copy(source, pathInZipfile, StandardCopyOption.REPLACE_EXISTING);
        }

    }


}