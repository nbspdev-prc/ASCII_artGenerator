#!/bin/bash
echo "Cleaning old build files..."
rm -rf build MyApp.jar

echo "Creating build directory..."
mkdir -p build

echo "Compiling Java files..."
javac -d build App/*.java Main.java

if [ $? -ne 0 ]; then
  echo "❌ Compilation failed. Check errors above."
  exit 1
fi

echo "Creating JAR file..."
jar cfm MyApp.jar manifest.txt -C build .

if [ $? -eq 0 ]; then
  echo "✅ Build successful! Run the app with:"
  echo "java -jar MyApp.jar"
else
  echo "❌ Failed to create JAR file."
fi
