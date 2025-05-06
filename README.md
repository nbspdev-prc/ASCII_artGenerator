# ASCII Art Generator

ASCII Art Generator is a Java-based application that converts text into ASCII art using a graphical user interface (GUI). The application leverages a predefined font table to generate ASCII art representations of characters.

## Features

- **Text-to-ASCII Conversion**: Enter any text, and the application will generate its ASCII art representation.
- **Graphical User Interface**: User-friendly GUI built with Java Swing.
- **Custom Font Table**: Supports a wide range of characters, including letters, numbers, and symbols.

## How to Run

1. **Download or Build the JAR File**:
   - If you already have the `MyApp.jar` file, skip to step 2.
   - To build the JAR file yourself, follow the steps in the [How to Build a JAR File](#how-to-build-a-jar-file) section.

2. **Run the Application**:
   - Open a terminal and navigate to the directory containing `MyApp.jar`.
   - Run the following command:
     ```sh
     java -jar MyApp.jar
     ```

3. **Using the GUI**:
   - Enter text in the input field and click the "Translate" button to see the ASCII art in the output area.

## How to Build a JAR File

1. Create a manifest file (`manifest.mf`) with the following content: