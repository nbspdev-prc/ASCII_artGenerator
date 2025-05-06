# ASCII Art Generato
ASCII Art Generator is a Java-based application that converts text into ASCII art using a graphical user interface (GUI). The application leverages a predefined font table to generate ASCII art representations of characters.

## Features
- **Text-to-ASCII Conversion**: Enter any text, and the application will generate its ASCII art representation.
- **Image-to-ASCII Conversion**: Enter any image, and the application will do the same thing.
- **Graphical User Interface**: User-friendly GUI built with Java Swing.
- **Custom Font Table**: Supports a wide range of characters, including letters, numbers, and symbols.

## How to Run

1. **Make the Build Script Executable** (only required once):
   - Run the following command to make the `build.sh` script executable:
     ```sh
     chmod +x build.sh
     ```

2. **Run the Build Script**:
   - Use the provided `build.sh` script to compile the project, create the JAR file, and run the application.
   - Open a terminal and navigate to the project directory.
   - Run the following command:
     ```sh
     ./build.sh
     ```

3. **Using the GUI**:
   - Enter text in the input field and click the "Translate" button to see the ASCII art in the output area.

## How to Build and Run Manually (Optional)

If you prefer not to use the `build.sh` script, you can manually build and run the application:

1. **Compile the Project**:
   - Run the following command to compile the Java files:
     ```sh
     javac -d build src/Main.java src/App/*.java
     ```

2. **Create the Manifest File**:
   - Create a file named `manifest.mf` with the following content:
     ```
     Main-Class: Main
     ```

3. **Package the JAR File**:
   - Run the following command to create the JAR file:
     ```sh
     jar cfm MyApp.jar manifest.mf -C build .
     ```

4. **Run the Application**:
   - Execute the JAR file using:
     ```sh
     java -jar MyApp.jar
     ```

## Project Structure

```
ASCII_artGenerator/
├── src/
│   ├── Main.java                # Main entry point with GUI implementation
│   ├── App/
│   │   ├── FontTable.java       # Contains the ASCII art font table
│   │   ├── TextTranslator.java  # Handles text-to-ASCII conversion
│   │   ├── ImageTranslator.java # Handles image-to-ASCII conversion
│   │   └── Translator.java      # Interface for translation logic
│   └── Client/
│       ├── TextClient.java      # GUI for text-to-ASCII translation
│       └── ImageClient.java     # GUI for image-to-ASCII translation
├── Build/                       # Compiled classes and build artifacts
├── MyApp.jar                    # Prebuilt JAR file for running the application
├── manifest.mf                  # Manifest file for JAR packaging
├── build.sh                     # Build script for automating the process
├── README.md                    # Project documentation
```

## Dependencies
- Java Development Kit (JDK) 8 or higher.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Acknowledgments
- ASCII art font inspired by various online resources.
- Built using Java Swing for the GUI.
